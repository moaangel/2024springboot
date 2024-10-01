package com.sample.spring.tv1;

public class TVUser {

	public static void main(String[] args) {
//		LGTV tv = new LGTV();
		SamsungTV tv = new SamsungTV();
		tv.turnOn();
		tv.turnOff();
		tv.soundOn();
		tv.soundOff();
	}

}
