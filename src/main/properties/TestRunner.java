package main.properties;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"com.cucumber.listener.ExtentCucumberFormatter:output/AutomationReport.html", "html:target/cucumber"},
features= "src/test/features", glue = "test.stepDefinitions")
public class TestRunner {

	@AfterClass
	public static void setup() {
        Reporter.loadXMLConfig(new File("src/test/features/extent-config.xml"));
        Reporter.setSystemInfo("OS", "Windows 7");
	    Reporter.setSystemInfo("user", "Sedhu");
	}
}
