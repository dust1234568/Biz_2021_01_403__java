package com.callor.shop.model;

public class CartVO {

	// private 인스턴스 변수 선언
	// 추상화
	private String userName;
	private String productName;
	private String date;
	private String time;

	private int intQty;
	private int intPrice;
	private int intTotal;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getIntQty() {
		return intQty;
	}

	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}

	public int getIntPrice() {
		return intPrice;
	}

	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}

	public int getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}

	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", date=" + date + ", time=" + time
				+ ", intQty=" + intQty + ", intPrice=" + intPrice + ", intTotal=" + intTotal + "]";
	}

}
