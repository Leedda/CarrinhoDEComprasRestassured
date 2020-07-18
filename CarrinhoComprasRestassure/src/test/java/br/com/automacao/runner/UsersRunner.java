package br.com.automacao.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "http:build/reports/feature.html"},
        features = {"src/test/resources/features/users.feature"},
        glue = {"Steps"}
)
public class UsersRunner {
	
}
