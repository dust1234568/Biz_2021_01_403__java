package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_07 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.makeNamesAndArratInit();
		ssV1.makeScore();
		ssV1.makteSum();
		ssV1.makteAvg();
		ssV1.print();
		
	}
}
