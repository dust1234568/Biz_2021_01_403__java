package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
			// System.out.println(intNums[i]);
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("1 ~ 10 까지 중 정수 입력");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();

		for (int i = 0; i < intNums.length; i++) {

			boolean bYes = intNums[i] == keyNum;
			if (bYes) {

				// boolean식을 만족하는 i의 위치번호 출력
				System.out.println(i + "번째");
			}

		}

	}
}
