package com.callor.score.model;

public class ScoreVO {

	private String num;
	private int Kor;
	private int Eng;
	private int Math;
	private int Music;
	private int History;

	private int total;
	private float avg;

	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScoreVO(String num, int kor, int eng, int math, int music, int history) {
		super();
		this.num = num;
		Kor = kor;
		Eng = eng;
		Math = math;
		Music = music;
		History = history;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getKor() {
		return Kor;
	}

	public void setKor(int kor) {
		Kor = kor;
	}

	public int getEng() {
		return Eng;
	}

	public void setEng(int eng) {
		Eng = eng;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getMusic() {
		return Music;
	}

	public void setMusic(int music) {
		Music = music;
	}

	public int getHistory() {
		return History;
	}

	public void setHistory(int history) {
		History = history;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", Kor=" + Kor + ", Eng=" + Eng + ", Math=" + Math + ", Music=" + Music
				+ ", History=" + History + ", total=" + total + ", avg=" + avg + "]";
	}

}
