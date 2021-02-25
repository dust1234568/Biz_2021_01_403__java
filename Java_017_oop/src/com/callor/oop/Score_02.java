package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;
import com.callor.oop.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreVO sVO = new ScoreVO();

		ScoreServiceV1 ssV1 = new ScoreServiceV1();

		Scanner scan = new Scanner(System.in);

		System.out.println("============================");
		System.out.println("성적 입력 시스템");
		System.out.println("----------------------------");

		while (true) {
			System.out.print("학생 이름을 입력하세요 >> ");
			String strName = scan.nextLine();

			//sVO.intKor = ssV1.inputScore("국어");
			sVO.intEng = ssV1.inputScore("영어");
			sVO.intMath = ssV1.inputScore("수학");

			while (true) {
				System.out.print("국어 점수를 입력하세요 >> ");
				String strKor = scan.nextLine();
				try {
					int intKor = Integer.valueOf(strKor);
					//sVO.intKor = intKor;
					sVO.setIntKor(strKor);
					break;
				} catch (Exception e) {
					System.out.println("국어 점수는 숫자로만 입력");
					continue;
				}
			}
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

			while (true) {
				System.out.print("수학 점수를 입력하세요 >> ");
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

}
