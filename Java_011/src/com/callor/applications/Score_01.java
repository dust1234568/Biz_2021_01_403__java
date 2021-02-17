package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.print("국어 점수 (0 ~ 100) >> ");
		int korScore = Scan.nextInt();
		System.out.print("영어 점수 (0 ~ 100) >> ");
		int engScore = Scan.nextInt();
		System.out.print("수학 점수 (0 ~ 100) >> ");
		int matScore = Scan.nextInt();

		int sum = korScore + engScore + matScore;
		double avg = sum / 3.0;

		boolean bYes1 = (korScore > 0) && (korScore <= 100);
		boolean bYes2 = (engScore > 0) && (engScore <= 100);
		boolean bYes3 = (matScore > 0) && (matScore <= 100);

		if (!bYes1) {
			System.out.println("0 ~ 100 까지 입력");
		} else if (!bYes2) {
			System.out.println("0 ~ 100 까지 입력");
		} else if (!bYes3) {
			System.out.println("0 ~ 100 까지 입력");
		} else {
			System.out.println();
			System.out.println("=================================================");
			System.out.println("국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
			System.out.println("-------------------------------------------------");
			System.out.println(korScore + "\t" + engScore + "\t" + matScore + "\t" + sum + "\t" + avg);
			System.out.println("=================================================");
		}

	}

}
