package stepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//Providing the paths to be followed
@CucumberOptions(features = "src/test/resources/Features", 
				glue = { "StepDefinition" }, 
				monochrome = true, plugin = {
						"json", "junit:target/JUnitreports/report.xml", "json:target/JSONReports/report.json", "html: target/HtmlReports/htmlReport" },

				tags="@Test1"
				
)
public class TestRunner {

}
