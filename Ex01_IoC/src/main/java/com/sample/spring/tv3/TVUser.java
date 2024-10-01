package com.sample.spring.tv3;

public class TVUser {

	public static void main(String[] args) {
//		LGTV tv = new LGTV();
//		TV tv1 = new SamsungTV();
		BeanContainer container = new BeanContainer();
		
		TV tv = (TV)container.getBean(args[0]);
		tv.turnOn();
		
	}

}
