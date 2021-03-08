package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

/*
 * ScoreService* 를 테스트하는 코드
 */
public class ScoreEx_01 {

	public static void main(String[] args) {

		// 팀플할때 서로간에 먼저 method를 정해놓고 그 method를 불러오기 위해 ScoreService를 Impl함
		/*
		 * 인터페이스를 통하여
		 * *ServiceImpl*와 클래스를 사용하는 코드들 간에 약속이 만들어진다
		 * 
		 * 이런 환경이 되면, method가 달라서 발생하는 여러 구조적 오류를 최소화 할 수 있다
		 * 
		 * 만약 ImplV1을 만들던 개발자가 코드를 미완성 하더라도 ImplV1 클래스를 사용하는 곳에서는 오류가 발생하지 않고
		 * 다른 부분 코드를 작성 할 수 있게 된다
		 */
		ScoreService ssV1 = new ScoreServiceImplV1();

		ssV1.inputScore();
		ssV1.makeScore();
		ssV1.saveScoreToFile();
		ssV1.loadScoreFromFile();
		ssV1.printScore();

	}
}
