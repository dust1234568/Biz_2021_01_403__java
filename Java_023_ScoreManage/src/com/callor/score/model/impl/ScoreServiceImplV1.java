package com.callor.score.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	// List는 모든 method에서 공용으로 사용되므로 method 바깥에서 선언하고

	private List<Integer> scoreList;

	public ScoreServiceImplV1() {
		// 생성자 method에서 초기화 => 메모리 누수 관리
		scoreList = new ArrayList<Integer>();

	}

	@Override
	public void makeScore() {
		// Random값은 값을 생성할때만 필요함으로 method에서 선언 및 초기화
		
		// Random 값 생성 후 scoreList에 저장
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			scoreList.add(num);

		}

	}

	@Override
	public void saveScoreToFile() {

	}

	@Override
	public void loadScoreFromRile() {

	}

}
