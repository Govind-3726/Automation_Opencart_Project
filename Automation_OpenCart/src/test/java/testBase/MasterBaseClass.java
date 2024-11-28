package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.time.Duration;
import java.util.Properties;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class MasterBaseClass {
    public static ThreadLocal<WebDriver> ThreadLocalDriver = new ThreadLocal<>();  // ThreadLocal to handle WebDriver instances for parallel execution
    public Logger logger;  // logger initialization
    public Properties pr;

    // Retrieve the correct WebDriver instance for the current thread
    public WebDriver getDriver() {
        return ThreadLocalDriver.get();
    }

    @BeforeClass(groups = {"Sanity", "Regression", "Master","Smoke", "DataDriven"})
    @Parameters({"os", "browser"})
    public void setup(String os, String br) throws IOException, Exception {
        FileReader file = new FileReader("./src/test/resourses/configure.properties");
        pr = new Properties();
        pr.load(file);

        logger = LogManager.getLogger(this.getClass());   // log4j2
        logger.info("Test setup is starting...");

        try {
        if (pr.getProperty("execution_env").equalsIgnoreCase("Remote")) {
            logger.info("Test is Running in Remote Environment");

            DesiredCapabilities capabilities = new DesiredCapabilities();

            // Operating system
            if (os.equalsIgnoreCase("windows")) {
                capabilities.setPlatform(Platform.WIN10);
                logger.info(os + " Operating system selected");
            } else if (os.equalsIgnoreCase("mac")) {
                capabilities.setPlatform(Platform.MAC);
                logger.info(os + " Operating system selected");
            }
            else if (os.equalsIgnoreCase("linux")) {
                capabilities.setPlatform(Platform.LINUX);
                logger.info(os + " Operating system selected");
            }else {
                logger.error("Invalid Operating system specified: " + os);
                throw new Exception("No Matching operating System");
            }

            // Browser
            switch (br.toLowerCase()) {
                case "chrome":
                    capabilities.setBrowserName("chrome");
                    logger.info("Chrome browser selected");
                    break;
                case "edge":
                    capabilities.setBrowserName("MicrosoftEdge");
                    logger.info("Edge browser selected");
                    break;
                case "firefox":
                    capabilities.setBrowserName("firefox");
                    logger.info("firefox browser selected");
                    break;
                case "safari":
                    capabilities.setBrowserName("safari");
                    logger.info("Safari browser selected");
                    break;
                default:
                    logger.error("Invalid browser specified: " + br);
                    throw new Exception("Invalid browser specified.");
            }

            // Connect to the Remote WebDriver or Selenium Grid
            URI gridUri = new URI("http://localhost:4444/wd/hub");
            ThreadLocalDriver.set(new RemoteWebDriver(gridUri.toURL(), capabilities));

        } else if (pr.getProperty("execution_env").equalsIgnoreCase("Local")) {
            logger.info("Test is Running in Local Environment");

            // Browser
            switch (br.toLowerCase()) {
                case "chrome":
                	ThreadLocalDriver.set(new ChromeDriver());
                    logger.info("Chrome browser selected");
                    break;
                case "edge":
                	ThreadLocalDriver.set(new EdgeDriver());
                    logger.info("Edge browser selected");
                    break;
                case "firefox":
                	ThreadLocalDriver.set(new FirefoxDriver());
                    logger.info("Firefox browser selected");
                    break;
                default:
                    logger.error("Invalid browser specified: " + br);
                    throw new UnreachableBrowserException("Invalid browser specified.");
            }
        }

        // Common WebDriver setup
        WebDriver driver = getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logger.info("Browser setup complete");

    } catch (Exception e) {
        logger.error("Setup failed: " + e.getMessage());
        throw e;
    }
}
    
    @BeforeMethod(groups = {"Sanity", "Regression","Smoke", "Master", "DataDriven"})
    public void launchUrl() {
        WebDriver driver = getDriver();
        driver.get(pr.getProperty("url"));
        driver.manage().window().maximize();
    }


    @AfterClass(groups = {"Sanity", "Regression", "Smoke","Master", "DataDriven"})
    public void tearDown() {
    	 // Common WebDriver setup
        WebDriver driver = getDriver();   // Retrieve the correct driver
        
        if (driver != null) {
            logger.info("Closing the browser.");
            driver.quit();
            ThreadLocalDriver.remove();  // Remove the WebDriver instance for the current thread
        } else {
            logger.warn("Driver is null, nothing to quit.");
        }
    }

    // Generate random strings
    public String randomString() {
        return RandomStringUtils.randomAlphabetic(5);
    }

    public String randomNumber() {
        return RandomStringUtils.randomNumeric(10);
    }

    public String randomAlphaNumeric() {
        String randomString = RandomStringUtils.randomAlphabetic(3);
        String randomNumber = RandomStringUtils.randomNumeric(3);
        return randomString + "@" + randomNumber;
    }

    // Capture a screenshot
    public  String CaptureScreen(String tname) {
        WebDriver driver = getDriver();
        if (driver == null) {
            if (logger != null) {
                logger.error("Cannot capture screenshot because WebDriver is not initialized.");
            } else {
                System.out.println("Logger is not initialized.");
            }
            return null;
        }

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String targetFilePath = System.getProperty("user.dir") + "\\Screenshots\\" + tname + "_" + timeStamp + ".png";
        File targetFile = new File(targetFilePath);
        sourceFile.renameTo(targetFile);

        if (logger != null) {
            logger.info("Screenshot captured at: " + targetFilePath);
        } else {
            System.out.println("Screenshot captured at: " + targetFilePath);
        }
        return targetFilePath;
    }

    
    public void isChangedCurrencySign()
	 {
    	// Common WebDriver setup
        WebDriver driver = getDriver();
    	
   	WebElement CurrentCurrencySign=driver.findElement(By.xpath("//strong[normalize-space()]"));
		 // Check for $US Dollar
	    if (CurrentCurrencySign.getText().equals("$")) {
	        int totalProducts = driver.findElements(By.xpath("//*[contains(text(), '$')]")).size();
	        logger.info(totalProducts + "places $ sign has been changed.");
	    }
		// Check for £Pound Sterling
		else if (CurrentCurrencySign.getText().equals("£")) {
		    int totalProducts = driver.findElements(By.xpath("//*[contains(text(), '£')]")).size();
		    logger.info(totalProducts + "places £ sign has been changed.");
		    }
		// Check for €Euro
		else if (CurrentCurrencySign.getText().equals("€")) {
		    int totalProducts = driver.findElements(By.xpath("//*[contains(text(), '€')]")).size();
		    logger.info(totalProducts + "places € sign has been changed.");
		    }
		// Default case
		else {
		     logger.info("Nothing meets the condition.");
		    }
	 } 
   
   public void login() {
	// Common WebDriver setup
       WebDriver driver = getDriver();
   	HomePage HP=new HomePage(driver);
		HP.clickonMyAccountlnkinHeader();
		HP.clickonLoginlnk();
		LoginPage LP=new LoginPage(driver);
		LP.SetEmail(pr.getProperty("email"));
		LP.SetPassword(pr.getProperty("pwd"));
		LP.ClickLogin();
   }
   
   public void logout(){
	   WebDriver driver=getDriver();
   	HomePage home=new HomePage(driver);
   	home.clickonMyAccountlnkinHeader();
   	try {
   		LoginPage Login=new LoginPage(driver);
   	   	Login.ClickLogout();
   	}catch(Exception e) {
   		home.ClickonLogoutLink();
   	}
   
   }

}
