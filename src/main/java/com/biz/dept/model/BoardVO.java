package com.biz.dept.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardVO {
	
	private long cs_seq;
	private String cs_title;
	private String cs_writer;
	private String cs_date;
	private String cs_time;
	private String cs_contents;
	private String cs_category;

}
