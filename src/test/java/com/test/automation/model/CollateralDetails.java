package com.test.automation.model;

public class CollateralDetails {
	
	private String collateralSKU;
	private String collateralDesc;
	private String collateralLongDesc;
	private String collateralType;
	private boolean isbarcoded;
	private String barcode;
	private float collateralLength;
	private float collateralWidth;
	private float collateralHeight;
	private float collateralWeight;
	private boolean notIncludeWithPrepackagedProducts;
	
	
	
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getCollateralSKU() {
		return collateralSKU;
	}
	public void setCollateralSKU(String collateralSKU) {
		this.collateralSKU = collateralSKU;
	}
	public String getCollateralDesc() {
		return collateralDesc;
	}
	public void setCollateralDesc(String collateralDesc) {
		this.collateralDesc = collateralDesc;
	}
	public String getCollateralLongDesc() {
		return collateralLongDesc;
	}
	public void setCollateralLongDesc(String collateralLongDesc) {
		this.collateralLongDesc = collateralLongDesc;
	}
	public String getCollateralType() {
		return collateralType;
	}
	public void setCollateralType(String collateralType) {
		this.collateralType = collateralType;
	}
	public boolean isIsbarcoded() {
		return isbarcoded;
	}
	public void setIsbarcoded(boolean isbarcoded) {
		this.isbarcoded = isbarcoded;
	}
	
	public float getCollateralLength() {
		return collateralLength;
	}
	public void setCollateralLength(float collateralLength) {
		this.collateralLength = collateralLength;
	}
	public float getCollateralWidth() {
		return collateralWidth;
	}
	public void setCollateralWidth(float collateralWidth) {
		this.collateralWidth = collateralWidth;
	}
	public float getCollateralHeight() {
		return collateralHeight;
	}
	public void setCollateralHeight(float collateralHeight) {
		this.collateralHeight = collateralHeight;
	}
	public float getCollateralWeight() {
		return collateralWeight;
	}
	public void setCollateralWeight(float collateralWeight) {
		this.collateralWeight = collateralWeight;
	}
	public boolean isNotIncludeWithPrepackagedProducts() {
		return notIncludeWithPrepackagedProducts;
	}
	public void setNotIncludeWithPrepackagedProducts(boolean notIncludeWithPrepackagedProducts) {
		this.notIncludeWithPrepackagedProducts = notIncludeWithPrepackagedProducts;
	}
	
	


}
