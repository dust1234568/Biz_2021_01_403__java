package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {

		CartVO[] cVO = new CartVO[3];

		for (int i = 0; i < cVO.length; i++) {
			cVO[i] = new CartVO();
		}

		cVO[0].setCartUserName("홍길동");
		cVO[0].setCartDate("2021-02-26");
		cVO[0].setCartTime("10:44:00");
		cVO[0].setCartPname("초코파이");
		cVO[0].setCartQty(10);
		cVO[0].setCartStd("바나나맛");
		cVO[0].setCartPrice(1000);
		cVO[0].setCartTotal(1000 * 10);

		cVO[1].setCartUserName("이몽룡");
		cVO[1].setCartDate("2021-02-26");
		cVO[1].setCartTime("11:04:49");
		cVO[1].setCartPname("빅파이");
		cVO[1].setCartQty(100);
		cVO[1].setCartStd("딸기맛");
		cVO[1].setCartPrice(500);
		cVO[1].setCartTotal(500 * 100);

		cVO[2].setCartUserName("성춘향");
		cVO[2].setCartDate("2021-02-26");
		cVO[2].setCartTime("10:05:15");
		cVO[2].setCartPname("감자칩");
		cVO[2].setCartQty(6);
		cVO[2].setCartStd("오리지널");
		cVO[2].setCartPrice(1000);
		cVO[2].setCartTotal(1000 * 6);

		System.out.println(cVO[0].toString());
		System.out.println(cVO[1].toString());
		System.out.println(cVO[2].toString());

	}

}
