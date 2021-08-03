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

	@Override
	public NoticeBoardVO noticeBoardSelectOne(int notice_board_seq) {
		return noticeBoardDao.noticeBoardSelectOne(notice_board_seq);
	}

	@Override
	public int noticeBoardInsert(NoticeBoardVO noticeBoardVO) {
		return noticeBoardDao.noticeBoardInsert(noticeBoardVO);
	}

	@Override
	public int noticeBoardUpdate(NoticeBoardVO noticeBoardVO) {
		return noticeBoardDao.noticeBoardUpdate(noticeBoardVO);
	}

	@Override
	public int noticeBoardDelete(int notice_board_seq) {
		return noticeBoardDao.noticeBoardDelete(notice_board_seq);
	}

}
