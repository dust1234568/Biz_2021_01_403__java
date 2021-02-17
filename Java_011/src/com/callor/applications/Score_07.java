package com.callor.applications;

import com.callor.applications.service.ScoreServiceExtendsV1;

public class Score_07 {

	public static void main(String[] args) {
		
		ScoreServiceExtendsV1 scExV1 = new ScoreServiceExtendsV1();
		
		int intKor = 99;
		int intEng = 87;
		int intMath = 66;
				
		scExV1.print(intKor, intEng, intMath);
		
		scExV1.input();
	}
}
