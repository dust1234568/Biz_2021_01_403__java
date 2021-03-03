package com.callor.shop.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceImplV1 implements MenuService {

	// 선언만
	Scanner scan;

	public MenuServiceImplV1() {
		// 생성자 method 에서 초기화
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		System.out.println("=================================================");
		System.out.println("빛나라 쇼핑몰 2021");
		System.out.println("-------------------------------------------------");

		while (true) {

			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("=================================================");

			System.out.print("입력 >> ");
			String strMenu = scan.nextLine();

			if (strMenu.equals("QUIT")) {
				System.out.println("끝내기");
				break;
			}
			try {
				int intMenu = Integer.valueOf(strMenu);
				if (intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else {
					System.out.println("업무 선택은 1 ~ 3까지 중에 선택하세요");
				}

			} catch (Exception e) {
				System.out.println("업무 선택은 QUIT(끝내기), 1 ~ 3까지 정수만 입력할 수 있습니다");
			}

		}

		return null;
	}

}
