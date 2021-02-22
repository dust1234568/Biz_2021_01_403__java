package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strSub = new String[] { "국어", "영어", "수학" };

		int[] intKor = new int[4];
		int[] intEng = new int[4];
		int[] intMath = new int[4];

		for (int i = 0; i < 3; i++) {

			System.out.println((i + 1) + "번 학생");

			System.out.print("국어점수 >> ");
			intKor[i] = scan.nextInt();

			System.out.print("영어점수 >> ");
			intEng[i] = scan.nextInt();

			System.out.print("수학점수 >> ");
			intMath[i] = scan.nextInt();

		}
		System.out.println("==================================");
		System.out.println("국어\t영어\t수학");
		System.out.println("----------------------------------");

		System.out.println(intKor[0] + "\t" + intEng[0] + "\t" + intMath[0]);
		System.out.println(intKor[1] + "\t" + intEng[1] + "\t" + intMath[1]);
		System.out.println(intKor[2] + "\t" + intEng[2] + "\t" + intMath[2]);
	}
}
