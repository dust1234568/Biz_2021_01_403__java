package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {

	public static void main(String[] args) {

		ScoreVO sVO = new ScoreVO();

		Scanner scan = new Scanner(System.in);

		System.out.println("============================");
		System.out.println("성적 입력 시스템");
		System.out.println("----------------------------");

		while (true) {
			System.out.println("학생 이름을 입력하세요");
			System.out.print(">> ");
			String strName = scan.nextLine();

			System.out.print("국어 점수를 입력하세요 >> ");
			try {
				String strKor = scan.nextLine();
				int intKor = Integer.valueOf(strKor);
				if ((intKor < 50) && (intKor > 100)) {
				} else { 
					System.out.println("50 ~ 100까지만 입력하세요");
				}
			} catch (Exception e) {
				System.out.print("숫자로 입력하세요");
			}
			System.out.print("영어 점수를 입력하세요 >> ");
			try {
				String strEng = scan.nextLine();
				int intEng = Integer.valueOf(strEng);
				if ((sVO.intEng < 50) && (sVO.intEng > 100)) {
				}
			} catch (Exception e) {
				System.out.println("50 ~ 100 까지만 입력하세요");
			}
			System.out.print("수학 점수를 입력하세요 >> ");
			try {
				String strMath = scan.nextLine();
				int intMath = Integer.valueOf(strMath);
				if ((sVO.intMath < 50) && (sVO.intMath > 100)) {

				}
			} catch (Exception e) {
				System.out.println("50 ~ 100 까지만 입력하세요");
			}
		}
	}

}
