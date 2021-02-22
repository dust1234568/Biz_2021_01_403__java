package com.callor.applications;

import java.util.Random;

public class Score_04 {

	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		String[] strName = new String[3];

		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";

		Random rnd = new Random();

		for (int index = 0; index < strName.length; index++) {

			// 국어 점수 랜덤
			int score = rnd.nextInt(100) + 1;
			intKor[index] = Integer.valueOf(score);

			// 영어 점수 랜덤
			score = rnd.nextInt(100) + 1;
			intEng[index] = Integer.valueOf(score);

			// 수학 점수 랜덤
			score = rnd.nextInt(100) + 1;
			intMath[index] = Integer.valueOf(score);

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
