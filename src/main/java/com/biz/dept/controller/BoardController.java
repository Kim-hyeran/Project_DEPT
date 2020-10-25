package com.biz.dept.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.dept.model.BoardVO;
import com.biz.dept.service.BoardService;

@Controller
@RequestMapping(value="/comsc")
public class BoardController {
	
	@Autowired
	private BoardService freeService;
	
	@RequestMapping(value={"/", ""}, method=RequestMethod.GET)
	public String main() {
		
		return "home";
	}
	
	@RequestMapping(value="/free", method=RequestMethod.GET)
	public String free(Model model) {
		List<BoardVO> freeList=freeService.selectAll();
		
		model.addAttribute("FREE_LIST", freeList);
		model.addAttribute("BODY", "FREE_BOARD");
		
		return "home";
	}
	
	/*
	 * 게시판 CRUD 구현 : 완벽한 테이블 명세 작성
	 * 1. 작성일시를 글쓰기 완료 버튼을 클릭하는 시점으로 설정
	 * 2. 첨부파일 가능 확장자를 이미지로 제한하여 코딩
	 * 3. mapper.xml 대신 sql class 생성하기
	 * 4. 게시판 목록 페이지네이션 구현
	 * 5. 게시물 조회수, 추천, 신고 구현
	 * 6. 검색 기능 구현
	 * 
	 * 의문점
	 * 게시판마다 jsp와 controller method를 개별적으로 설정하는 방법만 존재하는가
	 * 스크랩 기능 구현 방법?
	 */
	
	@RequestMapping(value="/free/write", method=RequestMethod.GET)
	public String freeWrite(@ModelAttribute("FREE_VO") BoardVO bbsVO,Model model) {
		LocalDate localDate=LocalDate.now();
		LocalTime localTime=LocalTime.now();
		
		DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter time=DateTimeFormatter.ofPattern("hh:mm:ss");
		
		bbsVO.setCs_date(localDate.format(date).toString());
		bbsVO.setCs_time(localTime.format(time).toString());
		
		model.addAttribute("FREE_VO", bbsVO);
		model.addAttribute("BODY", "FREE_WRITE");
		
		return "home";
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(Model model) {
		model.addAttribute("BODY", "FREE_DETAIL");
		
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
