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
public class MemberVO {
	private String dept_userid;		//	varchar2(125)
	private String dept_password;	//	varchar2(125)
	private String dept_name;		//	nvarchar2(30)
	private String dept_nickname;	//	nvarchar2(30)
	private String dept_dept;		//	nvarchar2(30)
	private String dept_role;		//	nvarchar2(20)
}
