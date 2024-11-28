package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage
{
	//constructor
	public HomePage(WebDriver driver){
		super(driver);
	}

	//Locators
	@FindBy(xpath="//a[normalize-space()='Qafox.com']") WebElement LogoLnk;
	@FindBy(xpath="//span[normalize-space()='Currency']") WebElement CurrencyBtn;
	@FindBy(xpath="//ul[@Class=\"dropdown-menu\"]/li") List< WebElement> CurrenciesLnk;
	@FindBy(xpath="//button[contains(text(),'€Euro')]") WebElement EuroBtn;
	@FindBy(xpath="//button[normalize-space()='£Pound Sterling']") WebElement PoundBtn;
	@FindBy(xpath="//button[normalize-space()='$US Dollar']") WebElement DollarBtn;
	@FindBy(xpath="//i[@class='fa fa-phone']") WebElement ContactLnk;
	@FindBy(xpath="//i[@class='fa fa-user']") WebElement lnkMyAccount;
	@FindBy(xpath="//ul[@Class=\"dropdown-menu dropdown-menu-right\"]/li") List< WebElement> MyAccountLnks;
	
	@FindBy(xpath="(//a[normalize-space()='Register'])[1]") WebElement lnkRegister;
	@FindBy(xpath="(//a[normalize-space()='Login'])[1]") WebElement lnklogin;
	@FindBy(xpath="(//ul[@class=\"dropdown-menu dropdown-menu-right\"]/li)[1]") WebElement MyAccountHeaderLnk;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a") WebElement OrderHistoryHeaderLnk;
	@FindBy(xpath="(//a[normalize-space()='Transactions'])[1]") WebElement TransactionLnk;
	@FindBy(xpath="//h1[normalize-space()='Your Transactions']") WebElement TransactionsPage;
	@FindBy(xpath="(//a[normalize-space()='Downloads'])[1]") WebElement DownloadsLnk;
	@FindBy(xpath="//h2[normalize-space()='Account Downloads']") WebElement DownloadsPage;
	@FindBy(xpath="(//a[normalize-space()='Logout'])[1]") WebElement LogoutLink;
	@FindBy(xpath="//*[@id=\"content\"]/h1") WebElement LogoutPage;
			
	@FindBy(xpath="//li/a[@id=\"wishlist-total\"]") WebElement wishlistlnk;
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']") WebElement shoppingcartlnk;
	@FindBy(xpath="//span[normalize-space()='Checkout']") WebElement Checkoutlnk;
	@FindBy(xpath="//input[@placeholder='Search']") WebElement Searchinputboxbtn;
	@FindBy(xpath="//i[@class='fa fa-search']") WebElement Searchbtn;
	@FindBy(xpath="//span[@id='cart-total']") WebElement addtocartbtn;
	
	@FindBy(xpath="//a[normalize-space()='Desktops']") WebElement desktopslnk;
	@FindBy(xpath="//a[normalize-space()='PC (0)']") WebElement pc0lnk;
	@FindBy(xpath="//ul[@class='list-unstyled']//a[contains(text(),'Mac (1)')]") WebElement mac1lnk;
	@FindBy(xpath="//a[normalize-space()='Show AllDesktops']") WebElement ShowAllDesktopslnk;
	
	@FindBy(xpath="//a[normalize-space()='Laptops & Notebooks']") WebElement LaptopsandNotebookslnk;
	@FindBy(xpath="//a[normalize-space()='Macs (0)']") WebElement macs0lnk;
	@FindBy(xpath="//a[normalize-space()='Windows (0)']") WebElement windows0lnk;
	@FindBy(xpath="//a[normalize-space()='Show AllLaptops & Notebooks']") WebElement ShowAllLaptopsandNotebookslnk;

	@FindBy(xpath="//a[normalize-space()='Components']") WebElement componentslnk;
	@FindBy(xpath="//a[normalize-space()='Mice and Trackballs (0)']") WebElement miceandtrackballs0lnk;
	@FindBy(xpath="//a[normalize-space()='Monitors (2)']") WebElement monitors2lnk;
	@FindBy(xpath="//a[normalize-space()='Printers (0)']") WebElement printers0lnk;
	@FindBy(xpath="//a[normalize-space()='Scanners (0)']") WebElement scanners0lnk;
	@FindBy(xpath="//a[normalize-space()='Web Cameras (0)']") WebElement webcameras0lnk;
	@FindBy(xpath="//a[normalize-space()='Show AllComponents']") WebElement showallcomponentslnk;
	
	@FindBy(xpath="//a[normalize-space()='Tablets']") WebElement tabletslnk;
	@FindBy(xpath="//a[normalize-space()='Software']") WebElement softwarelnk;
	@FindBy(xpath="//a[normalize-space()='Phones & PDAs']") WebElement phonesandpdaslnk;
	@FindBy(xpath="//a[normalize-space()='Cameras']") WebElement cameraslnk;
	
	@FindBy(xpath="//a[normalize-space()='MP3 Players']") WebElement mp3playerslnk;
	@FindBy(xpath="//a[normalize-space()='test 11 (0)']") WebElement test11_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 12 (0)']") WebElement test12_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 15 (0)']") WebElement test15_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 16 (0)']") WebElement test16_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 17 (0)']") WebElement test17_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 18 (0)']") WebElement test18_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 19 (0)']") WebElement test19_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 20 (0)']") WebElement test20_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 21 (0)']") WebElement test21_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 22 (0)']") WebElement test22_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 23 (0)']") WebElement test23_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 24 (0)']") WebElement test24_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 4 (0)']") WebElement test4_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 5 (0)']") WebElement test5_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 6 (0)']") WebElement test6_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 7 (0)']") WebElement test7_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 8 (0)']") WebElement test8_0_lnk;
	@FindBy(xpath="//a[normalize-space()='test 9 (0)']") WebElement test9_0_lnk;
	@FindBy(xpath="//a[normalize-space()='Show AllMP3 Players']") WebElement ShowAllMP3Playerslnk;
	
	@FindBy(xpath="//h3[normalize-space()='Featured']") WebElement FeaturedHeadertxt;
	
	@FindBy(xpath="//a[normalize-space()='MacBook']") WebElement MacBooklnk;
	@FindBy(xpath="//h1[normalize-space()='MacBook']") WebElement MacBookPage;
	@FindBy(xpath="//p[contains(text(),'Intel Core 2 Duo processor')]") WebElement MacBookDescriptiontxt;
	@FindBy(xpath="(//p[@class=\"price\"])[1]") WebElement MacBookTaxtxt;
	@FindBy(xpath="(//p/span)[1]") WebElement MacBookExTaxtxt;
	@FindBy(xpath="(//div[@class=\"button-group\"])[1]") WebElement MacBookGroupBtn;
	@FindBy(xpath="(//span[contains(text(),'Add to Cart')])[1]") WebElement MacBookAddtocartBtn;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]")  WebElement MacBookAddtoWishList;
	@FindBy(xpath="//i[@class='fa fa-home']")  WebElement HomeBtn;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[3]") WebElement MacBookCompareThisProductbtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement MacBookConfirmationMsg;
	
	@FindBy(xpath="(//a[normalize-space()='iPhone'])") WebElement iPhonelnk;
	@FindBy(xpath="//h1[normalize-space()='iPhone']") WebElement iPhonePage;
	@FindBy(xpath="//p[contains(text(),'iPhone is a revolutionary new mobile phone that al')]") WebElement iPhoneDescriptiontxt;
	@FindBy(xpath="(//p[@class=\"price\"])[2]") WebElement iPhoneTaxtxt;
	@FindBy(xpath="(//p/span)[2]") WebElement iPhoneExTaxtxt;
	@FindBy(xpath="(//div[@class=\"button-group\"])[2]") WebElement iPhoneGroupBtn;
	@FindBy(xpath="(//span[contains(text(),'Add to Cart')])[2]") WebElement iPhoneAddtocartBtn;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]")  WebElement iPhoneAddtoWishList;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[3]") WebElement iPhoneCompareThisProductbtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement iPhoneConfirmationMsg;
	
	@FindBy(xpath="//a[normalize-space()='Apple Cinema 30\"']") WebElement AppleCinema30lnk;
	@FindBy(xpath="//h1[normalize-space()='Apple Cinema 30\"']") WebElement AppleCinema30Page;
	@FindBy(xpath="//p[contains(text(),'The 30-inch Apple Cinema HD Display delivers an am')]") WebElement AppleCinema30Descriptiontxt;
	@FindBy(xpath="//span[normalize-space()='Ex Tax:$90.00']") WebElement AppleCinema30ExTaxtxt;
	@FindBy(xpath="//span[normalize-space()='$110.00']") WebElement AppleCinema30NewTaxtxt;
	@FindBy(xpath="//span[normalize-space()='$122.00']") WebElement AppleCinema30OldTaxtxt;
	@FindBy(xpath="(//div[@class=\"button-group\"])[3]") WebElement AppleCinema30GroupBtn;
	@FindBy(xpath="(//span[contains(text(),'Add to Cart')])[3]") WebElement AppleCinema30AddtocartBtn;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[2]")  WebElement AppleCinema30AddtoWishList;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[3]") WebElement AppleCinema30CompareThisProductbtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement AppleCinema30ConfirmationMsg;
	@FindBy(xpath="//h1[normalize-space()='Apple Cinema 30\"']") WebElement AppleCinema30Pagetext;
	
	@FindBy(xpath="//a[normalize-space()='Canon EOS 5D']") WebElement CanonEOS5Dlnk;
	@FindBy(xpath="//h1[normalize-space()='Canon EOS 5D']") WebElement CanonEOS5DPage;
	@FindBy(xpath="//p[contains(text(),\"Canon's press material for the EOS 5D states that \")]") WebElement CanonEOS5DDescriptiontxt;
	@FindBy(xpath="//span[normalize-space()='Ex Tax:$80.00']") WebElement CanonEOS5DExTaxtxt;
	@FindBy(xpath="//span[normalize-space()='$98.00']") WebElement CanonEOS5DNewTaxtxt;
	@FindBy(xpath="//span[normalize-space()='$122.00']") WebElement CanonEOS5DOldTaxtxt;
	@FindBy(xpath="(//div[@class=\"button-group\"])[4]") WebElement CanonEOS5DGroupBtn;
	@FindBy(xpath="(//span[contains(text(),'Add to Cart')])[4]") WebElement CanonEOS5DAddtocartBtn;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[4]/div/div[3]/button[2]")  WebElement CanonEOS5DAddtoWishList;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[4]/div/div[3]/button[3]") WebElement CanonEOS5DCompareThisProductbtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement CanonEOS5DConfirmationMsg;
	@FindBy(xpath="//h1[normalize-space()='Canon EOS 5D']") WebElement CanonEOS5DPagetext;
	

    @FindBy(xpath="//h5[normalize-space()='Information']") WebElement InformationHeadertext;
	@FindBy(xpath="//a[normalize-space()='About Us']") WebElement AboutUsLnk;
	@FindBy(xpath="//h1[normalize-space()='About Us']") WebElement AboutUsPage;
	@FindBy(xpath="//ul[@class='list-unstyled']//a[contains(text(),'Delivery Information')]") WebElement DeliveryInformationLnk;
	@FindBy(xpath="//h1[normalize-space()='Delivery Information']") WebElement DeliveryInformationPage;
	@FindBy(xpath="//a[normalize-space()='Privacy Policy']") WebElement PrivacypolicyLnk;
	@FindBy(xpath="//a[normalize-space()='Privacy Policy']") WebElement PrivacypolicyPage;
	@FindBy(xpath="//a[normalize-space()='Terms & Conditions']") WebElement TermsAndConditionsLnk;
	@FindBy(xpath="//h1[normalize-space()='Terms & Conditions']") WebElement TermsAndConditionsPage;
	
	@FindBy(xpath="//h5[normalize-space()='Customer Service']") WebElement CustomerServicesHeadertext;
	@FindBy(xpath="//a[normalize-space()='Contact Us']") WebElement ContactUsLnk;
	@FindBy(xpath="//h1[normalize-space()='Contact Us']") WebElement ContactUsPage;
	@FindBy(xpath="//a[normalize-space()='Returns']") WebElement ReturnsLnk;
	@FindBy(xpath="//h1[normalize-space()='Product Returns']") WebElement ReturnsPage;
	@FindBy(xpath="//a[normalize-space()='Site Map']") WebElement SiteMapLnk;
	@FindBy(xpath="//h1[normalize-space()='Site Map']") WebElement SiteMapPage;
	
	@FindBy(xpath="//h5[normalize-space()='Extras']") WebElement ExtrasHeadertext;
	@FindBy(xpath="//a[normalize-space()='Brands']") WebElement BrandsLnk;
	@FindBy(xpath="//h1[normalize-space()='Find Your Favorite Brand']") WebElement BrandsPage;
	@FindBy(xpath="//a[normalize-space()='Gift Certificates']") WebElement GiftCertificatesLnk;
	@FindBy(xpath="//h1[normalize-space()='Purchase a Gift Certificate']") WebElement GiftCertificatesPage;
	@FindBy(xpath="//a[normalize-space()='Affiliate']") WebElement AffiliateLnk;
	@FindBy(xpath="//h1[normalize-space()='Affiliate Program']") WebElement AffiliatePage;
	@FindBy(xpath="//h2[normalize-space()='My Affiliate Account']") WebElement MyAffiliateAccountPage;
	@FindBy(xpath="//a[normalize-space()='Specials']") WebElement SpecialsLnk;
	@FindBy(xpath="//h2[normalize-space()='Special Offers']") WebElement SpecialsPage;
	
	@FindBy(xpath="//h5[normalize-space()='My Account']") WebElement MyAccountHeadertext;
	@FindBy(xpath="//a[contains(text(),'My Account')]") WebElement MyAccountLnk;
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement MyAccountPage;
	@FindBy(xpath="//h2[normalize-space()='Returning Customer']") WebElement ReturingCustomerPage;
	@FindBy(xpath="//a[normalize-space()='Order History']") WebElement OrderHistoryLnk;
	@FindBy(xpath="//h1[normalize-space()='Order History']") WebElement OrderHistoryPage;
	@FindBy(xpath="//a[normalize-space()='Wish List']") WebElement WishListLnk;
	@FindBy(xpath="//h2[normalize-space()='My Wish List']") WebElement WishListPage;
	@FindBy(xpath="//a[normalize-space()='Newsletter']") WebElement NewsLetterLnk;
	@FindBy(xpath="//h1[normalize-space()='Newsletter Subscription']") WebElement NewsLetterPage;
	
	//Action Methods
	 public boolean LogoisDisplayed() {
		 return LogoLnk.isDisplayed();
	 }
	 
	 
	 public void ClickOnCurrencyButton() {
		 CurrencyBtn.click();
	 }
	 public boolean CurrenciesAreDisplayed() {
	        for (WebElement link : CurrenciesLnk) {
	            if (!link.isDisplayed()) {
	                return false;
	            }
	        }
	        return true;
	    }
	 public void ClickOnEurobutton() {
		 EuroBtn.click();
	 }
	 public void ClickOnPoundbutton() {
		 PoundBtn.click();
	 }
	 public void ClickOnDollarbutton() {
		 DollarBtn.click();
	 }
	 
	 
	 public void ClickonContactlnk() {
		 ContactLnk.click();
	 }
	
	 
	 public void clickonMyAccountlnkinHeader() {
		    try {
		        lnkMyAccount.click();
		    } catch (ElementClickInterceptedException e) {
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click();", lnkMyAccount);
		    }
		}
	 public boolean MyAccountLinksAreDisplayed() {
	        for (WebElement link : MyAccountLnks) {
	            if (!link.isDisplayed()) {
	                return false;
	            }
	        }
	        return true;
	    }

	 public void clickonRegisterlnk() {
		 try {
	     lnkRegister.click();
		 }catch(Exception e) {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 WebElement myAccountLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Login'])[1]")));
			 myAccountLink.click();
		 }
	 } 
	 public void clickonLoginlnk() {
	    lnklogin.click();
	 }
	 public void ClickonMyCCOUNTLink() {
		 try {
			 MyAccountLnk.click();
		    } catch (ElementClickInterceptedException e) {
		        // Fallback to JavaScript if click is intercepted
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click();", MyAccountLnk);
		    }
		}
		
		public void ClickonOrderHistoryHeaderLnk() {
			OrderHistoryHeaderLnk.click();
		}
		
		public void ClickonTransactionLnk() {
			        TransactionLnk.click();
			  
		}
		public void ClickonDownloadsLnk(){
			DownloadsLnk.click();
		}
		
		public void ClickonLogoutLink(){
		    LogoutLink.click();
		}
		public String TransactionPagetext() {
			return TransactionsPage.getText();
		}
		public String DownloadsPagetext() {
			return DownloadsPage.getText();
		}
		public String LogoutPagetext() {
			return LogoutPage.getText();
		}
	 
	 
	 public void ClickonWishListlnk() {
		 wishlistlnk.click();
	 }
	 
	 
	 public void ClickonShoppingCartlnk() {
		 shoppingcartlnk.click();
	 }
	 
	 
	 public void ClickonCheckoutlnk() {
		 Checkoutlnk.click();
	 }
	 
	 
	 public boolean searchInputboxisEnabled() {
		 return Searchinputboxbtn.isEnabled();
	 }
	 public void ClickonSearchbtn() {
		 Searchbtn.click();
	 }
	 public void SetSearchData(String searchdata) {
		 Searchinputboxbtn.sendKeys(searchdata);
	}
	 
	 
	 public void ClickonAddtoCart() {
		 addtocartbtn.click();
	 }
	 
	 //Desktops
	 public void hoveringmouseonDesktops() {
		 Actions action=new Actions(driver);
		 action.moveToElement(desktopslnk).perform();
	 }
	 public void ClickonDesktops() {
		 desktopslnk.click();
	 }
	 public void ClickonPC0() {
		 pc0lnk.click();
	 }
	 public void Clickonmac1lnk() {
		 mac1lnk.click();
	 }
	 public void ClickonShowAllDesktopslnk() {
		 ShowAllDesktopslnk.click();
	 }
	
	 //LaptopsandNotebooks
	 public void hoveringmouseonLaptopsandNotebookslnk() {
		 Actions action=new Actions(driver);
		 action.moveToElement(LaptopsandNotebookslnk).perform();
	 }
	 public void ClickonLaptopsandNotebookslnk() {
		 LaptopsandNotebookslnk.click();
	 }
	 public void Clickonmacs0lnk() {
		 macs0lnk.click();
	 }
	 public void Clickonwindows0lnk() {
		 windows0lnk.click();
	 }
	 public void ClickonShowAllLaptopsandNotebookslnk() {
		 ShowAllLaptopsandNotebookslnk.click();
	 }
	 
	 //cameras
	 public void hoveringmouseoncomponentslnk() {
		 Actions action=new Actions(driver);
		 action.moveToElement(componentslnk).perform();
	 }
	 public void Clickoncomponentslnk() {
		 componentslnk.click();
	 }
	 public void Clickonmiceandtrackballs0lnk() {
		 miceandtrackballs0lnk.click();
	 }
	 public void Clickonmonitors2lnk() {
		 monitors2lnk.click();
	 }
	 public void clickonprinters0lnk() {
		 printers0lnk.click();
	 }
	 public void Clickonscanners0lnk() {
		 scanners0lnk.click();
	 }
	 public void Clickonwebcameras0lnk() {
		 webcameras0lnk.click();
	 }
	 public void Clickonshowallcomponentslnk() {
		 showallcomponentslnk.click();
	 }
	 public void Clickontabletslnk() {
		 tabletslnk.click();
	 }
	 public void Clickonsoftwarelnk() {
		 softwarelnk.click();
	 }
	 public void Clickonphonesandpdaslnk() {
		 phonesandpdaslnk.click();
	 }
	 public void Clickoncameraslnk() {
		 cameraslnk.click();
	 }
	 
	 
	 //MP3Players
	 public void hoveringmouseonMP3Playerslnk() {
		 Actions action=new Actions(driver);
		 action.moveToElement(mp3playerslnk).perform();
	 }
	 public void ClickonMp3Playerslnkk() {
		 mp3playerslnk.click();
	 }
	 public void ClickonTest11_0_lnk() {
		 test11_0_lnk.click();
	 }
	 public void ClickonTest12_0_lnk() {
		 test12_0_lnk.click();
	 }
	 public void ClickonTest15_0_lnk() {
		 test15_0_lnk.click();
	 }
	 public void ClickonTest16_0_lnk() {
		 test16_0_lnk.click();
	 }
	 public void ClickonTest17_0_lnk() {
		 test17_0_lnk.click();
	 }
	 public void ClickonTest18_0_lnk() {
		 test18_0_lnk.click();
	 }
	 public void ClickonTest19_0_lnk() {
		 test19_0_lnk.click();
	 }
	 public void ClickonTest20_0_lnk() {
		 test20_0_lnk.click();
	 }
	 public void ClickonTest21_0_lnk() {
		 test21_0_lnk.click();
	 }
	 public void ClickonTest22_0_lnk() {
		 test22_0_lnk.click();
	 }
	 public void ClickonTest23_0_lnk() {
		 test23_0_lnk.click();
	 }
	 public void ClickonTest24_0_lnk() {
		 test24_0_lnk.click();
	 }
	 public void ClickonTest4_0_lnk() {
		 test4_0_lnk.click();
	 }
	 public void ClickonTest5_0_lnk() {
		 test5_0_lnk.click();
	 }
	 public void ClickonTest6_0_lnk() {
		 test6_0_lnk.click();
	 }
	 public void ClickonTest7_0_lnk() {
		 test7_0_lnk.click();
	 }
	 public void ClickonTest8_0_lnk() {
		 test8_0_lnk.click();
	 }
	 public void ClickonTest9_0_lnk() {
		 test9_0_lnk.click();
	 }
	 public void ClickonShowAllMP3Playerslnk() {
		 ShowAllMP3Playerslnk.click();
	 }
	 
	 
	 public String FeaturedHeadlineText() {
		 return FeaturedHeadertxt.getText();
	 }
	 
	 //MacBook
	 public void ClickonMacBooklnk() {
		 MacBooklnk.click();
		 }
	 public String MacBookPageText() {
		 return MacBookPage.getText();
	 }
	 public String MacBookText() {
		 return MacBooklnk.getText();
	 }
	 public String MacBookDescriptionText() {
		 return MacBookDescriptiontxt.getText();
	 }
	 public String MacBookTaxText() {
		 return MacBookTaxtxt.getText();
	 }
	 public String MacBookExTaxText() {
		 return MacBookExTaxtxt.getText();
	 }
	 public boolean MacBookgroupbuttonIsDisplayed() {
		 return  MacBookGroupBtn.isDisplayed();
	 }
	 public void ClickonMacBookAddtocartBtn() {
		 MacBookAddtocartBtn.click();
	 }
	 public String MacBookAddtoCartConfirmationMsg() {
		 return MacBookConfirmationMsg.getText();
	 }
	 public void ClickonHomeBtn() {
		 HomeBtn.click();
	 }
	 public void ClickonMacBookAddtoWishList() {
		 MacBookAddtoWishList.click();
	 }
	 public String MacBookAddtoWishListConfirmationMsg() {
		 return MacBookConfirmationMsg.getText();
	 }
	 public void ClickonMacBookCompareThisProductbtn() {
		 MacBookCompareThisProductbtn.click();
	 }
	 public String MacBookCompareThisProductConfirmationMsg() {
		 return MacBookConfirmationMsg.getText();
	 }
	 
	 //iPhone
	 public void ClickoniPhonelnk() {
		 iPhonelnk.click();
		 }
	 public String iPhonePageText() {
		 return iPhonePage.getText();
	 }
	 public String iPhoneText() {
		 return iPhonelnk.getText();
	 }
	 public String iPhoneDescriptionText() {
		 return iPhoneDescriptiontxt.getText();
	 }
	 public String iPhoneTaxText() {
		 return iPhoneTaxtxt.getText();
	 }
	 public String iPhoneExTaxText() {
		 return iPhoneExTaxtxt.getText();
	 }
	 public boolean iPhonegroupbuttonIsDisplayed() {
		 return  iPhoneGroupBtn.isDisplayed();
	 }
	 public void ClickoniPhoneAddtocartBtn() {
		 iPhoneAddtocartBtn.click();
	 }
	 public String iPhoneAddtoCartConfirmationMsg() {
		 return iPhoneConfirmationMsg.getText();
	 }
	 public void ClickoniPhoneAddtoWishList() {
		 iPhoneAddtoWishList.click();
	 }
	 public String iPhoneAddtoWishListConfirmationMsg() {
		 return iPhoneConfirmationMsg.getText();
	 }
	 public void ClickoniPhoneCompareThisProductbtn() {
		 iPhoneCompareThisProductbtn.click();
	 }
	 public String iPhoneCompareThisProductConfirmationMsg() {
		 return iPhoneConfirmationMsg.getText();
	 }
	 
	 //AppleCinema30
	 public void ClickonAppleCinema30lnk() {
		 AppleCinema30lnk.click();
		 }
	 public String AppleCinema30PageText() {
		 return AppleCinema30Page.getText();
	 }
	 public String AppleCinema30Text() {
		 return AppleCinema30lnk.getText();
	 }
	 public String AppleCinema30DescriptionText() {
		 return AppleCinema30Descriptiontxt.getText();
	 }
	 public String AppleCinema30ExTaxText() {
		 return AppleCinema30ExTaxtxt.getText();
	 }
	 public String AppleCinema30OldTaxText() {
		 return AppleCinema30OldTaxtxt.getText();
	 }
	 public String AppleCinema30NewTaxText() {
		 return AppleCinema30NewTaxtxt.getText();
	 }
	 public boolean AppleCinema30groupbuttonIsDisplayed() {
		 return  AppleCinema30GroupBtn.isDisplayed();
	 }
	 public void ClickonAppleCinema30AddtocartBtn() {
		 AppleCinema30AddtocartBtn.click();
	 }
	 public String AppleCinema30AddtoCartRedirectingtoApple30productPage() {
		 return AppleCinema30Pagetext.getText();
	 }
	 public void ClickonAppleCinema30AddtoWishList() {
		 AppleCinema30AddtoWishList.click();
	 }
	 public String AppleCinema30AddtoWishListConfirmationMsg() {
		 return AppleCinema30ConfirmationMsg.getText();
	 }
	 public void ClickonAppleCinema30CompareThisProductbtn() {
		 AppleCinema30CompareThisProductbtn.click();
	 }
	 public String AppleCinema30CompareThisProductConfirmationMsg() {
		 return AppleCinema30ConfirmationMsg.getText();
	 }
	 
	 
	 //CanonEOS5D
	 public void ClickonCanonEOS5Dlnk() {
		 CanonEOS5Dlnk.click();
		 }
	 public String CanonEOS5DPageText() {
		 return CanonEOS5DPage.getText();
	 }
	 public String CanonEOS5DText() {
		 return CanonEOS5Dlnk.getText();
	 }
	 public String CanonEOS5DDescriptionText() {
		 return CanonEOS5DDescriptiontxt.getText();
	 }
	 public String CanonEOS5DExTaxText() {
		 return CanonEOS5DExTaxtxt.getText();
	 }
	 public String CanonEOS5DOldTaxText() {
		 return CanonEOS5DOldTaxtxt.getText();
	 }
	 public String CanonEOS5DNewTaxText() {
		 return CanonEOS5DNewTaxtxt.getText();
	 }
	 public boolean CanonEOS5DgroupbuttonIsDisplayed() {
		 return  CanonEOS5DGroupBtn.isDisplayed();
	 }
	 public void ClickonCanonEOS5DAddtocartBtn() {
		 CanonEOS5DAddtocartBtn.click();
	 }
	 public String CanonEOS5DAddtoCartRedirectingtoCanonEOS5DproductPage() {
		 return CanonEOS5DPagetext.getText();
	 }
	 public void ClickonCanonEOS5DAddtoWishList() {
		 CanonEOS5DAddtoWishList.click();
	 }
	 public String CanonEOS5DAddtoWishListConfirmationMsg() {
		 return CanonEOS5DConfirmationMsg.getText();
	 }
	 public void ClickonCanonEOS5DCompareThisProductbtn() {
		 CanonEOS5DCompareThisProductbtn.click();
	 }
	 public String CanonEOS5DCompareThisProductConfirmationMsg() {
		 return CanonEOS5DConfirmationMsg.getText();
	 }
	 
	 
	 //footerSection Information Headeader
	 public String InformationHeadertext() {
		return InformationHeadertext.getText();
	 }
	 public void ClickonAboutUsLink() {
		 AboutUsLnk.click();
	 }
	 public String AboutUsPagetext() {
			return AboutUsPage.getText();
		}
	 public void ClickonDeliveryInformationLnk() {
		 DeliveryInformationLnk.click();
	 }
	 public String DeliveryInformationPagetext() {
			return DeliveryInformationPage.getText();
		}
	 public void ClickonPrivacypolicyLnk() {
		 PrivacypolicyLnk.click();
	 }
	 public String PrivacypolicyPagetext() {
			return PrivacypolicyPage.getText();
		}
	 public void ClickonTermsAndConditionsLnk() {
		 TermsAndConditionsLnk.click();
	 }
	 public String TermsAndConditionsPagetext() {
			return TermsAndConditionsPage.getText();
		}
	 
	//footerSection Customer Services Header
	 public String CustomerServicesHeadertext() {
			return CustomerServicesHeadertext.getText();
		}
	 public void ClickonContactUsLnk() {
		 ContactUsLnk.click();
	 }
	 public String ContactUsPagetext() {
			return ContactUsPage.getText();
		}
	 public void ClickonReturnsLnk() {
		 ReturnsLnk.click();
	 }
	 public String ReturnsPagetext() {
			return ReturnsPage.getText();
	 }
	 public void ClickonSiteMapLnk() {
		 SiteMapLnk.click();
	 }
	 public String SiteMapPagetext() {
			return SiteMapPage.getText();
	 }
	 
	//footerSection Extras Header
	 public String ExtrasHeadertext() {
			return ExtrasHeadertext.getText();
		}
	 public void ClickonBrandsLnk() {
		 BrandsLnk.click();
	 }
	 public String BrandsPagetext() {
			return BrandsPage.getText();
		}
	 public void ClickonGiftCertificatesLnk() {
		 GiftCertificatesLnk.click();
	 }
	 public String GiftCertificatesPagetext() {
			return GiftCertificatesPage.getText();
		}
	 public void ClickonAffiliateLnk() {
		 AffiliateLnk.click();
	 }
	 public String AffiliatePagetext() {
			return AffiliatePage.getText();
		}
	 public String MyAffiliateAccountPagetext() {
			return MyAffiliateAccountPage.getText();
		}
	 public void ClickonSpecialsLnk() {
		 SpecialsLnk.click();
	 }
	 public String SpecialsPagetext() {
			return SpecialsPage.getText();
		}
	 
	//footerSection MyAccount Header
	 public String MyAccountHeadertext() {
			return MyAccountHeadertext.getText();
		}
	 public void ClickonMyAccountLnk() {
		 MyAccountLnk.click();
	 }
	 public String ReturingCustomerPagetext() {
			return ReturingCustomerPage.getText();
		}
	 public void ClickonOrderHistortLnk() {
		 OrderHistoryLnk.click();
	 }
	 public void ClickonWishListLnk() {
		 WishListLnk.click();
	 }
	 public void ClickonNewsLetterLnk() {
		 NewsLetterLnk.click();
	 }
	 public String MyAccountPagetext() {
			return MyAccountPage.getText();
		}
	 public String OrderHistoryPagetext() {
			return OrderHistoryPage.getText();
		}
	 public String WishListPagetext() {
			return WishListPage.getText();
		}
	 public String NewsLetterPagetext() {
			return NewsLetterPage.getText();
		}
}
