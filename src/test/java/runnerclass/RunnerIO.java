package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".\\src\\test\\java\\featurefiles\\CreateOrg.feature"},
		glue = {"stepdefinitions"},
		monochrome = true,
		plugin = {"pretty","html:VtigerReport.html"},
		dryRun = false 
		
		)
		


public class RunnerIO extends AbstractTestNGCucumberTests{

}
