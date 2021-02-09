package com.callor.start;

public class Multiple_01 {

	public static void main(String args[]) {

		int intSum = 0;

		// 1 ~ 100 까지의 범위
		for (int i = 0; i < 100; i++) {

			/*
			 * boolean bYes1 = i % 3 == 0; boolean bYes2 = i % 9 == 0;
			 * 
			 * if (bYes1) { System.out.println(i); } if (bYes2) { System.out.println(i); }
			 * if (i % 9 == 0) { sum += i; // 의미없는 코드 } }
			 * System.out.println("3의 배수 이면서, 9의 배수인 수의 합 : " + sum);
			 */
		
			int num1 = i + 1;
			boolean bYes1 = num1 % 3 == 0;
			boolean bYes2 = num1 % 9 == 0;

			// 3의 배수이면샤(and) 9의 배수
			if (bYes1 && bYes2) {
				intSum += num1; // i를 더하지 않는다
				System.out.println(num1 + "는 3과 9의 배수");
			}
		}
		System.out.println("3과 9의 배수합 : " + intSum);
		System.out.println("==============================");

		intSum = 0;
		for (int i = 0; i < 100; i++) {
			int num1 = i + 1;
			boolean bYes3 = num1 % 3 == 0;
			boolean bYes4 = num1 % 9 == 0;

			// if() 비교연산문을 중복 처리하는 방식
			if (bYes3) { // 3의 배수를 검사하고 맞으면
				// 연산을 수행한 후
				if (bYes4) { // 다시 9의 배수를 검사하는 방식
					intSum += num1;
					System.out.println(num1);

				}
			}

		}
		System.out.println(intSum);
	}

}
