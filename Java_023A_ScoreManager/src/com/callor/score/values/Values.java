package com.callor.score.values;

public class Values {

	// 생성자를 통해 값을 초기화하기 위해 선언
	// static 변수는 public
	public static final String dLine;
	public static final String sLine;

	// static final 변수 생성하기
	// static 생성자 블럭에서 초기화 해줘야 함
	static {
		// 빈칸 50개 만들고 마지막 값을 0으로 채우고 남은 빈칸은 0으로 채워라
		// "0"을 "="로 바꿔라 바로 "="이 안되기 때문에
		// ==========================
		dLine = String.format("%070d", 0).replace("0", "=");
		sLine = String.format("%070d", 0).replace("0", "-");

	}

}
