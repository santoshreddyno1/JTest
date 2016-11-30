package com.test.automation.model;

public class ProductDetails {
	
	private String prodName;
	private String prodDesc;
	private String prodLongDesc;
	private String barcode;
	private String prodCategory;
	private float retailPrice;
	private float retailCost;
	private float length;
	private float width;
	private float height;
	private float weight;
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getProdLongDesc() {
		return prodLongDesc;
	}
	public void setProdLongDesc(String prodLongDesc) {
		this.prodLongDesc = prodLongDesc;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public float getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(float retailPrice) {
		this.retailPrice = retailPrice;
	}
	public float getRetailCost() {
		return retailCost;
	}
	public void setRetailCost(float retailCost) {
		this.retailCost = retailCost;
	}
}
