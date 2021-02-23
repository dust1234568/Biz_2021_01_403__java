package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		// Random 클래스를 사용하여 rnd 객체를 선언하고
		// = new Radnom() 명령을 사용하여 rnd 객체를 인스턴스화(..으로 만든다) 시킨다
		// rnd = Random 클래스의 인스턴스
		Random rnd = new Random();

		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
			System.out.println(intNums[i]);

		}

		System.out.print("1 ~ 10 까지 정수 입력 >> ");
		int num = scan.nextInt();

		for (int i = 0; i < intNums.length; i++) {

			boolean bYes = i == num;

			if (bYes) {
				System.out.println(num + "의 개수 ");

			}

		}

	}

}
