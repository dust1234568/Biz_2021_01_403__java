package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1_01 {

	// makeRnd()와 saveFileRnd() method가 공용으로 사용할 객체이므로
	// 인스턴스 객체변수로 선언
	private List<Integer> intList;

	public RndServiceImplV1_01() {
		intList = new ArrayList<Integer>();
	}

	// Random 수를 생성하여 List에 담을 method
	public void makeRnd() {

		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) + 1;
			intList.add(num);

		}

	}

	// List에 담긴 숫자들을 파일에 저장하는 method
	public void saveFileRnd() {

		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int nCount = 0;
			for (Integer n : intList) {

				printer.print(n + ":");
				if (++nCount % 5 == 0) {
					printer.println();
				}

			}
			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
