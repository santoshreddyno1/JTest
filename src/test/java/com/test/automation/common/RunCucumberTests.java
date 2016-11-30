package com.test.automation.common;

import org.testng.annotations.Listeners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = true)
@Listeners({WebDriverListener.class})
public class RunCucumberTests extends AbstractTestNGCucumberTests{

}
