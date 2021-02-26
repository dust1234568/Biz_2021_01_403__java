package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	List<CartVO> cartList = new ArrayList<CartVO>();

	Scanner scan = new Scanner(System.in);

	public void inputCart() {
		for (int i = 0; i < 3; i++) {

			System.out.println("======================================");
			System.out.println("상품 카트 ");
			System.out.println("--------------------------------------");

			System.out.print("구매자 >> ");
			String strUserName = scan.nextLine();

			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();

			int intQty = 0;
			while (true) {
				System.out.print("수량 >> ");
				String strQty = scan.nextLine();
				try {
					intQty = (Integer.valueOf(strQty));
					if (intQty < 2) {
						System.out.println("수량은 2 이상 입력하세요");
						continue;
					}
				} catch (Exception e) {
					System.out.println("수량은 정수만 입력하세요");
				}
				break;
			}
			int intPrice = 0;
			while (true) {
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();

				try {
					intPrice = Integer.valueOf(strPrice);
					if (intPrice < 1000) {
						System.out.println("단가는 1000이상 입력하세요");
						continue;
					}
				} catch (Exception e) {
					System.out.println("단가는 정수만 입력하세요");
				}
				break;
			}
			int intSum = 0;
			intSum = intQty * intPrice;

			CartVO csV1 = new CartVO();
			csV1.setCartUserName(strUserName);
			csV1.setCartPname(strPName);
			csV1.setCartQty(intQty);
			csV1.setCartPrice(intPrice);
			csV1.setCartTotal(intSum);

			cartList.add(csV1);

		} // end for

	}
	public void printCartList() {
		
		System.out.println("=======================================");
		System.out.println("구매자\t상품명\t수량\t단가\t총계");
		System.out.println("---------------------------------------");

		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n", cartList.get(i).getCartUserName(), cartList.get(i).getCartPname(),
					cartList.get(i).getCartQty(), cartList.get(i).getCartPrice(), cartList.get(i).getCartTotal());
		}
		
	}

}
