package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.ListVO;
import com.callor.iolist.service.IolistService;
import com.callor.iolist.values.Values;

public class IolistImplV1 implements IolistService {

	String fileName;
	List<ListVO> dList;

	public IolistImplV1() {

		fileName = "src/com/callor/iolist/매입매출데이터.txt";
		dList = new ArrayList<ListVO>();

	}

	@Override
	public void loadFromFile() {
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {

				String strList = buffer.readLine();

				if (strList == null) {
					break;
				}

				String list[] = strList.split(",");

				ListVO vo = new ListVO(list[0],	// 거래일자
						list[4], // 상품명
						list[5], // 거래처명
						list[6], // 대표자명
						Integer.valueOf(list[7]), // 구분
						Integer.valueOf(list[8]), // 매입단가
						Integer.valueOf(list[9]), // 판매단가
						Integer.valueOf(list[10]) // 수량
				);
				dList.add(vo);
			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제 발생");
		}
		this.printList();
	}
	
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
	// 일자 별 리스트
	private void dateList() {
		
		int nSize = dList.size();
		// 리스트를 내림차순 정렬
		for (int i = 0; i < nSize; i++) {
			
			for (int j = 0; j < nSize; j++) {
				
				int date1 = Integer.valueOf(dList.get(i).getDate());
				int date2 = Integer.valueOf(dList.get(j).getDate());
				
				if (date1 > date2) {
					
					ListVO temp = dList.get(i);
					dList.set(i, dList.get(j));
					dList.set(j, temp);
					
				}
				
			}
			
		}
		
	}
	*/

	@Override
	public void printList() {

		this.total();
		
		// this.dateList();
		
		
		System.out.println(Values.dLine);
		System.out.println("거래일자\t거래처\t\t대표자명\t상품이름\t매입금액\t판매금액");
		System.out.println(Values.sLine);
		
		for (ListVO vo : dList) {
			
			//System.out.printf("%s\t%010s\t%s\t%010s\t%010d\t010d", 
			//		vo.getDate(), vo.getCompany(), vo.getcName(), vo.getpName(), vo.getInTotal(), vo.getOutTotal());
			
			System.out.print(vo.getDate() + "\t");
			System.out.print(vo.getCompany() + "\t\t");
			System.out.print(vo.getcName() + "\t");
			System.out.print(vo.getpName() + "\t\t");
			System.out.print(vo.getInTotal() + "\t\t");
			System.out.print(vo.getOutTotal() + "\n");
		}
		
	}

}
