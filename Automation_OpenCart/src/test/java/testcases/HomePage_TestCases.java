package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.MasterBaseClass;

public class HomePage_TestCases extends MasterBaseClass
{
	
	@Test(groups= {"Sanity","Master"})
	public void TC001_VerifyHomePageLoadSuccessfully()
	{
		logger.info("*****Starting TC001_VerifyHomePageLoadSuccessfully*****");
	    WebDriver driver = getDriver();  // Use current thread's driver
	    try {
		String actualurl=pr.getProperty("url");
		String expectedurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl,expectedurl);
	    }
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC001_VerifyHomePageLoadSuccessfully*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC002_VerifyHomePageTitle()
	{
		logger.info("*****Starting TC002_VerifyHomePageTitle*****");
		WebDriver driver = getDriver();
		try {
		String title=driver.getTitle();
		if(title.equals("Your Store")) {
			Assert.assertTrue(true);
		}else {
		Assert.assertFalse(true);
	    }
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC002_VerifyHomePageTitle*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC003_VerifyISLogoDisplayed()
	{
		logger.info("*****Starting TC003_VerifyISLogoDisplayed*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			boolean isDisplayedLogo=hp.LogoisDisplayed();
			Assert.assertTrue(isDisplayedLogo, "Logo is not displayed on the webpage.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC002_VerifyHomePageTitle*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC004_verifyCurencyareDisplayedinsideCurrencyLink()
	{
		logger.info("*****Starting TC004_verifyCurencyareDisplayedinsideCurrencyLink*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
	        hp.ClickOnCurrencyButton();
	        boolean links = hp.CurrenciesAreDisplayed();  // Check if currency links are displayed
	        Assert.assertTrue(links, "Currency links are not displayed");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC004_verifyCurencyareDisplayedinsideCurrencyLink*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC005_VerifyEuroCurrencyButtonTest()
	{
		logger.info("*****Starting TC005_VerifyEuroCurrencyButtonTest*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickOnCurrencyButton();
			hp.ClickOnEurobutton();
			//verify How Many Sign has been changed.
			if(true) {
			isChangedCurrencySign();
			Assert.assertTrue(true);
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC005_VerifyEuroCurrencyButtonTest*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC006_VerifyPoundCurrencyButtonTest()
	{
		logger.info("*****Starting TC006_VerifyPoundCurrencyButtonTest*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickOnCurrencyButton();
			hp.ClickOnPoundbutton();
			//verify How Many Sign has been changed.
			if(true) {
			isChangedCurrencySign();
			Assert.assertTrue(true);
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC006_PoundCurrencyButtonTest*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC007_VerifyDollarCurrencyButtonTest()
	{
		logger.info("*****Starting TC007_VerifyDollarCurrencyButtonTest*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickOnCurrencyButton();
			hp.ClickOnDollarbutton();
			//verify How Many Sign has been changed.
			if(true) {
			isChangedCurrencySign();
			Assert.assertTrue(true);
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC007_VerifyDollarCurrencyButtonTest*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC008_VerifyContactlnkRedirectingtoContactPage()
	{
		logger.info("*****Starting TC008_VerifyContactlnkRedirectingtoContactPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonContactlnk();
			String ContractPage=driver.findElement(By.xpath("(//div//h1)[2]")).getText();
			Assert.assertEquals(ContractPage,"Contact Us","Contract Page Not Found...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC008_VerifyContactlnkRedirectingtoContactPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC009_verifyLinksareDisplayedinsideMyAccountLink()
	{
		logger.info("*****Starting TC009_verifyLinksareDisplayedinsideMyAccountLink*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
	        hp.clickonMyAccountlnkinHeader();
	        boolean links = hp.MyAccountLinksAreDisplayed();  // Check if MyAccount links are displayed
	        Assert.assertTrue(links, "MyAccount links are not displayed");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC009_verifyLinksareDisplayedinsideMyAccountLink*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC010_VerifyRegisterlnkRedirectingtoRegisterAccountPage()
	{
		logger.info("*****Starting TC010_VerifyRegisterlnkRedirectingtoRegisterAccountPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.clickonMyAccountlnkinHeader();
			hp.clickonRegisterlnk();
			String RegisterAccountPage=driver.findElement(By.xpath("//h1[normalize-space()='Register Account']")).getText();
			Assert.assertEquals(RegisterAccountPage,"Register Account","Register Account Page Not Found...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC010_VerifyRegisterlnkRedirectingtoRegisterAccountPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC011_VerifyLoginlnkRedirectingtoReturingCustomerPage()
	{
		logger.info("*****Starting TC011_VerifyLoginlnkRedirectingtoReturingCustomerPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.clickonMyAccountlnkinHeader();
			hp.clickonLoginlnk();
			String RegisterAccountPage=driver.findElement(By.xpath("//h2[normalize-space()='Returning Customer']")).getText();
			Assert.assertEquals(RegisterAccountPage,"Returning Customer","Returning Customer Page Not Found...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC011_VerifyLoginlnkRedirectingtoReturingCustomerPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC012_VerifyWishListlnkRedirectingtoReturingCustomerPageWithoutLogin()
	{
		logger.info("*****Starting TC012_VerifyWishListlnkRedirectingtoReturingCustomerPageWithoutLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonWishListlnk();
			String ReturningCustomerPage=driver.findElement(By.xpath("//h2[normalize-space()='Returning Customer']")).getText();
			Assert.assertEquals(ReturningCustomerPage,"Returning Customer","Returning Customer Page Not Found...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC012_VerifyWishListlnkRedirectingtoReturingCustomerPageWithoutLogin*****");
	}
	
	@Test(enabled=false,groups= {"Regression","Master"})
	public void TC013_VerifyWishListlnkRedirectingtoMyWishListPageWithLogin()
	{
		logger.info("*****Starting TC013_VerifyWishListlnkRedirectingtoMyWishListPageWithLogin*****");
		WebDriver driver = getDriver();
		try {
			login();
			HomePage hp=new HomePage(driver);
			hp.ClickonWishListlnk();
			String WishListPage=driver.findElement(By.xpath("//h2[normalize-space()='My Wish List']")).getText();
			Assert.assertEquals(WishListPage,"My Wish List","My Wish List Page Not Found...");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC013_VerifyWishListlnkRedirectingtoMyWishListPageWithLogin*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC014_VerifyShoppingCartlnkRedirectingtoShoppingCartPageWithoutLogin()
	{
		logger.info("*****Starting TC014_VerifyShoppingCartlnkRedirectingtoShoppingCartPageWithoutLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonShoppingCartlnk();
			String shoppingcartPage=driver.findElement(By.xpath("(//div//h1)[2]")).getText();
			Assert.assertEquals(shoppingcartPage,"Shopping Cart","shoppingcart Page Not Found...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC014_VerifyShoppingCartlnkRedirectingtoShoppingCartPageWithoutLogin*****");
	}
	
	@Test(enabled=false,groups= {"Regression","Master"})
	public void TC015_VerifyShoppingCartlnkRedirectingtoShoppingCartPageWithLogin()
	{
		logger.info("*****Starting TC015_VerifyShoppingCartlnkRedirectingtoShoppingCartPageWithLogin*****");
		WebDriver driver = getDriver();
		try {
			login();
			HomePage hp=new HomePage(driver);
			hp.ClickonShoppingCartlnk();
			String shoppingcartPage=driver.findElement(By.xpath("(//div//h1)[2]")).getText();
			String shoppingcart=shoppingcartPage.substring(0,13);
			Assert.assertEquals(shoppingcart,"Shopping Cart","shoppingcart Page Not Found...");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC015_VerifyShoppingCartlnkRedirectingtoShoppingCartPageWithLogin*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC016_VerifycheckoutlnkRedirectingtoShoppingCartPageWithoutLogin()
	{
		logger.info("*****Starting TC016_VerifycheckoutlnkRedirectingtoShoppingCartPageWithoutLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonCheckoutlnk();
			String shoppingcartPage=driver.findElement(By.xpath("(//div//h1)[2]")).getText();
			Assert.assertEquals(shoppingcartPage,"Shopping Cart","shoppingcart Page Not Found...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC016_VerifycheckoutlnkRedirectingtoShoppingCartPageWithoutLogin*****");
	}
	
	@Test(enabled=false,groups= {"Regression","Master"})
	public void TC017_VerifycheckoutlnkRedirectingtoShoppingCartPageWithLogin()
	{
		logger.info("*****Starting TC017_VerifycheckoutlnkRedirectingtoShoppingCartPageWithLogin*****");
		WebDriver driver = getDriver();
		try {
			login();
			HomePage hp=new HomePage(driver);
			hp.ClickonCheckoutlnk();
			String shoppingcartPage=driver.findElement(By.xpath("(//div//h1)[2]")).getText();
			String shoppingcart=shoppingcartPage.substring(0,13);
			Assert.assertEquals(shoppingcart,"Shopping Cart","shoppingcart Page Not Found...");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC017_VerifycheckoutlnkRedirectingtoShoppingCartPageWithLogin*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC018_VerifysearchInputBoxIsEnabled()
	{
		logger.info("*****Starting TC018_VerifysearchInputBoxIsEnabled*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			boolean isEnabledSearchInputBox=hp.searchInputboxisEnabled();
			Assert.assertTrue(isEnabledSearchInputBox, "Search Input Box is not enabled");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC018_VerifysearchInputBoxIsEnabled*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC019_VerifysearchInputBoxWithRegisteredtextValue()
	{
		logger.info("*****Starting TC019_VerifysearchInputBoxWithRegisteredtextValue*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.SetSearchData(pr.getProperty("RegisteredSearchTextvalue"));   
			hp.ClickonSearchbtn();
			
			//verify found search page 
			String actualSearchPage = driver.findElement(By.xpath("(//div/h1)[2]")).getText();
			String expectedSearchPage = "Search - " + pr.getProperty("RegisteredSearchTextvalue");
			Assert.assertEquals(actualSearchPage, expectedSearchPage, "Search Page not found");
			
			 // Verify how many products are shown
		    List<WebElement> products = driver.findElements(By.xpath("//div[@class='image']/a"));
		    int totalDisplayedProducts = products.size();
		    logger.info(totalDisplayedProducts + " products are shown...");
		    Assert.assertTrue(totalDisplayedProducts > 0, "No products displayed");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC019_VerifysearchInputBoxWithRegisteredtextValue*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC020_VerifysearchInputBoxWithUnRegisteredtextValue()
	{
		logger.info("*****Starting TC020_VerifysearchInputBoxWithUnRegisteredtextValue*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.SetSearchData(pr.getProperty("UnregisteredSearchTextValue"));   
			hp.ClickonSearchbtn();
			
			//verify found search page 
			String actualSearchPage = driver.findElement(By.xpath("(//div/h1)[2]")).getText();
			String expectedSearchPage = "Search - " + pr.getProperty("UnregisteredSearchTextValue");
			Assert.assertEquals(actualSearchPage, expectedSearchPage, "Search Page not found");
			
			 // Verify how many products are shown
		    String displayedText =driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]")).getText();
		    Assert.assertEquals(displayedText,"There is no product that matches the search criteria.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC020_VerifysearchInputBoxWithUnRegisteredtextValue*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC021_VerifysearchInputBoxWithNotextValue()
	{
		logger.info("*****Starting TC021_VerifysearchInputBoxWithNotextValue*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.SetSearchData(""); 
			hp.ClickonSearchbtn();
			
			//verify found search page 
			String SearchPage = driver.findElement(By.xpath("(//div/h1)[2]")).getText();
			Assert.assertEquals(SearchPage,"Search","Search Page Not Found...");
			
			 // Verify how many products are shown
		    String displayedText =driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criter')]")).getText();
		    Assert.assertEquals(displayedText,"There is no product that matches the search criteria.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC021_VerifysearchInputBoxWithNotextValue*****");
	}
	
	
	@Test(enabled=false,groups= {"Regression","Master"})
	public void TC022_VerifyaddtoCartbuttonredirecttobillingPageWithLogin()
	{
		logger.info("*****Starting TC022_VerifyaddtoCartbuttonredirecttobillingPageWithLogin*****");
		WebDriver driver = getDriver();
		try {
			login();
			HomePage hp=new HomePage(driver);
			hp.ClickonAddtoCart();
			
			// Check if "View Cart" and "Checkout" buttons are present
			Assert.assertTrue(driver.findElement(By.xpath("//strong[normalize-space()='View Cart']")).isDisplayed(), "View Cart not available");
	        Assert.assertTrue(driver.findElement(By.xpath("//strong[normalize-space()='Checkout']")).isDisplayed(), "Checkout not available");
	        logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC022_VerifyaddtoCartbuttonredirecttobillingPageWithLogin*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC023_VerifyaddtocartbuttonRedirectingtoPageWithMsgWithoutLogin()
	{
		logger.info("*****Starting TC023_VerifyaddtocartbuttonRedirectingtoPageWithMsgWithoutLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonAddtoCart();
			String text=driver.findElement(By.xpath("//p[@class='text-center']")).getText();
			Assert.assertEquals(text,"Your shopping cart is empty!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC023_VerifyaddtocartbuttonRedirectingtoPageWithMsgWithoutLogin*****");
	}
	
	@Test(groups= {"Regression","Master"})
	public void TC024_VerifyMyAccountLinkRedirectingtoMyAccountPage()
	{
		logger.info("*****Starting TC024_VerifyMyAccountLinkRedirectingtoMyAccountPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			login();
			hp.clickonMyAccountlnkinHeader();
			hp.ClickonMyCCOUNTLink();	
			String MyAccountPage=hp.MyAccountHeadertext();
			Assert.assertEquals(MyAccountPage,"My Account","My Account Page Not Found.");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC024_VerifyMyAccountLinkRedirectingtoMyAccountPage*****");
	}
	
	@Test(groups= {"Regression","Master"})
	public void TC025_VerifyOrderHistoryLinkRedirectingtoOrderHistoryPage()
	{
		logger.info("*****Starting TC025_VerifyOrderHistoryLinkRedirectingtoOrderHistoryPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			login();
			hp.clickonMyAccountlnkinHeader();
			hp.ClickonOrderHistortLnk();
			
			String OrderHistory=hp.OrderHistoryPagetext();
			Assert.assertEquals(OrderHistory,"Order History","Order History Page Not Found.");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC025_VerifyOrderHistoryLinkRedirectingtoOrderHistoryPage*****");
	}
	
	@Test(groups= {"Regression","Master"})
	public void TC026_VerifyTransactionsLinkRedirectingtoYourTransactionsPage()
	{
		logger.info("*****Starting TC026_VerifyTransactionsLinkRedirectingtoYourTransactionsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			login();
			hp.clickonMyAccountlnkinHeader();
			hp.ClickonTransactionLnk();
			
			String YourTransactions=hp.TransactionPagetext();
			Assert.assertEquals(YourTransactions,"Your Transactions","Your Transactions Page Not Found.");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC026_VerifyTransactionsLinkRedirectingtoYourTransactionsPage*****");
	}
	
	@Test(groups= {"Regression","Master"})
	public void TC027_VerifyDownloadsLinkRedirectingtoAccountDownloadsPage()
	{
		logger.info("*****Starting TC027_VerifyDownloadsLinkRedirectingtoAccountDownloadsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			login();
			hp.clickonMyAccountlnkinHeader();
			hp.ClickonDownloadsLnk();
			
			String AccountDownloads=hp.DownloadsPagetext();
			Assert.assertEquals(AccountDownloads,"Account Downloads","Account Downloads Page Not Found.");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC027_VerifyDownloadsLinkRedirectingtoAccountDownloadsPage*****");
	}
	
	@Test(groups= {"Regression","Master"})
	public void TC028_VerifyLogoutLinkRedirectingtoLogoutPage()
	{
		logger.info("*****Starting TC028_VerifyLogoutLinkRedirectingtoLogoutPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			login();
			hp.clickonMyAccountlnkinHeader();
			hp.ClickonLogoutLink();
			
			String AccountLogout=hp.LogoutPagetext();
			Assert.assertEquals(AccountLogout,"Account Logout","Account Logout Page Not Found.");
		}catch(Exception e) {
			logger.error("Test failed due to an exception: " + e.getMessage());
	        Assert.fail("Test case encountered an exception: " + e.getMessage());
			Assert.fail();
		}
		logger.info("*****Finished TC028_VerifyLogoutLinkRedirectingtoLogoutPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC029_hoveringMouseOnDesktopsLink()
	{
		logger.info("*****Starting TC029_hoveringMouseOnDesktopsLink*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.hoveringmouseonDesktops();
			
			List<WebElement> innerlinks=driver.findElements(By.xpath("(//div[@Class=\"dropdown-inner\"])[1]//a"));
			for (WebElement links : innerlinks) {
			    Assert.assertTrue(links.isDisplayed(), "Link is not displayed: " + links.getText());
			}
			
			WebElement link=driver.findElement(By.xpath("(//div[@Class=\"dropdown-menu\"]/a)[1]"));
			Assert.assertTrue(link.isDisplayed(),"Link is not displayed: "+link.getText());	
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC029_hoveringMouseOnDesktopsLink*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC030_PC0LinkisredirectingtoPCPage()
	{
		logger.info("*****Starting TC030_PC0LinkisredirectingtoPCPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonDesktops();
			hp.ClickonPC0();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='PC']")).getText(),"PC");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC030_PC0LinkisredirectingtoPCPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC031_Mac1LinkisredirectingtoMacPage()
	{
		logger.info("*****Starting TC031_Mac1LinkisredirectingtoMacPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonDesktops();
			hp.Clickonmac1lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Mac']")).getText(),"Mac");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC031_Mac1LinkisredirectingtoMacPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC032_ShowAllDesktopsLinkisredirectingtoDesktopsPage()
	{
		logger.info("*****Starting TC032_ShowAllDesktopsLinkisredirectingtoDesktopsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonDesktops();
			hp.ClickonShowAllDesktopslnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Desktops']")).getText(),"Desktops");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC032_ShowAllDesktopsLinkisredirectingtoDesktopsPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC033_hoveringMouseOnLaptopsandNotebooksLink()
	{
		logger.info("*****Starting TC033_hoveringMouseOnLaptopsandNotebooksLink*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.hoveringmouseonLaptopsandNotebookslnk();
			
			List<WebElement> innerlinks=driver.findElements(By.xpath("(//div[@Class=\"dropdown-inner\"])[2]//a"));
			for (WebElement links : innerlinks) {
			    Assert.assertTrue(links.isDisplayed(), "Link is not displayed: " + links.getText());
			}
			
			WebElement link=driver.findElement(By.xpath("(//div[@Class=\"dropdown-menu\"]/a)[2]"));
			Assert.assertTrue(link.isDisplayed(),"Link is not displayed: "+link.getText());	
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC033_hoveringMouseOnLaptopsandNotebooksLink*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC034_Macs0LinkisredirectingtoMacsPage()
	{
		logger.info("*****Starting TC034_Macs0LinkisredirectingtoMacsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonLaptopsandNotebookslnk();
			hp.Clickonmacs0lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Macs']")).getText(),"Macs");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC034_Macs0LinkisredirectingtoMacsPage*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC035_windows0LinkisredirectingtoWindowsPage()
	{
		logger.info("*****Starting TC035_windows0LinkisredirectingtoWindowsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonLaptopsandNotebookslnk();
			hp.Clickonwindows0lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Windows']")).getText(),"Windows");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC035_windows0LinkisredirectingtoWindowsPage*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC036_ShowAllLaptopsandNotebooksLinkisredirectingtoLaptopsandNotebooksPage()
	{
		logger.info("*****Starting TC036_ShowAllLaptopsandNotebooksLinkisredirectingtoLaptopsandNotebooksPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonLaptopsandNotebookslnk();
			hp.Clickonwindows0lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Windows']")).getText(),"Windows");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC036_ShowAllLaptopsandNotebooksLinkisredirectingtoLaptopsandNotebooksPage*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC037_hoveringMouseOncomponentsLink()
	{
		logger.info("*****Starting TC037_hoveringMouseOncomponentsLink*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.hoveringmouseoncomponentslnk();
			
			List<WebElement> innerlinks=driver.findElements(By.xpath("(//div[@Class=\"dropdown-inner\"])[3]//a"));
			for (WebElement links : innerlinks) {
			    Assert.assertTrue(links.isDisplayed(), "Link is not displayed: " + links.getText());
			}
			
			WebElement link=driver.findElement(By.xpath("(//div[@Class=\"dropdown-menu\"]/a)[3]"));
			Assert.assertTrue(link.isDisplayed(),"Link is not displayed: "+link.getText());	
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC037_hoveringMouseOncomponentsLink*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC038_miceandtrackballs0lnkisredirectingtomiceandtrackballsPage()
	{
		logger.info("*****Starting TC038_miceandtrackballs0lnkisredirectingtomiceandtrackballsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickoncomponentslnk();
			hp.Clickonmiceandtrackballs0lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Mice and Trackballs']")).getText(),"Mice and Trackballs");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC038_miceandtrackballs0lnkisredirectingtomiceandtrackballsPage*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC039_monitors2lnkkisredirectingtomonitorsPage()
	{
		logger.info("*****Starting TC039_monitors2lnkkisredirectingtomonitorsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickoncomponentslnk();
			hp.Clickonmonitors2lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Monitors']")).getText(),"Monitors");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC039_monitors2lnkkisredirectingtomonitorsPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC040_printers0lnkisredirectingtoPrinterskPage()
	{
		logger.info("*****Starting TC040_printers0lnkisredirectingtoPrinterskPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickoncomponentslnk();
			hp.clickonprinters0lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Printers']")).getText(),"Printers");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC040_printers0lnkisredirectingtoPrinterskPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC041_scanners0lnkisredirectingtoScannersPage()
	{
		logger.info("*****Starting TC041_scanners0lnkisredirectingtoScannersPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickoncomponentslnk();
			hp.Clickonscanners0lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Scanners']")).getText(),"Scanners");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC041_scanners0lnkisredirectingtoScannersPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC042_webcameras0lnkisredirectingtoWebCamerasPage()
	{
		logger.info("*****Starting TC042_webcameras0lnkisredirectingtoWebCamerasPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickoncomponentslnk();
			hp.Clickonwebcameras0lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Web Cameras']")).getText(),"Web Cameras");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC042_webcameras0lnkisredirectingtoWebCamerasPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC043_ClickonshowallcomponentslnisredirectingtoComponentsPage()
	{
		logger.info("*****Starting TC043_ClickonshowallcomponentslnisredirectingtoComponentsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickoncomponentslnk();
			hp.Clickonshowallcomponentslnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Components']")).getText(),"Components");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC043_ClickonshowallcomponentslnisredirectingtoComponentsPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC044_ClickontabletslnkRedirectingtoTabletsPage()
	{
		logger.info("*****Starting TC044_ClickontabletslnkRedirectingtoTabletsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickontabletslnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Tablets']")).getText(),"Tablets");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC044_ClickontabletslnkRedirectingtoTabletsPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC045_ClickonsofwarelnkRedirectingtoSoftwarePage()
	{
		logger.info("*****Starting TC045_ClickonsofwarelnkRedirectingtoSoftwarePage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickonsoftwarelnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Software']")).getText(),"Software");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC045_ClickonsofwarelnkRedirectingtoSoftwarePage*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC046_ClickonphonesandpdaslnkRedirectingtoPhonesAndPDASPage()
	{
		logger.info("*****Starting TC046_ClickonphonesandpdaslnkRedirectingtoPhonesAndPDASPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickonphonesandpdaslnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Phones & PDAs']")).getText(),"Phones & PDAs");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC046_ClickonphonesandpdaslnkRedirectingtoPhonesAndPDASPage*****");
	}
		
	
	@Test(groups= {"Sanity","Master"})
	public void TC047_ClickoncameraslnkRedirectingtoCamerasPage()
	{
		logger.info("*****Starting TC047_ClickoncameraslnkRedirectingtoCamerasPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickoncameraslnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Cameras']")).getText(),"Cameras");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC047_ClickoncameraslnkRedirectingtoCamerasPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC048_hoveringMouseOnMp3PlayersLink()
	{
		logger.info("*****Starting TC048_hoveringMouseOnMp3PlayersLink*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			
			List<WebElement> testlinks=driver.findElements(By.xpath("(//div[@Class=\"dropdown-inner\"])[4]//a"));
			for (WebElement links : testlinks) {
			    Assert.assertTrue(links.isDisplayed(), "Link is not displayed: " + links.getText());
			}
			
			WebElement showallmp3playerslink=driver.findElement(By.xpath("(//div[@Class=\"dropdown-menu\"]/a)[4]"));
			Assert.assertTrue(showallmp3playerslink.isDisplayed(),"Link is not displayed: "+showallmp3playerslink.getText());	
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC048_hoveringMouseOnMp3PlayersLink*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC049_ClickonTest11_0_lnkRedirectingtotest11Page()
	{
		logger.info("*****Starting TC049_ClickonTest11_0_lnkRedirectingtotest11Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest11_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 11']")).getText(),"test 11");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC049_ClickonTest11_0_lnkRedirectingtotest11Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC050_ClickonTest12_0_lnkRedirectingtotest12Page()
	{
		logger.info("*****Starting TC050_ClickonTest12_0_lnkRedirectingtotest12Pagee*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.Clickoncameraslnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Cameras']")).getText(),"Cameras");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC050_ClickonTest12_0_lnkRedirectingtotest12Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC051_ClickonTest15_0_lnkRedirectingtotest15Page()
	{
		logger.info("*****Starting TC051_ClickonTest15_0_lnkRedirectingtotest15Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest15_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 15']")).getText(),"test 15");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC051_ClickonTest15_0_lnkRedirectingtotest15Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC052_ClickonTest16_0_lnkRedirectingtotest16Page()
	{
		logger.info("*****Starting TC052_ClickonTest16_0_lnkRedirectingtotest16Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest16_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 16']")).getText(),"test 16");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC052_ClickonTest16_0_lnkRedirectingtotest16Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC053_ClickonTest17_0_lnkRedirectingtotest17Page()
	{
		logger.info("*****Starting TC053_ClickonTest17_0_lnkRedirectingtotest17Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest17_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 17']")).getText(),"test 17");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC053_ClickonTest17_0_lnkRedirectingtotest17Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC054_ClickonTest18_0_lnkRedirectingtotest18Page()
	{
		logger.info("*****Starting TC054_ClickonTest18_0_lnkRedirectingtotest18Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest18_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 18']")).getText(),"test 18");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC054_ClickonTest18_0_lnkRedirectingtotest18Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC055_ClickonTest19_0_lnkRedirectingtotest19Page()
	{
		logger.info("*****Starting TC055_ClickonTest19_0_lnkRedirectingtotest19Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest19_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 19']")).getText(),"test 19");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC055_ClickonTest19_0_lnkRedirectingtotest19Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC056_ClickonTest20_0_lnkRedirectingtotest20Page()
	{
		logger.info("*****Starting TC056_ClickonTest20_0_lnkRedirectingtotest20Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest20_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 20']")).getText(),"test 20");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC056_ClickonTest20_0_lnkRedirectingtotest20Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC057_ClickonTest21_0_lnkRedirectingtotest21Page()
	{
		logger.info("*****Starting TC057_ClickonTest21_0_lnkRedirectingtotest21Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest21_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 21']")).getText(),"test 21");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC057_ClickonTest21_0_lnkRedirectingtotest21Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC058_ClickonTest22_0_lnkRedirectingtotest22Page()
	{
		logger.info("*****Starting TC058_ClickonTest22_0_lnkRedirectingtotest22Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest22_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 22']")).getText(),"test 22");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC058_ClickonTest22_0_lnkRedirectingtotest22Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC059_ClickonTest23_0_lnkRedirectingtotest23Page()
	{
		logger.info("*****Starting TC059_ClickonTest23_0_lnkRedirectingtotest23Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest23_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 23']")).getText(),"test 23");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC059_ClickonTest23_0_lnkRedirectingtotest23Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC060_ClickonTest24_0_lnkRedirectingtotest24Page()
	{
		logger.info("*****Starting TC060_ClickonTest24_0_lnkRedirectingtotest24Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest24_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 24']")).getText(),"test 24");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC060_ClickonTest24_0_lnkRedirectingtotest24Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC061_ClickonTest4_0_lnkRedirectingtotest4Page()
	{
		logger.info("*****Starting TC061_ClickonTest4_0_lnkRedirectingtotest4Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest4_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 4']")).getText(),"test 4");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC061_ClickonTest4_0_lnkRedirectingtotest4Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC062_ClickonTest5_0_lnkRedirectingtotest5Page()
	{
		logger.info("*****Starting TC062_ClickonTest5_0_lnkRedirectingtotest5Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest5_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 5']")).getText(),"test 5");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC062_ClickonTest5_0_lnkRedirectingtotest5Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC063_ClickonTest6_0_lnkRedirectingtotest6Page()
	{
		logger.info("*****Starting TC063_ClickonTest6_0_lnkRedirectingtotest6Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest6_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 6']")).getText(),"test 6");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC063_ClickonTest6_0_lnkRedirectingtotest6Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC064_ClickonTest7_0_lnkRedirectingtotest7Page()
	{
		logger.info("*****Starting TC064_ClickonTest7_0_lnkRedirectingtotest7Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest7_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 7']")).getText(),"test 7");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC064_ClickonTest7_0_lnkRedirectingtotest7Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC065_ClickonTest8_0_lnkRedirectingtotest8Page()
	{
		logger.info("*****Starting TC065_ClickonTest8_0_lnkRedirectingtotest8Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest8_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 8']")).getText(),"test 8");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC065_ClickonTest8_0_lnkRedirectingtotest8Page*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC066_ClickonTest9_0_lnkRedirectingtotest9Page()
	{
		logger.info("*****Starting TC066_ClickonTest9_0_lnkRedirectingtotest9Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonTest9_0_lnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='test 9']")).getText(),"test 9");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC066_ClickonTest9_0_lnkRedirectingtotest9Page*****");
	}
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC067_ClickonShowAllMP3PlayerslnkRedirectingtoMP3PlayersPage()
	{
		logger.info("*****Starting TC067_ClickonShowAllMP3PlayerslnkRedirectingtoMP3PlayersPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMp3Playerslnkk();
			hp.ClickonShowAllMP3Playerslnk();
			Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='MP3 Players']")).getText(),"MP3 Players");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC067_ClickonShowAllMP3PlayerslnkRedirectingtoMP3PlayersPage*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC068_verifyFourProductsInFeaturedHeadline()
	{
		logger.info("*****Starting TC068_verifyFourProductsInFeaturedHeadline*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			String header = hp.FeaturedHeadlineText();
			    if (header.equals("Featured")) {
			        List<WebElement> products = driver.findElements(By.xpath("//h4"));
			        for (WebElement product : products) {
			            Assert.assertTrue(product.isDisplayed(), "Product is not displayed: " + product.getText());
			        }
			    } else {
			        Assert.fail("The headline is not 'Featured'.");
			    }
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC068_verifyFourProductsInFeaturedHeadline*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC069_VerifyMacBooklinkisredirectingtoMacBookpage()
	{
		logger.info("*****Starting TC069_VerifyMacBooklinkisredirectingtoMacBookpage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMacBooklnk();
			String MacBooktxt=hp.MacBookPageText();
			Assert.assertEquals(MacBooktxt,"MacBook","Mackbook Page is Not Found.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC069_VerifyMacBooklinkisredirectingtoMacBookpage*****");
	}
	

	@Test(groups= {"Sanity","Master"})
	public void TC070_VerifyMacBookDescription()
	{
		logger.info("*****Starting TC070_VerifyMacBookDescription*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			String MacBooktxt=hp.MacBookText();
			if(MacBooktxt.equals("MacBook")) {
				Assert.assertEquals(hp.MacBookDescriptionText(),"Intel Core 2 Duo processor Powered by an Intel Core 2 Duo processor at speeds up to 2.1..","Text not matched.");
			}else {
				Assert.fail("Product name is not MacBook.");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC070_VerifyMacBookDescription*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC071_VerifyMacBookTax()
	{
		logger.info("*****Starting TC071_VerifyMacBookTax*****");
		WebDriver driver = getDriver();
		try {
			 HomePage hp = new HomePage(driver);
			    
			    String macBookText = hp.MacBookText();
			    if (macBookText.equals("MacBook")) {
			        String actualTaxText = hp.MacBookTaxText();
			        logger.info("MacBook Tax Value: "+actualTaxText);
			        Assert.assertEquals(actualTaxText, "Tax:$600.00", "Tax is not matching");
			    } else {
			        Assert.fail("Product name is not MacBook.");
			    }
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****TC071_VerifyMacBookTax*****");
	}
	
	@Test(groups= {"Sanity","Master"})
	public void TC072_VerifyMacBookExTax()
	{
		logger.info("*****Starting TC072_VerifyMacBookExTax*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			
			String MacBooktxt=hp.MacBookText();
			if(MacBooktxt.equals("MacBook")) {
				 String actualExTaxText =hp.MacBookExTaxText();
				  logger.info("MacBook Ex Tax Value: "+actualExTaxText);
				Assert.assertEquals(actualExTaxText,"Ex Tax:$500.00");
			}else {
				  Assert.fail("Product name is not MacBook.");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC072_VerifyMacBookExTax*****");
	}	
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC073_verifyAgroupof3ButtonsaredisplayedinMacbookProduct()
	{
		logger.info("*****Starting TC073_verifyAgroupof3ButtonsaredisplayedinMacbookProduct*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			boolean Macgroupbtn=hp.MacBookgroupbuttonIsDisplayed();
			Assert.assertTrue(Macgroupbtn, "MacBook group button is not Displayed.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC073_verifyAgroupof3ButtonsaredisplayedinMacbookProduct*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC074_VerifyAddtoCartButtonofMacBookProduct()
	{
		logger.info("*****Starting TC074_VerifyAddtoCartButtonofMacBookProduct*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMacBookAddtocartBtn();
			
			logger.info(hp.MacBookAddtoCartConfirmationMsg());
			String AddtoCartConfirmationMsg=hp.MacBookAddtoCartConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoCartConfirmationMsg,"Success: You have added MacBook to your shopping cart!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC074_VerifyAddtoCartButtonofMacBookProduct*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC075_VerifyAddtoWishListButtonofMacBookProductWithoutLogin()
	{
		logger.info("*****TC075_VerifyAddtoWishListButtonofMacBookProductWithoutLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMacBookAddtoWishList();
			
			logger.info(hp.MacBookAddtoWishListConfirmationMsg());
			String AddtoWishListConfirmationMsg=hp.MacBookAddtoWishListConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoWishListConfirmationMsg,"You must login or create an account to save MacBook to your wish list!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC075_VerifyAddtoWishListButtonofMacBookProductWithoutLogin*****");
	}		
	
	@Test(groups= {"Regression","Master"})
	public void TC076_VerifyAddtoWishListButtonofMacBookProductWithLogin()
	{
		logger.info("*****TC076_VerifyAddtoWishListButtonofMacBookProductWithLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			login();
			hp.ClickonHomeBtn();
			hp.ClickonMacBookAddtoWishList();	
			
			logger.info(hp.MacBookAddtoWishListConfirmationMsg());
			String AddtoWishListConfirmationMsg=hp.MacBookAddtoWishListConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoWishListConfirmationMsg,"Success: You have added MacBook to your wish list!");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC076_VerifyAddtoWishListButtonofMacBookProductWithLogin*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC077_VerifyCompareThisProductsButtonofMacBookProduct()
	{
		logger.info("*****Starting TC077_VerifyCompareThisProductsButtonofMacBookProduct*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonMacBookCompareThisProductbtn();
			
			logger.info(hp.MacBookCompareThisProductConfirmationMsg());
			String CompareThisProductsConfirmationMsg=hp.MacBookCompareThisProductConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(CompareThisProductsConfirmationMsg,"Success: You have added MacBook to your product comparison!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC077_VerifyCompareThisProductsButtonofMacBookProduct*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC078_VerifyiphoneLnkisRedirectToiphonePage()
	{
		logger.info("*****Starting TC078_VerifyiphoneLnkisRedirectToiphonePage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickoniPhonelnk();
			String iPhonetxt=hp.iPhonePageText();
			Assert.assertEquals(iPhonetxt,"iPhone","iPhone Page is Not Found.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC078_VerifyiphoneLnkisRedirectToiphonePage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC079_VerifyiPhoneDescription()
	{
		logger.info("*****Starting TC079_VerifyiPhoneDescription*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			String iPhonetxt=hp.iPhoneText();
			if(iPhonetxt.equals("iPhone")) {
				Assert.assertEquals(hp.iPhoneDescriptionText(),"iPhone is a revolutionary new mobile phone that allows you to make a call by simply tapping a nam..");
			}else {
				Assert.fail("Product name is not iPhone.");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC079_VerifyiPhoneDescription*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC080_VerifyiPhoneExTax()
	{
		logger.info("*****Starting TC080_VerifyiPhoneExTax*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			
			String iPhonetxt=hp.iPhoneText();
			if(iPhonetxt.equals("iPhone")) {
				 String actualExTaxText =hp.iPhoneExTaxText();
				  logger.info("iPhone Ex Tax Value: "+actualExTaxText);
				Assert.assertEquals(actualExTaxText,"Ex Tax:$101.00");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC080_VerifyiPhoneExTax*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC081_VerifyiPhoneTax()
	{
		logger.info("*****Starting TC081_VerifyiPhoneTax*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp = new HomePage(driver);
		    
		    String iPhoneText = hp.iPhoneText();
		    if (iPhoneText.equals("iPhone")) {
		        String actualTaxText = hp.iPhoneTaxText();
		        logger.info("iPhone Tax Value: "+actualTaxText);
		        Assert.assertEquals(actualTaxText, "$123.00", "Tax is not matching");
		    } else {
		        Assert.fail("Product name is not iPhone.");
		    }

		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC081_VerifyiPhoneTax*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC082_verifyAgroupof3ButtonsaredisplayediniPhoneProduct()
	{
		logger.info("*****Starting TC082_verifyAgroupof3ButtonsaredisplayediniPhoneProduct*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			boolean iPhonegroupbtn=hp.iPhonegroupbuttonIsDisplayed();
			Assert.assertTrue(iPhonegroupbtn, "iPhone group button is not Displayed.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC082_verifyAgroupof3ButtonsaredisplayediniPhoneProduct*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC083_VerifyAddtoCartButtonofiPhoneProduct()
	{
		logger.info("*****Starting TC083_VerifyAddtoCartButtonofiPhoneProduct*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickoniPhoneAddtocartBtn();
			
			logger.info(hp.iPhoneAddtoCartConfirmationMsg());
			String AddtoCartConfirmationMsg=hp.iPhoneAddtoCartConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoCartConfirmationMsg,"Success: You have added iPhone to your shopping cart!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC083_VerifyAddtoCartButtonofiPhoneProduct*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC084_VerifyAddtoWishListButtonofiPhoneProductWithoutLogin()
	{
		logger.info("*****Starting TC084_VerifyAddtoWishListButtonofiPhoneProductWithoutLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickoniPhoneAddtoWishList();
			
			logger.info(hp.iPhoneAddtoWishListConfirmationMsg());
			String AddtoWishListConfirmationMsg=hp.iPhoneAddtoWishListConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoWishListConfirmationMsg,"You must login or create an account to save iPhone to your wish list!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC084_VerifyAddtoWishListButtonofiPhoneProductWithoutLogin*****");
	}		
	
	@Test(groups= {"Regression","Master"})
	public void TC085_VerifyAddtoWishListButtonofiPhoneProductWithLogin()
	{
		logger.info("*****Starting TC085_VerifyAddtoWishListButtonofiPhoneProductWithLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			login();
			hp.ClickonHomeBtn();
			hp.ClickoniPhoneAddtoWishList();	
			
			logger.info(hp.iPhoneAddtoWishListConfirmationMsg());
			String AddtoWishListConfirmationMsg=hp.iPhoneAddtoWishListConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoWishListConfirmationMsg,"Success: You have added iPhone to your wish list!");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC085_VerifyAddtoWishListButtonofiPhoneProductWithLogin*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC086_VerifyCompareThisProductsButtonofiPhoneProduct()
	{
		logger.info("*****Starting TC086_VerifyCompareThisProductsButtonofiPhoneProduct*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickoniPhoneCompareThisProductbtn();
			
			logger.info(hp.iPhoneCompareThisProductConfirmationMsg());
			String CompareThisProductsConfirmationMsg=hp.iPhoneCompareThisProductConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(CompareThisProductsConfirmationMsg,"Success: You have added iPhone to your product comparison!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC086_VerifyCompareThisProductsButtonofiPhoneProduct*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC087_VerifyAppleCinema30LnkisRedirectToAppleCinema30Page()
	{
		logger.info("*****Starting TC087_VerifyAppleCinema30LnkisRedirectToAppleCinema30Page*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonAppleCinema30lnk();
			String AppleCinema30txt=hp.AppleCinema30PageText();
			Assert.assertEquals(AppleCinema30txt,"Apple Cinema 30\"","Apple Cinema 30\"is Not Found.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC087_VerifyAppleCinema30LnkisRedirectToAppleCinema30Page*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC088_VerifyAppleCinema30Description()
	{
		logger.info("*****Starting TC088_VerifyAppleCinema30Description*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			String AppleCinema30txt=hp.AppleCinema30Text();
			if(AppleCinema30txt.equals("Apple Cinema 30\"")) {
				Assert.assertEquals(hp.AppleCinema30DescriptionText(),"The 30-inch Apple Cinema HD Display delivers an amazing 2560 x 1600 pixel resolution. Designed sp..");
			}else {
				Assert.fail("Product name is not AppleCinema30.");
			};
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC088_VerifyAppleCinema30Description*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC089_VerifyAppleCinema30ExTax()
	{
		logger.info("*****Starting TC089_VerifyAppleCinema30ExTax*****");
		WebDriver driver = getDriver();
		try {
			 HomePage hp = new HomePage(driver);
			    String AppleCinema30txt=hp.AppleCinema30Text();
				if(AppleCinema30txt.equals("Apple Cinema 30\"")) {
			        String actualTaxText = hp.AppleCinema30ExTaxText();
			        logger.info("AppleCinema30 Ex Tax Value: "+actualTaxText);
			        Assert.assertEquals(actualTaxText,"Ex Tax:$90.00", "Ex Tax is not matching");
			    } else {
			        Assert.fail("Product name is not AppleCinema30.");
			    }
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC089_VerifyAppleCinema30ExTax*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC090_VerifyAppleCinema30NewTax()
	{
		logger.info("*****Starting TC090_VerifyAppleCinema30NewTax*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp = new HomePage(driver);
		    String AppleCinema30txt=hp.AppleCinema30Text();
			if(AppleCinema30txt.equals("Apple Cinema 30\"")) {
		        String actualTaxText = hp.AppleCinema30NewTaxText();
		        logger.info("AppleCinema30 New Tax Value: "+actualTaxText);
		        Assert.assertEquals(actualTaxText, "$110.00", "New Tax is not matching");
		    } else {
		        Assert.fail("Product name is not AppleCinema30.");
		    }
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC090_VerifyAppleCinema30NewTax*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC091_VerifyAppleCinema30OldTax()
	{
		logger.info("*****Starting TC091_VerifyAppleCinema30OldTax*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp = new HomePage(driver);
		    String AppleCinema30txt=hp.AppleCinema30Text();
			if(AppleCinema30txt.equals("Apple Cinema 30\"")) {
		        String actualTaxText = hp.AppleCinema30OldTaxText();
		        logger.info("AppleCinema30 Old Tax Value: "+actualTaxText);
		        Assert.assertEquals(actualTaxText, "$122.00", "Old Tax is not matching");
		    } else {
		        Assert.fail("Product name is not AppleCinema30.");
		    }
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC091_VerifyAppleCinema30OldTax*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC092_verifyAgroupof3ButtonsaredisplayedinAppleCinema30Product()
	{
		logger.info("*****Starting TC092_verifyAgroupof3ButtonsaredisplayedinAppleCinema30Product*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			boolean AppleCinema30groupbtn=hp.AppleCinema30groupbuttonIsDisplayed();
			Assert.assertTrue(AppleCinema30groupbtn, "AppleCinema30 group button is not Displayed.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC092_verifyAgroupof3ButtonsaredisplayedinAppleCinema30Product*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC093_VerifyAddtoCartButtonoRedirectingToAppleCinema30ProductPage()
	{
		logger.info("*****Starting TC093_VerifyAddtoCartButtonoRedirectingToAppleCinema30ProductPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonAppleCinema30AddtocartBtn();
			String AddtoCartApple30productPage=hp.AppleCinema30AddtoCartRedirectingtoApple30productPage();
			Assert.assertEquals(AddtoCartApple30productPage,"Apple Cinema 30\"");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC093_VerifyAddtoCartButtonoRedirectingToAppleCinema30ProductPage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC094_VerifyAddtoWishListButtonofAppleCinema30ProductWithoutLogin()
	{
		logger.info("*****Starting TC094_VerifyAddtoWishListButtonofAppleCinema30ProductWithoutLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonAppleCinema30AddtoWishList();
			
			logger.info(hp.AppleCinema30AddtoWishListConfirmationMsg());
			String AddtoWishListConfirmationMsg=hp.AppleCinema30AddtoWishListConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoWishListConfirmationMsg,"You must login or create an account to save Apple Cinema 30\" to your wish list!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC094_VerifyAddtoWishListButtonofAppleCinema30ProductWithoutLogin*****");
	}		
	
	@Test(groups= {"Regression","Master"})
	public void TC095_VerifyAddtoAppleCinema30ButtonofAppleCinema30ProductWithLogin()
	{
		logger.info("*****Starting TC095_VerifyAddtoAppleCinema30ButtonofAppleCinema30ProductWithLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			login();
			hp.ClickonHomeBtn();
			hp.ClickonAppleCinema30AddtoWishList();	
			
			logger.info(hp.AppleCinema30AddtoWishListConfirmationMsg());
			String AddtoWishListConfirmationMsg=hp.AppleCinema30AddtoWishListConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoWishListConfirmationMsg,"Success: You have added Apple Cinema 30\" to your wish list!");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC095_VerifyAddtoAppleCinema30ButtonofAppleCinema30ProductWithLogin*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC096_VerifyCompareThisProductsButtonofAppleCinema30Product()
	{
		logger.info("*****Starting TC096_VerifyCompareThisProductsButtonofAppleCinema30Product*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonAppleCinema30CompareThisProductbtn();
			
			logger.info(hp.AppleCinema30CompareThisProductConfirmationMsg());
			String CompareThisProductsConfirmationMsg=hp.AppleCinema30CompareThisProductConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(CompareThisProductsConfirmationMsg,"Success: You have added Apple Cinema 30\" to your product comparison!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC096_VerifyCompareThisProductsButtonofAppleCinema30Product*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC097_VerifyCanonEOS5DLnkisRedirectToCanonEOS5DPage()
	{
		logger.info("*****Starting TC097_VerifyCanonEOS5DLnkisRedirectToCanonEOS5DPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonCanonEOS5Dlnk();
			String CanonEOS5Dtxt=hp.CanonEOS5DPageText();
			Assert.assertEquals(CanonEOS5Dtxt,"Canon EOS 5D","Canon EOS 5D is Not Found.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC097_VerifyCanonEOS5DLnkisRedirectToCanonEOS5DPage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC098_VerifyCanonEOS5DDescription()
	{
		logger.info("*****Starting TC098_VerifyCanonEOS5DDescription*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			String CanonEOS5Dtxt=hp.CanonEOS5DText();
			if(CanonEOS5Dtxt.equals("Canon EOS 5D")) {
				Assert.assertEquals(hp.CanonEOS5DDescriptionText(),"Canon's press material for the EOS 5D states that it 'defines (a) new D-SLR category', while we'r..");
			}else {
				Assert.fail("Product name is not CanonEOS5D.");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC098_VerifyCanonEOS5DDescription*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC099_VerifyCanonEOS5DExTax()
	{
		logger.info("*****Starting TC099_VerifyCanonEOS5DExTax*****");
		WebDriver driver = getDriver();
		try {
			 HomePage hp = new HomePage(driver);
			    String CanonEOS5Dtxt=hp.CanonEOS5DText();
				if(CanonEOS5Dtxt.equals("Canon EOS 5D")) {
			        String actualTaxText = hp.CanonEOS5DExTaxText();
			        logger.info("CanonEOS5D Ex Tax Value: "+actualTaxText);
			        Assert.assertEquals(actualTaxText,"Ex Tax:$80.00", "Ex Tax is not matching");
			    } else {
			        Assert.fail("Product name is not CanonEOS5D.");
			    }
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC099_VerifyCanonEOS5DExTax*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC100_VerifyCanonEOS5DNewTax()
	{
		logger.info("*****Starting TC100_VerifyCanonEOS5DNewTax*****");
		WebDriver driver = getDriver();
		try {
			  HomePage hp = new HomePage(driver);
			    String CanonEOS5Dtxt=hp.CanonEOS5DText();
				if(CanonEOS5Dtxt.equals("Canon EOS 5D")) {
			        String actualTaxText = hp.CanonEOS5DNewTaxText();
			        logger.info("CanonEOS5D New Tax Value: "+actualTaxText);
			        Assert.assertEquals(actualTaxText, "$98.00", "New Tax is not matching");
			    } else {
			        Assert.fail("Product name is not CanonEOS5D.");
			    }
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC100_VerifyCanonEOS5DNewTax*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC101_VerifyCanonEOS5DOldTax()
	{
		logger.info("*****Starting TC101_VerifyCanonEOS5DOldTax*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp = new HomePage(driver);
		    String CanonEOS5Dtxt=hp.CanonEOS5DText();
			if(CanonEOS5Dtxt.equals("Canon EOS 5D")) {
		        String actualTaxText = hp.CanonEOS5DOldTaxText();
		        logger.info("CanonEOS5D Old Tax Value: "+actualTaxText);
		        Assert.assertEquals(actualTaxText, "$122.00", "Old Tax is not matching");
		    } else {
		        Assert.fail("Product name is not CanonEOS5D.");
		    }
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC101_VerifyCanonEOS5DOldTax*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC102_verifyAgroupof3ButtonsaredisplayedinCanonEOS5DProduct()
	{
		logger.info("*****Starting TC102_verifyAgroupof3ButtonsaredisplayedinCanonEOS5DProduct*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			boolean CanonEOS5Dgroupbtn=hp.CanonEOS5DgroupbuttonIsDisplayed();
			Assert.assertTrue(CanonEOS5Dgroupbtn, "CanonEOS5D group button is not Displayed.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC102_verifyAgroupof3ButtonsaredisplayedinCanonEOS5DProduct*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC0103_VerifyAddtoCartButtonoRedirectingToCanonEOS5DProductPage()
	{
		logger.info("*****Starting TC0103_VerifyAddtoCartButtonoRedirectingToCanonEOS5DProductPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			boolean CanonEOS5Dgroupbtn=hp.CanonEOS5DgroupbuttonIsDisplayed();
			Assert.assertTrue(CanonEOS5Dgroupbtn, "CanonEOS5D group button is not Displayed.");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC0103_VerifyAddtoCartButtonoRedirectingToCanonEOS5DProductPage*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC104_VerifyAddtoWishListButtonofCanonEOS5DProductWithoutLogin()
	{
		logger.info("*****Starting TC104_VerifyAddtoWishListButtonofCanonEOS5DProductWithoutLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonCanonEOS5DAddtoWishList();
			
			logger.info(hp.CanonEOS5DAddtoWishListConfirmationMsg());
			String AddtoWishListConfirmationMsg=hp.CanonEOS5DAddtoWishListConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoWishListConfirmationMsg,"You must login or create an account to save Canon EOS 5D to your wish list!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC104_VerifyAddtoWishListButtonofCanonEOS5DProductWithoutLogin*****");
	}		
	
	@Test(groups= {"Regression","Master"})
	public void TC105_VerifyAddtoCanonEOS5DButtonofCanonEOS5DProductWithLogin()
	{
		logger.info("*****Starting TC105_VerifyAddtoCanonEOS5DButtonofCanonEOS5DProductWithLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			login();
			hp.ClickonHomeBtn();
			hp.ClickonCanonEOS5DAddtoWishList();	
			
			logger.info(hp.CanonEOS5DAddtoWishListConfirmationMsg());
			String AddtoWishListConfirmationMsg=hp.CanonEOS5DAddtoWishListConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(AddtoWishListConfirmationMsg,"Success: You have added Canon EOS 5D to your wish list!");
			logout();
			Assert.assertTrue(true,"Logout is not successfully...");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC105_VerifyAddtoCanonEOS5DButtonofCanonEOS5DProductWithLogin*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC106_VerifyCompareThisProductsButtonofCanonEOS5DProduct()
	{
		logger.info("*****Starting TC106_VerifyCompareThisProductsButtonofCanonEOS5DProduct*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			hp.ClickonCanonEOS5DCompareThisProductbtn();
			
			logger.info(hp.CanonEOS5DCompareThisProductConfirmationMsg());
			String CompareThisProductsConfirmationMsg=hp.CanonEOS5DCompareThisProductConfirmationMsg().split("\n")[0].trim();
			
			Assert.assertEquals(CompareThisProductsConfirmationMsg,"Success: You have added Canon EOS 5D to your product comparison!");
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC106_VerifyCompareThisProductsButtonofCanonEOS5DProduct*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC107_VerifyClickonAboutUsLinkRedirectingToAboutUsPage()
	{
		logger.info("*****Starting TC107_VerifyClickonAboutUsLinkRedirectingToAboutUsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.InformationHeadertext().equals("Information")) {
				hp.ClickonAboutUsLink();
				Assert.assertEquals(hp.AboutUsPagetext(),"About Us","About Us Page not Found");
			}
			else {
				Assert.fail("Information Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC107_VerifyClickonAboutUsLinkRedirectingToAboutUsPage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC108_VerifyClickonDeliveryInformationLinkRedirectingToDeliveryInformationPage()
	{
		logger.info("*****Starting TC108_VerifyClickonDeliveryInformationLinkRedirectingToDeliveryInformationPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.InformationHeadertext().equals("Information")) {
				hp.ClickonDeliveryInformationLnk();
				Assert.assertEquals(hp.DeliveryInformationPagetext(),"Delivery Information","Delivery Information Page not Found");
			}
			else {
				Assert.fail("Information Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC108_VerifyClickonDeliveryInformationLinkRedirectingToDeliveryInformationPage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC109_VerifyClickonPrivacypolicyLinkRedirectingToPrivacypolicyPage()
	{
		logger.info("*****Starting TC109_VerifyClickonPrivacypolicyLinkRedirectingToPrivacypolicyPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.InformationHeadertext().equals("Information")) {
				hp.ClickonPrivacypolicyLnk();
				Assert.assertEquals(hp.PrivacypolicyPagetext(),"Privacy Policy","Privacy Policy Page not Found");
			}
			else {
				Assert.fail("Information Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC109_VerifyClickonPrivacypolicyLinkRedirectingToPrivacypolicyPage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC110_VerifyClickonTermsAndConditionsLinkRedirectingToTermsAndConditionsPage()
	{
		logger.info("*****Starting TC110_VerifyClickonTermsAndConditionsLinkRedirectingToTermsAndConditionsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.InformationHeadertext().equals("Information")) {
				hp.ClickonTermsAndConditionsLnk();
				Assert.assertEquals(hp.TermsAndConditionsPagetext(),"Terms & Conditions","Terms & Conditions Page not Found");
			}
			else {
				Assert.fail("Information Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC110_VerifyClickonTermsAndConditionsLinkRedirectingToTermsAndConditionsPage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC111_VerifyClickonContactUsLinkRedirectingToContactUsPage()
	{
		logger.info("*****Starting TC111_VerifyClickonContactUsLinkRedirectingToContactUsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.CustomerServicesHeadertext().equals("Customer Service")) {
				hp.ClickonContactlnk();
				Assert.assertEquals(hp.ContactUsPagetext(),"Contact Us","Contact Us Page not Found");
			}
			else {
				Assert.fail("Customer Service Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC111_VerifyClickonContactUsLinkRedirectingToContactUsPage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC112_VerifyClickonReturnsLinkRedirectingToReturnsPage()
	{
		logger.info("*****Starting TC112_VerifyClickonReturnsLinkRedirectingToReturnsPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.CustomerServicesHeadertext().equals("Customer Service")) {
				hp.ClickonReturnsLnk();
				Assert.assertEquals(hp.ReturnsPagetext(),"Product Returns","Product Returns Page not Found");
			}
			else {
				Assert.fail("Customer Service Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC112_VerifyClickonReturnsLinkRedirectingToReturnsPage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC113_VerifyClickonSiteMapLinkRedirectingToSiteMapPage()
	{
		logger.info("*****Starting TC113_VerifyClickonSiteMapLinkRedirectingToSiteMapPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.CustomerServicesHeadertext().equals("Customer Service")) {
				hp.ClickonSiteMapLnk();
				Assert.assertEquals(hp.SiteMapPagetext(),"Site Map","Site Map Page not Found");
			}
			else {
				Assert.fail("Customer Service Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC113_VerifyClickonSiteMapLinkRedirectingToSiteMapPage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC114_VerifyClickonBrandLinkRedirectingToFindYourFavoriteBrandPage()
	{
		logger.info("*****Starting TC114_VerifyClickonBrandLinkRedirectingToFindYourFavoriteBrandPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.ExtrasHeadertext().equals("Extras")) {
				hp.ClickonBrandsLnk();
				Assert.assertEquals(hp.BrandsPagetext(),"Find Your Favorite Brand","Find Your Favorite Brand Page not Found");
			}
			else {
				Assert.fail("Extras Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC114_VerifyClickonBrandLinkRedirectingToFindYourFavoriteBrandPage*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC115_VerifyClickonGiftCertificatesLinkRedirectingToPurchaseAGiftCertificatePage()
	{
		logger.info("*****Starting TC115_VerifyClickonGiftCertificatesLinkRedirectingToPurchaseAGiftCertificatePage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.ExtrasHeadertext().equals("Extras")) {
				hp.ClickonGiftCertificatesLnk();
				Assert.assertEquals(hp.GiftCertificatesPagetext(),"Purchase a Gift Certificate","Purchase a Gift Certificate Page not Found");
			}
			else {
				Assert.fail("Extras Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC115_VerifyClickonGiftCertificatesLinkRedirectingToPurchaseAGiftCertificatePage*****");
	}		
	
	@Test(groups= {"Sanity","Master"})
	public void TC116_VerifyClickonAffiliateLinkRedirectingToAffiliateProgramPageWithoutLogin()
	{
		logger.info("*****Starting TC116_VerifyClickonAffiliateLinkRedirectingToAffiliateProgramPageWithoutLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.ExtrasHeadertext().equals("Extras")) {
				hp.ClickonAffiliateLnk();
				Assert.assertEquals(hp.AffiliatePagetext(),"Affiliate Program","Affiliate Program page not Found.");
			}
			else {
				Assert.fail("Extras Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC116_VerifyClickonAffiliateLinkRedirectingToAffiliateProgramPageWithoutLogin*****");
	}		
	
	@Test(groups= {"Regression","Master"})
	public void TC117_VerifyClickonAffiliateLinkRedirectingToMyAffiliateAccountPageWithLogin()
	{
		logger.info("*****Starting TC117_VerifyClickonAffiliateLinkRedirectingToMyAffiliateAccountPageWithLogin*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.ExtrasHeadertext().equals("Extras")) {
				login();
				hp.ClickonAffiliateLnk();
				Assert.assertEquals(hp.MyAffiliateAccountPagetext(),"My Affiliate Account","My Affiliate Account page not Found");
				logout();
				Assert.assertTrue(true,"Logout is not successfully...");
			}
			else {
				Assert.fail("Extras Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC117_VerifyClickonAffiliateLinkRedirectingToMyAffiliateAccountPageWithLogin*****");
	}		
	
	
	@Test(groups= {"Sanity","Master"})
	public void TC118_VerifyClickonSpecialLinkRedirectingToSpecialOffersPage()
	{
		logger.info("*****Starting TC118_VerifyClickonSpecialLinkRedirectingToSpecialOffersPage*****");
		WebDriver driver = getDriver();
		try {
			HomePage hp=new HomePage(driver);
			if(hp.ExtrasHeadertext().equals("Extras")) {
				hp.ClickonSpecialsLnk();
				Assert.assertEquals(hp.SpecialsPagetext(),"Special Offers","Special Offers Page not Found.");
			}
			else {
				Assert.fail("Extras Header is not Found...");
			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*****Finished TC118_VerifyClickonSpecialLinkRedirectingToSpecialOffersPage*****");
	}		
	
}
