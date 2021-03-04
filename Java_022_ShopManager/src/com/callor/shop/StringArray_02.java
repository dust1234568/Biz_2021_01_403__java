package com.callor.shop;

public class StringArray_02 {

	public static void main(String[] args) {

		String strCart = "홍길동:초코파이:10:1000";

		/*
		 * 원래문자열.split(구분자문자열)
		 * 
		 * 원래문자열을 구분자문자열을 기준으로 나누고 문자열 배열로 만들어 return 한다
		 * 
		 * 문자열을 분해하는 method
		 * 
		 */
		String[] cartList = strCart.split(":"); // {"홍길동", "초코파이" };

		for (String s : cartList) {
			System.out.println(s);
		}

		// 한글자 한글자마다 잘라서 배열로 넣어라
		/*
		 * strCart 에 담긴 문자열을 글자 단위로 잘라서 배열에 담아 달라
		 */
		cartList = strCart.split("");
		for (String s : cartList) {
			System.out.println(s);
		}
		
		// printf로 콘솔에 보여주는것과 같이
		// String.format은 문자열로 만들어서 변수에 저장해준다
		
		// 지정된 형식 (폼) 으로 문자열을 만들어서 return 해 주는 method
		strCart = String.format("%d:%d:%d", 10, 20, 30);
		System.out.println(strCart);

		// strCart에 저장된 문자열 중에서 "20"이라는 문자열이 있으면 "대한민국"이라는 문자열로 바꿔서 return 하라
		strCart = strCart.replace("20", "대한민국");
		System.out.println(strCart);
		
		String strName = "홍 길동   ";
		System.out.println(strName);
		// strCart 변수에 담긴 문자열 중에  빈칸(" ") 이 있으면 ""으로 바꿔서 return 해달라
		// 빈칸(공백) 모두 제거
		strName = strName.replace(" ","");
		System.out.println(strName);
		
		// 문자열 중에서 9번째 글자 부터 그 뒤에 문자열만 자르기 
		strName = "나는 자랑스러운 태극기 앞에";
		String strFlag = strName.substring(9);
		
		System.out.println(strFlag);
		
		// 9번쨰 글자 부터 12번째 글자까지만 자르기
		// java 외 다른언어는 9번쨰부터 몇(n)글자 (9, n);
		strFlag = strName.substring(9,12);
		
		System.out.println(strFlag);
		
	}

}
