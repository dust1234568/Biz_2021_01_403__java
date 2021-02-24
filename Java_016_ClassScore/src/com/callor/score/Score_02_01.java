package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;
import com.callor.score.service.ScoreServiceV1_01;

public class Score_02_01 {

	public static void main(String[] args) {

		ScoreServiceV1_01 ssV1 = new ScoreServiceV1_01();

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String[] strSub = new String[] { "국어", "영어", "수학" };

		int allLen = strName.length;

		int[] intKor = new int[allLen];
		int[] intEng = new int[allLen];
		int[] intMath = new int[allLen];

		int[] intSum = new int[allLen];
		float[] floatAvg = new float[allLen];

		int[] intPrint = new int[allLen];
		Random rnd = new Random();

		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}

		// 총점 계산
		// ssV1.scoreSum() method를 호출하여 총점 계산

		for (int i = 0; i < strName.length; i++) {

			// ssV1.scoreSum() 호출하여 총점
			// 총점을 계산하려면 3과목의 점수를 전달하고
			// 총점 결과를 다시 return 받아서...해야한다

			// i 번째 학생의 3과목 점수를 scoreSum()에 전달하고
			// 결과를 다시 i 번째 학생의 총점에 저장
			// intSum[i] : i 번째 학생의 총점

			int sum = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);
			intSum[i] = sum;

		}
		for (int i = 0; i < strName.length; i++) {
			float avg = ssV1.scoreAvg(intSum[i]);
			floatAvg[i] = avg;
		}

		for (int i = 0; i < strName.length; i++) {

			ssV1.print(strName[i], intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		}

		// 이름,국어,영어,수학,총점,평균 배열을
		// 통째로 매개변수로 전달하고
		// ssV1.print() method에서 리스트를 출력하도록
		ssV1.print(strName, intKor, intEng, intMath, intSum, floatAvg);
	}
}
