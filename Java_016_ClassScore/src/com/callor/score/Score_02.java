package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String[] strSub = new String[] { "국어", "영어", "수학" };

		int allLen = strName.length;

		int[] intKor = new int[allLen];
		int[] intEng = new int[allLen];
		int[] intMath = new int[allLen];

		int[] resultSum = new int[allLen];
		float[] resultAvg = new float[allLen];

		int[] resultPrint = new int[allLen];
		Random rnd = new Random();

		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}

		// 총점 계산 scoreSum() method 에 값을 전달하고 호출
		for (int i = 0; i < strName.length; i++) {
			resultSum[i] = ssV1.scoreSum(intKor, intEng, intMath);
		}
		// 평균 계산 scoreAvg() method 에 값을 전달하고 호출
		for (int i = 0; i < strName.length; i++) {
			resultAvg[i] = ssV1.scoreAvg(resultSum);

		}
		// 성적리스트 scorePrint() method 에 값을 전달하고 호출
		for (int i = 0; i < strName.length; i++) {
			resultPrint[i] = ssV1.scorePrint(strName, intKor, intEng, intMath, resultSum, resultAvg);
		}

		System.out.println("======================================================");
		System.out.print("이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("------------------------------------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.println(resultSum[i]);
			System.out.println(resultAvg[i]);
			System.out.println(resultPrint[i]);

		}

		System.out.println("------------------------------------------------------");
	}

}
