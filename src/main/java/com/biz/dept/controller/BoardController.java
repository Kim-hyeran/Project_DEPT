package com.biz.dept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/comsc")
public class BoardController {
	
	/*
	 * 1. db 연결하기 : 각 게시판 crud 구현
	 * 2. 첨부파일 이미지 확장자로 제한
	 * 3. 페이지네이션
	 * 4. 조회수, 추천, 신고
	 * 4. 댓글 기능
	 */
	
	@RequestMapping(value={"/", ""}, method=RequestMethod.GET)
	public String main() {
		
		return "home";
	}
	
	@RequestMapping(value="/free", method=RequestMethod.GET)
	public String free(Model model) {
		model.addAttribute("BODY", "FREE_BOARD");
		
		return "home";
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(Model model) {
		model.addAttribute("BODY", "FREE_DETAIL");
		
		return "home";
	}
	
	@RequestMapping(value="/free/write", method=RequestMethod.GET)
	public String freeWrite(Model model) {
		model.addAttribute("BODY", "FREE_WRITE");
		
		return "home";
	}
	
	@RequestMapping(value="/info", method=RequestMethod.GET)
	public String info(Model model) {
		model.addAttribute("BODY", "INFO_BOARD");
		
		return "home";
	}
	
	@RequestMapping(value="/info/write", method=RequestMethod.GET)
	public String infoWrite(Model model) {
		model.addAttribute("BODY", "INFO_WRITE");
		
		return "home";
	}

}
