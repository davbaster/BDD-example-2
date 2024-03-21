package com.mycompany.app.runner;

import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber(
    glue = "com.mycompany.app.stepdefinitions",
    features = "src/test/resources/features/",
    extraGlue = "com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results/ManualRunnerTest_OctaneGherkinResults.xml"
)
public class TestRunner {
    // Configuration is included directly in the annotation parameters
}


