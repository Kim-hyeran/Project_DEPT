package com.biz.dept.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.dept.model.FreeVO;
import com.biz.dept.model.NotiVO;
import com.biz.dept.service.NotiService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	@Autowired
	@Qualifier("notiService")
	private NotiService notiService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home";
	}

	@RequestMapping(value = "/notice", method = RequestMethod.GET)
	public String notice(Model model) {
		model.addAttribute("BODY", "NOTI_BOARD");

		return "home";
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String notiWrite(@ModelAttribute("NOTI_VO") NotiVO notiVO, Model model) {
		LocalDateTime ldt = LocalDateTime.now();

		String date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(ldt);
		String time = DateTimeFormatter.ofPattern("HH:mm").format(ldt);

		notiVO = NotiVO.builder().cs_noti_date(date).cs_noti_time(time).build();

		model.addAttribute("BODY", "NOTI_WRITE");
		model.addAttribute("NOTI_VO", notiVO);

		return "home";
	}

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String notiWrite(NotiVO notiVO) {
		log.debug(notiVO.toString());
		notiService.insert(notiVO);

		return "redirect:/notice";
	}

	@RequestMapping(value = "/notice/{seq}", method = RequestMethod.GET)
	public String freeDetail(@PathVariable String seq, Model model) {
		long long_seq = Long.valueOf(seq);
		NotiVO notiVO = notiService.findBySeq(long_seq);

		model.addAttribute("NOTI_VO", notiVO);
		model.addAttribute("BODY", "NOTI_DETAIL");

		return "home";
	}

	@RequestMapping(value = "/update/{seq}", method = RequestMethod.GET)
	public String freeUpdate(@PathVariable String seq, Model model) {
		Long long_seq = Long.valueOf(seq);
		NotiVO notiVO = notiService.findBySeq(long_seq);

		model.addAttribute("BODY", "NOTI_WRITE");
		model.addAttribute("NOTI_VO", notiVO);

		return "board/noti-write";
	}

	@RequestMapping(value = "/update/{seq}", method = RequestMethod.POST)
	public String freeUpdate(NotiVO notiVO) {
		log.debug(notiVO.toString());
		notiService.update(notiVO);

		return "redirect:/notice";
	}

	@RequestMapping(value = "/delete/{seq}", method = RequestMethod.GET)
	public String freeDelete(@PathVariable String seq) {
		Long long_seq = Long.valueOf(seq);

		notiService.delete(long_seq);

		return "redirect:/notice";
	}

}
