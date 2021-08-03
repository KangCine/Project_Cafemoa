package com.spring.cafemoa.noticeboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeBoardServiceImpl implements NoticeBoardService {
	
	@Autowired
	private NoticeBoardDao noticeBoardDao;

	@Override
	public List<NoticeBoardVO> noticeBoardSelectList() {
		return noticeBoardDao.noticeBoardSelectList();
	}

}
