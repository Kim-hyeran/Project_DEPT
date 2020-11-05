<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/main.css?ver=2020-11-03-001" />
<style>
	a {
		text-decoration: none;
		color: inherit;
	}
</style>
<div id="container">
  <div id="free_board_m">
    <h4>자유게시판</h4>
    <c:choose>
		<c:when test="${empty FREE_LIST}">
			<p>데이터가 존재하지 않습니다.</p>
		</c:when>
		<c:otherwise>
		    <c:forEach items="${FREE_LIST}" var="FREE_VO" begin="0" end="15">
		    	<p><a href="${rootPath}/comsc/free/${FREE_VO.cs_free_seq}">${FREE_VO.cs_free_title}</a></p>
		    </c:forEach>
		</c:otherwise>
	</c:choose>
  </div>
  <div id="board_right">
	  <div id="hot_board_m">
	    <h4>인기글</h4>
	    <p>명왕성에서 온 이메일</p>
	    <p>Morgens und abends zu lesen</p>
	    <p>인터넷 강의 보다 저렴하게 이용하는 법</p>
	  </div>
	  <div id="info_board_m">
	    <h4>정보게시판</h4>
			<c:choose>
				<c:when test="${empty INFO_LIST}">
					<p>데이터가 존재하지 않습니다.</p>
				</c:when>
				<c:otherwise>
					<c:forEach items="${INFO_LIST}" var="INFO_VO" begin="0" end="4">
						<p>
							<a href="${rootPath}/comsc/info/${INFO_VO.cs_info_seq}">${INFO_VO.cs_info_title}</a>
						</p>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</div>
	  <div id="book_board_m">
	    <h4>책방</h4>
	    <p>반응형 웹 만들기</p>
	    <p>스프링 웹 프로젝트</p>
	    <p>HTML5+CSS3 웹표준의 정석</p>
	  </div>  
  </div>
</div>