package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2_01 {

	public static void main(String[] args) {

		CartVO[] cVO = new CartVO[3];

		cVO[0] = new CartVO();
		cVO[0].setCartUserName("홍길동");
		cVO[0].setCartDate("2021-02-26");
		cVO[0].setCartTime("10:44:00");
		cVO[0].setCartPname("초코파이");
		cVO[0].setCartQty(10);
		cVO[0].setCartStd("바나나맛");
		cVO[0].setCartPrice(1000);
		cVO[0].setCartTotal(1000 * 10);
		System.out.println(cVO[0].toString());

		cVO[1] = new CartVO();
		cVO[1].setCartUserName("홍길동");
		cVO[1].setCartDate("2021-02-26");
		cVO[1].setCartTime("11:04:49");
		cVO[1].setCartPname("빅파이");
		cVO[1].setCartQty(100);
		cVO[1].setCartStd("딸기맛");
		cVO[1].setCartPrice(500);
		cVO[1].setCartTotal(500 * 100);
		System.out.println(cVO[1].toString());

		cVO[2] = new CartVO();
		cVO[2].setCartUserName("홍길동");
		cVO[2].setCartDate("2021-02-26");
		cVO[2].setCartTime("10:05:15");
		cVO[2].setCartPname("감자칩");
		cVO[2].setCartQty(6);
		cVO[2].setCartStd("오리지널");
		cVO[2].setCartPrice(1000);
		cVO[2].setCartTotal(1000 * 6);
		System.out.println(cVO[2].toString());
		
		// === cartVO의 개수가 3인 상태
		// 상품 한가지를 더 카트에 넣고 싶다
		cVO = new CartVO[4]; // 이전 배열 값은 무시됨 [0] [1] [2]
		// 배열의 크기를 변경하는 명령문을 쓰면 이전 변수 내용이 이름은 같지만
		// 새로운 cVO가 생성 
		
		cVO[3] = new CartVO();
		cVO[3].setCartUserName("홍길동");
		cVO[3].setCartDate("2021-02-26");
		cVO[3].setCartTime("10:44:00");
		cVO[3].setCartPname("바나나우유");
		cVO[3].setCartQty(10);
		cVO[3].setCartStd("바나나맛");
		cVO[3].setCartPrice(1000);
		cVO[3].setCartTotal(1000 * 10);
		System.out.println(cVO[3].toString());
		
		System.out.println("=========================");
		System.out.println("카트 내용");
		System.out.println("-------------------------");
		
		for (int i = 0; i < cVO.length; i++) {
			System.out.println(cVO[i].toString());
			
			
		}
		
	}

}
