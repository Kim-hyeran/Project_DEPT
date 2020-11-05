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
public class NotiVO {
	
	private long cs_noti_seq;
	private String cs_noti_title;
	private String cs_noti_writer;
	private String cs_noti_date;
	private String cs_noti_time;
	private String cs_noti_text;
	private String cs_noti_count;

}
