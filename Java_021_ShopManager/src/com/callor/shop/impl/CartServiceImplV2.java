package com.callor.shop.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceImplV2 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceImplV2() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public void inputCart() {
		System.out.println("=================================================");
		System.out.println("장바구니 넣기");
		System.out.println("-------------------------------------------------");
		System.out.print("구매자 >> ");
		String userName = scan.nextLine();

		System.out.print("상품명 >> ");
		String productName = scan.nextLine();
		int intPrice = 0;
		while (true) {

			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1000) {
					System.out.println("단가는 1000원 이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 정수만 입력하세요");

			}

		}
		
		int intQty = 0;
		while (true) {
			
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) {
					System.out.println("수량은 1개 이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 정수만 입력하세요");

			}

		}
		int intTotal = intQty * intPrice;

		CartVO cartVO = new CartVO();
		cartVO.setUserName(userName);
		cartVO.setProductName(productName);
		cartVO.setIntQty(intQty);
		cartVO.setIntPrice(intPrice);
		cartVO.setIntTotal(intTotal);
		cartList.add(cartVO);
		
	}

	@Override
	public void printCart() {

		
	}

	@Override
	public void printUserCart() {

		
	}

}
