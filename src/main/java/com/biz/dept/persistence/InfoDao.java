package com.biz.dept.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.dept.model.InfoVO;
import com.biz.dept.sql.BoardSQL;

public interface InfoDao {

	@Select("SELECT * FROM tbl_cs_info ORDER BY cs_info_seq DESC")
	public List<InfoVO> selectAll();

	@Select("SELECT * FROM tbl_cs_info WHERE cs_info_seq = #{cs_info_seq}")
	public InfoVO findBySeq(long seq);

	@InsertProvider(type = BoardSQL.class, method = "info_insert")
	@SelectKey(keyProperty = "cs_info_seq", statement = "SELECT cs_info_seq.NEXTVAL FROM DUAL", resultType = Long.class, before = true)
	public int insert(InfoVO infoVO);

	@UpdateProvider(type = BoardSQL.class, method = "info_update")
	public int update(InfoVO infoVO);

	@Delete("DELETE FROM tbl_cs_info WHERE cs_info_seq = #{cs_info_seq}")
	public int delete(long seq);

}
