package com.callor.score.values;

public class Values {

	public static final int SC_NUM = 0;
	public static final int SC_KOR = 1;
	public static final int SC_ENG = 2;
	public static final int SC_MATH = 3;
	public static final int SC_MUSIC = 4;
	
	public static final int MENU_START = 1;
	
	public static final int MENU_INPUT = 1;
	public static final int MENU_SAVE = 2;
	public static final int MENU_LOAD = 3;
	public static final int MENU_PRINT = 4;
	
	public static final int MENU_END = 4;
	
	
	public static final String dLine;

	public static final String sLine;

	static {

		dLine = String.format("%055d", 0).replace("0", "=");
		sLine = String.format("%055d", 0).replace("0", "-");
	}
}
