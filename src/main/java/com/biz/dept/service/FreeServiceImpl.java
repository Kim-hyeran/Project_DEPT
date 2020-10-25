package com.biz.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.biz.dept.mapper.BoardDao;
import com.biz.dept.model.BoardVO;

@Service
@Qualifier("freeService")
public class FreeServiceImpl implements BoardService {
	
	@Autowired
	private BoardDao bbsDao;

	@Override
	public List<BoardVO> selectAll() {
		return bbsDao.freeAll();
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
