package com.callor.applications;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intKor = new int[20];

		// 1 ~ 100 까지 중의 임의 수를 20개 만들어서
		// intKor 배열에 0번주소부터 19번주소까지 위치에 한개씩 저장하라
		for (int index = 0; index < 20; index++) {
			int num = rnd.nextInt(100) + 1;
			intKor[index] = num;

		}
		// 저장된 값을 읽어 Console에 출력
		// intKor 배열에 저장된 값들을 0번주소에 저장된 값부터 19번주소에 저장된 값까지
		// 순서대로 출력하라
		for (int index = 0; index < 20; index++) {
			System.out.println(intKor[index]);

		}

		int kor_1 = 0;
		int kor_100 = 0;
		for(int index = 0; index < 20; index++) {
			
			// kor_0 ~ kor_100
			kor_index = 100;
			
		}
	}

}
