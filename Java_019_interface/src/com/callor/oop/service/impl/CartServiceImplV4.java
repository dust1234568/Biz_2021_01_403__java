package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartService;

public class CartServiceImplV4 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceImplV4() {

		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);

	}

	@Override
	public void inputCart() {

		System.out.println("==================================");
		System.out.println("빛나라 카트 시스템 V3");
		System.out.println("----------------------------------");

		System.out.print("구매자 >> ");
		String strUserName = scan.nextLine();

		System.out.print("상품명 >> ");
		String strProName = scan.nextLine();

		int intQty = 0;
		while (true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
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
		int intPrice = 0;
		while (true) {
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1000) {
					System.out.println("단가는 1000 이상 입력하세요");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자로만 입력하세요");
			}

		}
		// 카트에 저장
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProName);
		cartVO.setPrice(intPrice);
		cartVO.setQty(intQty);
		cartVO.setTotal(intPrice * intQty);
		cartList.add(cartVO);

	}

	@Override
	public void printCart() {

		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(cartList.get(i).toString());

		}

	}

}
