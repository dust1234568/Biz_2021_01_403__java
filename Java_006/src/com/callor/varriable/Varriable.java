package com.callor.varriable;

public class Varriable {
	
	public static void main(String[] args) {
		
		
		// 연산하고자 하는 원래값이 저장되는 변수
		int intNum1 = 0; // int num1 = 0;
		int intNum2 = 0;
		
		// 변수에 연산할 값을 저장하기
		intNum1 = 30; // num1 = 30;
		intNum2 = 40;
	
		// 연산결과를 저장할 변수 선언과 초기화
		int intResult1 = 0; // int result1 = 0;
		int intResult2 = 0;
		int intResult3 = 0;
		int intResult4 = 0;
		int intResult5 = 0;
		
		// 연산결과를 변수에 저장하기
		intResult1 = intNum1 + intNum2; // resutl1 = num1 + num2;
		intResult2 = intNum1 * intNum2;
		intResult3 = intNum2 - intNum1;
		intResult4 = intNum2 / intNum2;
		intResult5 = intNum2 % intNum1;
		
		// 변수에 저장된 결과를 Console에 출력
		System.out.println(intResult1); // sysout.out.println(result1);
		System.out.println(intResult2);
		System.out.println(intResult3);
		System.out.println(intResult4);
		System.out.println(intResult5);
		
		
	}

}
