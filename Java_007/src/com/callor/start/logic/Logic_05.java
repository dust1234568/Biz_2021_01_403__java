package com.callor.start.logic;

/*
 * 화폐매수 계산
 * 
 * 4789800
 * 오만원권 : 95매
 * 만원권 	: 3매 : 오만원 / 5
 * 오천원권 : 1매 : 만원 / 2
 * 천원권 	: 4매 : 오천원 / 5
 * 오백원 	: 1개 : 천원 / 2
 * 백원 	: 3개 : 오백원 / 5
 * 
 */
public class Logic_05 {

	public static void main(String args[]) {

		int pay = 4_789_800;
		int paper = 50_000;
		int count = pay / paper;

		System.out.println(paper + "원권 : " + count);
		
		int paper1 = 10_000;
		int count1 = (pay - (count * paper))/ paper1;
		
		System.out.println(paper1 + "원권 : " + count1);
	
	}
}
