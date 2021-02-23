package com.callor.applications;

import java.util.Scanner;

public class Prime_01_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("2 이상의 정수 입력");
		System.out.print(">> ");
		int keyNum = scan.nextInt();

		// keyNum = 7
		boolean bYes = 7 % 2 == 0; // false
		bYes = 7 % 3 == 0; // false
		bYes = 7 % 4 == 0; // false
		bYes = 7 % 5 == 0; // false
		bYes = 7 % 6 == 0; // false
		// 7은 소수

		// keyNum = 4
		bYes = 4 % 2 == 0; // true, 소수가 아니다
		bYes = 4 % 3 == 0; // false

		for (int index = 2; index < keyNum; index++) {
			bYes = keyNum % index == 0;

			// 소수가 아닌 경우 찾는 방법
			if (bYes) {
				System.out.println("소수가 아니다");
				break;
			}

		}

		int pos = 0;
		for (pos = 2; pos < keyNum; pos++) {
			if (keyNum % pos == 0) {
				break;
			}
		}
		// pos의 값은?
		System.out.println(pos);

		// for 반복문이 중간에 break 되면 (1)
		// 항상 pos < keyNum 관계가 된다
		// if(pos == keyNum) {소수인 경우}
		if (pos < keyNum) {
			System.out.println(keyNum + "는 소수가 아님");
			// for 반복문이 break 없이 모두 완료되었으면 (2)
		} else {
			System.out.println(keyNum + "는 소수임");
		}

	}
}