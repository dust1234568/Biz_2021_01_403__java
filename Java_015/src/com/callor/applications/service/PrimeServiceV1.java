package com.callor.applications.service;

public class PrimeServiceV1 {

	// 정수 1개를 매개변수로 갖는 prime() method
	public void prime(int keyNum) {

		int index = 0;
		for (index = 2; index < keyNum; index++) {

			boolean bYes = keyNum % index == 0;

			if (bYes) {
				// System.out.println("소수가 아니다");
				break;
			}

		}
		if (index < keyNum) {
			System.out.println(keyNum + " 은(는) 소수가 아님");
		} else {
			System.out.println(keyNum + " 은(는) 소수임");
		}

	}
}
