<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/free.css?ver=2020-10-15-001" />
<script>
	$(function () {
	    $("div.write_btn").click(function () {
	        document.location.href = "${rootPath}/comsc/write"
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
                <th>추천</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>2</td>
                <td class="board_title">검색 기능을 보완하였습니다.</a></td>
                <td>관리자</td>
                <td>20-10-05</td>
                <td>0</td>
            </tr>
            <tr>
                <td>1</td>
                <td class="board_title"><a href="#">DEPT 9월 개선 내용</a></td>
                <td>관리자</td>
                <td>20-09-30</td>
                <td>0</td>
            </tr>
        </tbody>
    </table>
    <div class="footer_contents">
        <div class="search_box">
            <input type="search_txt" placeholder="검색어를 입력하세요" />
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