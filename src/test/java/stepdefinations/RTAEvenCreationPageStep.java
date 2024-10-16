package stepdefinations;

import java.util.Properties;

import org.openqa.selenium.By;

import com.pages.RTAEvenCreationPage;

import com.qa.factory.DriverFactory;
import com.qa.util.DB2Connect;

import io.cucumber.java.en.Then;

public class RTAEvenCreationPageStep {
	RTAEvenCreationPage rtaEvenCreationPG= new RTAEvenCreationPage(DriverFactory.getDriver());

	private DB2Connect db2connect = new DB2Connect();
	Properties prop;
	
	@Then("Check all web elements present on Register Evoting Details")
	public void checkAllWebElementsPresent() {
		boolean expectedPresentNSDLFileFormatBtn = rtaEvenCreationPG.presentNSDLFileFormatUplRadioBtn();
		boolean expectedPresentISIN = rtaEvenCreationPG.presentISIN();
		boolean expectedPresentPostalballotRadioBtn = rtaEvenCreationPG.presentPostalballotRadioBtn();
		boolean expectedPresentGeneralRadioBtn = rtaEvenCreationPG.presentGeneralRadioBtn();
		boolean expectedPresentDirectorElectionRadioBtn = rtaEvenCreationPG.presentDirectorElectionRadioBtn();
		boolean expectedPresentCsiRadioButtonRadioBtn = rtaEvenCreationPG.presentCsiRadioButton();
		boolean expectedPresentStartDate = rtaEvenCreationPG.presentStartDate();
		boolean expectedPresentEndDate = rtaEvenCreationPG.presentEndDate();
		boolean expectedPresentResultDate = rtaEvenCreationPG.presentResultDate();
		boolean expectedPresentStartTime = rtaEvenCreationPG.presentStartTime();
		boolean expectedPresentEndTime = rtaEvenCreationPG.presentEndTime();
		boolean expectedPresentCutOffDate = rtaEvenCreationPG.presentCutOffDate();
		boolean expectedPresentGeneralMeetingDate = rtaEvenCreationPG.presentGeneralMeetingDate();
		boolean expectedPresentLastDisplayOfNotice = rtaEvenCreationPG.presentLastDisplayOfNotice();
		boolean expectedPresentNumberOfVacancy = rtaEvenCreationPG.presentNumberOfVacancy();
		boolean expectedPresentSearchImg = rtaEvenCreationPG.presentSearchImg();
		boolean expectedPresentScrUserID = rtaEvenCreationPG.presentScrUserID();
		boolean expectedPresentFirstResolutionTitle = rtaEvenCreationPG.presentFirstResolutionTitle();
		boolean expectedPresentFirstResolution = rtaEvenCreationPG.presentFirstResolution();
		boolean expectedPresentAddBtn = rtaEvenCreationPG.presentAddBtn();
		boolean expectedPresentDeleteBtn = rtaEvenCreationPG.presentDelBtn();
		
		if (expectedPresentNSDLFileFormatBtn && expectedPresentISIN && expectedPresentPostalballotRadioBtn && expectedPresentGeneralRadioBtn && expectedPresentDirectorElectionRadioBtn && expectedPresentDirectorElectionRadioBtn && expectedPresentCsiRadioButtonRadioBtn 
				&& expectedPresentStartDate && expectedPresentEndDate && expectedPresentCutOffDate && expectedPresentGeneralMeetingDate && expectedPresentLastDisplayOfNotice && expectedPresentLastDisplayOfNotice && expectedPresentNumberOfVacancy && expectedPresentSearchImg && expectedPresentScrUserID && 
				expectedPresentFirstResolutionTitle && expectedPresentFirstResolution && expectedPresentAddBtn && expectedPresentDeleteBtn ) {
			System.out.println("All web element present on page of even creation");
		}
				
		
	}
}
