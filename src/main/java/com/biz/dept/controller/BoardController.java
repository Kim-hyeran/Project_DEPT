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
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.dept.model.FreeVO;
import com.biz.dept.model.InfoVO;
import com.biz.dept.service.FreeService;
import com.biz.dept.service.InfoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/comsc")
public class BoardController {

	@Autowired
	@Qualifier("freeService")
	private FreeService freeService;

	@Autowired
	@Qualifier("infoService")
	private InfoService infoService;

	// 게시판 메인 화면
	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String main() {

		return "home";
	}

	// 자유게시판
	@RequestMapping(value = "/free", method = RequestMethod.GET)
	public String free(Model model) {
		List<FreeVO> freeList = freeService.selectAll();

		model.addAttribute("FREE_LIST", freeList);
		model.addAttribute("BODY", "FREE_BOARD");

		return "home";
	}

	@RequestMapping(value = "/free/{seq}", method = RequestMethod.GET)
	public String freeDetail(@PathVariable String seq, Model model) {
		long long_seq = Long.valueOf(seq);
		FreeVO freeVO = freeService.findBySeq(long_seq);

		model.addAttribute("FREE_VO", freeVO);
		model.addAttribute("BODY", "FREE_DETAIL");

		return "home";
	}

	@RequestMapping(value = "/free/write", method = RequestMethod.GET)
	public String freeWrite(@ModelAttribute("FREE_VO") FreeVO freeVO, Model model) {
		LocalDateTime ldt = LocalDateTime.now();

		String date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(ldt);
		String time = DateTimeFormatter.ofPattern("HH:mm:SS").format(ldt);

		freeVO = FreeVO.builder().cs_free_date(date).cs_free_time(time).build();

		model.addAttribute("BODY", "FREE_WRITE");
		model.addAttribute("FREE_VO", freeVO);

		return "home";
	}

	@RequestMapping(value = "/free/write", method = RequestMethod.POST)
	public String freeWrite(FreeVO freeVO) {
		log.debug(freeVO.toString());
		freeService.insert(freeVO);

		return "redirect:/comsc/free";
	}

	@RequestMapping(value = "/free/update/{seq}", method = RequestMethod.GET)
	public String freeUpdate(@PathVariable String seq, Model model) {
		long long_seq = Long.valueOf(seq);
		FreeVO freeVO = freeService.findBySeq(long_seq);
		

		model.addAttribute("BODY", "FREE_WRITE");
		model.addAttribute("FREE_VO", freeVO);

		return "home";
	}

	@RequestMapping(value = "/free/update/{seq}", method = RequestMethod.POST)
	public String freeUpdate(FreeVO freeVO) {
		log.debug(freeVO.toString());
		freeService.update(freeVO);

		return "redirect:/comsc/free/{seq}";
	}

	@RequestMapping(value = "/free/delete/{seq}", method = RequestMethod.GET)
	public String freeDelete(@PathVariable String seq) {
		Long long_seq = Long.valueOf(seq);

		freeService.delete(long_seq);

		return "redirect:/comsc/free";
	}

	// 정보게시판
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String info(Model model) {
		List<InfoVO> infoList = infoService.selectAll();

		model.addAttribute("INFO_LIST", infoList);
		model.addAttribute("BODY", "INFO_BOARD");

		return "home";
	}

	@RequestMapping(value = "/info/write", method = RequestMethod.GET)
	public String infoWrite(@ModelAttribute("INFO_VO") InfoVO infoVO, Model model) {
		LocalDateTime ldt = LocalDateTime.now();

		String date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(ldt);
		String time = DateTimeFormatter.ofPattern("HH:mm").format(ldt);

		infoVO = InfoVO.builder().cs_info_date(date).cs_info_time(time).build();

		model.addAttribute("BODY", "INFO_WRITE");
		model.addAttribute("INFO_VO", infoVO);

		return "home";
	}

	@RequestMapping(value = "/info/write", method = RequestMethod.POST)
	public String infoWrite(InfoVO infoVO) {
		log.debug(infoVO.toString());
		infoService.insert(infoVO);

		return "redirect:/comsc/info";
	}
	
	@RequestMapping(value = "/info/{seq}", method = RequestMethod.GET)
	public String infoDetail(@PathVariable String seq, Model model) {
		long long_seq = Long.valueOf(seq);
		InfoVO infoVO = infoService.findBySeq(long_seq);

		model.addAttribute("INFO_VO", infoVO);
		model.addAttribute("BODY", "INFO_DETAIL");

		return "home";
	}
	
	@RequestMapping(value = "/info/update/{seq}", method = RequestMethod.GET)
	public String infoUpdate(@PathVariable String seq, Model model) {
		long long_seq = Long.valueOf(seq);
		InfoVO infoVO = infoService.findBySeq(long_seq);
		

		model.addAttribute("BODY", "INFO_WRITE");
		model.addAttribute("INFO_VO", infoVO);

		return "home";
	}

	@RequestMapping(value = "/info/update/{seq}", method = RequestMethod.POST)
	public String infoUpdate(InfoVO infoVO) {
		log.debug(infoVO.toString());
		infoService.update(infoVO);

		return "redirect:/comsc/info/{seq}";
	}

	@RequestMapping(value = "/info/delete/{seq}", method = RequestMethod.GET)
	public String infoDelete(@PathVariable String seq) {
		Long long_seq = Long.valueOf(seq);

		infoService.delete(long_seq);

		return "redirect:/comsc/info";
	}

}
