package com.callor.iolist.service;

/*
 * 파일을 읽어서 ioList에 담기
 * 
 * ioList에 담긴 데이터를 "구분" 값을 기준으로 매입금액과 매출금액을 계산하자
 * 
 * ioList에 담긴 데이터를 출력하기
 * 
 */
public interface IolistService {

	public void loadDataFromFile();

	public void ioListSum();

	public void printIoList();

}
