package br.com.automacao.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "http:build/reports/feature.html", "json:target/reports/report-json/report.json"},
        features = {"src/test/resources/features/user.feature"},
        glue = {"steps"},
		tags = {"@funcionais"}
)
public class UsersRunner {
	 @AfterClass
	    public static void writeExtentReport() {
	        Reporter.loadXMLConfig(new File("config/report.xml"));
	    }
}
