package com.callor.student.model;

public class StuVO {

	private int stNum; // 학번
	private String stName; // 학생이름
	private String stSub; // 학과
	private int stGrade; // 학년
	private int stBan; // 반
	private String stAdd; // 주소
	private String stTel; // 전화번호

	public StuVO() {

	}

	public StuVO(int stNum, String stName, String stSub, int stGrade, int stBan, String stAdd, String stTel) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stSub = stSub;
		this.stGrade = stGrade;
		this.stBan = stBan;
		this.stAdd = stAdd;
		this.stTel = stTel;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStSub() {
		return stSub;
	}

	public void setStSub(String stSub) {
		this.stSub = stSub;
	}

	public int getStGrade() {
		return stGrade;
	}

	public void setStGrade(int stGrade) {
		this.stGrade = stGrade;
	}

	public int getStBan() {
		return stBan;
	}

	public void setStBan(int stBan) {
		this.stBan = stBan;
	}

	public String getStAdd() {
		return stAdd;
	}

	public void setStAdd(String stAdd) {
		this.stAdd = stAdd;
	}

	public String getStTel() {
		return stTel;
	}

	public void setStTel(String stTel) {
		this.stTel = stTel;
	}

	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", stSub=" + stSub + ", stGrade=" + stGrade
				+ ", stBan=" + stBan + ", stAdd=" + stAdd + ", stTel=" + stTel + "]";
	}

}
