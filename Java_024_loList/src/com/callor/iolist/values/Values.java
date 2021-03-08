package com.callor.iolist.values;

public class Values {

	public static final String dLine;
	
	public static final String sLine;
	
	static {
		
		dLine = String.format("%090d", 0).replace("0", "=");
		sLine = String.format("%090d", 0).replace("0", "-");
	}
	
}
