package com.callor.score;

import java.util.Random;

public class Score_01 {

	public static void main(String[] args) {

		// String[] strN = new String[5];
		// strN[0] = "홍길동";

		// 배열에 정해진 값(고정값)을 넣어 저장하고
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		// String[] strAdd = {"서울시", "익산시", "남원시", "한양시", "함흥시" };
		String[] strAdd = new String[] { "서울시", "익산시", "남원시", "한양시", "함흥시" };
		String[] strSub = new String[] { "국어", "영어", "수학" };

		// 학생수 변동시 이 변수값만 변경하면됨
		// int arrLen = strName.length
		// int[] intKor = new int[allLen];

		// 5개의 점수, 총점, 평균 배열 선언
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];

		int[] intSum = new int[5];
		float[] floatAvg = new float[5];

		Random rnd = new Random();

		// 학생 과목별 점수를 Random 값 생성 후 저장
		for (int i = 0; i < strName.length; i++) {

			// 국어 점수 1 ~ 100 까지 Random 값 저장
			intKor[i] = rnd.nextInt(100) + 1;

			// 영어 점수 1 ~ 100 까지 Random 값 저장
			intEng[i] = rnd.nextInt(100) + 1;

			// 수학 점수 1 ~ 100 까지 Random 값 저장
			intMath[i] = rnd.nextInt(100) + 1;

		}
		// 학생별 총점 계산
		for (int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i] + intEng[i] + intMath[i];

			// intSum[i] = intKor[i];
			// intSum[i] += intEng[i];
			// intSum[i] += intMath[i];
		}
		// 학생별 평균 계산 평균 - 총점 / 3;
		for (int i = 0; i < strName.length; i++) {
			floatAvg[i] = (float) intSum[i] / 3;

			// floatAvg[i] = intSum[i] / 3.0F;
		}

		System.out.println("======================================================");
		System.out.print("이름\t주소\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("------------------------------------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], strAdd[i], intKor[i], intEng[i],
					intMath[i], intSum[i], floatAvg[i]);
		}
		System.out.println("------------------------------------------------------");
	}
}
