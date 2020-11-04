package com.biz.dept.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.dept.model.FreeVO;
import com.biz.dept.sql.BoardSQL;

public interface FreeDao {

	@Select("SELECT * FROM tbl_cs_free ORDER BY cs_free_seq DESC")
	public List<FreeVO> selectAll();

	@Select("SELECT * FROM tbl_cs_free WHERE cs_free_seq = #{cs_free_seq}")
	public FreeVO findBySeq(long seq);

	@InsertProvider(type = BoardSQL.class, method = "free_insert")
	@SelectKey(keyProperty = "cs_free_seq", statement = "SELECT cs_free_seq.NEXTVAL FROM DUAL", resultType = Long.class, before = true)
	public int insert(FreeVO freeVO);

	@UpdateProvider(type = BoardSQL.class, method = "free_update")
	public int update(FreeVO freeVO);

	@Delete("DELETE FROM tbl_cs_free WHERE cs_free_seq = #{cs_free_seq}")
	public int delete(long seq);

}
