package com.biz.dept.service;

import com.biz.dept.model.MemberVO;
import com.biz.dept.model.UserDetailsVO;
import com.biz.dept.persistence.GenericDao;

public interface MemberService extends GenericDao<MemberVO, String> {
	
	public MemberVO login(MemberVO loginVO);
	
//	public int insert(UserDetailsVO userVO);
//
//	public UserDetailsVO findById(String username);
//	
//	public String userNameAndPassword(String username, String password);
//
//	public int update(UserDetailsVO userVO);
}
