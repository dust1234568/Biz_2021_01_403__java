package com.callor.start;

public class Loop_02 {
	public static void main(String args[]) {

		for (int i = 0; i < 10; i += 1) {

		}

		int num = 0;
		num = num + 1;
		num += 1;
		num = +1; // 이 코드는 사용하지 말것
		num++; // num 변수를 1 증가 시켜라
		++num; // 단항연산자

		num = num - 1;
		num -= 1;
		num--;
		--num;
		for (int i = 0; i < 10; i++) {

		}

		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}

	}
}
