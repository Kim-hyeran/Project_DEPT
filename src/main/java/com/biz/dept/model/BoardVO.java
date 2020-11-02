package com.biz.dept.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BoardVO {
	
	private long cs_seq;
	private String cs_title;
	private String cs_writer;
	private String cs_date;
	private String cs_time;
	private String cs_text;
	private String cs_category;
	private String cs_image;
	private String cs_count;

}
