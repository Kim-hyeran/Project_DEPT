package com.biz.dept.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.dept.model.BoardVO;
import com.biz.dept.sql.BoardSQL;

public interface FreeDao {

	@Select("SELECT * FROM tbl_cs_free ORDER BY cs_free_seq DESC")
	public List<BoardVO> selectAll();

	@Select("SELECT * FROM tbl_cs_free WHERE cs_free_seq = #{cs_seq}")
	public BoardVO findBySeq(long seq);

	@InsertProvider(type = BoardSQL.class, method = "free_insert")
	@SelectKey(keyProperty = "cs_seq", statement = "SELECT cs_free_seq.NEXTVAL FROM DUAL", resultType = Long.class, before = true)
	public int insert(BoardVO bbsVO);

	@UpdateProvider(type = BoardSQL.class, method = "free_update")
	public int update(BoardVO bbsVO);

	@Delete("DELETE FROM tbl_cs_free WHERE cs_free_seq = #{cs_seq}")
	public int delete(long seq);

}
