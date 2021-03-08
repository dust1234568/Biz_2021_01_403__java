package com.callor.iolist;

import com.callor.iolist.service.IolistService;
import com.callor.iolist.service.impl.IolistImplV1;

public class IolistEx_01 {

	public static void main(String[] args) {

		IolistService iService = new IolistImplV1();


			iService.loadFromFile();

			iService.printList();


	}
}
