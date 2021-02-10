package com.callor.applications.myclass;

import java.util.Scanner;

/*
 * main() method가 없는 클래스 선언
 * 
 * 
 */
public class MyGuGuDan {

	/*
	 * public(누구나) 사용할 수 있는 gugu() method 선언
	 * 
	 * 임의로 어떤 일을 수행하기 위한 명령문 생성
	 * 
	 */
	public void gugu() {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 (2 ~ 9) >> ");
		int num = scan.nextInt();

		System.out.println("===========================");
		System.out.println("구구단 " + num + " 단");
		System.out.println("---------------------------");

		for (int i = 0; i < 8; i++) {
			int num2 = i + 2;

			System.out.print(num);
			System.out.print(" x ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num * num2);
		}
	}

}
