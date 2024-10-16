package stepdefinations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.junit.Assert;

import com.pages.RTALoginPage;
import com.pages.RTAMainPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import com.qa.util.DB2Connect;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RTAMainPageStep {
	RTAMainPage rtamainpg = new RTAMainPage(DriverFactory.getDriver());
	RTALoginPage rtaloginpg= new RTALoginPage(DriverFactory.getDriver());

	private DB2Connect db2connect = new DB2Connect();
	Properties prop;
	
	
	
	@When("Click on eVoting menu")
	public void eVotingOption() {
		rtamainpg.clickEvoting();
	}
	
	@When("Click on Register Evoting Details option")
	public void eVotingRegister() {
		rtamainpg.clickRegisterEvotingdtl();
	}
	
	/*@When("Click on Voting Start Date and enter start date as in format {string} as mm\\\\/dd\\\\/yyyy")
	public void enterStartMonth(String startDate) {
		//rtamainpg.clickOnStartDate();
	//
	//	rtamainpg.enterMonth(Integer.parseInt(month));
		
	//	rtamainpg.enterStartDate(startDate);
	}*/
	
	@Then("Check eVoting menu present")
	public void checkevotingMenu() {
	boolean expectedEvotingPresent = rtamainpg.checkEvotingBtnPresentStatus();
	 boolean actualEvotingPresent = true;
	 Assert.assertEquals(expectedEvotingPresent,actualEvotingPresent);
	}
	
	@Then("Check user profile menu present")
	public void checkUserProfile() {
		boolean expectedEvotingPresent = rtamainpg.checkUserDetailsBtnPresentStatus();
		Assert.assertTrue(expectedEvotingPresent);
	}
	@Then("Check News and Results menu present")
	public void checkNewsAndResults() {
		boolean expectednewsAndReportPresent = rtamainpg.checkNewsandReportBtnPresentStatus();
		Assert.assertTrue(expectednewsAndReportPresent);
	}
	
	@When("Click on user profile menu")
	public void clickUserProfile() {
		rtamainpg.clickUserDetailsBtn();
	}
	
	@When("Click on Update contact details sub menu")
	public void clickUpdateContactDtls() {
		rtamainpg.clickupdateContactdtls();
	}
	
	@Then("Check heading on page as {string}")
	public void checkheadingStatus(String actualHeading) {
		String expectedHeading = rtamainpg.getHeadingOfPage();
		System.out.println("Actual Heading >> "+actualHeading);
		System.out.println("Expected Heading >> "+expectedHeading);
		Assert.assertEquals(expectedHeading, actualHeading);
	}
	
	@When("Update address line four as {string}")
	public void enteraddress(String enterAdd4) throws Exception {
		rtamainpg.clearenterAdd4();
		Thread.sleep(2000);
		rtamainpg.enterAdd4(enterAdd4);
	}
	
	@Then("Check with back end line four address {string} for user is {string}")
	public void checkline4AddwithDB(String Add4,String userid) throws Exception {
		DB2Connect.connect();
		String sqlQuery = "select USM_ADDR4 from USER_MST where USM_USER_ID='" + userid + "'";
		String userIDAdd = null;
		ResultSet rs = db2connect.statement.executeQuery(sqlQuery);
		while (rs.next()) {
			userIDAdd = rs.getString("USM_ADDR4");
		}
		String expectedAdd4=userIDAdd;
		String actualAdd4 = Add4;
		Assert.assertEquals(expectedAdd4,actualAdd4);
	}
	
	@Then("Check the message as {string}")
	public void checkSuccessMsg(String actualMsg) throws Exception {
		Thread.sleep(1000);
		String expectedMsg = rtamainpg.getErrorMsg();
		
		System.out.println("Success message as >> ACTUAL >> "+actualMsg);
		System.out.println("Success message as >> EXEPECT >>"+expectedMsg);
		Assert.assertEquals(expectedMsg,actualMsg);
	}
	
	@When("Clear Mobile text box")
	public void clearMobileTxt() {
		rtamainpg.clearMobileNum();
	}
	
	@Then("Pop up appears as {string}")
	public void popAppears(String actualpopMsg) {
		String expectedpopMsg = rtamainpg.getAlertMsg();
		System.out.println("Pop Msg actual >> "+actualpopMsg);
		System.out.println("Pop Msg expected >> "+expectedpopMsg);
		Assert.assertEquals(expectedpopMsg, actualpopMsg);
		rtamainpg.dissmissAlert();
	}
	
	@When("User enter wrong mobile number as {string}")
	public void entermobilenumer(String mobNum) {
		rtamainpg.enterMobileNum(mobNum);
	}
	
	@When("Clear email text box")
	public void clearEmailTxt() {
		rtamainpg.clearEmailId();
	}
	
	@When("User enter wrong email id as {string}")
	public void enterEmailId(String emailID) {
		rtamainpg.enterEmailId(emailID);
	}
	
	@When("Enter mobile number	as {string}")
	public void entermobileNumber(String mobileNum) {
		rtamainpg.enterMobileNum(mobileNum);
	}
	
	@When("Enter Email ID as {string}")
	public void enterEmailID(String emailId) {
		rtamainpg.enterEmailId(emailId);
	}
	
	@Then("Check backend also with value as email id as {string} and mobile no {string} for user id {string}")
	public void checkBackend(String actualemailID,String actualmobNum,String userid) throws Exception {
		DB2Connect.connect();
		
		String sqlQuery = "select USM_EMAIL_ID,USM_MOBILE_NO from USER_MST where USM_USER_ID='" + userid + "'";
		String expecteduseremailID = null;
		String expecedusermobileNum = null;
		ResultSet rs = db2connect.statement.executeQuery(sqlQuery);
		while (rs.next()) {
			expecteduseremailID = rs.getString("USM_EMAIL_ID");
			expecedusermobileNum = rs.getString("USM_MOBILE_NO");
		}
		Assert.assertEquals(expecteduseremailID,actualemailID);
		Assert.assertEquals(expecedusermobileNum,actualmobNum);
	}
	
	@When("Click on change password sub menu")
	public void clickChngPass() {
		rtamainpg.clickChangePwdSubMenu();
	}
	
	@Then("Check for change password sub menu")
	public void clickChangePassword() {
		rtamainpg.checkChangePasswordOption();
	}
	
	@When("Click on change button under change password page")
	public void clickChangeBtn() {
		rtamainpg.clickChangeBtn();
	}
	
	@When("Enter value in new password as {string}")
	public void enterNewPassword(String newPassword) throws Exception {
		rtamainpg.enternewpwdTxt(newPassword);
	}
	
	@Then("Change password as back to normal for user id {string}")
	public void changePasswordBack(String userid) throws Exception {
		String sqlQuery = "update usr_psswd set USP_PSSWD_1='shwu6QO5rP/8/kYzhqt+bg==', USP_HASH_PWD='shwu6QO5rP/8/kYzhqt+bg==' where usp_user_id = '" + userid + "'";
		
		int rs = db2connect.statement.executeUpdate(sqlQuery);
		
	}
	
	@When("Enter value in confirm password as {string}")
	public void enterConfPassword(String confPassword) {
		rtamainpg.enterconfpwdTxt(confPassword);
	}
	
	@When("Check old password text field present")
	public void checkOldPassd() {
		boolean expectedOldPwd= rtamainpg.checkoldpwdTxt();
		boolean actualOldPwd = true;
		Assert.assertEquals(expectedOldPwd, actualOldPwd);
	}
	
	@When("Check new password text field present")
	public void checkNewPassd() {
		boolean expectedNewPwd= rtamainpg.checknewpwdTxt();
		boolean actualNewPwd = true;
		Assert.assertEquals(expectedNewPwd, actualNewPwd);
	}
	
	@When("Check confirm password text field present")
	public void checkConfPassd() {
		boolean expectedConfPwd= rtamainpg.checkconfpwdTxt();
		boolean actualConfPwd = true;
		Assert.assertEquals(expectedConfPwd, actualConfPwd);
	}
	
	@When("Enter value in old password as {string}")
	public void enterOldPass(String oldpwd) {
		rtamainpg.enteroldpwdTxt(oldpwd);
	}
	
	@Then("Check news and result button")
	public void checkNewsResult() {
		rtamainpg.checkNewsResult();
	}
	
}
