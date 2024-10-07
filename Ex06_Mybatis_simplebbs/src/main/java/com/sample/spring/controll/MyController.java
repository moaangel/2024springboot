package com.sample.spring.controll;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.spring.dao.ISimpleBbsDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@Autowired
	ISimpleBbsDao dao;
	
	
	
	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String listPage(Model model) {
		model.addAttribute("lists",dao.listDao());
		model.addAttribute("count",dao.countDao());
		return "list";
	}
	
	@RequestMapping("/view") // view?id=1 형태
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		model.addAttribute("dto",dao.viewDao(sId));
		return "view";
	}
	
	@RequestMapping("/writeForm")
	public String writer() {
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("writer",request.getParameter("writer"));
		hm.put("title",request.getParameter("title"));
		hm.put("content",request.getParameter("content"));		
		dao.writeDao(hm);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) {
		dao.delete(request.getParameter("id"));
		return "redirect:list";
	}
	
}
