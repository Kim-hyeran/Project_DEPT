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
public class FreeVO {
	
	private long cs_free_seq;
	private String cs_free_title;
	private String cs_free_writer;
	private String cs_free_date;
	private String cs_free_time;
	private String cs_free_text;
	private String cs_free_category;
	private String cs_free_image;
	private String cs_free_count;

}
