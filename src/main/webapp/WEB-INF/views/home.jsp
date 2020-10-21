<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title>DEPT</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/home.css?ver=2020-10-20-001" />
<script src="https://kit.fontawesome.com/c2f525edad.js" crossorigin="anonymous"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="${rootPath}/static/javascript/sidebar.js?ver=2020-10-20-001"></script>
<script>
	var rootPath = "${rootPath}"
	var csrf_header = "${_csrf.headerName}"
	var csrf_token = "${_csrf.token}"
</script>
</head>

<input type="checkbox" id="check" />
<label for="check">
  <i class="fas fa-bars" id="btn"></i>
  <i class="fas fa-times" id="cancel"></i>
</label>
<div class="sidebar">
  <header>
    <span id="site_title">DEPT</span>
  </header>
  <ul>
    <li id="hot_board"><i class="fas fa-fire-alt"></i>인기글</li>
    <li id="free_board"><i class="fas fa-stream"></i>자유게시판</li>
    <li id="info_board"><i class="fas fa-info-circle"></i>정보게시판</li>
    <li id="book_board"><i class="fas fa-book"></i>책방</li>
    <li id="notice"><i class="fas fa-bullhorn"></i>공지사항</li>
    <li id="mypage"><i class="fas fa-user"></i>마이페이지</li>
  </ul>
</div>
<body>
  <div>
  		<%@ include file="/WEB-INF/views/header.jsp" %>
		<section>
			<c:choose>
				<c:when test="${BODY == 'FREE_BOARD'}">
					<%@ include file="/WEB-INF/views/board/free.jsp"%>
				</c:when>
				<c:when test="${BODY == 'FREE_WRITE'}">
					<%@ include file="/WEB-INF/views/board/free-write.jsp"%>
				</c:when>
				<c:when test="${BODY == 'FREE_DETAIL'}">
					<%@ include file="/WEB-INF/views/board/detail.jsp"%>
				</c:when>
				<c:when test="${BODY == 'INFO_BOARD'}">
					<%@ include file="/WEB-INF/views/board/info.jsp"%>
				</c:when>
				<c:when test="${BODY == 'INFO_WRITE'}">
					<%@ include file="/WEB-INF/views/board/info-write.jsp"%>
				</c:when>
				<c:when test="${BODY == 'NOTI_BOARD'}">
					<%@ include file="/WEB-INF/views/board/notice.jsp"%>
				</c:when>
				<c:otherwise>
					<%@ include file="/WEB-INF/views/board/main.jsp"%>
				</c:otherwise>
			</c:choose>
		</section>
	</div>
</body>

</html>