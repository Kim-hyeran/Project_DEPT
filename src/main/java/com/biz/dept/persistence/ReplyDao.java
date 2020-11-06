package com.biz.dept.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.biz.dept.model.ReplyVO;
import com.biz.dept.sql.BoardSQL;

public interface ReplyDao {

	@Select("SELECT * FROM tbl_cs_reply WHERE cs_free_seq = #{cs_free_seq} ORDER BY cs_free_seq DESC")
	public List<ReplyVO> selectAll(long seq);

	@InsertProvider(type = BoardSQL.class, method = "free_reply_insert")
	@SelectKey(keyProperty = "cs_rp_seq", statement = "SELECT cs_rp_seq.NEXTVAL FROM DUAL", resultType = Long.class, before = true)
	public int insert(ReplyVO replyVO);

	@Delete("DELETE FROM tbl_cs_reply WHERE cs_rp_seq = #{cs_rp_seq}")
	public int delete(long seq);

}
