package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			int num = i + 1;
			System.out.print(num + "번 이름 >> ");

			strName[i] = scan.nextLine();

		}
		System.out.println("--------------------------------------");

		System.out.println("국어 점수입력");
		for (int index = 0; index < intKor.length; index++) {
			int num = index + 1;
			System.out.print(num + "번 학생 >> ");
			intKor[index] = scan.nextInt();

		}
		System.out.println("--------------------------------------");

		System.out.println("영어 점수입력");
		for (int index = 0; index < intEng.length; index++) {
			int num = index + 1;
			System.out.print(num + "번 학생 >> ");
			intEng[index] = scan.nextInt();
		}
		System.out.println("--------------------------------------");

		System.out.println("수학 점수입력");
		for (int index = 0; index < intMath.length; index++) {
			int num = index + 1;
			System.out.print(num + "번 학생 >> ");
			intMath[index] = scan.nextInt();
		}

		System.out.println("======================================");
		System.out.printf("이름\t국어\t영어\t수학\n");
		System.out.println("--------------------------------------");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("--------------------------------------");
	}

}
