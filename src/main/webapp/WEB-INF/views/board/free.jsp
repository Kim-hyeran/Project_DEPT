<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/free.css?ver=2020-10-15-001" />
<script>
	$(function () {
	    $("div.write_btn").click(function () {
	        document.location.href = "${rootPath}/comsc/free/write"
	    })
	})
</script>
<div class="board_list_wrap">
  <h2 id="board_title">자유게시판</h2>
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
        <td>9</td>
        <td class="board_title">명왕성에서 온 이메일</td>
        <td>장이지</td>
        <td>20-10-06</td>
        <td>83</td>
      </tr>
      <tr>
        <td>8</td>
        <td class="board_title"><a href="#">즐거운 편지</a></td>
        <td>황동규</td>
        <td>20-08-27</td>
        <td>6</td>
      </tr>
      <tr>
        <td>7</td>
        <td class="board_title">
          <a href="#">The Cloths of Heaven</a>
        </td>
        <td>William Butler Yeats</td>
        <td>20-08-03</td>
        <td>10</td>
      </tr>
      <tr>
        <td>6</td>
        <td class="board_title"><a href="#">꽃이 진다고 그대를 잊은 적 없다</a></td>
        <td>정호승</td>
        <td>20-07-30</td>
        <td>1</td>
      </tr>
      <tr>
        <td>5</td>
        <td class="board_title"><a href="#">나의 자랑 이랑</a></td>
        <td>김승일</td>
        <td>20-07-18</td>
        <td>29</td>
      </tr>
      <tr>
        <td>4</td>
        <td class="board_title"><a href="#">Bright Star</a></td>
        <td>John Keats</td>
        <td>20-06-23</td>
        <td>23</td>
      </tr>
      <tr>
        <td>3</td>
        <td class="board_title"><a href="#">눈사람 자살사건</a></td>
        <td>최승호</td>
        <td>20-06-07</td>
        <td>11</td>
      </tr>
      <tr>
        <td>2</td>
        <td class="board_title"><a href="#">다람다람 다람쥐</a></td>
        <td>박목월</td>
        <td>20-05-25</td>
        <td>5</td>
      </tr>
      <tr>
        <td>1</td>
        <td class="board_title"><a href="#">Morgens und abends zu lesen</a></td>
        <td>Bertolt Brecht</td>
        <td>20-04-08</td>
        <td>66</td>
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