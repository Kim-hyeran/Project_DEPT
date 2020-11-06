package com.biz.dept.service;

import java.util.List;

import com.biz.dept.model.ReplyVO;

public interface ReplyService {
	
	public List<ReplyVO> selectAll(long seq);
//	public ReplyVO findBySeq(long seq);
	public int insert(ReplyVO replyVO);
	public int delete(long seq);

}
