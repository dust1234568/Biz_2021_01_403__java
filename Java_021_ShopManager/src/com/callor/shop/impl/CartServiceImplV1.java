package com.callor.shop.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

// 클래스를 선언하고 CartService를 implements
public class CartServiceImplV1 implements CartService {

	// method 바깥에서 List와 Scanner 선언만
	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceImplV1() {
		// 생성자 method에서 초기화
		// 분리 이유 -> 메모리 누수 관리 위
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}
	// main() method에서 MenuServiceImplV1 클래스에 있는 메뉴 출력에서 1을 입력했을때 실행되는 method
	@Override
	public void inputCart() {
		// 장바구니 정보를 입력받기 위한 설명문
		System.out.println("=================================================");
		System.out.println("장바구니 넣기");
		System.out.println("-------------------------------------------------");
		
		// 구매자와 상품명을 scanner를 사용하여 문자열 String 으로 입력받는다 
		System.out.print("구매자 >> ");
		String userName = scan.nextLine();

		System.out.print("상품명 >> ");
		String productName = scan.nextLine();
		
		// 단가의 경우 문자형으로 입력받고 숫자형으로 Integer를 해줘야 함으로 int형 변수를 하나 선언하고 초기화한다 
		int intPrice = 0;
		// while문을 써서 입력값이 범위내에 없을 경우 재입력 할 수 있도록 무한 반복을 시켜준다
		while (true) {

			System.out.print("단가 >> ");
			// 문자형으로 단가를 입력받는
			String strPrice = scan.nextLine();
			// try catch문 예외처리를 하여 유효성검사를 한
			try {
				// 입력받은 문자열 값을 정수형으로 변환한
				intPrice = Integer.valueOf(strPrice);
				// 정수형으로 변환된 값이 1000이하 일 경우 아래의 출력문을 출력 
				if (intPrice < 1000) {
					System.out.println("단가는 1000원 이상");
				} else {
					// 변환된 값이 해당 범위에 해당함으로 while문을 종료하고 다음으로 넘어감 
					break;
				}
			} catch (Exception e) {
				// 만약 입력값이 정수가 아니면 exception이 발생하는데 그 것을 예외처리하여 무시되고 아래의 출력문을 출력 
				System.out.println("단가는 정수만 입력하세요");

			}

		}
		
		// 단가와 같이 정수형으로 변환된 값을 저장받기 위해 정수형 변수를 하나 선언한다 
		int intQty = 0;
		// 똑같이 while문으로 범위내의 수량값이 입력될 때까지 반복을 시켜준다 
		while (true) {
			
			// 수량을 입력받기 위해 프롬프트를 표시하고 문자열로 입력받는다 
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			// 변환된 값이 문제를 일으킬 수 있으므로 유효성 검사를 실시한다 
			try {
				// 입력받은 문자열 값을 Integer를 통해 숫자형변수 intQty로 변환하고 그 변수에 입력한다 
				intQty = Integer.valueOf(strQty);
				// 변형된 값이 1 이하 인 경우 아래의 출력문을 출력 
				if (intQty < 1) {
					System.out.println("수량은 1개 이상");
				} else {
					// 그 외 1 이상의 값이 입력된 경우 문제없이 출력되며 while문 종료 
					break;
				}
				// 형변환때 오류가 발생할 수 있으며 오류 발생시 무시 
				// 정수 이외의 문자열 입력시 아래의 출력문을 출력 
			} catch (Exception e) {
				System.out.println("수량은 정수만 입력하세요");

			}

		}
		
		// 총합을 나타낼 변수를 선언해주고 그 값을 단가와 수량의 곱으로 생성 
		int intTotal = intQty * intPrice;

		// 카트 정보 생성
		CartVO cartVO = new CartVO();
		// 카트 정보 입력
		// 입력받은 각 입력값을 cartVO에 있는 set method에 각각 저장 
		cartVO.setUserName(userName);
		cartVO.setProductName(productName);
		cartVO.setIntQty(intQty);
		cartVO.setIntPrice(intPrice);
		cartVO.setIntTotal(intTotal);
		// 카트리스트 추가
		// Arraylist 로 생성된 배열에 입력값이 저장된 정보를 배열로 입력해준다 
		// 배열의 끝이 정해지지 않아서 리스트를 원하는 만큼 생성 가
		cartList.add(cartVO);

	}
	
