package com.biz.dept.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.dept.model.BoardVO;
import com.biz.dept.sql.BoardSQL;

public interface NotiDao {
	
	@Select("SELECT * FROM tbl_cs_noti ORDER BY cs_noti_seq DESC")
	public List<BoardVO> selectAll();
	
	@Select("SELECT * FROM tbl_cs_noti WHERE cs_noti_seq = #{seq}")
	public BoardVO findBySeq(long seq);
	
	@InsertProvider(type=BoardSQL.class, method="noti_insert")
	@SelectKey(keyProperty = "cs_seq", statement="SELECT cs_noti_seq.NEXTVAL FROM DUAL", resultType=Long.class, before=true)
	public int insert(BoardVO boardVO);
	
	@UpdateProvider(type=BoardSQL.class, method="noti_update")
	public int update(BoardVO boardVO);
	
	@Delete("DELETE FROM tbl_cs_noti WHERE cs_noti_seq = #{seq}")
	public int delete(long seq);

}
