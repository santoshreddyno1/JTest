package com.test.automation.common;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class EnvironmentProperties {
	
	private static Properties appProperties = new Properties();
	
	public static boolean isInitialized(){
		return appProperties.size() > 0;
	}
	
	public static void init(){
		String env = System.getProperty("environment") !=null ? System.getProperty("environment") : "QA";
		try {
			String propFiles[] = {"application.properties", "user.properties"};
			for(String propFile: propFiles){
				appProperties.load(new FileInputStream(new File("src/test/resources/environment/"+env+"/"+ propFile)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key){
		return appProperties.getProperty(key);
	}
	
	public static void setProperty(String key, String value){
		 appProperties.setProperty(key, value);
	}

	public static Properties getAppProperties() {
		return appProperties;
	}

}
