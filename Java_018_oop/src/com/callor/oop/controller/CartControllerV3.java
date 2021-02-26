package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {

	public static void main(String[] args) {

		List<CartVO> cartList = new ArrayList<CartVO>();

		Scanner scan = new Scanner(System.in);

		CartVO[] cartVO = new CartVO[3];

		for (int i = 0; 0 < cartVO.length; i++) {

			System.out.print("구매자 이름 >> ");
			cartVO[i].setCartUserName(scan.nextLine());
			System.out.print("상품명 >> ");
			cartVO[i].setCartPname(scan.nextLine());

			System.out.print("수량 >> ");
			// 3000 이라고 입력하면 "3000" 으로 입력되어 문자열이다
			String cartQty = scan.nextLine();
			// "3000" 문자열형 숫자를 정수 3000으로 변경하여 변수에 저장
			cartVO[i].setCartQty(Integer.valueOf(cartQty));

			System.out.print("가격 >> ");
			String cartPrice = scan.nextLine();
			cartVO[i].setCartPrice(Integer.valueOf(cartPrice));

			String strPName = "홍길동";

			// 카트 리스트에 추가
			cartList.add(cartVO[i]);
		}

		// 카트 리스트 출력
		System.out.println("======================================");
		System.out.println("카트 장바구니");
		System.out.println("--------------------------------------");

		for (int i = 0; i < 3; i++) {
			cartVO[i] = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n", cartVO[i].getCartUserName(), cartVO[i].getCartPname(), cartVO[i].getCartQty(),
					cartVO[i].getCartPrice());
		}

	}
}
