package com.callor.applications;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[10];

		// 배열 저장
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;

		}
		int intNumSum1 = 0;
		int intNumSum2 = 0;
		
		// 배열에 저장된 전체 합계 계산
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			intNumSum1 += intNum[i];

		}

		// 배열에 저장된 값 중 짝수들의 합계 계산 // intEvenSum
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			boolean bYes = intNum[i] % 2 == 0;
			if (bYes) { // if (intNum[i] % 2 == 0) {}
				intNumSum2 += intNum[i];
			}
			System.out.print(intNum[i] + " \t");
			System.out.print((intNum[i] % 2 == 0 ) + "\t");

		}
		System.out.println();
		System.out.println("배열에 저장된 값의 합계 : " + intNumSum1);
		System.out.println("배열에 저장된 값 중 짝수의 합계 : " + intNumSum2);
	}

}
