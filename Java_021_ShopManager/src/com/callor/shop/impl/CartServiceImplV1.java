package com.callor.shop.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceImplV1 implements CartService {

	// 선언만
	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceImplV1() {
		// 생성자 method에서 초기화
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

		// 카트 정보 생성
		CartVO cartVO = new CartVO();
		// 카트 정보 입력
		cartVO.setUserName(userName);
		cartVO.setProductName(productName);
		cartVO.setIntQty(intQty);
		cartVO.setIntPrice(intPrice);
		cartVO.setIntTotal(intTotal);
		// 카트리스트 추가
		cartList.add(cartVO);

	}

	@Override
	public void printCart() {

		System.out.println("* 전체 장바구니 리스트");
		System.out.println("=================================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-------------------------------------------------");

		// 카트리스트 전체 입력 개수
		int nSize = cartList.size();
		// 카트리스트 전체 합계
		int intTotal = 0;
		int count = 0;

		for (int i = 0; i < nSize; i++) {

			System.out.printf(cartList.get(i).getUserName() + "\t");
			System.out.printf(cartList.get(i).getProductName() + "\t");
			System.out.printf(cartList.get(i).getIntPrice() + "\t");
			System.out.printf(cartList.get(i).getIntQty() + "\t");
			System.out.printf(cartList.get(i).getIntTotal() + "\n");
			intTotal += cartList.get(i).getIntTotal();
			count++;
		}

		System.out.println("-------------------------------------------------");
		System.out.println("합계" + "\t" + count + "가지" + "\t" + "\t" + "\t" + intTotal);
		System.out.println("-------------------------------------------------");

	}

	@Override
	public void printUserCart() {
		System.out.println("=================================================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("-------------------------------------------------");
		System.out.print("이름 >> ");
		String strName = scan.nextLine();

		System.out.println(strName + "\t " + "장바구니 리스트");
		System.out.println("=================================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-------------------------------------------------");

		// 카트리스트 전체 입력 개수
		int nSize = cartList.size();
		int intTotal = 0;
		// 이름별 입력 개수
		int count = 0;

		for (int i = 0; i < nSize; i++) {

			if (strName.equals(cartList.get(i).getUserName())) {
				System.out.printf(cartList.get(i).getUserName() + "\t");
				System.out.printf(cartList.get(i).getProductName() + "\t");
				System.out.printf(cartList.get(i).getIntPrice() + "\t");
				System.out.printf(cartList.get(i).getIntQty() + "\t");
				System.out.printf(cartList.get(i).getIntTotal() + "\n");

				intTotal += cartList.get(i).getIntTotal();
				count++;
			}

		}
		System.out.println("-------------------------------------------------");
		System.out.println("합계" + "\t" + count + "가지" + "\t" + "\t" + "\t" + intTotal);
		System.out.println("-------------------------------------------------");
	}

}
