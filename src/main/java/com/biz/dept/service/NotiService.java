package com.biz.dept.service;

import java.util.List;

import com.biz.dept.model.NotiVO;

public interface NotiService {
	
	public List<NotiVO> selectAll();
	public NotiVO findBySeq(long seq);
	public int insert(NotiVO notiVO);
	public int update(NotiVO notiVO);
	public int delete(long seq);

}
