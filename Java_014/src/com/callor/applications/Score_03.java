package com.callor.applications;

import java.util.Scanner;

public class Score_03 {
	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		String[] strName = new String[3];

		Scanner scan = new Scanner(System.in);

		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";

		for (int i = 0; i < strName.length; i++) {
			System.out.println(strName[i]);
			
			System.out.print("국어점수 >> ");
			intKor[i] = scan.nextInt();

			System.out.print("영어점수 >> ");
			intEng[i] = scan.nextInt();
			
			System.out.print("수학점수 >> ");
			intMath[i] = scan.nextInt();
			
		}

		System.out.println("=======================================");
		System.out.print("이름\t국어\t영어\t수학\n");
		System.out.println("---------------------------------------");
		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
			
		}
		System.out.println("---------------------------------------");
	}
}
