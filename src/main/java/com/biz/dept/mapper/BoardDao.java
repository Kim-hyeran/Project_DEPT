package com.biz.dept.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.dept.model.BoardVO;
import com.biz.dept.sql.BoardSQL;

public interface BoardDao {
	
	// 자유게시판 SQL
	@Select("SELECT * FROM tbl_cs_free ORDER BY cs_free_seq DESC")
	public List<BoardVO> freeAll();
	
	@Select("SELECT * FROM tbl_cs_free WHERE cs_free_seq = #{seq} ")
	public BoardVO free_Seq(long seq);
	
	@InsertProvider(type=BoardSQL.class, method="free_insert")
	@SelectKey(keyProperty = "cs_free_seq", statement = "SELECT cs_free_seq.NEXTVAL FROM DUAL", resultType = Long.class, before=true)
	public int free_insert(BoardVO boardVO);
	
	@UpdateProvider(type=BoardSQL.class,method="free_update")
	public int free_update(BoardVO boardVO);
	
	@Delete("DELETE FROM tbl_cs_free WHERE cs_free_seq = #{seq}")
	public int free_delete(long seq);
	
	
	
	// 정보게시판 SQL
	@Select("SELECT * FROM tbl_cs_info ORDER BY cs_info_seq DESC")
	public List<BoardVO> infoAll();
	
	@Select("SELECT * FROM tbl_cs_info WHERE cs_info_seq = #{seq} ")
	public BoardVO info_seq(long seq);
	
	@InsertProvider(type=BoardSQL.class, method="info_insert")
	@SelectKey(keyProperty = "cs_info_seq", statement = "SELECT cs_info_seq.NEXTVAL FROM DUAL", resultType = Long.class, before=true)
	public int info_insert(BoardVO boardVO);
	
	@UpdateProvider(type=BoardSQL.class,method="info_update")
	public int info_update(BoardVO boardVO);
	
	@Delete("DELETE FROM tbl_cs_info WHERE cs_info_seq = #{seq}")
	public int info_delete(long seq);
	
	
	
	// 공지사항 SQL
	@Select("SELECT * FROM tbl_cs_noti ORDER BY cs_noti_seq DESC")
	public List<BoardVO> notiAll();
	
	@Select("SELECT * FROM tbl_cs_noti WHERE cs_noti_seq = #{seq} ")
	public BoardVO noti_noti(long seq);
	
	@InsertProvider(type=BoardSQL.class, method="noti_insert")
	@SelectKey(keyProperty = "cs_noti_seq", statement = "SELECT cs_noti_seq.NEXTVAL FROM DUAL", resultType = Long.class, before=true)
	public int noti_insert(BoardVO boardVO);
	
	@UpdateProvider(type=BoardSQL.class,method="noti_update")
	public int noti_update(BoardVO boardVO);
	
	@Delete("DELETE FROM tbl_cs_noti WHERE cs_noti_seq = #{seq}")
	public int noti_delete(long seq);

}
