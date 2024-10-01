package com.sample.spring.tv3;

public class BeanContainer {
	public Object getBean(String id) {
		if(id.equals("lg")) {
			return new LGTV();
		}
		else if(id.equals("samsung")){
			return new SamsungTV();
		}
		else if(id.equals("sony")) {
			return new SonyTV();
		}
		else {
			return null;
		}
	}
}
