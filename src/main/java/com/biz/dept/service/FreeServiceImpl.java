package com.biz.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dept.model.FreeVO;
import com.biz.dept.persistence.FreeDao;

@Service("freeService")
public class FreeServiceImpl implements FreeService {
	
	@Autowired
	private FreeDao freeDao;

	@Override
	public List<FreeVO> selectAll() {
		return freeDao.selectAll();
	}

	@Override
	public FreeVO findBySeq(long seq) {
		// TODO Auto-generated method stub
		return freeDao.findBySeq(seq);
	}

	@Override
	public int insert(FreeVO boardVO) {
		// TODO Auto-generated method stub
		return freeDao.insert(boardVO);
	}

	@Override
	public int update(FreeVO boardVO) {
		// TODO Auto-generated method stub
		return freeDao.update(boardVO);
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return freeDao.delete(seq);
	}

}
