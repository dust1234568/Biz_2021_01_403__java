package com.callor.oop.controller;

import com.callor.oop.service.CartServiceV2;

/*
 * Controller 클래스
 * web application 프로젝트를 수행할때 처음 시작하는 시작점 클래스
 * 
 * Service 등 모듈클래스를 객체로 선언하고 모듈클래스에 method들을 호출하는 일만 수행
 */
public class CartControllerV5_01 {

	public static void main(String[] args) {

		CartServiceV2 csV2 = new CartServiceV2();
		
		csV2.inputCart();
		
		csV2.printCartList();

	}
}
