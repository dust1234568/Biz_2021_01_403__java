package com.callor.start;

public class Multiple_01 {

	public static void main(String args[]) {

		int sum = 0;

		for (int i = 0; i < 100; i++) {

			int num = i + 7;

			boolean bYes = num % 3 == 0;

			if (bYes) {

				sum += num;

				System.out.println(num);
			}

		}
		System.out.println(sum + " : 7 ~ 106까지 3의 배수의 합");

	}

}
