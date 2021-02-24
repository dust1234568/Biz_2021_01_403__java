package com.callor.score.service;

public class ScoreServiceV1 {

	public int scoreSum(int[] intKor, int[] intEng, int[] intMath) {
		int[] sum = new int[intKor.length];
		for (int i = 0; i < intKor.length; i++) {
			sum[i] = intKor[i];
			sum[i] += intEng[i];
			sum[i] += intMath[i];

		}
		return 0;
	}

	public float scoreAvg(int[] resultSum) {
		float[] avg = new float[resultSum.length];
		for (int i = 0; 0 < resultSum.length; i++) {
			avg[i] = resultSum[i] / 3.0F;
		}
		return 0;
	}

	public int scorePrint(String[] strName, int[] intKor, int[] intEng, int[] intMath, int[] resultSum,
			float[] resultAvg) {
		int print = 0;

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], intKor[i], intEng[i], intMath[i], resultSum[i],
					resultAvg[i]);
		}
		return print;
	}

}
