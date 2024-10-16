package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RTAEvenCreationPage {
	private WebDriver driver;
	
	public RTAEvenCreationPage(WebDriver driver) {
		this.driver = driver;
	}
	

	private By submitBTNXpath = By.xpath("//*[@title='Submit_Button']");
	private By resetBTNXpath = By.xpath("title='Reset_Button'");
	
	private By NSDLfileuploadRadioBtn = By.xpath("//*[@id='currentApproach']");
	
	private By isinTxtID = By.id("isin");
	private By postalballotRadioBtnID = By.id("postalballot");
	private By generalRadioBtnID = By.id("generalmeeting");
	private By directorelectionRadioBtnID = By.id("directorelection");
	private By csiRadioBTNID = By.id("csiTypeEven");
	//private By startDateSelID = By.id("date1");
	
	//private By cal=By.xpath(" //*[@id='calendar']");
	private By endDateID = By.id("endDate");
	private By resultDateID = By.id("resultDate");
	private By startTimeID = By.id("startTime");
	private By endTimeID = By.id("endTime");
	private By cutOffDateID = By.id("cutOffDate");
	private By generalMeetingDateID = By.id("startDateOfGm");
	private By generalMeetingTimeID = By.id("startTimeOfGm");
	private By lastdateDispatchOfNoticeID = By.id("lastDateOfDispatch");
	private By numberOfVacancyID = By.id("numberOfVacancy");
	private By searchImgXpath = By.xpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[8]/td/table/tbody/tr[1]/td[3]/a/img");
	private By scrUseridXpath = By.xpath("//*[@title='scr User Id']");
	private By scrUserNameID = By.id("scrName");
	private By resolutionTitleID = By.id("resolutionTitle");
	private By resolutinDescID = By.id("resolutionDesc");
	private By addBTNXpath = By.xpath("//*[@name='addResltn']");
	private By deleteBTNXpath = By.xpath("//*[@name='delResltn']");
	private By startDateTxtID= By.xpath("//*[@id='startDate']");
	private By entermonthXpath = By.xpath("//*[@id='calendar']/table/tbody/tr/td/center/table[1]/tbody/tr/td[2]/span");
	
	public void clickSubmitBtn() {
		driver.findElement(submitBTNXpath).click();
	}
	
	public void clickResetBtn() {
		driver.findElement(resetBTNXpath).click();
	}
	
	public void clickNSDLFILEFormatUploadBtn() {
		driver.findElement(NSDLfileuploadRadioBtn).click();
		}
	
	public boolean presentNSDLFileFormatUplRadioBtn() {
		return driver.findElement(NSDLfileuploadRadioBtn).isDisplayed();
	}
	
	public void enterISIN(String isin) {
		driver.findElement(isinTxtID).clear();
		driver.findElement(isinTxtID).sendKeys(isin);
	}
	
	public boolean presentISIN() {
		return driver.findElement(isinTxtID).isDisplayed();
	}
	
	public void clickPostalballotRadioBtn() {
		driver.findElement(postalballotRadioBtnID).click();
	}
	
	public boolean presentPostalballotRadioBtn() {
		return driver.findElement(postalballotRadioBtnID).isDisplayed();
	}
	
	public boolean presentGeneralRadioBtn() {
		return driver.findElement(generalRadioBtnID).isDisplayed();
	}
	
	public void clickGeneralRadioBtn() {
		driver.findElement(generalRadioBtnID).click();
	}
	
	public boolean presentDirectorElectionRadioBtn() {
		return driver.findElement(directorelectionRadioBtnID).isDisplayed();
	}
	
	public void clickDirectorElectionRadioBtn() {
		driver.findElement(directorelectionRadioBtnID).click();
		
	}
	
	public boolean presentCsiRadioButton() {
		return driver.findElement(csiRadioBTNID).isDisplayed();	}
	
	public void clickcsiRadioBtn() {
		driver.findElement(csiRadioBTNID).click();
	}
	
	public boolean presentStartDate() {
		return driver.findElement(startDateTxtID).isDisplayed();
	}
	
	public boolean presentEndDate() {
		 return driver.findElement(endDateID).isDisplayed();
	}
	
	public void enterEndDate(String endDate) {
		driver.findElement(endDateID).sendKeys(endDate);
	}
	
	public void enterStartDate(String startDate) {
		driver.findElement(startDateTxtID).sendKeys(startDate);
	}
	
	public boolean presentResultDate() {
		return driver.findElement(resultDateID).isDisplayed();
	}
	
	public boolean presentStartTime() {
		return driver.findElement(startTimeID).isDisplayed();
	}
	
	public void enterResultdate(String resultDate) {
		driver.findElement(resultDateID).sendKeys(resultDate);
	}
	
	
	public void enterStartTime(String startTime) {
		driver.findElement(startTimeID).sendKeys(startTime);
	}
	
	public boolean presentEndTime() {
		return driver.findElement(endTimeID).isDisplayed();
	}
	
	public void enterEndTime(String endTime) {
		driver.findElement(endTimeID).sendKeys(endTime);
	}
	
	public void enterCutOffDate(String cutoffDate) {
		driver.findElement(cutOffDateID).sendKeys(cutoffDate);
	}
	
	public boolean presentCutOffDate() {
		return driver.findElement(cutOffDateID).isDisplayed();
	}
	
	public void enterGeneralMeetingDate(String generalMeetingDate) {
		driver.findElement(generalMeetingDateID).sendKeys(generalMeetingDate);
	}
	
	
	public boolean presentGeneralMeetingDate() {
		return driver.findElement(generalMeetingDateID).isDisplayed();
	}
	
	public void enterGeneralMeetingTime(String generalMeetingTime) {
		driver.findElement(generalMeetingTimeID).sendKeys(generalMeetingTime);
	}
	
	public boolean presentLastDisplayOfNotice() {
		return driver.findElement(lastdateDispatchOfNoticeID).isDisplayed();
	}
	
	public void enterlastdateDispatchOfNotice(String lastdateDispatchOfNotice) {
		driver.findElement(lastdateDispatchOfNoticeID).sendKeys(lastdateDispatchOfNotice);
	}
	
	public boolean presentNumberOfVacancy() {
		return driver.findElement(numberOfVacancyID).isDisplayed();
	}
	
	public void enterNumberOfVacancy(String numVacancy) {
		driver.findElement(numberOfVacancyID).sendKeys(numVacancy);
	}
	
	public boolean presentSearchImg() {
		return driver.findElement(searchImgXpath).isDisplayed();
	}
	
	public void clickSearchImg(String searchImg) {
		driver.findElement(searchImgXpath).click();
	}
	
	public boolean presentScrUserID() {
		return driver.findElement(scrUserNameID).isDisplayed();
	}
	
	public void enterSCRUserID(String scrUserID) {
		driver.findElement(scrUserNameID).sendKeys(scrUserID);
	}
	
	public boolean presentFirstResolutionTitle() {
		return driver.findElement(resolutionTitleID).isDisplayed();
	}
	
	public void enterFirstResolutionTitle(String resolutionFirstTittle) {
		driver.findElement(resolutionTitleID).sendKeys(resolutionFirstTittle);
	}
	
	public boolean presentFirstResolution() {
		return driver.findElement(resolutinDescID).isDisplayed();
	}
	
	public void enterFirstResolutionDesc(String resolutionFirstDesc) {
		driver.findElement(resolutinDescID).sendKeys(resolutionFirstDesc);
	}
	
	public void clickADDBtn() {
		driver.findElement(addBTNXpath).click();
	}
	
	public boolean presentAddBtn() {
		return driver.findElement(addBTNXpath).isDisplayed();
	}
	
	public void clickDelBtn() {
		driver.findElement(deleteBTNXpath).click();
	}
	
	public boolean presentDelBtn() {
		return driver.findElement(deleteBTNXpath).isDisplayed();
	}
	
	//public void enterSCRPassword(String scr)
	/*
	public void clickOnStartDate() {
		driver.findElement(startDateSelID).click();
	}
	public void sendOnMonth(String monthName) {
		//waitImplicit();
		WebElement startdate = driver.findElement(entermonthXpath);
		/*	JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript(monthName, startdate);
		startdate.sendKeys(monthName);
	}
	
	public void enterMonth(int month) {
		if(month == 1) {
			sendOnMonth("January");
		}else if(month == 2) {
			sendOnMonth("February");
		}else  if(month == 3) {
			sendOnMonth("March");
		}else  if(month == 4) {
			sendOnMonth("April");
		}else  if(month == 5) {
			sendOnMonth("May");
		}else  if(month == 6) {
			sendOnMonth("June");
		}else  if(month == 7) {
			sendOnMonth("July");
		}else  if(month == 8) {
			sendOnMonth("August");
		}else  if(month == 9) {
			sendOnMonth("September");
		}else  if(month == 10) {
			sendOnMonth("October");
		}else  if(month == 11) {
			sendOnMonth("November");
		}else  if(month == 12) {
			sendOnMonth("December");
		}else {
			System.out.println("Kindly enter corrct words");
		}
	}*/
}
