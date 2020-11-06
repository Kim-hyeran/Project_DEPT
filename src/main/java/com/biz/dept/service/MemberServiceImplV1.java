package com.biz.dept.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.biz.dept.model.AuthorityVO;
import com.biz.dept.model.MemberVO;
import com.biz.dept.model.UserDetailsVO;
import com.biz.dept.persistence.AuthorityDao;
import com.biz.dept.persistence.MemberDao;
import com.biz.dept.persistence.UserDao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("memberServiceV1")
@RequiredArgsConstructor
public class MemberServiceImplV1 implements MemberService{

	@Autowired
	private final MemberDao memDao;

	@Override
	public List<MemberVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * memberService의 insert는 회원가입 join method를 대신한다.
	 * 
	 * * 회원가입 정책(Policy)
	 * 1. tbl_member table에 아무런 데이터도 없이 최초로 가입(INSERT)된 회원정보는
	 *    권한(ROLL)을 'ADMIN'으로 부여한다.
	 * 2. 두번째부터 가입된 회원은 권한(ROLL)을 'USER'로 부여한다.
	 * 3. 회원이 탈퇴를 요청하면 권한을 'GUEST'로 변경한다.
	 * 4. 같은 아이디로 재가입을 요청하면 권한을 'GUEST'에서 'USER'로 변경한다.
	 * 5. ADMIN 권한: 현재 App의 모든 기능을 사용할 수 있다.
	 *     - 다른 사용자의 정보를 변경할 수 있다.
	 *     - 다른 사용자의 권한을 변경할 수 있다.
	 * 6. MEMBER권한: ADMIN권한으로 접근할 수 있는 부분은 사용이 불가하다.
	 *     - 본인의 사용자 정보만 변경할 수 있다.
	 *     - 본인의 사용자 권한은 변경할 수 있다.
	 * 7. GUEST권한: 로그인과 재가입요청만 할 수 있다.
	 * 
	 * * 회원가입 절차
	 * 1. tbl_member 테이블에 회원정보가 1개라도 있는가 검사
	 * 2. 없으면 : 현재 추가할 회원은 ADMIN
	 * 3. 있으면 : 현재 추가할 회원은 MEMBER
	 * 4. memberVO의 ROLL칼럼에 권한 문자열을 추가하고
	 * 5. INSERT를 수행
	 */
	@Override
	public int insert(MemberVO memberVO) {
		
		// tbl_member table의 저장된 레코드개수 가져오기
		int count = memDao.memberCount();
		
		// 회원정보가 없으면 ADMIN, 있으면 MEMBER
		if(count > 0) {
			memberVO.setDept_role("MEMBER");
		}else {
			memberVO.setDept_role("ADMIN");
		}
		
		int ret = memDao.insert(memberVO);
		
		return ret;
	}

