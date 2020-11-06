package com.biz.dept.persistence;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;

import com.biz.dept.model.ReplyVO;
import com.biz.dept.sql.BoardSQL;

public interface ReplyDao {
	
	@Select("SELECT * FROM tbl_cs_reply WHERE cs_free_seq=#{cs_free_seq} ORDER BY cs_free_seq DESC")
	public List<ReplyVO> selectAll();
	
//	public ReplyVO findBySeq(long seq);

	@InsertProvider(type = BoardSQL.class, method = "free_reply_insert")
	public int insert(ReplyVO replyVO);
	
	public int delete(long seq);

}
