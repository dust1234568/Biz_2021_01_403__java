package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {

	public static void main(String[] args) {
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		// keyNum 값을 키보드로부터 입력 받음
		Scanner scan = new Scanner(System.in);
		System.out.print("2 이상 정수 입력 >> ");
		int keyNum = scan.nextInt();
		
		// 입력된 keyNum값을 psV2.prime() method에 전달하며 결과값 호출
		// return 된 결과 값을 result 변수를 선언하고 저장
		int result = psV2.prime(keyNum);
		
		// 소수가 아니면 -1이므로 keyNum값 그대로인 소수와 if()문으로 판별하여 출력
		if(result < 0) {
			System.out.println(keyNum + "는 소수가 아님");
		} else {
			System.out.println(keyNum + "는 소수");
		}
	}
}
