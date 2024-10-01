package com.sample.spring.bin;

public class PrinterB implements Printer{

	@Override
	public void print(String message) {
		System.out.println("Printer B : " + message);
	}
}
