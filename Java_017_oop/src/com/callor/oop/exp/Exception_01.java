package com.callor.oop.exp;

import java.util.Scanner;

public class Exception_01 {

	public static void main(String[] args) {

		Integer.valueOf("3");
		// Integer.valueOf("");// 아무것도아니다. 숫자타입이 아니라 정수형으로 바꾸지 못함

		// try catch : 예외처리
		try {
			Integer.valueOf(""); // "" 값을 정수형으로 바꿔바라(시도해봐라)
		} catch (NumberFormatException e) { // 다른 오류를 제외하고 NumberFormatException 오류가 발생하면 처리하겠다
			System.out.println("null 값은 숫자로 변환할 수 없음");
		}
		// boolean bYes = 3 == "3"; // int형과 String형 이므로 컴퓨터는 완전히 다른 타입으로 인식하여 비교 불가
		// if (3 == "3") {} // if() 문 동일

		Scanner scan = new Scanner(System.in);
		System.out.println("0 이상의 정수를 입력하세요");
		System.out.print(">> ");
		// 아무것도 입력하지 않고 enter 누르면 NumberFormatException 오류 발생
		String strNum = scan.nextLine();

		try {
			int intNum = Integer.valueOf(strNum);
			if (intNum < 0) {
				System.out.println("정수 0 이상 입력하세요!!!"); // 예외사항
			} else {
				System.out.println("입력한 정수 : " + intNum);
			}
		} catch (Exception e) { // java 에서 발생하는 모든 Exception을 전부 catch 하겠다
			System.out.println("반드시 숫자로 입력해 주세요");
			// TODO: handle exception
		}

		

	}
}
