package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartService;

public class CartServiceImplV3 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceImplV3() {

		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);

	}

	@Override
	public void inputCart() {

		while (true) {
			System.out.println("==================================");
			System.out.println("빛나라 카트 시스템 V3");
			System.out.println("----------------------------------");

			System.out.print("구매자 >> ");
			String strUserName = scan.nextLine();

			System.out.print("상품명 >> ");
			String strProName = scan.nextLine();

			System.out.print("수량 >> ");
			String strQty = scan.nextLine();

			while (true) {
				int intQty = 0;
				try {
					intQty = Integer.valueOf(strQty);
					if (intQty < 1) {
						System.out.println("수량은 1개 이상 입력하세요");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로만 입력하세요");
				}

			}

		}

	}

	@Override
	public void printCart() {
		// TODO Auto-generated method stub

	}

}
