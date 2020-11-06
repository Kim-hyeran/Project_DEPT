package com.biz.dept.service;

import java.util.List;

import com.biz.dept.model.FreeVO;

public interface FreeService {
	
	public List<FreeVO> selectAll();
	public FreeVO findBySeq(long seq);
	public int insert(FreeVO freeVO);
	public int update(FreeVO freeVO);
	public int delete(long seq);
	
}
