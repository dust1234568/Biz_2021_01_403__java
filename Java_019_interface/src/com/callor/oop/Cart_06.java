package com.callor.oop;

import com.callor.oop.service.MenuService;
import com.callor.oop.service.impl.MenuServiceImplV3;

public class Cart_06 {

	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV3();
		
		mService.selectMenu();
		
		Integer selectMenu = ((MenuServiceImplV3)mService).menuItem;
		
		
	}
}
