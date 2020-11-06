package com.biz.dept.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookVO {
	
	private long b_seq;
	private String b_title;
	private String b_author;
	private long b_price;
	private String b_cover;
	private String b_bookpaper;
	private String b_deal;
	private String b_first_line;
	private String b_context;
	private String b_writer;
	private String b_date;
	private String b_time;

}
