<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/detail.css?ver=2020-10-20-001" />
<script>
	$(function () {
	    $("div#back_to_list").click(function () {
	        document.location.href = "${rootPath}/notice"
	    })
	    
	    $("div#modify").click(function () {
	        document.location.href = "${rootPath}/notice/update/${NOTI_VO.cs_noti_seq}"
	    })
	})
	
	document.addEventListener("DOMContentLoaded", function () {
		let trash = document.querySelector("#delete")
		trash.addEventListener("click", function () {
			if(confirm("삭제할까요?")) {
				document.location.href="${rootPath}/notice/delete/${NOTI_VO.cs_noti_seq}"
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
	
	div.bbs_comment_area p {
		color: #666;
		text-align: center;
	}
</style>
<div class="bbs_area">
  <div class="bbs_title_area">
    <div class="bbs_title">
      <strong>${NOTI_VO.cs_noti_title}</strong>
    </div>
    <div class="bbs_info">
      <div class="nickname">${NOTI_VO.cs_noti_writer}</div>
      <div class="comment_date">${NOTI_VO.cs_noti_date} | ${NOTI_VO.cs_noti_time}</div>
      <div class="mem_func">
        <div id="modify">수정</div>
        <div id="delete">삭제</div>
        <div id="scrap">스크랩</div>
      </div>
    </div>
  </div>
  <hr />
  <div class="bbs_text_area">
    ${NOTI_VO.cs_noti_text}
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
    <p>댓글을 사용할 수 없습니다.</p>
  </div>
</div>