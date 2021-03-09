package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.ListVO;
import com.callor.iolist.service.IolistService;
import com.callor.iolist.values.Values;

public class IolistImplV1 implements IolistService {

	// 공용으로 사용
	// 불러올 파일 이름 객체와 리스트를 선언
	String fileName;
	List<ListVO> dList;

	public IolistImplV1() {

		// 메모리 누수 관리를 위해 생성자 method 안에서 초기화
		fileName = "src/com/callor/iolist/매입매출데이터.txt";
		dList = new ArrayList<ListVO>();

	}

	// 파일 불러오기 method
	@Override
	public void loadFromFile() {

		// 파일 불러오는 객체 선언, null로 초기화
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			// fileReader 객체를 통해 저장된 파일을 읽어옴
			// 예외처리, 유효성 검사를 위해 try catch() 문 안에 입력
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {

				// strList에 한줄씩 불러오는 작업
				String strList = buffer.readLine();

				// txt 파일을 다 읽었을 경우 null 읽을게 없으면 break로 while문 종료
				if (strList == null) {
					break;
				}

				// list배열에 strList의 데이터들을 ","를 기준으로 분리하여 각 배열에 저장
				String list[] = strList.split(",");

				// ListVO 객체에 각 배열의 원하는 위치값을 저장
				ListVO vo = new ListVO(list[0], // 거래일자
						list[4], // 상품명
						list[5], // 거래처명
						list[6], // 대표자명
						// 위는 String 이므로 형변환을 안해줘도 되지만
						// 아래는 int로 입력 되므로 Integer로 형변환을 시켜준다
						Integer.valueOf(list[7]), // 구분
						Integer.valueOf(list[8]), // 매입단가
						Integer.valueOf(list[9]), // 판매단가
						Integer.valueOf(list[10]) // 수량
				);

				// method 밖에서 선언했던 dList에 vo 객체에 저장된 값들을 넣어준다
				dList.add(vo);
			}
			// 파일을 읽어온 buffer, fileReader를 닫아준다
			buffer.close();
			fileReader.close();

			// 파일이 없을 경우 exception
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다");

			// 파일을 읽을동안 문제 생길 경우 exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제 발생");
		}
		// printList로 넘어가기? 호출
		this.printList();
	}

	// 마지막 출력문에서 매입금액과 판매금액을 계산하기 위한 method
	private void total() {
		for (ListVO vo : dList) {

			// 매입금액 표시 , 판매금액 0
			boolean bYes1 = vo.getIntSwitch() == 1;
			// 판매금액 표시 , 매입금액 0
			boolean bYes2 = vo.getIntSwitch() == 2;

			int inPrice = 0;
			int outPrice = 0;

			// 매입금액 구분 "1"
			if (bYes1) {
				inPrice = vo.getInPrice() * vo.getQty();
			}
			// 판매금액 구분 "2"
			if (bYes2) {
				outPrice = vo.getOutPrice() * vo.getQty();
			}

			vo.setInTotal(inPrice);
			vo.setOutTotal(outPrice);

		}

	}

	/*
	 * // 일자 별 리스트 private void dateList() {
	 * 
	 * int nSize = dList.size(); // 리스트를 내림차순 정렬 for (int i = 0; i < nSize; i++) {
	 * 
	 * for (int j = 0; j < nSize; j++) {
	 * 
	 * int date1 = Integer.valueOf(dList.get(i).getDate()); int date2 =
	 * Integer.valueOf(dList.get(j).getDate());
	 * 
	 * if (date1 > date2) {
	 * 
	 * ListVO temp = dList.get(i); dList.set(i, dList.get(j)); dList.set(j, temp);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 */

	// List를 출력하는 method
	@Override
	public void printList() {

		// 매입금액과 판매금액을 계산했던 method를 호출
		this.total();

		// this.dateList();

		System.out.println(Values.dLine);
		System.out.printf("%s\t%-30s\t%s\t%s\t%s\t%s\n", "거래일자", "거래처", "대표자명", "상품이름", "매입금액", "판매금액");
		// System.out.println("거래일자\t거래처\t\t대표자명\t상품이름\t매입금액\t판매금액");
		System.out.println(Values.sLine);

		for (ListVO vo : dList) {

			System.out.printf("%s\t%-30s\t%s\t%-10s\t%10d\t%10d\n", vo.getDate(), vo.getCompany(), vo.getcName(),
					vo.getpName(), vo.getInTotal(), vo.getOutTotal());

			// System.out.print(vo.getDate() + "\t");
			// System.out.print(vo.getCompany() + "\t\t");
			// System.out.print(vo.getcName() + "\t");
			// System.out.print(vo.getpName() + "\t\t");
			// System.out.print(vo.getInTotal() + "\t\t");
			// System.out.print(vo.getOutTotal() + "\n");
		}

	}

}
