package com.biz.dept.service;

import com.biz.dept.model.MemberVO;
import com.biz.dept.model.UserDetailsVO;

public interface MemberService extends GenericService<MemberVO, String> {
	public int insert(UserDetailsVO userVO);

	public MemberVO findById(String username);
	
	public String userNameAndPassword(String username, String password);

	//public int update(MemberVO userVO);
	
	public MemberVO login(MemberVO loginVO);
}
