package com.biz.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dept.model.ReplyVO;
import com.biz.dept.persistence.ReplyDao;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private ReplyDao replyDao;

	@Override
	public List<ReplyVO> selectAll(long seq) {
		// TODO Auto-generated method stub
		return replyDao.selectAll();
	}

//	@Override
//	public ReplyVO findBySeq(long seq) {
//		// TODO Auto-generated method stub
//		return replyDao.findBySeq(seq);
//	}

	@Override
	public int insert(ReplyVO replyVO) {
		// TODO Auto-generated method stub
		return replyDao.insert(replyVO);
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return replyDao.delete(seq);
	}

}
