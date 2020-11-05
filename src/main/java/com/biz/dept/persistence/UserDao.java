package com.biz.dept.mapper;
package com.biz.dept.persistence;

import org.apache.ibatis.annotations.Select;

import com.biz.dept.model.UserDetailsVO;

public interface UserDao extends GenericDao<UserDetailsVO, String>{

	@Select("SELECT COUNT(*) FROM tbl_member")
	public int userCount();
}
