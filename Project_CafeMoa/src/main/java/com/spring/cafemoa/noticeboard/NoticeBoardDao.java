package com.spring.cafemoa.noticeboard;

import java.util.List;

public interface NoticeBoardDao {
	
	String NAMESPACE = "noticeboard.";
	
	public List<NoticeBoardVO> noticeBoardSelectList();
	

}
