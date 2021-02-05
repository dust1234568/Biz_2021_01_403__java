package com.callor.start.logic;

public class Logic_06 {

	public static void main(String args[]) {

		// 5만원권 계산
		int pay = 4_789_800;
		int paper = 50_000;

		for (; pay > 0;) {
			int count = pay / paper;
			pay -= (paper * count);
			paper = paper / 5;
			System.out.println(paper + "원권 : " + count);
		}

	}
}
