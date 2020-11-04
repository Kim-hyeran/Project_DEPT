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
public class InfoVO {
	
	private long cs_info_seq;
	private String cs_info_title;
	private String cs_info_writer;
	private String cs_info_date;
	private String cs_info_time;
	private String cs_info_text;
	private String cs_info_category;
	private String cs_info_image;
	private String cs_info_count;

}
