<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/list.css?ver=2020-10-15-001" />
<script>
	$(function () {
	    $("div.write_btn").click(function () {
	        document.location.href = "${rootPath}/write"
	    })
	})
</script>
<div class="board_list_wrap">
    <h2 id="board_title">공지사항</h2>
    <table class="board_list">
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>글쓴이</th>
                <th>작성일</th>
                <th>조회수</th>
            </tr>
        </thead>
        <tbody>
            <c:choose>
			<c:when test="${empty NOTI_LIST}">
				<tr>
					<td colspan="5">데이터가 존재하지 않습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${NOTI_LIST}" var="NOTI_VO" varStatus="i">
			        <tr id="tr_body">
			            <td>${i.count}</td>
			            <td class="board_title" data-seq="${NOTI_VO.cs_noti_seq}">${NOTI_VO.cs_noti_title}</td>
			            <td>${NOTI_VO.cs_noti_writer}</td>
			            <td>${NOTI_VO.cs_noti_date}</td>
			            <td>${NOTI_VO.cs_noti_count}</td>
			            <td></td>
			        </tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
        </tbody>
    </table>
    <div class="footer_contents">
        <div class="search_box">
            <input id="search_txt" placeholder="검색어를 입력하세요" />
            <a class="search_btn"><i class="fas fa-search"></i></a>
        </div>
        <div class="write_btn">
            <button>글쓰기</button>
        </div>
    </div>
    <div class="paging">
        <a href="#"><i class="fas fa-angle-left"></i></a>
        <a href="#"><b>1</b></a>
        <a href="#">2</a>
        <a href="#">3</a>
        <a href="#">4</a>
        <a href="#">5</a>
        <a href="#"><i class="fas fa-angle-right"></i></a>
    </div>
</div>