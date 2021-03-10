package com.callor.score.service.impl;

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
		// TODO Auto-generated method stub

		while (true) {
			System.out.println(Values.dLine);
			System.out.println("성적일람표");
			System.out.println(Values.sLine);
			System.out.println(Values.MENU_INPUT + ". 입력 하기");
			System.out.println(Values.MENU_SAVE + ". 저장 하기");
			System.out.println(Values.MENU_LOAD + ". 불러 오기");
			System.out.println(Values.MENU_PRINT + ". 출력");
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine);

			System.out.print("선택 >> ");
			String strNum = scan.nextLine();

			if (strNum.equalsIgnoreCase("QUIT")) {
				System.out.println("업무 종료");
				break;
			}
			try {
				Integer intNum = Integer.valueOf(strNum);
				if (intNum >= Values.MENU_START && intNum <= Values.MENU_END) {
					return intNum;
				} else {
					System.out.printf("업무는 %d ~ %d번 까지 입력하세요", Values.MENU_START, Values.MENU_END);
				}

			} catch (Exception e) {
				System.out.printf("업무는 QUIT, %d ~ %d 번 까지 입력하세요", Values.MENU_START, Values.MENU_END);
			}
		}
		return null;
	}

}
