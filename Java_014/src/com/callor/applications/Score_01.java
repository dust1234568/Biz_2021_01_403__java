package com.callor.applications;

import java.util.Scanner;

/*
 * 학생 3명의 국어, 영어, 수학 점수를 키보드로 입력받아서
 * (학생명의 과목점수를 저장할 배열을 선언)
 * (intKor, intEng, intMath)
 * Console에 리스트를 출력하기
 * 
 * 1. 학생 3명의 3과목의 점수를 저장할 배열
 * 2. 배열이 나오면 일단 for 반복문이 한번쯤은 나타난다
 * 3. 학생 3명의 3과목의 점수를 어떻게 입력받을 것인가
 * 4. 학생 3명의 과목 점수를 어떻게 출력할 것인가
 * 
 */
public class Score_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strSub = new String[] { "국어", "영어", "수학" };

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		for (int i = 0; i < 3; i++) {
			int num = i + 1;
			System.out.println(num + "번 학생");

			System.out.print("국어점수 >> ");
			intKor[i] = scan.nextInt();

			System.out.print("영어점수 >> ");
			intEng[i] = scan.nextInt();

			System.out.print("수학점수 >> ");
			intMath[i] = scan.nextInt();

		}
		System.out.println("==================================");
		System.out.println("국어\t영어\t수학");
		System.out.println("----------------------------------");

		System.out.println(intKor[0] + "\t" + intEng[0] + "\t" + intMath[0]);
		System.out.println(intKor[1] + "\t" + intEng[1] + "\t" + intMath[1]);
		System.out.println(intKor[2] + "\t" + intEng[2] + "\t" + intMath[2]);
	}
}
