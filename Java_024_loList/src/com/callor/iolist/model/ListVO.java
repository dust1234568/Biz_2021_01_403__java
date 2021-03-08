package com.callor.iolist.model;

public class ListVO {

	private String date; // 거래일자
	private String pName; // 상품명
	private String company; // 거래처명
	private String cName; // 대표자명
	private int intSwitch; // 구분
	private int inPrice; // 매입단가
	private int outPrice; // 판매단가
	private int qty; // 수량

	private int inTotal; // 매입금액 = 매입단가 * 수량
	private int outTotal; // 판매금액 = 판대단가 * 수량

	public ListVO(String date, String pName, String company, String cName, int intSwitch, int inPrice, int outPrice,
			int qty) {
		super();
		this.date = date;
		this.pName = pName;
		this.company = company;
		this.cName = cName;
		this.intSwitch = intSwitch;
		this.inPrice = inPrice;
		this.outPrice = outPrice;
		this.qty = qty;
	}

	public ListVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getIntSwitch() {
		return intSwitch;
	}

	public void setIntSwitch(int intSwitch) {
		this.intSwitch = intSwitch;
	}

	public int getInPrice() {
		return inPrice;
	}

	public void setInPrice(int inPrice) {
		this.inPrice = inPrice;
	}

	public int getOutPrice() {
		return outPrice;
	}

	public void setOutPrice(int outPrice) {
		this.outPrice = outPrice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getInTotal() {
		return inTotal;
	}

	public void setInTotal(int inTotal) {
		this.inTotal = inTotal;
	}

	public int getOutTotal() {
		return outTotal;
	}

	public void setOutTotal(int outTotal) {
		this.outTotal = outTotal;
	}

	@Override
	public String toString() {
		return "ListVO [date=" + date + ", pName=" + pName + ", company=" + company + ", cName=" + cName
				+ ", intSwitch=" + intSwitch + ", inPrice=" + inPrice + ", outPrice=" + outPrice + ", qty=" + qty + "]";
	}

}
