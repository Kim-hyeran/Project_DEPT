package com.biz.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dept.model.BoardVO;
import com.biz.dept.persistence.FreeDao;

@Service("freeService")
public class FreeServiceImpl implements BoardService {
	
	@Autowired
	private FreeDao freeDao;

	@Override
	public List<BoardVO> selectAll() {
		return freeDao.selectAll();
	}

	@Override
	public BoardVO findById(long seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BoardVO bbsVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BoardVO bbsVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return 0;
	}

}
