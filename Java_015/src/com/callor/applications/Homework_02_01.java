package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class Homework_02_01 {

	/*
	 *  2 이상의 임의의 정수 100개를 만들고
	 *  PrimeServiceV2의 prime() method 호출하여
	 *  임의 정수 100개 중 소수인 수들의 리스트를 출력(배열 이용)
	 *  소수인 수들의 합
	 */
	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();

		int intPrimeSum = 0;
		int intPrimeCount = 0;

		// int rndNums[] = new int[100]; 둘다 사용 가능
		int[] rndNums = new int[100];

		for (int i = 0; i < 100; i++) {
			rndNums[i] = rnd.nextInt(10000) + 2;
		}
	}
}