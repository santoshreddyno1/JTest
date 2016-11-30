package com.test.automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Asn.feature",
				format = { "pretty","html:target/cucumber/" },
				glue = { "com/test/automation.hooks", "com/test/automation.common",
				"com/test/automation.stepdefs" })
public class TestRunner {

}

