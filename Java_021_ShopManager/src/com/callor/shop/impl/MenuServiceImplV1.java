package com.callor.shop.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

// 클래스 MenuServiceImplV1을 선언하고 MenuService 인터페이스를 implements
public class MenuServiceImplV1 implements MenuService {

	// mehtod 바깥에서 scanner를 선언만 하고
	Scanner scan;

	public MenuServiceImplV1() {
		// 생성자 method 에서 초기화
		// 분리해서 선언 초기화 하는 이유는 memory 누수 관리때
		scan = new Scanner(System.in);
	}

	//메뉴 선택 method 
	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("=================================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("-------------------------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("=================================================");

			// 메뉴를 선택할 수 있도록 입력 프롬프트 생
			System.out.print("입력 >> ");
			// 문자열로 입력 받기 
			String strMenu = scan.nextLine();

			// equals는 내용 자체를 비교, == 는 주소값을 비
			// 입력된 값이 문자열 "QUIT" 과 같으면 업무종료 문구를 출력하고 종
			if (strMenu.equals("QUIT")) { 
				System.out.println("업무종료");
				break;
			}
			// 입력된 문자열을 정수형으로 형변형시키고 그때 발생할수 있는 exception을 막기위한 유효성검사 를 실시한
			try {
				int intMenu = Integer.valueOf(strMenu);
				// 입력된 문자열을 정수형으로 형변환시켜서 그 값이 1 이상 3 이하 일 경우 intMenu로 값이 return된
				if (intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else { 
					// 1 ~ 3 까지 정수 외의 값을 입력 했을 경우 아래 출력문을 출력
					System.out.println("업무 선택은 1 ~ 3까지 중에 선택하세요");
				}
				// QUIT와 1 ~ 3 까지 정수 외의 문자열과 정수 값을 입력 할 경우 아래 출력문을 출
			} catch (Exception e) {
				System.out.println("업무 선택은 QUIT(끝내기), 1 ~ 3까지 정수만 입력할 수 있습니다");
			}

		}
		//main() method에 null 값으로 값이 return
		return null;
	}

}
