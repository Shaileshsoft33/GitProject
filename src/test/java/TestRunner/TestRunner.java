package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"FeatureFolder"},
		glue = {"StepDef"},
		dryRun=false
		
		)
public class TestRunner {

}
