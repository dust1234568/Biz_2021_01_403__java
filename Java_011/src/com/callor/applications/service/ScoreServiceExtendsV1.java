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

	// public void input() {
	// System.out.println("여기는 ExtendsV1의 input() ");
	// }

	/*
	 * 문자열형 변수 1개를 매개변수로 갖는 input() method
	 * 
	 * input() method 선언 String subject 이므로 과목명 문자열형변수를 매개변수로 가짐
	 * 과목명을 입력하고 while()문 실행
	 * 
	 * intScore라는 변수를 선언하고 0으로 초기화
	 * while() 문으로 참일 경우 계속 반복
	 * 
	 * import scanner로 점수를 변수 intScore에 저장하기 위해
	 * 키보드로 입력 할 수 있도록 Console에 출력 및 입력대기
	 * 
	 * 그 입력한 값에 따라 입력값이 0 미만인 경우 "점수는 0점 이상 입력",
	 *
	 * 입력값이 100 초과인 경우 "점수는 100점 이하 입력"을 Console에 출력
	 * 
	 * 입력값이 0 ~ 100 사이가 아닌 경우 다시 값을 입력 하도록
	 * while()문 반복 "점수 입력 >> " 이 Console에 출력
	 * 
	 * 그 외 else 입력값이 0 ~ 100점 사이인 경우 break로 if문을 종료하고
	 * Console에 "입력한 점수 : " 와 함께 입력값 출력
	 * 
	 * input() method 하는일?
	 * 메소드를 불러오는 클래스에 코드를 복사 붙혀넣기?
	 * 불러오는 클래스 input() method에 과목명을 넣어 과목에 따른 점수를 입력하여 저장
	 * 
	 */
	public int input(String subject) { // return을 사용하기위해선 void 사용 x 정수-int 실수-float

		Scanner scan = new Scanner(System.in);

		int intScore = 0;
		while (true) {

			System.out.print(subject + "점수 입력 >> ");
			intScore = scan.nextInt();

			// if(intScore < 0 || intScore > 100) {
			//	System.out.println("점수는 0 ~ 100까지 입력")
			// }
			// 정확한 오류 내용 알려줌으로써 사용자가 이해하기 쉽게함

			if (intScore < 0) {
				System.out.println(subject + " 점수는 0점 이상 입력 !!");
			} else if (intScore > 100) {
				System.out.println(subject + " 점수는 100점 이하 입력 !!");
			} else {
				break;
			}

		}
		// System.out.println("입력한 점수 : " + intScore);
		return intScore; // 0 ~ 100 까지 값일 경우에 그 값을 intScore변수에 저장하고 return 실행
		
		// 호출한 코드에서
		// return 30; ==> int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라
	}

}
