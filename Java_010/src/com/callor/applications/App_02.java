package com.callor.applications;

import java.util.Scanner;

public class App_02 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 (2 ~ 9) >>");

		while (true) {

			int num = scan.nextInt();

			System.out.println("==========================");

			boolean bYes = (num < 2) || (num > 9);

			if (bYes) {

				System.out.println("경고");
				// break;
			} else {

				System.out.println("구구단 " + num + "단");
				System.out.println("--------------------------");

				for (int i = 0; i < 8; i++) {

					int num1 = i + 2;

					System.out.print(num);
					System.out.print(" x ");
					System.out.print(num1);
					System.out.print(" = ");
					System.out.println(num * num1);

				}
			}
			System.out.println("--------------------------");
		}
	}
}
