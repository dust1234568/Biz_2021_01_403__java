package com.callor.iolist.model;

/*
 * 거래일자[0], ioDate : String
 * 상품명[4], 	idPName : Stirng
 * 거래처명[5], ioDept : String
 * 대표자명[6], ioDeptCeo : String
 * 구분[7], 	ioInout : 1 == 매입, 2 == 매출 int
 * 매입단가[8], ioIprice : 합계를 계산해야할 데이터 int
 * 판매단가[9], ioOprice : int 
 * 수량[10] 	ioQty : int
 * 
 * 추상화 단계, 모델링
 */
public class IolistVO {

	private String ioDate;
	private String ioPName;
	private String ioDept;
	private String ioDeptCeo;

	private int inInout; // 구분
	private int ioIprice; // 매입단가
	private int inOprice; // 판매단가
	private int ioQty; // 수량

	private int ioITotal; // 매입금액 : 매입단가 * 수량
	private int inOTotal; // 판매금액 : 판대단가 * 수량

	/*
	 * 기본 생성자 기본 생정자만 필요한 경우는 별도로 만들지 않아도 된다
	 * 그런데 필드생성자를 1개라도 만들면 기본 생성자도 반드시 만들어 줘야 한다
	 * 필드 생성자를 만들면 기본 생성자가 자동으로 구현되지 않는다
	 * 
	 * 필드 생성자만 있고 기본 생성자를 만들지 않으면 다음 코드에서 오류가 발생 
	 * 		IolistVO ioVO = new IolistVO();
	 */
	public IolistVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 대표자명이 생략된 생성자
	public IolistVO(String ioDate, String ioPName, String ioDept, int inInout, int ioIprice, int inOprice, int ioQty) {
		super();
		this.ioDate = ioDate;
		this.ioPName = ioPName;
		this.ioDept = ioDept;
		this.inInout = inInout;
		this.ioIprice = ioIprice;
		this.inOprice = inOprice;
		this.ioQty = ioQty;
	}

	// 전체 필드가 포함된 생성자
	public IolistVO(String ioDate, String ioPName, String ioDept, String ioDeptCeo, int inInout, int ioIprice,
			int inOprice, int ioQty) {
		super();
		this.ioDate = ioDate;
		this.ioPName = ioPName;
		this.ioDept = ioDept;
		this.ioDeptCeo = ioDeptCeo;
		this.inInout = inInout;
		this.ioIprice = ioIprice;
		this.inOprice = inOprice;
		this.ioQty = ioQty;
	}

	public String getIoDate() {
		return ioDate;
	}

	public void setIoDate(String ioDate) {
		this.ioDate = ioDate;
	}

	public String getIoPName() {
		return ioPName;
	}

	public void setIoPName(String ioPName) {
		this.ioPName = ioPName;
	}

	public String getIoDept() {
		return ioDept;
	}

	public void setIoDept(String ioDept) {
		this.ioDept = ioDept;
	}

	public String getIoDeptCeo() {
		return ioDeptCeo;
	}

	public void setIoDeptCeo(String ioDeptCeo) {
		this.ioDeptCeo = ioDeptCeo;
	}

	public int getInInout() {
		return inInout;
	}

	public void setInInout(int inInout) {
		this.inInout = inInout;
	}

	public int getIoIprice() {
		return ioIprice;
	}

	public void setIoIprice(int ioIprice) {
		this.ioIprice = ioIprice;
	}

	public int getInOprice() {
		return inOprice;
	}

	public void setInOprice(int inOprice) {
		this.inOprice = inOprice;
	}

	public int getIoQty() {
		return ioQty;
	}

	public void setIoQty(int ioQty) {
		this.ioQty = ioQty;
	}

	public int getIoITotal() {
		return ioITotal;
	}

	public void setIoITotal(int ioITotal) {
		this.ioITotal = ioITotal;
	}

	public int getInOTotal() {
		return inOTotal;
	}

	public void setInOTotal(int inOTotal) {
		this.inOTotal = inOTotal;
	}

	@Override
	public String toString() {
		return "IolistVO [ioDate=" + ioDate + ", ioPName=" + ioPName + ", ioDept=" + ioDept + ", ioDeptCeo=" + ioDeptCeo
				+ ", inInout=" + inInout + ", ioIprice=" + ioIprice + ", inOprice=" + inOprice + ", ioQty=" + ioQty
				+ ", ioITotal=" + ioITotal + ", inOTotal=" + inOTotal + "]";
	}

}