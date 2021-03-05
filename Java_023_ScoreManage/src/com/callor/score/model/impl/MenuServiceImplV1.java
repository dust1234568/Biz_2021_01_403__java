package com.callor.score.model.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService {

	private Scanner scan;

	public MenuServiceImplV1() {
		scan = new Scanner(System.in);

	}

	@Override
	public Integer selectMenu() {

		while (true) {

			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.println(Values.MENU_INPUT + "." + "학생성적 점수 생성");
			System.out.println(Values.MENU_SAVE_FILE + "." + "학생성적 점수 파일에 저장");
			System.out.println(Values.MENU_SCORE_CHECK + "." + "성적결과 확인");
			System.out.println("QUIT" + "." + "끝내기");
			System.out.println(Values.dLine);
			System.out.print("선택 >> ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				System.out.println("업무 종료");
				break;
			}
			try {
				int intNum = Integer.valueOf(strNum);
				if (intNum >= 1 && intNum <= 3) {
					return intNum; 
				} else {
					System.out.println("업무는 1 ~ 3번 까지 입력하세요");
				}
				
			} catch (Exception e) {
			System.out.println("업무는 QUIT, 1 ~ 3 번 까지 입력하세요");
			}

		}

		return null;
	}

}
