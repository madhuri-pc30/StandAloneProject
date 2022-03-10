package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features/login.feature",glue= {"classpath:StepDefinations.LoginSteps"}, 
	monochrome=true,
	plugin ={"pretty",
			"junit:target/MyReports/report.xml",
	        "json:target/MyReports/report.json",
	         "html:target/HtmlReports"})
	//tags = "@Smoke or  @Regression"

	
	public class TestRunner {

}
