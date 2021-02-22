package com.callor.applications;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		// 학생이름배열 개수만큼 과목성적을 저장할 배열 선언
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		// 학생이름 배열 개수만큼 총점과 평균을 계산 저장할 배열 선언
		int[] intSum = new int[3]; // int[] intSum = new int[strName.length];
		float[] floatAvg = new float[3]; // float[] floatAvg = new float[strName.length];

		String[] strName = new String[3];

		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";

		// 학생별로 점수를 입력 생성(하는 코드)
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
		
		// 학생별로 총점을 계산하는 코드
		for (int num = 0; num < intSum.length; num++) {
			int sum = intKor[num] + intEng[num] + intMath[num];
			intSum[num] = Integer.valueOf(sum);

			/*
			 * intSum[i] = intKor[i];
			 * intSum[i] += intEng[i];
			 * intSum[i] += intMath[i];
			 */
		}
		
		// 학생별로 평균을 계산하는 코드
		for (int num = 0; num < floatAvg.length; num++) {

			// floatAvg[num] = Integer.valueOf(avg);
			floatAvg[num] = intSum[num] / 3.0F;
			// flaotAvg[num] = (float) intSum[i] / 3;
		}
		
		// 성적리스트 제목 출력
		System.out.println("================================================");
		System.out.println("빛나리 학습 성적알람표");
		System.out.println("================================================");
		System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("------------------------------------------------");

		// 성적리스트 출력
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg[i]);
		}

		System.out.println("------------------------------------------------");
	}

}
