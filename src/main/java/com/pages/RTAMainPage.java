package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RTAMainPage {

	private WebDriver driver;
	
	// 2. Constructor of page class
		public RTAMainPage(WebDriver driver) {
			this.driver = driver;
			
		}
		
	// Home Page after login
		
		private By evotingBtnOnHomePgXpath = By.xpath("//*[@title='eVoting']");
		private By userdetailsBtnOnHomePgXpath = By.xpath("//*[@title='User Profile']");
		private By evenCreationBtnXpath =By.xpath("//*[@href=\"/eVotingWeb/AccessController.do?Screen=4102\"]");
		private By newsandresultsBtnXpath = By.xpath("//*[@title='News and Results']");
		private By headingtxtXpath = By.xpath("//*[@class='heading']");
		
		private By updateContactDetailsXpath = By.xpath("//*[@id=\"vbUL_c45h3tbl\"]/table/tbody/tr[1]/td[2]/a");
		private By address4Xpath = By.xpath("//*[contains(@title,'Address Line 4')]");
		private By submitBTNXPath = By.xpath("//*[@title='Submit_Button']");
		// //*[@id="date1"]		
		private By errorMesgXpath = By.xpath("//*[@class='error' and @align='center']");
		private By mobilenumID = By.id("mobileno");
		private By emailidID = By.id("emailid");
		
		private By changePasswordXpath = By.xpath("//*[@id=\"vbUL_c45h3tbl\"]/table/tbody/tr[2]/td[2]");
		private By oldpwdID = By.id("oldpwd");
		private By newpwdID = By.id("newpwd");
		private By confirpwdID = By.id("confnewpwd");
		private By changeBTNXpath = By.xpath("//*[@title='Change_Button']");
		
		private By newsresultXpath = By.xpath("/html/body/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/table/tbody/tr/td/a/b/font");
		
		
		
	
		// allow to select exact month >> 
		//private By entermonthXpath = By.xpath("//span[@class='TESTcpMonthNavigation']");
		// //*[@id="calendar"]/table/tbody/tr/td/center/table[1]/tbody/tr/td[2]/span
		
	public void clickEvoting() {
		driver.findElement(evotingBtnOnHomePgXpath).click();
	}	
	
	public boolean checkEvotingBtnPresentStatus() {
		return driver.findElement(evotingBtnOnHomePgXpath).isDisplayed();
	}
		
	public void clickRegisterEvotingdtl() {
		driver.findElement(evenCreationBtnXpath).click();
	}
	
	public boolean checkUserDetailsBtnPresentStatus() {
		return driver.findElement(userdetailsBtnOnHomePgXpath).isDisplayed();
	}
	
	public void clickUserDetailsBtn() {
		driver.findElement(userdetailsBtnOnHomePgXpath).click();
	}
	
	public boolean checkNewsandReportBtnPresentStatus() {
		return driver.findElement(newsandresultsBtnXpath).isDisplayed();
	}
	
	
	
	
	
	

	
	public String getHeadingOfPage() {
		return driver.findElement(headingtxtXpath).getText();
	}
	
	public void clickupdateContactdtls() {
		driver.findElement(updateContactDetailsXpath).click();
	}
	
	public void waitImplicit() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	public void clickSubmitBtn() {
		driver.findElement(submitBTNXPath).click();
	}
	
	public void enterAdd4(String enterAdd4) {
		driver.findElement(address4Xpath).clear();
		driver.findElement(address4Xpath).sendKeys(enterAdd4);
	}
	
	public void clearenterAdd4() {
		driver.findElement(address4Xpath).clear();
	}
	
	public String getErrorMsg() {
		return driver.findElement(errorMesgXpath).getText();
	}
	
	public void  clearMobileNum() {
		driver.findElement(mobilenumID).clear();
	}
	
	public void enterMobileNum(String mobileNum) {
		clearMobileNum() ;
		driver.findElement(mobilenumID).sendKeys(mobileNum);
	}
	
	public void  clearEmailId() {
		driver.findElement(emailidID).clear();
	}
	
	public void enterEmailId(String emailID) {
		driver.findElement(emailidID).clear();
		driver.findElement(emailidID).sendKeys(emailID);
	}
	public String  getAlertMsg() {
		return driver.switchTo().alert().getText();
	}
	
	public void dissmissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void clickChangePwdSubMenu() {
		driver.findElement(changePasswordXpath).click();
	}
	
	public void clickChangeBtn() {
		driver.findElement(changeBTNXpath).click();
	}
	
	public void clearoldpwdTxt() {
		driver.findElement(oldpwdID).clear();
	}
	public void clearnewpwdTxt() {
		driver.findElement(newpwdID).clear();
	}
	public void clearconfpwdTxt() {
		driver.findElement(confirpwdID).clear();
	}
	
	public boolean checkoldpwdTxt() {
		return driver.findElement(oldpwdID).isDisplayed();
	}
	public boolean checknewpwdTxt() {
		return driver.findElement(newpwdID).isDisplayed();
	}
	public boolean checkconfpwdTxt() {
		return driver.findElement(confirpwdID).isDisplayed();
	}
	
	
	public void enteroldpwdTxt(String oldpwd) {
		driver.findElement(oldpwdID).clear();
		driver.findElement(oldpwdID).sendKeys(oldpwd);
	}
	public void enternewpwdTxt(String newpwd) throws Exception {
		driver.findElement(newpwdID).clear();
		//JavascriptExecutor j = (JavascriptExecutor)driver;
		//j.executeScript ("document.getElementById(newpwd).value='"+newpwd+"'");
		driver.findElement(newpwdID).sendKeys(newpwd);
		Thread.sleep(1000);
		
	}
	public void enterconfpwdTxt(String confpwd) {
		driver.findElement(confirpwdID).clear();
		driver.findElement(confirpwdID).sendKeys(confpwd);
	}
	
	public void checkNewsResult() {
		driver.findElement(newsresultXpath).isDisplayed();
	}
	
	public boolean checkChangePasswordOption() {
		return driver.findElement(changePasswordXpath).isDisplayed();
	}
}
