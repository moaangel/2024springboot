package com.sample.spring.tv2;

public class TVUser {

	public static void main(String[] args) {
//		LGTV tv = new LGTV();
		TV tv1 = new SamsungTV();
		tv1.turnOn();
		TV tv2 = new LGTV();
		tv2.turnOn();
	}

}
