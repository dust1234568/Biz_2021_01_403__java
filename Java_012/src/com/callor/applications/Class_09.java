package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {

	public static void main(String[] args) {
		ClassServiceV7 csV7 = new ClassServiceV7();

		Scanner scan = new Scanner(System.in);
		System.out.print("2 ~ 9 까지 정수 입력 >> ");

		int dan = scan.nextInt();

		int gugu = csV7.gugu(dan);
		System.out.println(gugu);

	}
}
