package com.test.automation.hooks;

import com.test.automation.common.DriverService;
import com.test.automation.common.EnvironmentProperties;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ScenarioHooks {
	
	@Before
	public void startDriver(){
		if(!EnvironmentProperties.isInitialized()){
			EnvironmentProperties.init();
		}
		System.out.println("before scenario");
		DriverService.setDriver();
	}
	
	@After
	public void closeDriver(Scenario scenario){
		System.out.println("after scenario");
		
		//DriverService.getDriver().manage().deleteAllCookies();
		if(scenario!=null){
			boolean isScenarioFailed = scenario.isFailed();
			if(isScenarioFailed){
				scenario.embed(DriverService.takescreenShot(), "image/png");
			}
		}
		
		DriverService.cleanUpDriver();
	}

}
