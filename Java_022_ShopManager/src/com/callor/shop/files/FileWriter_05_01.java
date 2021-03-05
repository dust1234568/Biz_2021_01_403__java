package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV1_01;

public class FileWriter_05_01 {

	public static void main(String[] args) {

		RndServiceImplV1_01 rService = new RndServiceImplV1_01();

		rService.makeRnd();
		rService.saveFileRnd();

	}

}
