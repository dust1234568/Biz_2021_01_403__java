package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class RndServiceImplV1 {

	private String fileName;
	private Random rnd;

	FileWriter fileWriter = null;
	PrintWriter printer = null;

	public RndServiceImplV1() {
		fileName = "src/com/callor/shop/files/nums.txt";
		rnd = new Random();
	}

	public void rndService() {

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			for (int i = 0; i < 100; i++) {
				int num = rnd.nextInt(1000) + 1;
				Integer strNum = Integer.valueOf(num);
				String numsList = String.format("%d:%d:%d:%d:%d", num);
				printer.println(numsList);
				// printer.println(num);

			}

			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
