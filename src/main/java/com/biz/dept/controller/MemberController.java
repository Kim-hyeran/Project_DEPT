package com.biz.dept.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.dept.model.MemberVO;
import com.biz.dept.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/")
public class MemberController {
	
	@Autowired
	@Qualifier("memberServiceV1")
	private MemberService memService;
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String join(@ModelAttribute("MEM_VO") MemberVO memVO, Model model) {
		
		// 아래 두 명령문을 @ModelAttribute("MEM_VO") MemberVO memVO 매개변수가 대신 처리한다.
		//MemberVO memVO = new MemberVO();
		//model.addAttribute("MEM_VO", memVO);

		return "/member/signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String join(@ModelAttribute("MEM_VO") MemberVO memVO, Model model, String s) {
		
		log.debug(memVO.toString());
		memService.insert(memVO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(@ModelAttribute("LOGIN_VO") MemberVO loginVO, Model model) {

		return "/member/login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("LOGIN_VO") MemberVO loginVO, Model model, HttpSession httpSession) {
		
		// 로그인을 위한 입력값
		log.debug(loginVO.toString());
		
		MemberVO memVO = memService.login(loginVO);
		
		// 로그인 체크를 수행한 후의 사용자 정보
		//log.debug(memVO.toString());
		
		String retURL = "";
		
		if(memVO == null) { // ID Fail
			retURL = "LOGIN";
			//model.addAttribute("MSG", "아이디가 없습니다.");
		}else if(loginVO.getDept_userid().equals(memVO.getDept_userid())) { // 로그인 성공
			retURL = "LOGIN";
			//model.addAttribute("MSG", "비밀번호가 일치하지 않습니다.");
		}else { // 인증이 된 경우
			/*
			 * httpSession을 사용하여 Client와 Server 간에 
			 * Session을 주고받을 수 있도록 하는 절차
			 */
			httpSession.setAttribute("LOGIN", memVO);
		}
		
		model.addAttribute("BODY", retURL);
		
		return "${rootPath}/comsc";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.removeAttribute("LOGIN");
		httpSession = null;
		
		return "index";
	}
	
//	@RequestMapping(value="/signup", method=RequestMethod.GET)
//	public String signup(Model model) {
//		model.addAttribute("BODY", "SIGNUP");
//		
//		return "signup";
//	}


}
