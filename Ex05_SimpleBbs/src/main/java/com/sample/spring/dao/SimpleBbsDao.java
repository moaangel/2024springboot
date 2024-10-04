package com.sample.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sample.spring.dto.SimpleBbsDto;

@Repository
public class SimpleBbsDao implements ISimpleBbsDao{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<SimpleBbsDto> listDao() {
		System.out.println("get listDao");
		String query = "select * from simple_bbs order by id desc";
		List<SimpleBbsDto> dtos = template.query(query, new BeanPropertyRowMapper<>(SimpleBbsDto.class));
		return dtos;
	}

	@Override
	public Integer countDao() {
		System.out.println("countDao()");
		String query = "select count(*) from simple_bbs";
		Integer count = template.queryForObject(query, Integer.class);
		
		return count;
	}

	@Override
	public SimpleBbsDto viewDao(String id) {
		System.out.println("viewDao()");
		
		String query = "select * from simple_bbs where id = " + id;
		SimpleBbsDto dto = template.queryForObject(query, new BeanPropertyRowMapper<>(SimpleBbsDto.class));
		return dto;
	}

	@Override
	public int writeDao(String writer, String title, String content) {
		System.out.println("writeDao()");
		String query = "insert into simple_bbs(writer, title, content) values (?,?,?)";
		return template.update(query,writer,title,content);
	}

	@Override
	public int delete(String id) {
		System.out.println("delete()");
		String query = "delete from simple_bbs where id = ?";
		return template.update(query,Integer.parseInt(id));
	}

}
