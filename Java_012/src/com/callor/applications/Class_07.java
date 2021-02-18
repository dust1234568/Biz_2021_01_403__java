package com.callor.applications;

import com.callor.applications.service.ClassServiceV5;

public class Class_07 {

	public static void main(String[] args) {

		ClassServiceV5 csV5 = new ClassServiceV5();

		csV5.sum(55.2F, 33.7F);

		float result = csV5.sum(55.2F, 33.7F);
		System.out.println(result);
	}
}
