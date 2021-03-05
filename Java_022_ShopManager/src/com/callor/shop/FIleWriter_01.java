package com.callor.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FIleWriter_01 {

	public static void main(String[] args) {

		// random값 입력하기 위함
		Random rnd = new Random();
		// 100개의 임의의 난수를 생성하기 위해 배열 선언
		int[] nums = new int[100];
		
		String numsFileName = "src/com/callor/shop/nums.txt";

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(numsFileName);
			printer = new PrintWriter(fileWriter);
			for (int i = 0; i < 100; i++) {
				nums[i] = rnd.nextInt(1000) + 1;
				System.out.println(nums[i]);
				// 숫자형으로 형변환 하기위해 문자열로 입력시 사용
				// nums[i] = Integer.valueOf(nums[i]); 
			}

			for (int i = 0; i < nums.length; i++) {

				printer.println(i + "번" + nums[i]);
			}

			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
