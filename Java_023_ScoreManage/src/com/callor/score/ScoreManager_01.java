package com.callor.score;

import com.callor.score.model.impl.MenuServiceImplV1;
import com.callor.score.model.impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

public class ScoreManager_01 {

	public static void main(String[] args) {
		
		MenuServiceImplV1 mService = new MenuServiceImplV1();
		ScoreServiceImplV1 sService = new ScoreServiceImplV1();
		
			while (true) {
				
				Integer menu = mService.selectMenu();
				if (menu == null) {
					break;
				} else if (menu == Values.MENU_INPUT) {
					sService.makeScore();
				} else if (menu == Values.MENU_SAVE_FILE) {
					sService.saveScoreToFile();
				} else if (menu == Values.MENU_SCORE_CHECK) {
					sService.loadScoreFromRile();
				}
			}
		
		
		
		
		
	}
}
