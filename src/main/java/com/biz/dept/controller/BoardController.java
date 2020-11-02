package com.biz.dept.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.dept.model.BoardVO;
import com.biz.dept.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/comsc")
public class BoardController {

	@Autowired
	@Qualifier("freeService")
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

	@RequestMapping(value="/free/{seq}", method=RequestMethod.GET)
	public String freeDetail(@PathVariable String seq, Model model) {
		long long_seq = Long.valueOf(seq);
		BoardVO boardVO = freeService.findBySeq(long_seq);
		
		model.addAttribute("FREE_VO",boardVO);
		model.addAttribute("BODY", "FREE_DETAIL");
		
		return "home";
	}
	
	@RequestMapping(value="/free/write", method=RequestMethod.GET)
	public String freeWrite(@ModelAttribute("FREE_VO") BoardVO boardVO, Model model) {
		LocalDateTime ldt=LocalDateTime.now();
		
		String date=DateTimeFormatter.ofPattern("yyyy-MM-dd").format(ldt);
		String time=DateTimeFormatter.ofPattern("HH:mm:SS").format(ldt);
		
		boardVO=BoardVO.builder().cs_date(date).cs_time(time).build();
		
		model.addAttribute("BODY", "FREE_WRITE");
		model.addAttribute("FREE_VO", boardVO);
		
		return "home";
	}
	
	@RequestMapping(value="/free/write", method=RequestMethod.POST)
	public String freeWrite(BoardVO boardVO) {
		log.debug(boardVO.toString());
		freeService.insert(boardVO);
		
		return "redirect:/comsc/free";
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
