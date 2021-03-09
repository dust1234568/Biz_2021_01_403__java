package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.IolistVO;
import com.callor.iolist.service.IolistService;
import com.callor.iolist.values.ValIolist;

public class IolistServiceImplV1 implements IolistService {

	private List<IolistVO> iolist;

	public IolistServiceImplV1() {
		iolist = new ArrayList<IolistVO>();
	}

	@Override
	public void loadDataFromFile() {
		// TODO 데이터 파일을 읽어오기
		String fileName = "src/com/callor/iolist/매입매출데이터.txt";

		// 파일 읽기 위한 객체 선언
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			// 파일 읽기 위한 객체 생성 (초기화)
			fileReader = new FileReader(fileName);
			// buffer 와 fileReader 연결
			buffer = new BufferedReader(fileReader);

			// buffer에 읽어들인 text 파일 데이터에서 한줄씩 데이터를 읽어서 처리하기
			while (true) {
				// 데이터 무조건 읽어들여라
				// buffer.readLine();

				// buffer에서 한줄 데이터를 읽어서 reader 변수에 저장
				String reader = buffer.readLine();

				// EOF(End Of File, 파일을 모두 읽었는지) 검사
				// buffer는 EOF 에 다다르면 null값을 return하고
				// reader 변수에는 null 값이 담겨 있게 된다
				// 만약 reader 변수에 null 값이 담겨 있으면
				// 더이상 다른 일을 하지 마라(끝내라)
				if (reader == null) {
					break;
				}

				// reader 변수에 담긴 문자열을 연산하기
				// 문자열을 특별한 구분자로 나누어서 분해 한후 IolistVO 객체에 담고
				// List<IolistVO> 리스트에 추가해 두기

				// 컴마(,)를 구분자로 하여 분해
				// 분해한 결과는 문자열 배열 형태이므로 문자열 배열을 선언하여 저장해 둔다
				String[] ioDatas = reader.split(",");

				// 필드 생성자를 사용하여 IolistVO 객체를 생성하면서 인스턴스 변수에 값 담기

				IolistVO iolistVO = new IolistVO(ioDatas[ValIolist.IO_DATE], // 거래일자
						ioDatas[ValIolist.IO_PNAME], // 상품명
						ioDatas[ValIolist.IO_DEPT], // 거래처명
						Integer.valueOf(ioDatas[ValIolist.IO_INOUT]), // 구분
						Integer.valueOf(ioDatas[ValIolist.IO_IPRICE]), // 매입단가
						Integer.valueOf(ioDatas[ValIolist.IO_OPRICE]), // 판매단가
						Integer.valueOf(ioDatas[ValIolist.IO_QTY])// 수량
				);

				iolist.add(iolistVO);

			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없음");

		} catch (IOException e) {
			System.out.println("파일을 읽는 도중 문제 발생");
		}

	}

	@Override
	public void ioListSum() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printIoList() {
		// TODO Auto-generated method stub

	}

}
