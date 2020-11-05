<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/detail.css?ver=2020-10-20-001" />
<script>
	$(function () {
	    $("#back_to_list").click(function () {
	        document.location.href = "${rootPath}/comsc/free"
	    })
	    
	    $("#modify").click(function () {
	        document.location.href = "${rootPath}/comsc/free/update/${FREE_VO.cs_free_seq}"
	    })
	})
	
	document.addEventListener("DOMContentLoaded", function () {
		let trash = document.querySelector("#delete")
		trash.addEventListener("click", function () {
			if(confirm("삭제할까요?")) {
				document.location.href="${rootPath}/comsc/free/delete/${FREE_VO.cs_free_seq}"
				return false
			}
		})
	})
</script>
<style>
	a {
		text-decoration: none;
		color: inherit;
	}
</style>
<div class="bbs_area">
  <div class="bbs_title_area">
    <div class="bbs_title">
      <strong>${FREE_VO.cs_free_title}</strong>
    </div>
    <div class="bbs_info">
      <div class="nickname">${FREE_VO.cs_free_writer}</div>
      <div class="comment_date">${FREE_VO.cs_free_date} | ${FREE_VO.cs_free_time}</div>
      <div class="mem_func">
        <div id="modify">수정</div>
        <div id="delete">삭제</div>
        <div id="scrap">스크랩</div>
      </div>
    </div>
  </div>
  <hr />
  <div class="bbs_text_area">
	<img src="${rootPath}/files/${FREE_VO.cs_free_image}" height="50%">
    ${FREE_VO.cs_free_text}
  </div>
  <div class="bbs_button_area">
    <div class="noti_reco">
      <div id="notify"><i class="fas fa-exclamation-circle"></i>신고</div>
      <div id="recommend"><i class="fas fa-heart"></i>추천 (83)</div>
      <div id="back_to_list"><button>목록</button></div>
    </div>
  </div>
  <hr />
  <div class="bbs_comment_area">
    <div class="input_area">
      <input class="comment_input" placeholder="댓글을 입력하세요" />
      <button id="submit">등록</button>
    </div>
    <ul>
      <li>
        <div class="profile_img"></div>
        <div class="comment_post">
          <div class="profile_info">
            <div class="nickname">댓글</div>
            <div class="comment_date">20-08-01</div>
            <div class="reply_button">
              <div id="modify">수정</div>
              <div id="delete">삭제</div>
            </div>
          </div>
          <div class="comment_text">테스트입니다</div>
        </div>
      </li>
      <li>
        <div class="profile_img"></div>
        <div class="comment_post">
          <div class="profile_info">
            <div class="nickname">안녕하세요</div>
            <div class="comment_date">20-10-05</div>
            <div class="reply_button">
              <div id="modify">수정</div>
              <div id="delete">삭제</div>
            </div>
          </div>
          <div class="comment_text">댓글입니다</div>
        </div>
      </li>
    </ul>
  </div>
</div>