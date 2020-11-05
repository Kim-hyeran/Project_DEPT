package com.biz.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dept.model.NotiVO;
import com.biz.dept.persistence.NotiDao;

@Service("notiService")
public class NotiServiceImpl implements NotiService {
	
	@Autowired
	private NotiDao notiDao;

	@Override
	public List<NotiVO> selectAll() {
		// TODO Auto-generated method stub
		return notiDao.selectAll();
	}

	@Override
	public NotiVO findBySeq(long seq) {
		// TODO Auto-generated method stub
		return notiDao.findBySeq(seq);
	}

	@Override
	public int insert(NotiVO notiVO) {
		// TODO Auto-generated method stub
		return notiDao.insert(notiVO);
	}

	@Override
	public int update(NotiVO notiVO) {
		// TODO Auto-generated method stub
		return notiDao.update(notiVO);
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return notiDao.delete(seq);
	}

}
