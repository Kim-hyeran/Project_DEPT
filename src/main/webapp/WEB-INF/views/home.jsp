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
  <link rel="stylesheet" type="text/css" href="${rootPath}/static/css/home.css?ver=2020-10-15-002" />
  <script src="https://kit.fontawesome.com/c2f525edad.js" crossorigin="anonymous"></script>
</head>

<body>
  <input type="checkbox" id="check" />
  <label for="check">
    <i class="fas fa-bars" id="btn"></i>
    <i class="fas fa-times" id="cancel"></i>
  </label>
  <div class="sidebar">
    <header>
      <span>DEPT</span>
    </header>
    <ul>
      <li><i class="fas fa-fire-alt"></i>인기글</li>
      <li><i class="fas fa-stream"></i>자유게시판</li>
      <li><i class="fas fa-info-circle"></i>정보게시판</li>
      <li><i class="fas fa-book"></i>책방</li>
      <li><i class="fas fa-bullhorn"></i>공지사항</li>
      <li><i class="fas fa-user"></i>마이페이지</li>
    </ul>
  </div>
  <div>
  		<%@ include file="/WEB-INF/views/header.jsp" %>
		<section>
			<c:choose>
				<c:when test="${BODY == 'FREE_BOARD'}">
					<%@ include file="/WEB-INF/views/board/free.jsp"%>
				</c:when>
				<c:when test="${BODY == 'INFO_BOARD'}">
					<%@ include file="/WEB-INF/views/board/info.jsp"%>
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