package com.callor.applications;

public class Numbers_02 {

	public static void main(String[] args) {

		int[] intNum = new int[2];
		
		intNum[0] = 33;
		intNum[1] = 77;
		
		
		System.out.println("intNum1 : " + intNum[0] + "\t" + "intNum2 : " + intNum[1]);

		int[] intNum2 = new int[1];
		intNum2[0] = 33;
		
		intNum[0] = intNum[1];
		intNum[1] = intNum2[1];
		System.out.println("intNum1 : " + intNum[0] + "\t" + "intNum2 : " + intNum[1]);

	}

}
