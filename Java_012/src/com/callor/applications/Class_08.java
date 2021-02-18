package com.callor.applications;

import com.callor.applications.service.ClassServiceV6;

public class Class_08 {

	public static void main(String[] args) {

		ClassServiceV6 csV6 = new ClassServiceV6();

		// 2-1
		int num1 = 88;
		int num2 = 99;

		// 2-2
		csV6.add(num1, num2);
		csV6.substraction(num1, num2);

		// 3-1
		// 각각 method에 변수(에 담긴 값) num1, num2 를 전달하고
		// 변수 num1과 num2에 담긴 값을 전달
		int resultAdd = csV6.add(num1, num2);
		int resultSub = csV6.substraction(num1, num2);

		// 3-2
		System.out.println("덧셈 : " + resultAdd);
		System.out.println("뺼셈 : " + resultSub);
		System.out.println("-------------------");
		System.out.printf("%d와 %d의\n덧셈 : %d, 뺼셈 : %d", num1, num2, resultAdd, resultSub);
	}

}
