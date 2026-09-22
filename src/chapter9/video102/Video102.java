package chapter9.video102;

import chapter9.TDuongException;

public class Video102 {
	public static void main(String[] args) {

		// khong duong throw exception chung chung
		// Luon throw ngoai le cu the hoac Custom Exception de nguoi goi biet cach xu ly

//		throw new TungduongException("custom exception");
		throw new TDuongException("custom runtime exception");

	}
}
