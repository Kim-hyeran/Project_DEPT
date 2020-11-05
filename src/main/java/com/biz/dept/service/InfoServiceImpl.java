package com.biz.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dept.model.InfoVO;
import com.biz.dept.persistence.InfoDao;

@Service("infoService")
public class InfoServiceImpl implements InfoService {
	
	@Autowired
	private InfoDao infoDao;

	@Override
	public List<InfoVO> selectAll() {
		// TODO Auto-generated method stub
		return infoDao.selectAll();
	}

	@Override
	public InfoVO findBySeq(long seq) {
		// TODO Auto-generated method stub
		return infoDao.findBySeq(seq);
	}

	@Override
	public int insert(InfoVO infoVO) {
		// TODO Auto-generated method stub
		return infoDao.insert(infoVO);
	}

	@Override
	public int update(InfoVO infoVO) {
		// TODO Auto-generated method stub
		return infoDao.update(infoVO);
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return infoDao.delete(seq);
	}

}
