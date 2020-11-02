package com.biz.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dept.model.BoardVO;
import com.biz.dept.persistence.NotiDao;

@Service("notiService")
public class NotiServiceImpl implements BoardService {
	
	@Autowired
	private NotiDao notiDao;

	@Override
	public List<BoardVO> selectAll() {
		// TODO Auto-generated method stub
		return notiDao.selectAll();
	}

	@Override
	public BoardVO findBySeq(long seq) {
		// TODO Auto-generated method stub
		return notiDao.findBySeq(seq);
	}

	@Override
	public int insert(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return notiDao.insert(boardVO);
	}

	@Override
	public int update(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return notiDao.update(boardVO);
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return notiDao.delete(seq);
	}

}
