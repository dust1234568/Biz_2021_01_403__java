package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class MenuServiceImplV1 {

	List<CartVO> cartList = new ArrayList<CartVO>();
	Scanner scan = new Scanner(System.in);

	public void selectMenu() {

		System.out.println("=============================");
		System.out.println("Java Menu System V1");
		System.out.println("-----------------------------");

		while (true) {

			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 끝내기");
			System.out.println("-----------------------------");

			try {
				System.out.print("선택 >> ");
				String strNum = scan.nextLine();

				if (strNum == "Q") {
					System.out.print("끝내기");
					break;
				}
				int num = Integer.valueOf(strNum);
				if (num == 1) {
					System.out.print("카트추가");
					break;
				} else if (num == 2) {
					System.out.print("카트삭제");
					break;
				} else if (num == 3) {
					System.out.print("카트리스트");
					break;
				}

			} catch (Exception e) {
				System.out.println("1 ~ 3 까지 입력 또는 Q 끝내기");
				System.out.println("-----------------------------");

			}

		}
		scan.close();
	}

}
