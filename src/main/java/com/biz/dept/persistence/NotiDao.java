package com.biz.dept.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.biz.dept.model.BoardVO;

public interface NotiDao {
	
	@Select("SELECT * FROM tbl_cs_noti ORDER BY cs_noti_seq DESC")
	public List<BoardVO> selectAll();
	
	@Select("SELECT * FROM tbl_cs_noti WHERE cs_noti_seq = #{seq} ")
	public BoardVO findBySeq(long seq);
	
	//@InsertProvider(type=BbsSQL.class, method="noti_insert")
	public int insert(BoardVO bbsVO);
	
	//@UpdateProvider(type=BbsSQL.class, method="noti_update")
	public int update(BoardVO bbsVO);
	
	@Delete("DELETE FROM tbl_cs_noti WHERE cs_noti_seq = #{seq}")
	public int delete(long seq);

}
