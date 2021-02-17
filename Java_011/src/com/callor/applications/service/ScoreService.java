package com.callor.applications.service;

import java.util.Scanner;

public class ScoreService {

	public void Score() {

		Scanner Scan = new Scanner(System.in);

		System.out.print("국어 점수를 입력하세요 >> ");

		int intKor = Scan.nextInt();

		System.out.print("영어 점수를 입력하세요 >> ");
		int intEng = Scan.nextInt();

		System.out.print("수학 점수를 입력하세요 >> ");
		int intMath = Scan.nextInt();

		System.out.println("========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");

		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;

		float fAvg = intSum / 3.0f;

		System.out.print(intSum + "\t");
		System.out.println(fAvg);
		System.out.println("========================================");

	}

}
