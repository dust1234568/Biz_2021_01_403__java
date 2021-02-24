package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class Homework_01 {

	public static void main(String[] args) {

		// (3)method 호출
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		Random rnd = new Random();
		int sum = 0;

		// (2) 2 ~ 101 범위의 임의의 정수 100개 만들고
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 2;

			// return 된 결과값 = 소수인 수들의 리스트 출력
			int result = psV2.prime(num);
			if (result > 0) {

				// (5) 소수의 합
				sum += result;

				// (4) 소수 리스트
				System.out.printf("%d,", result);
			}
		}
		System.out.println();
		System.out.println("소수 합 : " + sum);

	}
}