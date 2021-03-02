package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.MenuService;

public class MenuServiceImplV2 implements MenuService {

	/*
	 * 인스턴스 객체 선언
	 * 생성자에서 객체변수 초기화하여 사용 준비
	 * 
	 */
	List<CartVO> cartList = new ArrayList<CartVO>();
	private Scanner scan;

	public MenuServiceImplV2() {
		scan = new Scanner(System.in);
	}

	public void selectMenu() {

		while (true) {

			System.out.println("=============================");
			System.out.println("카트 메뉴 System V1");
			System.out.println("-----------------------------");

			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("QUIT. 끝내기");
			System.out.println("-----------------------------");

			System.out.print("선택 >> ");
			String strNum = scan.nextLine();

			// 1. QUIT 를 입력하면 끝내기
			if (strNum.equals("QUIT")) {
				System.out.println("끝내기");
				return;
			}
			// 2. QUIT 가 아니면 숫자로 변경하여 메뉴 선택 처리
			try {
				int num = Integer.valueOf(strNum);
				if (num == 1) {
					System.out.print("1. 카트추가");
				} else if (num == 2) {
					System.out.print("2. 카트삭제");
				} else if (num == 3) {
					System.out.print("3. 카트리스트");
				} else {
					System.out.println("메뉴는 1 ~ 3까지 입력");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("1 ~ 3 까지 입력 또는 QUIT 끝내기");
				System.out.println("-----------------------------");
			}

		}

		scan.close();
	}

}
