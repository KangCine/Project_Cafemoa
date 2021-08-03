package com.spring.cafemoa.noticeboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeBoardController {
	
	@Autowired
	private NoticeBoardService noticeBoardService;

	@RequestMapping("/noticeBoardList")
	public String noticeBoardSelectList(Model model) {
		
		model.addAttribute("list", noticeBoardService.noticeBoardSelectList());
		
		return "noticeboardlist";
	}
	
}
