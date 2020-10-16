package com.biz.dept.persistence;

import org.apache.ibatis.annotations.Select;

import com.biz.dept.model.MemberVO;


public interface MemberDao extends GenericDao<MemberVO, String>{

	@Select(" SELECT COUNT(*) FROM tbl_member ")
	public int memberCount();

}
