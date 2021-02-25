package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {

	public static void main(String[] args) {

		ProductVO[] pVO = new ProductVO[5];

		String[] strPCode = new String[5];
		String[] strPName = new String[5];
		String[] strDName = new String[5];
		String[] strItem = new String[5];
		int[] iPrice = new int[5];
		int[] oPrice = new int[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("========================================================");
		System.out.println("상품정보 등록(입력) 시스템 V1");

		for (int i = 0; i < strPCode.length; i++) {
			int num = i + 1;

			System.out.println("--------------------------------------------------------");
			System.out.println(num + "번 상품정보를 입력하세요");
			System.out.println("--------------------------------------------------------");

			System.out.print("상품 코드 입력 >> ");
			strPCode[i] = scan.nextLine();
			
			System.out.print("상품명 입력 >> ");
			strPName[i] = scan.nextLine();
			
			System.out.print("품목 입력 >> ");
			strItem[i] = scan.nextLine();

			System.out.print("거래처 입력 >> ");
			strDName[i] = scan.nextLine();

			System.out.print("매입 단가 입력 >> ");
			iPrice[i] = scan.nextInt();
			scan.nextLine();
			// Integer intIPrice = Integer.valueOf(i);
			
			System.out.print("매출 단가 입력 >> ");
			oPrice[i] = scan.nextInt();
			scan.nextLine();
			// Integer intOPrice = Integer.valueOf(i);
			
		}
		pVO.toString();
		// pVO.toString(strPCode, strPName, strItem, strDName, iPrice, oPrice);
	}
}
