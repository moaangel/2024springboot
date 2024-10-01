package com.sample.spring.tv3;

public class SonyTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("sony");
	}

	@Override
	public void turnOff() {
		System.out.println("sony");
		
	}

	@Override
	public void soundUp() {
		System.out.println("sony");
		
	}

	@Override
	public void soundDown() {
		System.out.println("sony");
		
	}

}
