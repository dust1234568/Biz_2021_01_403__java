package com.callor.oop.model;

/*
 * 카트 정보를 담아 App에서 사용할 Value Object 클래스
 * 구매자, 상품명, 규격, 날짜, 시각, 수량, 구매단가, 구매금액
 * 
 */
public class CartVO {

	private String userName; // 구매자
	private String productName; // 상품명
	private String standard; // 규격
	private String date; // 날짜
	private String time; // 시각
	private int qty; // 수량
	private int price; // 구매단가
	private int total; // 구매금액
	
	// VO 변수 변경시 지우고 다시 get,set 설정
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", standard=" + standard + ", date="
				+ date + ", time=" + time + ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}

}
