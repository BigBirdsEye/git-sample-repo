package com.workflow.eComms;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        format = {"pretty", "json:target/cucumber.json" },
        tags = {"~@ignore"},
        strict = false

)
public class RunnerTest {

}