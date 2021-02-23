package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {

			intNums[i] = rnd.nextInt(10) + 1;
			// intNums[i]배열에 저장된 값 모두 출력
			// System.out.println(intNums[i]);
		}

		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 ~ 10 까지 중 정수 입력");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();

		System.out.printf("값 %d가 저장된 첫번째 위치 \n", keyNum);

		for (int position = 0; position < intNums.length; position++) {

			boolean bYes = intNums[position] == keyNum;
			if (bYes) {

				System.out.println(position + "번째 위치");

				// 최초로 나타나는 위치만 표시하고 if() 반복문 종료
				break;
			}

		}

	}

}
