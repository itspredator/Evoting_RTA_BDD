package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
features = {"@target/rerun.txt",},
// features = {"\"src/test/resources/com/Appfeatures/ShareholderCastVotePage.feature"},
glue = {"stepdefinations","AppHooks"},
//tags= "@Smoke",
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:rerun/rerun1.txt"},
dryRun=false,
monochrome = true
)

public class RerunRunner {

	
	
	
}
