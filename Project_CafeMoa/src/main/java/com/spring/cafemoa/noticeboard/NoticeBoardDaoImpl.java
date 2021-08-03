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
			list = sqlSession.selectList(NAMESPACE+"noticeBoardSelectList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
