package com.callor.start;

public class Multiple_02 {

	public static void main(String args[]) {

		int sum = 0;

		for (int i = 0; i < 100; i++) {

			int num = i + 7;

			boolean bYes = num % 3 == 0;

			// if (bYes == false)
			if (!bYes) {
				sum += num;
				// System.out.println(sum); << 3의 배수가 아닌 수 나열 하는 출력문
			}
		}
		System.out.println("3의 배수가 아닌 수의 합 : " + sum);

	}
}
