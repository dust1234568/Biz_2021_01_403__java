package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 2 이상의 정수를 입력 받아 변수에 저장
		System.out.print("2 이상의 정수 입력 >> ");
		int num = scan.nextInt();

		for (int i = 2; i < num; i++) {

			boolean bYes = num % i == 0;
			//boolean bYes = (num % num == 0) && (num % 1 == 0);

			if (!bYes) {
				System.out.println("소수");
				break;
			} else {
				System.out.println("소수아님");
				break;
			}

		}
		System.out.println("=====");
	}
}