	// main() method에서 MenuServiceImplV1 클래스에 있는 메뉴 출력에서 2를 입력했을때 실행되는 method
	@Override
	public void printCart() {

		// 메소드 호출시 설명문 출력 
		System.out.println("=================================================");
		System.out.println("* 전체 장바구니 리스트");
		System.out.println("-------------------------------------------------");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-------------------------------------------------");

		// 카트리스트 전체 입력 개수
		// 카트리스트에 저장된 상품개수를 몇개인지 세어 그 값을 정수형 변수 nSize에 저장  
		int nSize = cartList.size();
		// 카트리스트 전체 합계
		int intTotal = 0;
		// 전체 리스트에서는 굳이 안해도되나 나중에 중복되는 배열 겹칠시 오류가 발생할 수 있기에 개별 리스트와 똑같이 카운트를 한다 
		int count = 0;
		
		// 반복문은 카트리스트에 저장된(입력된) 상품개수 만큼 반복된다 
		for (int i = 0; i < nSize; i++) {
			
			// 각 카트리스트 set 메소드에 저장된 값을 get을 사용하여 0번째 값부터 마지막 상품개수만큼 배열을 통해 입력된 값들을 출력한다 
			System.out.printf(cartList.get(i).getUserName() + "\t");
			System.out.printf(cartList.get(i).getProductName() + "\t");
			System.out.printf(cartList.get(i).getIntPrice() + "\t");
			System.out.printf(cartList.get(i).getIntQty() + "\t");
			System.out.printf(cartList.get(i).getIntTotal() + "\n");
			// 전체 합계는 입력된 합계들을 총 더하는 것이므로 똑같이 배열을 이용하여 그 값들을 전부 더해준
			intTotal += cartList.get(i).getIntTotal();
			// 카운트는 몇개인지 세는게 목적이므로 i 를 계속 더해준다 
			count++;
		}
		
		// 출력문을 보여주고 마지막으로 총 계산될 합계와 갯수를 입력하여 마무리한다 
		System.out.println("-------------------------------------------------");
		System.out.println("합계" + "\t" + count + "가지" + "\t" + "\t" + "\t" + intTotal);
		System.out.println("-------------------------------------------------");

	}

	// main() method에서 MenuServiceImplV1 클래스에 있는 메뉴 출력에서 3을 입력했을때 실행되는 method
	@Override
	public void printUserCart() {
		
		// 구매자 개별의 카트리스트를 보여주는 메소드이므로 먼저 보고싶은 구매자 이름을 입력받기위해 프롬프트로 출력하고 문자열로 이름을 입력받는다 
		System.out.println("=================================================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("-------------------------------------------------");

		System.out.print("이름 >> ");
		String strName = scan.nextLine();

		// 개별의 카트리스트이기 떄문에 누구의 카트리스트인지 보여주는 프롬프트를 보여준다 
		System.out.println("-------------------------------------------------");
		System.out.println("*" + strName + "\t " + "장바구니 리스트");
		System.out.println("=================================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-------------------------------------------------");

		// 카트리스트 전체 입력 개수
		// 전체리스트와 동일하게 카트리스트에 입력된 상품개수를 세어 그 값을 변수 nSize에 저장한다 
		int nSize = cartList.size();
		// 개별의 카트리스트에 합계들을 더해서 총합을 만들기위한 변수 선언 
		int intTotal = 0;
		// 입력된 이름별 개수를 카운트 하기위한 변수 선언 
		int count = 0;

		// 이 값은 카트리스트에 입력된 상품개수를 세어 그값만큼 반복하는 반복문이다 
		for (int i = 0; i < nSize; i++) {
			// 이 메소드는 개별 즉 구매자별 카트리스트이기 때문에 if문을 써서 이 메소드에서 입력된 값이 카트리스트에 입력되 있는 
			// 이름과 같을 경우 equals를 사용하여 같을 경우만 아래의 출력문이 실행되도록 비교문을 사용한다 
			if (strName.equals(cartList.get(i).getUserName())) {
				System.out.printf(cartList.get(i).getUserName() + "\t");
				System.out.printf(cartList.get(i).getProductName() + "\t");
				System.out.printf(cartList.get(i).getIntPrice() + "\t");
				System.out.printf(cartList.get(i).getIntQty() + "\t");
				System.out.printf(cartList.get(i).getIntTotal() + "\n");

				// 개별의 카트리스트 총합은 이름이 같은 배열에 있는 토탈값을 더해서 저장한다 
				intTotal += cartList.get(i).getIntTotal();
				// 이름이 같을경우 출력문이 실행되기 때문에 실행된 횟수만 체크해서 몇개인지 저장한다 
				count++;
			}

		}
		// 저장된 개별의 값을 출력한다 
		System.out.println("-------------------------------------------------");
		System.out.println("합계" + "\t" + count + "가지" + "\t" + "\t" + "\t" + intTotal);
		System.out.println("-------------------------------------------------");
	}

}
