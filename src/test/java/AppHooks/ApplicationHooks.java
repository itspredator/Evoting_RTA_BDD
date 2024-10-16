package AppHooks;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import com.qa.util.DB2Connect;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
    Properties prop;
    
    @Before(order =0)
    public void getProperty(){
    	configReader = new ConfigReader();
    	prop=configReader.init_prop();
    }
	@Before(order =1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		
	}
	
	@After(order=0)
	public void quitBrowser() throws Exception {
		driver.quit();

	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			//take screen shot
			String screenShotName = scenario.getName().replaceAll(" ","_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			File sourcePath1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 File screenshot = new File( "ScreenShotsForErrorCheck/"+screenShotName + ".png");
			   FileUtils.copyFile(sourcePath1, screenshot);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
	}
	
}
