package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_03 {

	public static void main(String[] args) {

		ScoreVO sVO = new ScoreVO();

		Scanner scan = new Scanner(System.in);

		System.out.println("============================");
		System.out.println("성적 입력 시스템");
		System.out.println("----------------------------");

		System.out.println("학생 이름을 입력하세요");
		String strName = scan.nextLine();

		while (true) {
			System.out.print("국어 점수를 입력하세요 >> ");
			String strKor = scan.nextLine();

			sVO.setIntKor(strKor);

			// intKor에 -1이 담겨 있으면 다시 입력을 하도록 해야한다
			if (sVO.intKor < 0) {
				continue;
			}
		}

		System.out.print("영어 점수를 입력하세요 >> ");
		while (true) {
			System.out.print("영어 점수를 입력하세요 >> ");
			String strEng = scan.nextLine();
			try {
				int intEng = Integer.valueOf(strEng);
				sVO.intEng = intEng;
				break;
			} catch (Exception e) {
				System.out.println("국어 점수는 숫자로만 입력");
				continue;
			}

		}

		System.out.print("수학 점수를 입력하세요 >> ");
		while (true) {
			System.out.print("영어 점수를 입력하세요 >> ");
			String strMath = scan.nextLine();
			try {
				int intMath = Integer.valueOf(strMath);
				sVO.intMath = intMath;
				break;
			} catch (Exception e) {
				System.out.println("국어 점수는 숫자로만 입력");
				continue;
			}

		}

	}

}
