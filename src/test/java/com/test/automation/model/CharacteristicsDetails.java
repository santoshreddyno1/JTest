package com.test.automation.model;

public class CharacteristicsDetails {
	private boolean isHazadrous;
	private boolean isMarkedWithBarcode;
	private boolean isPerishable;
	private int perishableDays;//re-check
	private boolean isSerialization;
	private boolean isRequireBatch;
	private boolean isContainsLiquid;
	private boolean isFragile;
	private boolean isShipAlone;
	private boolean canBeShippedInPolyBag;
	private boolean isContainsBattery;
	private String batteryType;// re-check

	public int getPerishableDays() {
		return perishableDays;
	}
	public void setPerishableDays(int perishableDays) {
		this.perishableDays = perishableDays;
	}
	public String getBatteryType() {
		return batteryType;
	}
	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}
	public boolean isContainsBattery() {
		return isContainsBattery;
	}
	public void setContainsBattery(boolean isContainsBattery) {
		this.isContainsBattery = isContainsBattery;
	}
	public boolean isHazadrous() {
		return isHazadrous;
	}
	public void setHazadrous(boolean isHazadrous) {
		this.isHazadrous = isHazadrous;
	}
	public boolean isMarkedWithBarcode() {
		return isMarkedWithBarcode;
	}
	public void setMarkedWithBarcode(boolean isMarkedWithBarcode) {
		this.isMarkedWithBarcode = isMarkedWithBarcode;
	}
	public boolean isPerishable() {
		return isPerishable;
	}
	public void setPerishable(boolean isPerishable) {
		this.isPerishable = isPerishable;
	}
	public boolean isSerialization() {
		return isSerialization;
	}
	public void setSerialization(boolean isSerialization) {
		this.isSerialization = isSerialization;
	}
	public boolean isRequireBatch() {
		return isRequireBatch;
	}
	public void setRequireBatch(boolean isRequireBatch) {
		this.isRequireBatch = isRequireBatch;
	}
	public boolean isContainsLiquid() {
		return isContainsLiquid;
	}
	public void setContainsLiquid(boolean isContainsLiquid) {
		this.isContainsLiquid = isContainsLiquid;
	}
	public boolean isFragile() {
		return isFragile;
	}
	public void setFragile(boolean isFragile) {
		this.isFragile = isFragile;
	}
	public boolean isShipAlone() {
		return isShipAlone;
	}
	public void setShipAlone(boolean isShipAlone) {
		this.isShipAlone = isShipAlone;
	}
	public boolean isCanBeShippedInPolyBag() {
		return canBeShippedInPolyBag;
	}
	public void setCanBeShippedInPolyBag(boolean canBeShippedInPolyBag) {
		this.canBeShippedInPolyBag = canBeShippedInPolyBag;
	}




}
