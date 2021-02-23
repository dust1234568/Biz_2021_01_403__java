package com.callor.applications.service;

public class PrimeServiceV2 {

	public int prime(int keyNum) {

		// keyNum 값이 소수이면 return num
		// 아니면 return -1
		int index = 0;
		for (index = 2; index < keyNum; index++) {

			boolean bYes = keyNum % index == 0;

			if (bYes) {
				break;
			}
		}

		if (index < keyNum) {
			System.out.println(keyNum);
			return -1;
		} else {
			System.out.println(keyNum);
			return keyNum;
		}

	}
}
