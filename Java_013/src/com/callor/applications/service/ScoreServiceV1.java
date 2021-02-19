package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	Scanner scan = new Scanner(System.in);

	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;

	// input() method가 호출되면
	// 키보드를 통해서 국어,영어,수학 점수를 입력받고
	// intKor, intEng, intMath에 저장
	public void input() {

		System.out.print("국어 점수 >> ");
		intKor = scan.nextInt();

		System.out.print("영어 점수 >> ");
		intEng = scan.nextInt();

		System.out.print("수학 점수 >> ");
		intMath = scan.nextInt();

	}

	public void sum() {

		intSum = intKor + intEng + intMath;

	}

	public void avg() {

		floatAvg = intSum / 3.0F;

	}

	public void print() {

		System.out.println("=======================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------");
		System.out.println(intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + floatAvg);
		System.out.println("=======================================");
	}
}
