package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<CartVO> cartList = new ArrayList<CartVO>();

		for (int i = 0; i < 3; i++) {

			// 제목 보이기
			System.out.println("==========================");
			System.out.println("쇼핑 카트 상품 추가");
			System.out.println("--------------------------");

			// 입력 받기
			System.out.println("구매자 >> ");
			String strUserName = scan.nextLine();

			System.out.println("상품명 >> ");
			String strPName = scan.nextLine();

			System.out.println("수량 >> ");
			String strQty = scan.nextLine();
			int intQty = Integer.valueOf(strQty);

			System.out.println("단가 >> ");
			String strPrice = scan.nextLine();
			int intPrice = Integer.valueOf(strPrice);

			// 카트정보 생성
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPname(strPName);
			cartVO.setCartQty(intQty);
			cartVO.setCartPrice(intPrice);

			// 카트정보 리스트에 추가하기
			cartList.add(cartVO);

		} // end for

		System.out.println("==================================================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("--------------------------------------------------");

		// 배열에서는 배열.length 값을 참조하면 배열의 개수를 알 수 있었다
		// List에서는 list.size() method를 호출하면 List의 개수를 return 해준다 
		
		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n", cartList.get(i).getCartUserName(), cartList.get(i).getCartPname(),
					cartList.get(i).getCartQty(), cartList.get(i).getCartPrice());

		}

	}

}
