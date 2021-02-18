package com.callor.applications;

import com.callor.applications.service.ClassServiceV1;

public class Class_01 {

	public static void main(String[] args) {

		/*
		 * == 변수 선언문, 생성(초기화) ==
		 * 
		 * 1. 정수형 변수 num1을 선언하고 정수 30을 할당하라
		 * 2. 앞으로 num1이라는 변수를 사용하여 정수값을 저장하고,
		 * 	여러가지 기능을 수행할 터이니 변수를 준비해달라		
		 */
		int num1 = 30; 
		// int num1 = 0;

		num1 = 40;
		
		/*
		 * (프로젝트에) 선언되어 있는 ClassServcieV1의 method 들을 사용하여
		 * 코드를 실행하려고 하니 사용할 준비를 해달라
		 * 
		 * CsV1 : "객체(Object)" 라고 한다
		 *  = new Css..() : 객체를 사용할 수 있도록 초기화 하기
		 *  
		 * CsV1 = new Css..() : 객체를 초기화하고 사용할 준비를 하는 상태
		 *  이 명령이 수행된 후에는 CsV1을 인스턴스(instance)라고 한다
		 *  
		 */
		ClassServiceV1 CsV1 = new ClassServiceV1(); // 뒤에 new가 붙어야 사용할 준비 완료
		ClassServiceV1 CsV1_1; // 사용할 준비 아직 안됨

		CsV1.add(56, 82);

		CsV1.add(30, 18.3F);

		CsV1.add(18.8D, 9.3F);
	}
}
