package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		// 100개의 intNums 배열 선언 및 생성
		int[] intNums = new int[100];

		Random rnd = new Random();
		// Random 클래스 사용하여 intNums 배열에 1 ~ 100까지의 정수를 생성하여 저장
		for (int i = 0; i < intNums.length; i++) {
			
			intNums[i] = rnd.nextInt(100) + 1;

			// System.out.println(intNums[i]);
		}

		System.out.println("3의 배수이면서 5의 배수인 값");
		System.out.println("리스트");

		int sum = 0;
		int count = 0;
		for (int i = 0; i < intNums.length; i++) {
			
			// 각각의 배수를 구하기위해 intNums[i] 나누었을때 0이되는 값을 구하고
			// 논리합으로 3의 배수이면서 5의 배수인 값을 논리식으로 표현
			boolean bYes = (intNums[i] % 3 == 0) && (intNums[i] % 5 == 0);

			if (bYes) {
				
				// boolean식이 true인 숫자들 출력
				System.out.printf("%d\t", intNums[i]);
				
				count++;
				// true로 나온 숫자들의 합
				sum += intNums[i];
				
			}

		}
		System.out.println();
		System.out.println("개수 : " + count);
		System.out.println("합계 : " + sum);
	}

}
