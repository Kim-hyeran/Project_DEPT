package com.biz.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dept.model.BoardVO;
import com.biz.dept.persistence.InfoDao;

@Service("infoService")
public class InfoServiceImpl implements BoardService {
	
	@Autowired
	private InfoDao infoDao;

	@Override
	public List<BoardVO> selectAll() {
		// TODO Auto-generated method stub
		return infoDao.selectAll();
	}

	@Override
	public BoardVO findBySeq(long seq) {
		// TODO Auto-generated method stub
		return infoDao.findBySeq(seq);
	}

	@Override
	public int insert(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return infoDao.insert(boardVO);
	}

	@Override
	public int update(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return infoDao.update(boardVO);
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return infoDao.delete(seq);
	}

}
