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
	public BoardVO findBySeq(long seq) {
		// TODO Auto-generated method stub
		return freeDao.findBySeq(seq);
	}

	@Override
	public int insert(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return freeDao.insert(boardVO);
	}

	@Override
	public int update(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return freeDao.update(boardVO);
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return freeDao.delete(seq);
	}

}
