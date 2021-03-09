package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StuVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.Values;

public class StudentServiceImplV1 implements StudentService {

	List<StuVO> slist;
	Scanner scan;

	public StudentServiceImplV1() {
		// TODO 생성자 method
		slist = new ArrayList<StuVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void loadFromFile() {
		// TODO 파일 불러오기
		String fileName = "src/com/callor/student/학생정보리스트.txt";

		FileReader fileReader;
		BufferedReader buffer;
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {

				String strReader = buffer.readLine();

				if (strReader == null) {
					break;
				}

				String strList[] = strReader.split(":");

				StuVO vo = new StuVO(Integer.valueOf(strList[Values.ST_NUM]), // 학번
						strList[Values.ST_NAME], // 이름
						strList[Values.ST_SUB], // 학과
						Integer.valueOf(strList[Values.ST_GRADE]), // 학년
						Integer.valueOf(strList[Values.ST_BAN]), // 반
						strList[Values.ST_ADD], // 주소
						strList[Values.ST_TEL] // 전화번호
				);
				slist.add(vo);

			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중 문제 발생");
		}

	}

	@Override
	public void inputScan() {

		StuVO vo = new StuVO();

		while (true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생이름을 입력하세요 (종료하려면 QUIT를 입력)");
			System.out.println(Values.sLine(50));

			System.out.print("이름 >> ");
			String strName = scan.nextLine();

			if (strName.equalsIgnoreCase("QUIT")) {
				System.out.println(Values.dLine(50));
				System.out.println("업무종료");
				break;
			}

			if (strName.equals(vo.getStName())) {
				System.out.println(Values.dLine(50));
				System.out.println(strName + " 자료가 있습니다");

			} else {
				System.out.println(Values.dLine(50));
				System.out.println(strName + " 자료는 없습니다");
			}
		}
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub

		this.inputScan();

		for (StuVO vo : slist) {

			System.out.println(Values.dLine(50));
			System.out.println("이름 : " + vo.getStName());
			System.out.printf("학번 : %05d\n", vo.getStNum());
			System.out.println("학과 : " + vo.getStSub() + "과");
			System.out.println("학년 : " + vo.getStGrade() + "학년");
			System.out.println("반 : " + vo.getStBan() + "반");
			System.out.println("주소 : " + vo.getStAdd());
			System.out.println("전화번호 : +82) " + vo.getStTel());
			System.out.println(Values.dLine(50));
		}
	}

	@Override
	public void scanAndPrint() {
		// TODO Auto-generated method stub

		while (true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생이름을 입력하세요 (종료하려면 QUIT를 입력)");
			System.out.println(Values.sLine(50));

			System.out.print("이름 >> ");
			String strName = scan.nextLine();

			if (strName.equalsIgnoreCase("QUIT")) {
				System.out.println(Values.dLine(50));
				System.out.println("업무종료");
				break;
			}
			for (StuVO vo : slist) {
				if (strName.equals(vo.getStName())) {

					System.out.println(Values.dLine(50));
					System.out.println("이름 : " + vo.getStName());
					System.out.printf("학번 : %05d\n", vo.getStNum());
					System.out.println("학과 : " + vo.getStSub() + "과");
					System.out.println("학년 : " + vo.getStGrade() + "학년");
					System.out.println("반 : " + vo.getStBan() + "반");
					System.out.println("주소 : " + vo.getStAdd());
					System.out.println("전화번호 : +82) " + vo.getStTel());
					System.out.println(Values.dLine(50));
					break;
				} else {
					System.out.println(Values.dLine(50));
					System.out.println(strName + " 자료는 없습니다");
					break;
				}
			}
		}

	}

}
