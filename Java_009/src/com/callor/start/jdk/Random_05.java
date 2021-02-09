package com.callor.start.jdk;

import java.util.Random;

public class Random_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int intRndNum = rnd.nextInt(); // int intRndNum = rnd.nextInt(100) + 1;
		int sum = 0;

		for (int i = 0; i < 100; i++) {
			intRndNum = rnd.nextInt(100) + 1;
			System.out.print(intRndNum + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
			if (intRndNum % 2 == 0) {
				sum += intRndNum;
				// System.out.println(sum);
			}

		}
		System.out.println("1 ~ 100 까지 임의의 수중에서 짝수들만의 합 " + sum);
	}

}
