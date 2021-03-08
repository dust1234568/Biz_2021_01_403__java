package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

// ScoreService에서 인터페이스 가져오기

/*
 * Service 클래스 코드 순서
 * 1. 입력한 또는 자동 생성한 데이터를 담아둘 List 객체 선언 및 생성
 * 
 * 2. 데이터를 입력 또는 생성하여 List에 담아두기
 */
public class ScoreServiceImplV1 implements ScoreService {

	private List<ScoreVO> scoreList; // 객체 선언

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void inputScore() {
		Scanner scan = new Scanner(System.in);

	}

	/*
	 * Random 클래스를 사용하여 점수 생성 makeScore() 에서만 사용할 것이므로 makeScore() method 내에서 생성한다
	 */
	@Override
	public void makeScore() {

		// makeScore()는 호출될때마다 20개씩 데이터를 생성하여 추가한다
		// 이전에 저장된 데이터가 있더라도 계속 추가된다

		/*
		 * List.remove(위치주소) List 에 담긴 특정 위치의 항목을 삭제
		 * 
		 * List.removeAll(다른리스트) List에 담긴 데이터중 다른리스트에 포함된 데이터들을 모두 삭제하라
		 *
		 * 트릭을 사용한다 scoreList 에 담긴 데이터들 중에서 자신의 데이터와 일치하는 값들 모두를 삭제하라
		 */
		scoreList.removeAll(scoreList);

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {

			ScoreVO scoreVO = new ScoreVO();

			// i 값에 따라서 00001 ~ 00020 일련번호 생성
			/*
			 * i 값에 따라서 00001 ~ 00020 까지 문자열을 생성한다 strNum에 저장한다
			 */
			String strNum = String.format("2021%03d", i + 1);

			scoreVO.setStrNum(strNum);
			// 직접 method 에 난수 생성
			scoreVO.setKor(rnd.nextInt(100) + 1);

			// 변수에 난수 생성 후 method에 저장
			int intEng = rnd.nextInt(100) + 1;
			scoreVO.setEng(intEng);

			int intMath = rnd.nextInt(100) + 1;
			scoreVO.setMath(intMath);

			int intMusic = rnd.nextInt(100) + 1;
			scoreVO.setMusic(intMusic);

			int intHistory = rnd.nextInt(100) + 1;
			scoreVO.setHistory(intHistory);

			// 학생 20명의 5과목 점수가 생성되어 List에 저장
			scoreList.add(scoreVO);

		} // end for

		// 검사 코드
		// for (ScoreVO vo : scoreList) {
		// System.out.println(vo.toString());
		// }

	}

	@Override
	public void saveScoreToFile() {

		String fileName = "src/com/callor/score/Score.txt";

		// 객체 이름 명명
		// 클래스 이름의 첫글자를 소문자로 하여 클래스 이름을 모두 사용한다 = 일반적인 방식
		FileWriter fileWriter = null; // fw
		PrintWriter printer = null; // pw

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			// scoreList에 담긴 데이터를 파일로 출력
			for (ScoreVO vo : scoreList) {
				printer.print(vo.getStrNum() + ":");
				printer.print(vo.getKor() + ":");
				printer.print(vo.getEng() + ":");
				printer.print(vo.getMath() + ":");
				printer.print(vo.getMusic() + ":");
				printer.print(vo.getHistory() + "\n");
			}
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 성공");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일 생성 중 문제 발생!!!");
		}

	}

	@Override
	public void loadScoreFromFile() {

	}

	private void totalAndAvg() {
		for (ScoreVO vo : scoreList) {

			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();
			
			float avg = (float) sum / 5;
			
			vo.setTotal(sum);
			vo.setAvg(avg);

		}
	}

	@Override
	public void printScore() {

		// 출력하기 전에 총점 평균 계산
		this.totalAndAvg();
		
		System.out.println(Values.dLine);
		System.out.println("빛나라 고교 성적처리 시스템 2021");
		System.out.println(Values.dLine);

		System.out.println("학번\t국어\t영어\t수학\t음악\t국사\t총점\t평균\t석차");
		System.out.println(Values.sLine);

		for (ScoreVO vo : scoreList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");

			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\t", vo.getAvg());

			System.out.print(vo.getRank() + "\n");

		}
		System.out.println(Values.dLine);
	}

}
