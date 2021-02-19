package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1_01;

public class Score_01_01 {

	public void main(String[] args) {

		ScoreServiceV1_01 scV1 = new ScoreServiceV1_01();

		// method return 값을 변수에 담기(저장)하려면
		// method return type이 void가 아니어야 한다.
		// Score_S_V1의 input() method는 
		// return type이 void(형, type) 이다
		// 따라서 아래 코드처럼 사용 할 수 없다
		// int num = scV1.input();
		
		scV1.input();
		
	}

}
