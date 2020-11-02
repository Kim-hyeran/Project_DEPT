package com.biz.dept.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.dept.service.BoardService;

@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("notiService")
	private BoardService notiService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}

	@RequestMapping(value="/notice", method=RequestMethod.GET)
	public String notice(Model model) {
		model.addAttribute("BODY", "NOTI_BOARD");
		
		return "home";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String notiWrite(Model model) {
		model.addAttribute("BODY", "NOTI_WRITE");
		
		return "home";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String notiWrite() {
		
		return "home";
	}
	
	@RequestMapping(value="/notice/{seq}", method=RequestMethod.GET)
	public String notiDetail(Model model) {
		model.addAttribute("BODY", "NOTI_WRITE");
		
		return "home";
	}
	
}
