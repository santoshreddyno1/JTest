package com.test.automation.common;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataUtil {
	
	public static String getRandomEmail(){
		return RandomStringUtils.randomAlphabetic(9)+ "@gmail.com";
	}
	
	public static String getRandomString(int size){
		return RandomStringUtils.randomAlphabetic(size);
	}
	
	public static String getRandomNumber(int size){
		return RandomStringUtils.randomNumeric(size);
	}
	
	public static String getRandomAlphaNumaric(int size){
		return RandomStringUtils.randomAlphanumeric(size);
	}
}
