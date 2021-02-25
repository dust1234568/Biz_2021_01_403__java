package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03_01 {

	public static void main(String[] args) {

		// VO 클래스를 배열로 선언하고
		// 사용 ( 데이터 저장, 읽기) 하려면
		// 선언된 객체배열 요소요소를 모두
		// 다시 초기화(생성)하는 과정이 필요하다
		ProductVO[] pVOs = new ProductVO[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("==========================");
		System.out.println("쇼핑몰 상품관리 V1");
		System.out.println("--------------------------");

		String strN = 3 + ""; // "3" 이라는 문자열로 저장 , ""빈칸없이
		int intN = Integer.valueOf(strN);

		for (int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();

			// 연속된 값으로 상품코드 생성
			String pCode = (i + 1) + "";
			pVOs[i].strPCode = pCode;

			System.out.println(pCode + " 번 상품 정보 입력");
			System.out.println("--------------------------");

			System.out.print("상품 코드 >> ");
			pVOs[i].strPCode = scan.nextLine();

			System.out.print("상품 이름 >> ");
			pVOs[i].strPName = scan.nextLine();

			System.out.print("거래처 >> ");
			pVOs[i].strDName = scan.nextLine();

			System.out.print("품목 >> ");
			pVOs[i].strItem = scan.nextLine();

			while (true) {

				System.out.print("매입단가 >> ");
				String strIPrice = scan.nextLine();
				int intIprice = Integer.valueOf(strIPrice);
				if (pVOs[i].iPrice < 0) {
					System.out.println("0 미만은 입력 할 수 없습니다");
					System.out.println("다시 입력해 주세요");

				} else {
					pVOs[i].iPrice = intIprice;
					break;
				}
			}

			while (true) {
				System.out.print("매출단가 >> ");
				String strOPrice = scan.nextLine();
				int intOPrice = Integer.valueOf(strOPrice);

				if (intOPrice < 0) {
					System.out.println("0 미만은 입력 할 수 없습니다");
					System.out.println("다시 입력해 주세요");
				} else {
					// 정상처리되었으면
					// 단가가 0 이상 입력되었으면
					// VO에 값을 저장하고 다음단계로 진행
					// 현 시점의 while() 은 중단하라
					pVOs[i].oPrice = intOPrice;
					break;
				}

			}
			pVOs[i].toString();
		}

	}
}
