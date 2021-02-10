package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_07 {

	public static void main(String[] args) {

		MyGuGuDan myGu = new MyGuGuDan();

		/*
		 * MyGuGuDan 클래스에 정의된 print() method 호출 
		 * MyGuGuDan 클래스의 print() method 호출
		 */
		myGu.print(8);

		Random rnd = new Random();
		rnd.nextInt(10); // Random 클래스에 nextInt를 호출한다

		Scanner scan = new Scanner(System.in);
		scan.nextInt(); // Scanner 클래스에 있는 nextInt 호출 

		Random rd = new Random();
		rd.nextInt(100);

	}
}
