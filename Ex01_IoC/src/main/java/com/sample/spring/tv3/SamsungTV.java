package com.sample.spring.tv3;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("===>SamsungTV");
	}
	
	@Override
	public void turnOn() {
		System.out.println("SamsungTV Power On");
	}
	
	@Override
	public void turnOff() {
		System.out.println("SamsungTV Power Off");
	}	

	@Override
	public void soundUp() {
		System.out.println("SamsungTV Sound On");
		
	}

	@Override
	public void soundDown() {
		System.out.println("SamsungTV Sound Off");
		
	}
}
