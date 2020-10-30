package com.biz.dept.service;

import java.util.List;

import com.biz.dept.model.BoardVO;

public interface BoardService {
	
	public List<BoardVO> selectAll();
	public BoardVO findById(long seq);
	public int insert(BoardVO bbsVO);
	public int update(BoardVO bbsVO);
	public int delete(long seq);

}
