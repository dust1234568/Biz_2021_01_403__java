package com.callor.oop;

import java.util.ArrayList;
import java.util.List;

import com.callor.oop.model.CartVO;

public class CartList_03 {

	public static void main(String[] args) {

		List<CartVO> cartList = new ArrayList<CartVO>();

		CartVO cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");
		cartList.add(cartVO);

		cartVO.setCartUserName("이몽룡");
		cartList.add(cartVO);

		cartVO.setCartUserName("성춘향");
		cartList.add(cartVO);

		cartVO.setCartUserName("장녹수");
		cartList.add(cartVO);

		cartVO.setCartUserName("임꺽정");
		cartList.add(cartVO);

	}
}
