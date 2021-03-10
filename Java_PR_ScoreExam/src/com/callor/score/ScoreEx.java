package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

public class ScoreEx {

	public static void main(String[] args) {

		ScoreService sService = new ScoreServiceImplV1();
		MenuService mService = new MenuServiceImplV1();
		while (true) {

			Integer menu = mService.selectMenu();
			if (menu == null) {
				break;
			} else if (menu == Values.MENU_INPUT) {
				sService.inputScore();
			} else if (menu == Values.MENU_SAVE) {
				System.out.println("저장 완료");
				sService.saveToFile();
			} else if (menu == Values.MENU_LOAD) {
				System.out.println("읽기 완료");
				sService.loadToFile();
			} else if (menu == Values.MENU_PRINT) {
				System.out.println("출력 완료");
				sService.printScore();
			}
		}

	}

}
