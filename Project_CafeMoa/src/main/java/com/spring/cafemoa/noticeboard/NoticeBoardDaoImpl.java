package com.spring.cafemoa.noticeboard;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeBoardDaoImpl implements NoticeBoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<NoticeBoardVO> noticeBoardSelectList() {
		List<NoticeBoardVO> list = new ArrayList<NoticeBoardVO>();
		try {
			list = sqlSession.selectList(NAMESPACE+"selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public NoticeBoardVO noticeBoardSelectOne(int notice_board_seq) {
		NoticeBoardVO noticeBoardVO = null;
		
		try {
			noticeBoardVO = sqlSession.selectOne(NAMESPACE+"selectOne", notice_board_seq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return noticeBoardVO;
	}

	@Override
	public int noticeBoardInsert(NoticeBoardVO noticeBoardVO) {
		int res = 0;
		
		try {
			res = sqlSession.insert(NAMESPACE + "insert", noticeBoardVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int noticeBoardUpdate(NoticeBoardVO noticeBoardVO) {
		int res = 0;
		
		try {
			res = sqlSession.update(NAMESPACE + "update", noticeBoardVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public int noticeBoardDelete(int notice_board_seq) {
		int res = 0;
		
		try {
			res = sqlSession.delete(NAMESPACE + "delete", notice_board_seq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

}
