package com.cucumber.tuts.cucmber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cucumber/tuts/cucmber/Features", 
glue = "com.cucumber.tuts.cucmber.StepDefinitions",
plugin = {"pretty", "html:target/results.html"},
publish = true)

public class TestRunner {

}
