package com.sample.spring.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increments
	private Long id;
	
	@Column(length = 100)
	private String name;
	
//	@Column(name = "userEmail") //  속성명 설정
	private String email;
	private LocalDate createDate;
}
