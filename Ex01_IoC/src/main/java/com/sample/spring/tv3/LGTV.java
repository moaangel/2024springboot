package com.sample.spring.tv3;

public class LGTV implements TV {
	public LGTV() {
		System.out.println("===>LGTV");
	}
	
	
	@Override
	public void turnOn() {
		System.out.println("LGTV Power On");
	}
	
	@Override
	public void turnOff() {
		System.out.println("LGTV Power Off");
	}

	@Override
	public void soundUp() {
		System.out.println("LGTV Sound On");
		
	}

	@Override
	public void soundDown() {
		System.out.println("LGTV Sound Off");
		
	}
}
