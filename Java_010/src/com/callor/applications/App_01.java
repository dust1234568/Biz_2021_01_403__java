package com.callor.applications;

import java.util.Scanner;

public class App_01 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 >> ");
		int intNum = scan.nextInt();

		System.out.println("===================");
		int num = 1;
		for (int i = 2; i < 10; i++) {
			num += 1;
			System.out.println(intNum + " x " + num + " = " + (intNum * num));

		}
		System.out.println("===================");
	}
}