	@Override
	public int update(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*
	 * 로그인 절차
	 * 
	 * 1. loginVO에 담긴 정보에서 userid를 추출하여 사용자정보를 가져오기
	 *    findById()
	 * 2. 결과값이 null이면 Controller로 즉시 null값 return : Login Fail
	 * 3. 결과값이 null이 아니면 password를 비교
	 *   가. 일치하면: Login OK, memberVO를 Controller로 return
	 *   나. 일치하지 않으면: Password Fail, Controller로 Password Fail을 알림 
	 */
	@Override
	public MemberVO login(MemberVO loginVO) {
		
		MemberVO memVO = memDao.findById(loginVO.getDept_userid());
		if(memVO != null) {
			if(loginVO.getDept_password().equals(memVO.getDept_password())){
				memVO.setDept_role("P_FAIL");
				memVO.setDept_userid("P_FAIL");
			}
		}
		
		return memVO;
	}
	
	
	
	
	
//	@Autowired
//	@Qualifier("passwordEncoder")
//	private final PasswordEncoder passwordEncoder;
//	
//	@Autowired
//	// 회원의 권한(ROLE) 정보 CRUD 구현
//	private final AuthorityDao authDao;
//	
//	/*
//	 * Controller에서 회원정보를 전달받아서
//	 * 비밀번호를 암호화하고 userDao에 보내서 저장하기
//	 * 
//	 * 사용자의 ROLE정보를 생성하여 AuthorityVO에 담고 저장하기
//	 */
//	@Transactional
//	public int insert(UserDetailsVO userVO) {
//		String password = userVO.getPassword();
//		String encPassword = passwordEncoder.encode(password);
//		
//		log.debug("password {}, encPassword{}", password, encPassword);
//		
//		// 사용자의 구너한정보를 설정하기 위해서 authList 객체 선언
//		List<AuthorityVO> authList = new ArrayList<AuthorityVO>();
//		
//		/*
//		 * 회원 테이블에 값이 없을 때 회원가입이 이루어지면
//		 * 그 회원은 admin 권한을 갖고
//		 * enabled 칼럼을 1로 세팅하여 즉시 로그인이 가능하도록
//		 * 자바에서 true로 값을 설정하면 오라클에서는 1로 저장
//		 * 
//		 * 두번째 가입되는 회원은
//		 * enabled 칼럼을 0으로 세팅하여 즉시 로그인이 불가능하도록 설정
//		 * 자바에서 false로 값을 설정하면 오라클에서는 0으로 저장
//		 * 
//		 * mysql에서는 true와 false 그대로 저장된다.
//		 */
//		int nCount = userDao.userCount();
//		
//		// 1. 회원가입한 모든 사용자에게 기본값으로 ROLL_USER 권한을 부여하고
//		AuthorityVO authVO = AuthorityVO.builder()
//				.username(userVO.getUsername())
//				.authority("ROLE_USER")
//				.build();
//		
//		authList.add(authVO);
//		
//		if(nCount > 0) {
//			userVO.setEnabled(false); // 0으로 세팅
//		}else {
//			userVO.setEnabled(true); // 1로 세팅
//			
//			// 2. 최초에 저장되는 회원은 ROLL_ADMIN 권한을 추가 부여하여
//			// 다른 사용자의 정보를 확인, 수정할 수 있도록 하고
//			// 관리자 페이지를 볼 수 있도록 하자.
//			authVO = AuthorityVO.builder()
//					.username(userVO.getUsername())
//					.authority("ROLE_ADMIN")
//					.build();
//
//			authList.add(authVO);
//		}
//		
//		// List에 담겨 있는 값을 DB에 insert를 할 때
//		// 가장 쉽게 할 수 있는 방법이 List를 for 반복문으로 감싸고
//		// vo 한개씩을 insert 에 보내는 방법 (촌스러운 방법: jdbc -> oracle 열었다 닫았다 반복)
////		for(AuthorityVO vo : authList) {
////			authDao.insert(vo);
////		}
//		
//		authDao.insertAll(authList);
//		
//		// 평문으로 입력된 비밀번호를 암호화된 비밀번호로 대치
//		userVO.setPassword(encPassword);
//		
//		// userDao의 insert가 수행되기 전에 authDao.insert가 수행되서 insert 될 것이고
//		// userDao insert에 문법오류가 나도록 했기 때문에
//		// sql 실행이 중단될 것 이다.
//		// authDao에는 insert가 되고 userDao는 insert가 안되는 상황이 되었다.
//
//		// 이 상황에서 정상적으로 Transaction이 작동된다면
//		// authDao에 insert가 취소되어야 한다.
//		
//		userDao.insert(userVO);
//		
//		return 0;
//	}
//	
//	public String userNameAndPassword(String username, String password) {
//		UserDetailsVO userVO = userDao.findById(username);
//		
//		// passwordEncoder를 사용하여 암호화한 비밀번호는 일방향 비밀번호인 까닭에
//		// decoder가 존재하지 않는다.
//		// 사용자가 입력한 비밀번호와 DB에 저장된 비밀번호를 
//		// passwordEncoder.matches() method에 매개 변수로 전달하면
//		// 비밀번호가 일치하는지 확인하여 true,false를 리턴한다.
//	
//		// 결과값에 따라 3항연산자를 사용하여 OK 또는 FAIL 문자열을 Controller로 return
//		return passwordEncoder.matches(password, userVO.getPassword()) ? "OK" : "FAIL";
//	}
}
