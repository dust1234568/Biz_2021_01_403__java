package com.callor.applications;

import com.callor.applications.service.ScoreServiceV4;

public class Score_05 {

	public static void main(String[] args) {

		ScoreServiceV4 scV4 = new ScoreServiceV4();

		//scV4.score(242);

		//scV4.score(80.666F);

		scV4.score(242, 88.666F);
	}
}
