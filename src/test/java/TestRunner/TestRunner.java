package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		plugin= {"pretty", "html:target/cucumber-html",
				"junit:target/cucumber.json"},
		glue = {"Hooks", "Steps"},
		features = "feature"
		
		)

public class TestRunner {
	

	

}
