package com.callor.applications;

import java.util.Scanner;

public class Score_02_01 {

	public static void main(String[] args) {

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int index = 0; index < strName.length; index++) {
			System.out.println("학생 이름을 입력하세요");
			System.out.print("이름 >> ");
			strName[index] = scan.nextLine();

			System.out.println("과목 점수를 입력하세요");
			System.out.print("국어 >> ");

			// 문자열형으로 입력받고
			String strSubj = scan.nextLine();
			// 문자열형숫자를 정수로 변경하여 저장
			intKor[index] = Integer.valueOf(strSubj);

			System.out.print("영어 >> ");
			strSubj = scan.nextLine();
			intEng[index] = Integer.valueOf(strSubj);

			System.out.print("수학 >> ");
			strSubj = scan.nextLine();
			intMath[index] = Integer.valueOf(strSubj);

			System.out.println("============================");

		}
		System.out.println("======================================");
		System.out.printf("이름\t국어\t영어\t수학\n");
		System.out.println("--------------------------------------");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("--------------------------------------");
	}

}
