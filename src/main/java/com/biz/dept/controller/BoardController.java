package com.biz.dept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/comsc")
public class BoardController {
	
	@RequestMapping(value={"/", ""}, method=RequestMethod.GET)
	public String main() {
		
		return "home";
	}
	
	@RequestMapping(value="/free", method=RequestMethod.GET)
	public String free(Model model) {
		model.addAttribute("BODY", "FREE_BOARD");
		
		return "home";
	}
	
	@RequestMapping(value="/info", method=RequestMethod.GET)
	public String info(Model model) {
		model.addAttribute("BODY", "INFO_BOARD");
		
		return "home";
	}
	
	@RequestMapping(value="/notice", method=RequestMethod.GET)
	public String notice(Model model) {
		model.addAttribute("BODY", "NOTI_BOARD");
		
		return "home";
	}

}
