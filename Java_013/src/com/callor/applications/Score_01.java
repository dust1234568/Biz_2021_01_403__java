package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_01 {

	public static void main(String[] args) {

		ScoreServiceV1 scV1 = new ScoreServiceV1();

		scV1.input();

		scV1.sum();

		scV1.avg();

		scV1.print();
	}

}
