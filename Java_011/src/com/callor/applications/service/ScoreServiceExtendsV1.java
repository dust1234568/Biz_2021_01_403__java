package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스의 extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parent(부모) 클래스
 * ScoreServiceExtendsV1 : child(자식) 클래스
 * 
 * 단순한 extends 
 * 	: 부모 클래스에 정의된 모든 method를 코드 한줄 추가, 수정 없이 그대로 사용할 수 있다
 * 
 * 추가 extends
 * 	: 부모 클래스에 정의된 method와 새롭게 추가된 method가 있는 확장된 클래스의 생성
 */
public class ScoreServiceExtendsV1 extends ScoreServiceV4 {

	public void input() {
		System.out.println("여기는 ExtendsV1의 input() ");
	}

	/*
	 * 문자열형 변수 1개를 매개변수로 갖는 input() method
	 * 
	 * input() method 선언
	 * intScore라는 변수를 선언하고 0으로 초기화
	 * while() 문으로 참일 경우 계속 반복
	 * import scan으로 점수를 키보드로 입력 할 수 있도록 Console에 출력 및 입력대기
	 * 그 입력한 값에 따라 입력값이 0 미만인 경우 "점수는 0점 이상 입력",
	 * 입력값이 100점 초과인 경우 "점수는 100점 이하 입력"을 Console에 출력
	 * 그 외 else 0 ~ 100점 사이인 경우 break로 if문을 종료
	 * "입력한 점수 : " 와 함께 입력값 출력
	 * while() 문으로 다음 값을 계속 입력 할 수 있도록 출력
	 * 
	 * input() method 하는일?
	 * 메소드를 불러오는 클래스에 코드를 복사 붙혀넣기?
	 * 불러오는 클래스 input() 에 넣는 값을 scan하여 while문 실행
	 * 
	 */
	public void input(String subject) {

		Scanner scan = new Scanner(System.in);

		int intScore = 0;
		while (true) {

			System.out.println("점수 입력 >> ");
			intScore = scan.nextInt();

			if (intScore < 0) {
				System.out.println("점수는 0점 이상 입력 !!");
			} else if (intScore > 100) {
				System.out.println("점수는 100점 이하 입력 !!");
			} else {
				break;
			}

		}
		System.out.println("입력한 점수 : " + intScore);

	}

}
