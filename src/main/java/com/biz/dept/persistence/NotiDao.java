package com.biz.dept.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.dept.model.NotiVO;
import com.biz.dept.sql.BoardSQL;

public interface NotiDao {
	
	@Select("SELECT * FROM tbl_cs_noti ORDER BY cs_noti_seq DESC")
	public List<NotiVO> selectAll();
	
	@Select("SELECT * FROM tbl_cs_noti WHERE cs_noti_seq = #{cs_noti_seq}")
	public NotiVO findBySeq(long seq);
	
	@InsertProvider(type=BoardSQL.class, method="noti_insert")
	@SelectKey(keyProperty = "cs_noti_seq", statement="SELECT cs_noti_seq.NEXTVAL FROM DUAL", resultType=Long.class, before=true)
	public int insert(NotiVO notiVO);
	
	@UpdateProvider(type=BoardSQL.class, method="noti_update")
	public int update(NotiVO notiVO);
	
	@Delete("DELETE FROM tbl_cs_noti WHERE cs_noti_seq = #{cs_noti_seq}")
	public int delete(long seq);

}
