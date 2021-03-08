package com.callor.score.model.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService {

	// 1
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
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine);
			System.out.print("선택 >> ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				System.out.println("업무 종료");
				return null;
			}
			try {
				Integer intNum = Integer.valueOf(strNum);
				if (intNum >= Values.MENU_START && intNum <= Values.MENU_LAST) {
					return intNum; 
				} else {
					System.out.printf("업무는 %d ~ %d번 까지 입력하세요", Values.MENU_START, Values.MENU_LAST);
				}
				
			} catch (Exception e) {
				System.out.printf("업무는 QUIT, %d ~ %d 번 까지 입력하세요", Values.MENU_START, Values.MENU_LAST);
			}

		}

	}

}
