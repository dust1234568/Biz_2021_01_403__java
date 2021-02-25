package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {

	public static void main(String[] args) {

		ProductVO pVO = new ProductVO();

		System.out.println("toString() " + pVO.toString());

		Scanner scan = new Scanner(System.in);

		System.out.println("========================================================");
		System.out.println("상품정보 등록(입력) 시스템 V1");
		System.out.println("--------------------------------------------------------");
		System.out.println("상품정보를 입력하세요");
		System.out.println("--------------------------------------------------------");

		System.out.print("상품 코드 입력 >> ");
		pVO.strPCode = scan.nextLine();

		System.out.print("상품명 입력 >> ");
		pVO.strPName = scan.nextLine();

		System.out.print("품목 입력 >> ");
		pVO.strItem = scan.nextLine();

		System.out.print("거래처 입력 >> ");
		pVO.strDName = scan.nextLine();

		System.out.print("매입 단가 입력 >> ");
		pVO.iPrice = scan.nextInt();

		System.out.print("매출 단가 입력 >> ");
		pVO.oPrice = scan.nextInt();

		// System.out.println("========================================================");
		// System.out.printf("%s\t%s\t%s\t%s\t%d\t%d\n", pVO.strPCode, pVO.strPName,
		// pVO.strItem, pVO.strDName, pVO.iPrice,
		// pVO.oPrice);
		// System.out.println("-------------------------------------------------------");

		pVO.toString();

	}
}
