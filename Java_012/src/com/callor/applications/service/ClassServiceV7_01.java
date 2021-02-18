package com.callor.applications.service;

public class ClassServiceV7_01 {

	/*
	 * 정수 1개를 매개변수 dan에 전달받아 구구단 출력
	 */
	public void gugu(int dan) {

		System.out.println("==========================");
		System.out.printf("%d단 구구단\n", dan);
		System.out.println("--------------------------");
		for (int num = 2; num < 10; num++) {
			System.out.printf("%d x %d = %d\n", dan, num, dan * num);

		}
		System.out.println("==========================");
	}
}
