package stepdefinations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.testng.Assert;

import com.pages.RTALoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import com.qa.util.DB2Connect;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RTALoginPageStep {

	RTALoginPage rtaloginpg= new RTALoginPage(DriverFactory.getDriver());

	private DB2Connect db2connect = new DB2Connect();
	Properties prop;
	
	
	@When("Enter the URL {string}")
	public void enter_the_url(String url) {
		DriverFactory.getDriver().get(url);
		rtaloginpg.waitImplicit();
		ConfigReader configReader;
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		String browser = prop.getProperty("browser");
		System.out.println("Browser selected >>" + browser);
		rtaloginpg.waitImplicit();
		//rtaloginpg.waitImplicit();
		String titleHomePage = rtaloginpg.getLoginPageTitle();
		System.out.println("Enter the URL " + url);
		// System.out.println("Title of Page "+titleHomePage);
		rtaloginpg.clickAdvBtn();
	}

	@When("On home page user click on RTA Login button")
	public void on_home_page_user_click_on_rta_login_button() {
		rtaloginpg.switchToFrame();
	   rtaloginpg.clickRTALoginHmPgBtn();
	}

	@Given("User should be on login page of RTA")
	public void user_should_be_on_home_page_of_e_voting() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User is on RTA login page");
	}

	@When("Enter user id as {string}")
	public void enter_user_id_as(String userid) {
	    // Write code here that turns the phrase above into concrete actions
	    rtaloginpg.enterUserID(userid);
	}

	@When("Enter verification code")
	public void enter_verification_code() {
		String captchaValue = JOptionPane.showInputDialog("Please enter the exact verfication code: ");
		rtaloginpg.enterCaptcha(captchaValue);
		System.out.println("Verification code" + captchaValue);
	}

	@When("Enter wrong verification code as {string}")
	public void EnterCaptchaBycode(String captchaValue){
		
		rtaloginpg.enterCaptcha(captchaValue);
	

	}
	
	@When("Enter password as {string}")
	public void enter_password_as(String password) {
	   rtaloginpg.enterPassword(password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    rtaloginpg.clickLognBtnOnLogPg();
	}

	@Then("Check for welcome message for {string}")
	public void check_for_welcome_message_for(String userid) throws Exception {
		DB2Connect.connect();
		String sqlQuery = "select USM_FRST_HLDR_NM from USER_MST where USM_USER_ID='" + userid + "'";
		String userIDName = null;
		System.out.println("SQL query executed to get user id > " + sqlQuery);

		ResultSet rs = db2connect.statement.executeQuery(sqlQuery);
		while (rs.next()) {
			userIDName = rs.getString("USM_FRST_HLDR_NM");
		}

		String expectedWelComeMsg = "Welcome " + userIDName + " (" + userid + ")";
		String actualWelComeMsg = rtaloginpg.getWelcomeMsg();
		System.out.println("Actual WelCome Msg : "+actualWelComeMsg);
		System.out.println("Expected Welcome Msg : "+expectedWelComeMsg);
		Assert.assertTrue(actualWelComeMsg.contains(expectedWelComeMsg));
	}
	
	@Then("Check user id label present")
	public void checkUserIdLblPresent() {
		Boolean expectedbooleanlblUserIDValue = rtaloginpg.checkuseridLblPresent();
		Boolean actualbooleanlblUserIDValue = true;
		Assert.assertEquals(actualbooleanlblUserIDValue, expectedbooleanlblUserIDValue);
	}
	
	@Then("Check user id text field present")
	public void checkUserIdTxtPresent() {
		Boolean expectedbooleantxtUserIDValue = rtaloginpg.checkuseridTxtPresent();
		Boolean actualbooleantxtUserIDValue = true;
		Assert.assertEquals(actualbooleantxtUserIDValue, expectedbooleantxtUserIDValue);
	}
	
	@Then("Check password label present")
	public void checkPasswordLblPresent() {
		Boolean expectedbooleanlblPassword = rtaloginpg.checkpasswordLblPresent();
		Boolean actualbooleanlblPassword = true;
		Assert.assertEquals(actualbooleanlblPassword, expectedbooleanlblPassword);
	}
	
	@Then("Check password text field present")
	public void checkepasswordtxtPresent() {
		Boolean expectedbooleanTxtPassword = rtaloginpg.checkpasswordTxtPresent();
		
	}
	
	@Then("Check captcha label present")
	public void checkCaptchaLblPresent() {
		Boolean expectedbooleanlblCaptcha = rtaloginpg.checkcaptchaLblPresent();
		Boolean actualbooleanlblCaptcha = true;
		Assert.assertEquals(actualbooleanlblCaptcha, expectedbooleanlblCaptcha);
	}
	
	@Then("Check login button present")
	public void checkLoginBtnPresent() {
		Boolean expectedbooleanBtnLogin = rtaloginpg.checkLoginBtnPresent();
		Boolean actualbooleanBtnLogin = true;
		Assert.assertEquals(actualbooleanBtnLogin, expectedbooleanBtnLogin);
	}
	
	@Then("Check Forgot Password link")
	public void checkForgotPassowrdLink() {
		Boolean expectedbooleanPasswordLink = rtaloginpg.checkForgotLink();
		Boolean actualbooleanPasswordLink = true;
		Assert.assertEquals(actualbooleanPasswordLink, expectedbooleanPasswordLink);
	}
	
	@When("Click on Forgot Password link")
	public void clickforgotPassword() {
		rtaloginpg.clickForgotLink();
	}
	
	@Then("Check forgot password page title")
	public void checkForgotPassword() {
		String execspedPageForgotPassword = rtaloginpg.getForgotPassword();
		String actualPageForgotPassword = "Forgot Password";
		Assert.assertEquals(actualPageForgotPassword, execspedPageForgotPassword);
	}
	
	@Then("Check User id txt field Present")
	public void checkUserIdPresent() {
		boolean execspedCheckUserId = rtaloginpg.checkuseridTxtPresent();
		boolean actualCheckUserId = true;
		Assert.assertEquals(actualCheckUserId, execspedCheckUserId);	
	}
	
	@Then("Check Email Id field Present")
	public void checkEmailIdPresent() {
		boolean execspedCheckemailId = rtaloginpg.checkEmailID();
		boolean actualCheckemailId = true;
		Assert.assertEquals(actualCheckemailId, execspedCheckemailId);
	}
	
	@When("Click on submit button")
	public void clickSubmit() {
		rtaloginpg.clickSubmitBtn();
	}
	
	@Then("Pop appears as {string}")
	public void popHandle(String actualpopmessage) {
		String expectedpopMesg = rtaloginpg.getpopmessage();
		System.out.println("Actual pop message "+ actualpopmessage);
		System.out.println("expected pop message "+ expectedpopMesg);
		Assert.assertEquals(actualpopmessage, expectedpopMesg);
		
		rtaloginpg.clickOKOnPop();
	}
	
	@When("Click on reset button")
	public void resetclick() {
		rtaloginpg.clickResetbtnForgotPg();
	}
	
	@When("Enter email id as {string}")
	public void enterEmailID(String emailID) {
		rtaloginpg.enterEmailID(emailID);
	}
	
	@Then("Check successmessage for {string}")
	public void checkSucessMsg(String emailID) {
		String expectedmsg = rtaloginpg.getTxtForgotPage();
		
		String actualmsg = "Welcome Message: THANK YOU. YOUR NEW PASSWORD HAS BEEN SENT AT YOUR EMAILID : "+emailID.toUpperCase();
		
		System.out.println("Success Message exepected : after forgot password : "+expectedmsg);
		System.out.println("Welcome Message actual : after forgot password : "+actualmsg);
		Assert.assertEquals(actualmsg, expectedmsg);
		
	}
	
	@Given("User unlock and password based changes for user id {string}")
	public void unlockUserID(String userid) throws Exception {
		DB2Connect.connect();
		String sqlQuery = "update usr_psswd set USP_UNSCSFULL_ATMPT='0',USP_ISLOGGED_ON='Y'  where usp_user_id = '" + userid + "'";
		String userIDName = null;
		System.out.println("SQL query executed to get user id > " + sqlQuery);

		int rs = db2connect.statement.executeUpdate(sqlQuery);
	}
	
	@Then("Error message appeas as {string}")
	public void errorMsgVerification(String actualErrorMsg) {
		String expectedErrorMsg = rtaloginpg.getErrorMesg();
		System.out.println("Error Message exepected : "+expectedErrorMsg);
		System.out.println("Error Message actual : "+actualErrorMsg);
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
	
}
