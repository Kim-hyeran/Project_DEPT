package com.biz.dept.service;

import java.util.List;

import com.biz.dept.model.FreeVO;
import com.biz.dept.model.InfoVO;

public interface InfoService {
	
	public List<InfoVO> selectAll();
	public InfoVO findBySeq(long seq);
	public int insert(InfoVO infoVO);
	public int update(InfoVO infoVO);
	public int delete(long seq);

}
