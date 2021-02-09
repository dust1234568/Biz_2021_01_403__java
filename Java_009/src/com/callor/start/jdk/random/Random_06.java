package com.callor.start.jdk.random;

import java.util.Random;

public class Random_06 {

	public static void main(String[] args) {

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			int ranNum = rnd.nextInt(100) + 1;
			System.out.println(ranNum);

			boolean bYes = ranNum > 34;
			if (bYes) {
				System.out.println((i + 1) + " 번째에서 나타남"); // 체크

				break;
			}

		}

	}

}
