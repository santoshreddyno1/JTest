package com.test.automation.model;

public class ReturnDetails {
	
	private boolean isReturnable;
	private int eligibleDays;
	private String returnDestination;
	private String shippingService;
	private boolean requestForSerialNumber;
	private boolean requireAuthorization;
	private boolean countryOfOrigin;
	
	
	public boolean isReturnable() {
		return isReturnable;
	}
	public void setReturnable(boolean isReturnable) {
		this.isReturnable = isReturnable;
	}
	public int getEligibleDays() {
		return eligibleDays;
	}
	public void setEligibleDays(int eligibleDays) {
		this.eligibleDays = eligibleDays;
	}
	public String getReturnDestination() {
		return returnDestination;
	}
	public void setReturnDestination(String returnDestination) {
		this.returnDestination = returnDestination;
	}
	public String getShippingService() {
		return shippingService;
	}
	public void setShippingService(String shippingService) {
		this.shippingService = shippingService;
	}
	public boolean isRequestForSerialNumber() {
		return requestForSerialNumber;
	}
	public void setRequestForSerialNumber(boolean requestForSerialNumber) {
		this.requestForSerialNumber = requestForSerialNumber;
	}
	public boolean isRequireAuthorization() {
		return requireAuthorization;
	}
	public void setRequireAuthorization(boolean requireAuthorization) {
		this.requireAuthorization = requireAuthorization;
	}
	public boolean isCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(boolean countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	
	
	
	
	

}
