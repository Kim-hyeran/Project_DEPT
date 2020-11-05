package com.biz.dept.mapper;
package com.biz.dept.persistence;

import java.util.List;

import com.biz.dept.model.AuthorityVO;

public interface AuthorityDao extends GenericDao<AuthorityVO, Long>{
	public int insertAll(List<AuthorityVO> authList);
	public List<AuthorityVO> findByUserName(String username);
}
