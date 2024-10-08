package com.sample.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.sample.spring.domain.Member;
import com.sample.spring.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "test";
	}
	
	@RequestMapping("/all")
	public String selectAll(Model model) {
		List<Member> result =  memberService.selectAll();
		model.addAttribute("members",result);
		return "selectAll";
	}
}
