package com.callor.student.values;

public class Values {

	public static final int ST_NUM = 0;
	public static final int ST_NAME = 1;
	public static final int ST_SUB = 2;
	public static final int ST_GRADE = 3;
	public static final int ST_BAN = 4;
	public static final int ST_ADD = 5;
	public static final int ST_TEL = 6;

	public static String dLine(int count) {

		String dLineFormat = "%0" + count + "d";
		String dLine = String.format(dLineFormat, 0).replace("0", "=");

		return dLine;

	}

	public static String sLine(int count) {

		String sLineFormat = "%0" + count + "d";
		String sLine = String.format(sLineFormat, 0).replace("0", "-");

		return sLine;

	}

}
