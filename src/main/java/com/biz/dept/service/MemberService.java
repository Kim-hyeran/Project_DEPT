package com.biz.dept.service;

import com.biz.dept.model.UserDetailsVO;

public interface MemberService {
	public int insert(UserDetailsVO userVO);

	public UserDetailsVO findById(String username);
	
	public String userNameAndPassword(String username, String password);

	public int update(UserDetailsVO userVO);
}
