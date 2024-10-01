package com.sample.spring.bin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    Member member1() {
    	
    	Member member1 = new Member();
    	member1.setName("박상연");
    	member1.setNickname("코딩도사");
    	member1.setPrinter(new PrinterA());
    	
    	
		return member1;
	}
    
    @Bean(name = "hello")
    Member member2() {
    	
    	return new Member("정한얼","신",new PrinterA());
    }
}
