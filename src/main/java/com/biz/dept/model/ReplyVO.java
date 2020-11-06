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
@ToString
@Builder
public class ReplyVO {
	
	private long cs_rp_seq;
	private long cs_free_seq;
	private String cs_rp_text;
	private String cs_rp_writer;
	private String cs_rp_date;

}
