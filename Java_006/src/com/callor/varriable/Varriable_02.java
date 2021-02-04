package com.callor.varriable;

public class Varriable_02 {

	public static void main(String[] args) {

		// 연산하고자 하는 원래값이 저장되는 변수 선언
		int num1 = 0;
		int num2 = 0;

		// 변수에 연산할 값을 저장하기
		num1 = 70;
		num2 = 90;

		// 연산결과를 저장할 변수 선언과 초기화
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;

		// 연산결과를 변수에 저장하기
		result1 = num1 + num2;
		result2 = num1 * num2;
		result3 = num2 - num1;
		result4 = num2 / num2;
		result5 = num2 % num1;

		// 변수에 저장된 결과를 Console에 출력
		// 30 + 40 = 70
		System.out.println("30 + 40 = " + (30 + 40));

		// 덧셈
		System.out.print(num1);
		System.out.print(" + ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.print(result1);

		// 뺼셈
		System.out.print(num1);
		System.out.print(" - ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.print(result3);

		// 곱셈
		System.out.print(num2);
		System.out.print(" x ");
		System.out.print(num1);
		System.out.print(" = ");
		System.out.print(result2);

		// 나눗셈
		System.out.print(num2);
		System.out.print(" ÷ "); // ㄷ 입력 후 한자키
		System.out.print(num1);
		System.out.print(" = ");
		System.out.print(result4);

		// 나머지(MOD)
		System.out.print(num2);
		System.out.print(" MODE "); // 프리티 아웃
		System.out.print(num1);
		System.out.print(" = ");
		System.out.print(result5);

	}

}
