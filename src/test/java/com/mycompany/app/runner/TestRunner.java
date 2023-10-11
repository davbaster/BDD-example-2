package com.mycompany.app.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com/mycompany/app/features",
        glue = "com.mycompany.app.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
}
