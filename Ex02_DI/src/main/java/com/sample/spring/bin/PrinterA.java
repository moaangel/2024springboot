package com.sample.spring.bin;

public class PrinterA implements Printer{
	
	@Override
	public void print(String message) {
		System.out.println("Printer A : " + message);
	}
}
