package com.callor.start;

public class Odd_Even_01 {

	public static void main(String args[]) {

		int sum = 0;

		for (int i = 0; i <= 100; i++) {

			boolean bYes = i % 2 == 0;

			// 만약 bYes true 이면
			if (bYes) {
				sum += i;
				// 값을 변수에 계속 더하라
			}

		}
		// 결과값을 출력하라
		System.out.println(sum + " : 짝수 들의 합");

		sum = 0;
		for (int i = 0; i <= 100; i++) {

			boolean bFalse = i % 2 == 1;

			if (bFalse) {
				sum += i;
			}

		}
		System.out.println(sum + " : 홀수 들의 합");
	}
}
