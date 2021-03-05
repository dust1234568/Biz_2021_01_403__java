package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV2;

public class FileWriter_07 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/score.txt";
		
		RndServiceImplV2 rV1 = new RndServiceImplV2();
		rV1.makeRnd();
		rV1.saveFileRnd(fileName);
		
	}
}
