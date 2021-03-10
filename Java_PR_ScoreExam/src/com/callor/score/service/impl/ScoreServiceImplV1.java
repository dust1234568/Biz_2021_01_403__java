package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	List<ScoreVO> scoreList;
	private String fileName;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();

		fileName = "src/com/callor/score/data/score.txt";

	}

	@Override
	public void inputScore() {
		// TODO 키보드롤 통해 항목 입력

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			ScoreVO vo = new ScoreVO();

			System.out.println(Values.dLine);
			System.out.println("학번을 입력하세요");
			System.out.print(">> ");
			int sNum = scan.nextInt();
			vo.setsNum(sNum);

			/*
			 * int nSize = scoreList.size(); int index = 0; String sNum = scan.nextLine();
			 * for (index = 0; index < nSize; index++) {
			 * 
			 * ScoreVO sVO = scoreList.get(index); if (sNum.equals(sVO.getsNum())) { break;
			 * } } if (index > nSize) { System.out.println(); }
			 * 
			 * 
			 * 
			 * vo.setsNum(Integer.valueOf(sNum));
			 */

			int intKor = 0;
			while (true) {
				System.out.println("국어점수를 입력하세요");
				System.out.print(">> ");
				try {
					intKor = scan.nextInt();
				} catch (Exception e) {
					System.out.println("정수만 입력하세요");
				}
				if (intKor < 0 || intKor > 100) {
					System.out.println("1 ~ 100까지 정수를 입력하세요");
				} else {
					break;
				}
			}
			vo.setKor(intKor);

			int intEng = 0;
			while (true) {
				System.out.println("영어점수를 입력하세요");
				System.out.print(">> ");
				try {
					intEng = scan.nextInt();
				} catch (Exception e) {
					System.out.println("정수만 입력하세요");

				}
				if (intEng < 0 || intEng > 100) {
					System.out.println("1 ~ 100까지 정수를 입력하세요");
				} else {
					break;
				}
			}
			vo.setEng(intEng);

			int intMath = 0;
			while (true) {
				System.out.println("수학점수를 입력하세요");
				System.out.print(">> ");
				try {
					intMath = scan.nextInt();
				} catch (Exception e) {
					System.out.println("정수만 입력하세요");
				}
				if (intMath < 0 || intMath > 100) {
					System.out.println("1 ~ 100까지 정수를 입력하세요");
				} else {
					break;
				}
			}
			vo.setMath(intMath);

			int intMusic = 0;
			while (true) {
				System.out.println("음악점수를 입력하세요");
				System.out.print(">> ");
				try {
					intMusic = scan.nextInt();
				} catch (Exception e) {
					System.out.println("정수만 입력하세요");
				}
				if (intMusic < 0 || intMusic > 100) {
					System.out.println("1 ~ 100까지 정수를 입력하세요");
				} else {
					break;
				}
			}
			vo.setMusic(intMusic);

			scoreList.add(vo);

			System.out.println(Values.sLine);

		} // for end
	}

	@Override
	public void saveToFile() {
		// TODO 입력 받은 항목 을 파일로 저장

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			for (ScoreVO vo : scoreList) {
				printer.print(vo.getsNum() + ":");
				printer.print(vo.getKor() + ":");
				printer.print(vo.getEng() + ":");
				printer.print(vo.getMath() + ":");
				printer.print(vo.getMusic() + "\n");

			}
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 완료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 생성 중 문제 발생");
		}

	}

	@Override
	public void loadToFile() {
		// TODO 파일 불러 읽기
		scoreList.removeAll(scoreList);

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {

				String reader = buffer.readLine();

				if (reader == null) {
					break;
				}
				String scores[] = reader.split(":");

				ScoreVO vo = new ScoreVO(Integer.valueOf(scores[0]), // 학번
						Integer.valueOf(scores[1]), // 국어
						Integer.valueOf(scores[2]), // 영어
						Integer.valueOf(scores[3]), // 수학
						Integer.valueOf(scores[4]) // 음악
				);
				scoreList.add(vo);

			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없습니다");

		} catch (IOException e) {
			System.out.println("파일 읽는 중 문제 발생");
		}
	}

	// 총점과 평균 구하는 method
	public void totalAndAvg() {

		for (ScoreVO vo : scoreList) {

			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();

			float avg = (float) sum / 4;

			vo.setSum(sum);
			vo.setAvg(avg);

		}

	}

	private void numRank() {

		int nSize = scoreList.size();

		for (int i = 0; i < nSize; i++) {

			for (int j = i + 1; j < nSize; j++) {

				if (scoreList.get(i).getsNum() > scoreList.get(j).getsNum()) {

					ScoreVO vo = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, vo);
				}

			}
		}

	}

	@Override
	public void printScore() {
		// TODO 점수 출력

		this.totalAndAvg();

		this.numRank();

		System.out.println(Values.dLine);
		System.out.println("성적 일람표");
		System.out.println(Values.sLine);
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLine);

		int count = 0;
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int musicTotal = 0;
		
		int allTotal = 0;
		
		float korAvg = 0;
		float engAvg = 0;
		float mathAvg = 0;
		float musicAvg = 0;

		for (ScoreVO vo : scoreList) {

			System.out.printf("%05d\t", vo.getsNum());
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");

			System.out.print(vo.getSum() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());

			count++;
			korTotal += vo.getKor();
			engTotal += vo.getEng();
			mathTotal += vo.getMath();
			musicTotal += vo.getMusic();
			allTotal += vo.getSum();
			
			korAvg = korTotal / count;
			engAvg = engTotal / count;
			mathAvg = mathTotal / count;
			musicAvg = musicTotal / count;

		}
		System.out.println(Values.sLine);
		System.out.printf("총점 : %d\t%d\t%d\t%d\t%d\n",korTotal, engTotal, mathTotal, musicTotal, allTotal);
		System.out.printf("평균 : %3.2f\t%3.2f\t%3.2f\t%3.2f\n",korAvg, engAvg, mathAvg, musicAvg);
		System.out.println(Values.dLine);

	}

}
