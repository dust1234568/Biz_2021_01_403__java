package com.callor.score.model.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	// List는 모든 method에서 공용으로 사용되므로 method 바깥에서 선언하고

	private List<Integer> sList;

	public ScoreServiceImplV1() {
		// 생성자 method에서 초기화 => 메모리 누수 관리
		sList = new ArrayList<Integer>();

	}

	@Override
	public void makeScore() {
		// Random값은 값을 생성할때만 필요함으로 method에서 선언 및 초기화

		// Random 값 생성 후 scoreList에 저장
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			sList.add(num);

		}

	}

	@Override
	public void saveScoreToFile() {

		String fileName = "src/com/callor/score/score.txt";
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int count = 0;
			int nCount = 0;
			for (Integer n : sList) {
				printer.print(n + ":");

				if (++count % 5 == 0) {
					printer.println();
					++nCount;
					// System.out.println(nCount);
				}

			}

			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void loadScoreFromRile() {

		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strList = new ArrayList<String>();
		// 파일 저장 위치 및 저장 이름
		String fileName = "src/com/callor/score/score.txt";
		// 파일 읽는 객체 선언
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			// 읽는 객체 초기화(생성)
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {

				String strNum = buffer.readLine();

				if (strNum == null) {
					break;
				}
				strList.add(strNum);

			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 파일 읽기 종

		for (String str : strList) {

			String[] score = str.split(":");

			ScoreVO scoreVO = new ScoreVO();

			scoreVO.setKor(Integer.valueOf(score[0]));
			scoreVO.setEng(Integer.valueOf(score[1]));
			scoreVO.setMath(Integer.valueOf(score[2]));
			scoreVO.setMusic(Integer.valueOf(score[3]));
			scoreVO.setHistory(Integer.valueOf(score[4]));

			scoreList.add(scoreVO);

		}

		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = sum / 5.0f;

			vo.setTotal(sum);
			vo.setAvg(avg);

		}

		List<ScoreVO> nCount = new ArrayList<ScoreVO>();
		ScoreVO count = new ScoreVO();
		for (ScoreVO nC : scoreList) {
			int[] count1 = new int[20];
			count.setCount(Integer.valueOf(count1[i]));
			nCount.add(count);
		}

		System.out.println(Values.dLine);
		System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);

		for (ScoreVO vo : scoreList) {

			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%3.1f\n",vo.getCount(), vo.getKor(), vo.getEng(), vo.getMath(),
					vo.getMusic(), vo.getHistory(), vo.getTotal(), vo.getAvg());

			// System.out.print(vo.getKor() + "\t");
			// System.out.print(vo.getEng() + "\t");
			// System.out.print(vo.getMath() + "\t");
			// System.out.print(vo.getMusic() + "\t");
			// System.out.print(vo.getHistory() + "\t");
			// System.out.print(vo.getTotal() + "\t");
			// System.out.print(vo.getAvg() + "\n"); // %3.2f

		}
		System.out.println(Values.dLine);

	}
}
