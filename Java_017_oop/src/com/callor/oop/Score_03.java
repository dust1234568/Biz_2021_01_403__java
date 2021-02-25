package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;
import com.callor.oop.service.ScoreServiceV1;

public class Score_03 {

	public static void main(String[] args) {

		ScoreVO sVO = new ScoreVO();

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
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
			if (sVO.getIntKor() < 0) {
				System.out.println("국어점수 유효성 검사 실패");
				continue;
			}
			break;
		}

		while (true) {
			System.out.print("영어 점수를 입력하세요 >> ");
			String strEng = scan.nextLine();
			sVO.setIntEng(strEng);
			if (sVO.getIntEng() < 0) {
				System.out.println("영어점수 유효성 검사 실패");
				continue;
			}
			break;
		}

		//while (true) {
		//	System.out.print("영어 점수를 입력하세요 >> ");
		//	String strMath = scan.nextLine();
		//}
		
		sVO.setIntKor(ssV1.inputScore("국어")+ "");
		sVO.setIntEng(ssV1.);
	}

}
