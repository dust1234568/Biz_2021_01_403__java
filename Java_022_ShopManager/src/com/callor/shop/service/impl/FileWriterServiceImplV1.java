package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import com.callor.shop.service.FileWriterServiceV1;

public class FileWriterServiceImplV1 implements FileWriterServiceV1 {

	private Random rnd;
	private String numsFileName;

	public FileWriterServiceImplV1() {
		rnd = new Random();
		numsFileName = "src/com/callor/shop/nums.txt";

	}

	@Override
	public void saveToFile() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(numsFileName);
			printer = new PrintWriter(fileWriter);
			int num = 0;
			for (int i = 0; i < 100; i++) {
				num = rnd.nextInt(100) + 1;
				System.out.println(num);
			}

			int nums = Integer.valueOf(num);
			printer.println(nums);

			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
