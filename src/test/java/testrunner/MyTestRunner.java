package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
features = {"src/test/resources/com/Appfeatures"},
// features = {"\"src/test/resources/com/Appfeatures/ShareholderCastVotePage.feature"},
glue = {"stepdefinations","AppHooks"},
//tags= "@Smoke",
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/rerun.txt"},
dryRun=false,
monochrome = true
)
public class MyTestRunner {

} 
