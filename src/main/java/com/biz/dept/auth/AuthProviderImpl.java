package com.biz.dept.auth;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import lombok.extern.slf4j.Slf4j;

/*
 * member table에서 user정보를 select하여 권한을 관리하는 클래스
 * 
 * (spring security에서 사용자 인증, 권한 부여 절차)
 * 사용자가 login form에 username, password를 입력한 후 로그인을 시도하면
 * 1. AuthenticationProvider 인터페이스를 구현한 AuthProviderImpl 객체를 찾는다.
 * 2. authenticate() method를 호출한다. 이때 sprint security는 authentication객체에
 * 	  로그인한 username, password를 실어서 전달한다.
 * 3. authentication 객체에서 principal(username), credential(password)값을 getter하여
 * 	  username과 password를 추출한다.
 * 4. UserDetailService 인터페이스를 구현한 UserDetailServiceImpl 객체를 호출하여
 * 	  UserDetails 정보를 요청한다.
 * 5. UserDetailServiceImpl은 username에 해당하는 사용자 정보를 user(member) table에서
 * 	  select하여 return한다. 이때 username에 해당하는 사용자 정보가 없으면
 *    UsernameNotFoundException을 발생시켜 spring security에게 사용자 정보가 없음을 통보한다.
 * 6. UserDetailServiceImpl로부터 return받은 UserDetails에 담겨있는 password와
 *    사용자가 login한 password를 비교한다.
 *    만약 password가 다르면 BadCredentialsException을 강제로 발생시켜 spring security에게 통보한다. 
 * 7. username과 password가 확인되었다. 이제 사용자 정보에 enable값을 검사하여 
 * 	  사용가능한 정보인지를 알아본다.
 */
@Slf4j
public class AuthProviderImpl implements AuthenticationProvider {@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return false;
	}

}