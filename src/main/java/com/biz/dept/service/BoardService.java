package com.biz.dept.service;

import java.util.List;

import com.biz.dept.model.BoardVO;

public interface BoardService {
	
	public List<BoardVO> selectAll();
	public BoardVO findBySeq(long seq);
	public int insert(BoardVO boardVO);
	public int update(BoardVO boardVO);
	public int delete(long seq);

}
