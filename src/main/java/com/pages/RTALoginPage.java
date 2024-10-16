package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RTALoginPage {

	private WebDriver driver;
	
	// On Main home page
	private By advanceBtnID=By.id("details-button");
	private By partialLinkUnsafe = By.partialLinkText("10.150.5.88");
	private By rtaLoginBtnHMPGXpath = By.xpath("//button[@id='RTALogin' and @type='button']");
	
	
	
	// On Login page of RTA
	private By useridtxtID = By.id("userId");
	private By captchatxtID = By.id("captcha");
	private By passwordTxtId = By.id("pwd");
	private By loginBtnId = By.id("loginButton");
	private By useridlblXpath = By.xpath("//*[@for='userId' ]");
	private By passwordlblXpath = By.xpath("//*[@for='pwd']");
	private By captchalblXpath = By.xpath("//*[@for='captcha']");
	private By errorMesgXpath = By.xpath("//*[@class='error ; font']");
	private By forgotPasswordPageXpath = By.xpath("//*[contains(@title,'Forgot Password')]");
	private By linkForgotPassword = By.partialLinkText("Forgot");
	private By emailID = By.id("emailId");
	private By submitBtnXpath = By.xpath("//*[contains(@title,'Submit_Button')]");
	private By resetBtnXpath = By.xpath("//*[contains(@title,'Reset_Button')]");
	private By successmsgXpath = By.xpath("/html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td/h5/p/font");
	
	
	// on Home page after login
	private By welcomeMsgXpath = By.xpath("//*[@class='welcomeBar' and @style='text-align:left;']");
	
	// 2. Constructor of page class
	public RTALoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void waitImplicit() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	// note assertion should not be write here (it should be written in step or runner class
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public void switchToFrame() {
		driver.switchTo().frame(0);
		//System.out.println(driver.getPageSource());
	}
	public void clickAdvBtn() {
		//waitImplicit();
		driver.findElement(advanceBtnID).click();
		driver.findElement(partialLinkUnsafe).click();
	}
	
	public void clickRTALoginHmPgBtn() {
		driver.findElement(rtaLoginBtnHMPGXpath).click();
	}
	
	public void enterUserID(String userID) {
		driver.findElement(useridtxtID).sendKeys(userID);
	}
	
	public void enterCaptcha(String captcha) {
		driver.findElement(captchatxtID).sendKeys(captcha);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordTxtId).sendKeys(password);
	}
	
	public void clickLognBtnOnLogPg() {
		driver.findElement(loginBtnId).click();
	}
	
	public String getWelcomeMsg() {
		return driver.findElement(welcomeMsgXpath).getText();
	}
	
	public boolean checkuseridLblPresent() {
		return driver.findElement(useridlblXpath).isDisplayed();
	}
	
	public boolean checkuseridTxtPresent() {
		return driver.findElement(useridtxtID).isDisplayed();
	}
	
	public boolean checkpasswordLblPresent() {
		return driver.findElement(passwordlblXpath).isDisplayed();
	}
	
	public boolean checkpasswordTxtPresent() {
		return driver.findElement(passwordTxtId).isDisplayed();
	}
	
	public boolean checkcaptchaLblPresent() {
		return driver.findElement(captchalblXpath).isDisplayed();
	}
	
	public boolean checkLoginBtnPresent() {
		return driver.findElement(loginBtnId).isDisplayed();
	}
	
	public void clickForgotLink() {
		driver.findElement(linkForgotPassword).click();
	}
	
	public boolean checkForgotLink() {
		return driver.findElement(linkForgotPassword).isDisplayed();
	}
	
	public String getForgotPassword() {
		return driver.findElement(forgotPasswordPageXpath).getText();
	}
	
	public boolean checkUserID() {
		return driver.findElement(useridtxtID).isDisplayed();
	}
	
   public boolean checkEmailID() {
	 return driver.findElement(emailID).isDisplayed();
   }
   
   public void enterEmailID(String emailid) {
	   driver.findElement(emailID).sendKeys(emailid);
   }
	
   public void clickSubmitBtn() {
	   driver.findElement(submitBtnXpath).click();
   }
   
   public String getpopmessage() {
	   return driver.switchTo().alert().getText();
   }
   public void clickOKOnPop() {
	   driver.switchTo().alert().dismiss();
   }
   
   public void clickResetbtnForgotPg() {
	   driver.findElement(resetBtnXpath).click();
   }
   
   public String getTxtForgotPage() {
	   return driver.findElement(successmsgXpath).getText();
   }
   
   public String getErrorMesg() {
	   return driver.findElement(errorMesgXpath).getText();
   }
}
