package com.callor.applications.service;

public class ClassServiceV1 {

	/*
	 * Java 코딩을 할때
	 * {} 내에서 같은 이름의 변수는 2번 이상 선언 불가
	 * class {} 내에서 같은 이름의 method는 2번 이상 선언 불가
	 * 
	 * 하지만, java에서는 method의 매개변수 개수, 타입이 다르면
	 * 같은 이름의 method를 중복하여 선언 할 수 있다
	 */
	
	// C 언어의 경우 method 이름 중복 x 
	public void sum_int_int(int num1, int num2) {

	}

	public void sum_int_float(int num1, float num2) {

	}

	public void add(int num1, int num2) {
		System.out.print("a. ");
		System.out.println(num1 + num2);

	}

	public void add(int num1, float fNum) {
		System.out.print("b. ");
		System.out.println(num1 + fNum);

	}

	public void add(double dNum, float fNum) {
		System.out.println("c. ");
		System.out.println(dNum + " + " + fNum + " = " + (dNum + fNum));
		System.out.println(dNum + " x " + fNum + " = " + (dNum * fNum));
		System.out.println(dNum + " - " + fNum + " = " + (dNum - fNum));
		System.out.println(dNum + " / " + fNum + " = " + (dNum / fNum));

	}
}
