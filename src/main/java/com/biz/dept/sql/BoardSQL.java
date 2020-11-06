package com.biz.dept.sql;

import org.apache.ibatis.jdbc.SQL;

public class BoardSQL {
	
	// 자유게시판
	public String free_insert() {
		SQL sql=new SQL();
		
		sql.INSERT_INTO("tbl_cs_free");
		sql.INTO_COLUMNS("cs_free_seq").INTO_VALUES("#{cs_free_seq}");
		sql.INTO_COLUMNS("cs_free_date").INTO_VALUES("#{cs_free_date}");
		sql.INTO_COLUMNS("cs_free_time").INTO_VALUES("#{cs_free_time}");
		sql.INTO_COLUMNS("cs_free_title").INTO_VALUES("#{cs_free_title}");
		sql.INTO_COLUMNS("cs_free_text").INTO_VALUES("#{cs_free_text}");
		sql.INTO_COLUMNS("cs_free_image").INTO_VALUES("#{cs_free_image}");
		
		return sql.toString();
	}
	
	public String free_update() {
		SQL sql=new SQL();
		
		sql.UPDATE("tbl_cs_free");
		sql.SET("cs_free_title = #{cs_free_title}");
		sql.SET("cs_free_text = #{cs_free_text}");
		sql.SET("cs_free_image = #{cs_free_image}");
		sql.WHERE("cs_free_seq = #{cs_free_seq}");
		
		return sql.toString();
	}
	
	// 자유게시판 댓글
	public String free_reply_insert() {
		SQL sql=new SQL();
		
		sql.INSERT_INTO("tbl_cs_reply");
		sql.INTO_COLUMNS("cs_rp_seq").INTO_VALUES("#{cs_rp_seq}");
		sql.INTO_COLUMNS("cs_free_seq").INTO_VALUES("#{cs_free_seq}");
		sql.INTO_COLUMNS("cs_rp_writer").INTO_VALUES("#{cs_rp_writer}");
		sql.INTO_COLUMNS("cs_rp_text").INTO_VALUES("#{cs_rp_text}");
		
		return sql.toString();
	}
	
	// 정보게시판
	public String info_insert() {
		SQL sql=new SQL();
		
		sql.INSERT_INTO("tbl_cs_info");
		sql.INTO_COLUMNS("cs_info_seq").INTO_VALUES("#{cs_info_seq}");
		sql.INTO_COLUMNS("cs_info_cate").INTO_VALUES("#{cs_info_category}");
		sql.INTO_COLUMNS("cs_info_date").INTO_VALUES("#{cs_info_date}");
		sql.INTO_COLUMNS("cs_info_time").INTO_VALUES("#{cs_info_time}");
		sql.INTO_COLUMNS("cs_info_title").INTO_VALUES("#{cs_info_title}");
		sql.INTO_COLUMNS("cs_info_text").INTO_VALUES("#{cs_info_text}");
		sql.INTO_COLUMNS("cs_info_image").INTO_VALUES("#{cs_info_image}");
		
		return sql.toString();
	}
	
	public String info_update() {
		SQL sql=new SQL();
		
		sql.UPDATE("tbl_cs_info");
		sql.SET("cs_info_title = #{cs_info_title}");
		sql.SET("cs_info_text = #{cs_info_text}");
		sql.SET("cs_info_image = #{cs_info_image}");
		sql.WHERE("cs_info_seq = #{cs_info_seq}");
		
		return sql.toString();
	}
	
	// 공지사항
	public String noti_insert() {
		SQL sql=new SQL();
		
		sql.INSERT_INTO("tbl_cs_noti");
		sql.INTO_COLUMNS("cs_noti_seq").INTO_VALUES("#{cs_noti_seq}");
		sql.INTO_COLUMNS("cs_noti_date").INTO_VALUES("#{cs_noti_date}");
		sql.INTO_COLUMNS("cs_noti_time").INTO_VALUES("#{cs_noti_time}");
		sql.INTO_COLUMNS("cs_noti_title").INTO_VALUES("#{cs_noti_title}");
		sql.INTO_COLUMNS("cs_noti_text").INTO_VALUES("#{cs_noti_text}");
		
		return sql.toString();
	}
	
	public String noti_update() {
		SQL sql=new SQL();
		
		sql.UPDATE("tbl_cs_noti");
		sql.SET("cs_noti_title = #{cs_noti_title}");
		sql.SET("cs_noti_text = #{cs_noti_text}");
		sql.WHERE("cs_noti_seq = #{cs_noti_seq}");
		
		return sql.toString();
	}

}
