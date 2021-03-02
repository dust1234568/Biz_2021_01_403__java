package com.callor.cart.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.cart.model.CartVO;
import com.callor.cart.service.CartService;

public class CartServiceV1 implements CartService {

	// 선언 먼저
	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceV1() {
		// 생성자가 다음
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void inputCart() {

		System.out.println("=============================");
		System.out.println("장바구니에 넣기");
		System.out.println("-----------------------------");
		System.out.print("구매자 >> ");
		String strUserName = scan.nextLine();

		System.out.print("제품명 >> ");
		String strProductName = scan.nextLine();

		int intQty = 0;

		while (true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) {
					System.out.println("수량은 1 이상");
					continue;
				} // else { break; }
				break;
			} catch (Exception e) {
				System.out.println("수량은 숫자로만");
			}
		}
		int intPrice = 0;
		while (true) {
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1000) {
					System.out.println("단가는 1000 이상");
					continue;
				} // else { break; }
				break;
			} catch (Exception e) {
				System.out.println("단가는 숫자로만");
			}

		}
		
		int intTotal = intQty * intPrice; 
		
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProName(strProductName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intTotal);
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
