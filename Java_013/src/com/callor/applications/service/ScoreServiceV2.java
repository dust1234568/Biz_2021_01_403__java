package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	// 클래스로 객체 선언 및 초기화(생성)
	private Scanner scan = new Scanner(System.in);

	// 정수 및 실수형 변수 "선언만"

	private String strName;

	private int intKor;
	private int intEng;
	private int intMath;

	private int intSum;
	private float floatAvg;

	public void input() {

		System.out.println("학생 이름을 입력하세요");
		System.out.print("이름 >> ");
		strName = scan.nextLine();
		
		System.out.println("각 과목의 점수를 입력하세요");
		
		/*
		 * public int nextInt() {
		 * 		return 키보드로 입력한 정수;
		 * }
		 */
		System.out.print("국어 >> ");
		intKor = scan.nextInt();

		System.out.print("영어 >> ");
		intEng = scan.nextInt();

		System.out.print("수학 >> ");
		intMath = scan.nextInt();
	}

	public void sum() {

	}

	public void avg() {

	}

	public void print() {

		// %s : 문자열 formatting
		System.out.printf("이름 : %3s\n", strName);

		System.out.printf("국어 : %3d\n", intKor);
		System.out.printf("영어 : %3d\n", intEng);
		System.out.printf("수학 : %3d\n", intMath);
		System.out.printf("총점 : %3d\n", intSum);
		System.out.printf("평균 : %3.2f\n", floatAvg);
	}
}
