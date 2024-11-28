package pageObjects;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")  WebElement txtEmailAddress;
	@FindBy(xpath="//input[@id='input-password']")  WebElement txtPassword;
	@FindBy(xpath="//input[@value='Login']")  WebElement btnlogin;
	@FindBy(xpath="(//a[normalize-space()='Logout'])[1]")  WebElement btnlogout;
	
	public void SetEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}
	
	public void SetPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void ClickLogin() {
		btnlogin.click();
	}
	
	public void ClickLogout() {
	    try {
	    	btnlogout.click();
	    } catch (ElementClickInterceptedException e) {
	        // Fallback to JavaScript if click is intercepted
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", btnlogout);
	    }
	}

}
