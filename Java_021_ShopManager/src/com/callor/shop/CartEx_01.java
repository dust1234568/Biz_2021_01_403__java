package com.callor.shop;

import com.callor.shop.impl.CartServiceImplV1;
import com.callor.shop.impl.MenuServiceImplV1;
import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;

public class CartEx_01 {

	public static void main(String[] args) {

		CartService cService = new CartServiceImplV1();

		MenuService mService = new MenuServiceImplV1();

		while (true) {
			Integer menu = mService.selectMenu();

			if (menu == null) {
				break;
			} else if (menu == 1) {
				// 장바구니 상품 담기
				cService.inputCart();
			} else if (menu == 2) {
				// 장바구니 전체 리스트 보기
				cService.printCart();
			} else if (menu == 3) {
				// 구매자별 장바구니 리스트 보기
				cService.printUserCart();
			}

		}

	}
}
