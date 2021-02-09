package com.callor.start.jdk;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String args[]) {

		Random rnd = new Random();
		int ranNum = rnd.nextInt(100) + 1;
		System.out.println("랜덤 값 : " + ranNum);

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int intNum = scan.nextInt();

		if (intNum > ranNum) {
			System.out.println(intNum + " > " + ranNum);
		}
		if (intNum < ranNum) {
			System.out.println(intNum + " < " + ranNum);
		}
		if (intNum == ranNum) {
			System.out.println(intNum + " == " + ranNum);
		}
		/*
		 * boolean bYes1 = intNum > ranNum;
		 * boolean bYes2 = intNum < ranNum;
		 * boolean bYes3 = intNum == ranNum;
		 * 
		 * if (bYes1) {
		 * System.out.println(intNum + " > " + ranNum);
		 * }
		 * if (bYes2) {
		 * System.out.println(intNum + " < " + ranNum);
		 * }
		 * if (bYes3) {
		 * System.out.println(intNum + " == " + ranNum); 
		 * }
		 */
	}

}
