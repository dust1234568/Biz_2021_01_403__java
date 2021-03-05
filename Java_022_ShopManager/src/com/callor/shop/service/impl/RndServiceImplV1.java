package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class RndServiceImplV1 {

	private String fileName;
	private Random rnd;
	int[] num = new int[100];

	FileWriter fileWriter = null;
	PrintWriter printer = null;

	// 생성자 method
	public RndServiceImplV1() {
		fileName = "src/com/callor/shop/files/nums.txt";
		rnd = new Random();
	}

	public void rndMakeService() {

		for (int i = 0; i < num.length; i++) {

			num[i] = rnd.nextInt(1000) + 1;
			if (i % 5 == 0) {
				System.out.println();
			}
			System.out.print(num[i] + ":");
		}

	}

	public void rndSaveService() {

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			for (int i = 0; i < num.length; i++) {
				printer.print(num[i] + ":");
			}

			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
