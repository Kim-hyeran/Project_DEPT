<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="" %>
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
	
	div.bbs_comment_area p {
		color: #666;
		text-align: center;
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
  	<c:if test="${not empty FREE_VO.cs_free_image}">
		<img src="${rootPath}/files/${FREE_VO.cs_free_image}" width="70%">
  	</c:if>
    ${FREE_VO.cs_free_text}
  </div>
  <div class="bbs_button_area">
    <div class="noti_reco">
      <div id="notify"><i class="fas fa-exclamation-circle"></i>신고</div>
      <div id="recommend"><i class="fas fa-heart"></i>추천 (0)</div>
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
	<c:choose>
		<c:when test="${empty REPLY_LIST}">
			<p>댓글이 작성되지 않았습니다.</p>
		</c:when>
		<c:otherwise>
			<c:forEach items="${REPLY_LIST}" var="REPLY_VO">
				<li>
					<div class="comment_post">
						<div class="profile_info">
							<div class="nickname">${REPLY_VO.cs_rp_writer}</div>
							<div class="comment_date">${REPLY_VO.cs_rp_date}</div>
							<div class="reply_button">
								<div id="modify">수정</div>
								<div id="delete">삭제</div>
							</div>
						</div>
						<div class="comment_text">${REPLY_VO.cs_rp_text}</div>
					</div>
				</li>
			</c:forEach>
		</c:otherwise>
	</c:choose>
   </ul>
  </div>
</div>