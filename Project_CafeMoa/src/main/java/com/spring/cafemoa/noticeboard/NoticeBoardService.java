package com.spring.cafemoa.noticeboard;

import java.util.List;

public interface NoticeBoardService {

	public List<NoticeBoardVO> noticeBoardSelectList();
	public NoticeBoardVO noticeBoardSelectOne(int notice_board_seq);
	public int noticeBoardInsert(NoticeBoardVO noticeBoardVO);
	public int noticeBoardUpdate(NoticeBoardVO noticeBoardVO);
	public int noticeBoardDelete(int notice_board_seq);
	
}
