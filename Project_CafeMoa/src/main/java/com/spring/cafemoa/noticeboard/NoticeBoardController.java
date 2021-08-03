package com.spring.cafemoa.noticeboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NoticeBoardController {
	
	@Autowired
	private NoticeBoardService noticeBoardService;
	
	@RequestMapping("/noticeboardlist.do")
	public String noticeBoardSelectList(Model model) {
		
		model.addAttribute("noticeboardlist", noticeBoardService.noticeBoardSelectList());
		
		return "noticeboardlist";
	}
	
	@RequestMapping("/noticeboardselectone.do")
	public String noticeBoardSelectOne(Model model, int notice_board_seq) {
		
		model.addAttribute("noticeBoardVO", noticeBoardService.noticeBoardSelectOne(notice_board_seq));
		
		return "noticeboardselectone";
	}
	
	@RequestMapping("/noticeboardinsertform.do")
	public String noticeBoardInsertForm() {
		return "noticeboardinsert";
	}
	
	@RequestMapping(value="/noticeboardinsertres.do", method=RequestMethod.POST)
	public String noticeBoardInsertRes(NoticeBoardVO noticeBoardVO) {
		
		if(noticeBoardService.noticeBoardInsert(noticeBoardVO) > 0) {
			return "redirect:noticeboardlist.do";
		}
		return "redirect:noticeboardinsertform.do";
	}
	
	@RequestMapping("/noticeboardupdateform.do")
	public String noticeBoardUpdateForm(Model model, int notice_board_seq) {
		
		model.addAttribute("noticeBoardVO", noticeBoardService.noticeBoardSelectOne(notice_board_seq));
		
		return "noticeboardboardupdate";
	}
	
	@RequestMapping("/noticeboardupdateres.do")
	public String noticeBoardUpdateRes(NoticeBoardVO noticeBoardVO) {
		
		if(noticeBoardService.noticeBoardUpdate(noticeBoardVO) > 0) {
			return "redirect:noticeboardselectone.do?notice_board_seq="+noticeBoardVO.getNotice_board_seq();
		}
		return "redirect:noticeboardupdateform.do?notice_board_seq="+noticeBoardVO.getNotice_board_seq();
	}
	
	@RequestMapping("/noticeboarddelete.do")
	public String noticeBoardDelete(int getNotice_board_seq) {
		
		if(noticeBoardService.noticeBoardDelete(getNotice_board_seq) > 0){
			return "redirect:list.do";
		}
		return "redirect:noticeboardselectone.do?notice_board_seq="+getNotice_board_seq;
	}

}
