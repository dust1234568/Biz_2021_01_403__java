package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class Homework_02 {

	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();

		// num 배열 100개 만들고
		int[] num = new int[100];

		// 배열 num 100개에 2 ~ 101 까지 랜덤 값을 각각 저장
		for (int i = 0; i < num.length; i++) {

			num[i] = rnd.nextInt(100) + 2;

		}

		int sum = 0;
		for (int i = 0; i < num.length; i++) {

			// return 된 결과값 = 소수인 수 리스트
			int result = psV2.prime(num[i]);

			if (result > 0) {

				// 소수 리스트
				System.out.printf("%d,", result);
				// 소수인 수들의 합 계산
				sum += result;
			}
		}
		System.out.println();
		System.out.println("소수 합계 : " + sum);
	}
}