package com.callor.applications.service;

public class ClassServiceV7 {

	public int gugu(int dan) {
		
		System.out.println("==========================");
		System.out.printf("%d단 구구단\n", dan);
		System.out.println("--------------------------");
		
		
		for (int i = 0; i < 9; i++) {
			int num = 0;
			num = i + 1;

			System.out.print(dan);
			System.out.print(" x ");
			System.out.print(num);
			System.out.print(" = ");
			System.out.println(dan * num);

		}
		return dan;
	}
}
