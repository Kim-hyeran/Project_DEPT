<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/detail.css?ver=2020-10-20-001" />
<script>
	$(function () {
	    $("div#back_to_list").click(function () {
	        document.location.href = "${rootPath}/comsc/free"
	    })
	})
</script>
<div class="bbs_area">
  <div class="bbs_title_area">
    <div class="bbs_title">
      <strong>명왕성에서 온 이메일</strong>
    </div>
    <div class="bbs_info">
      <div class="nickname">장이지</div>
      <div class="comment_date">2020-08-01 | 08:01</div>
      <div class="mem_func">
        <div id="modify"><a href="${rootPath}/comsc/f">수정</a></div>
        <div id="delete">삭제</div>
        <div id="scrap">스크랩</div>
      </div>
    </div>
  </div>
  <hr />
  <div class="bbs_text_area">
    (전략)
    <br/><br/>
    네가 쓰려다 지운 메일들이<br/>
	오로라를 타고 이곳 하늘을 지나가<br/>
	누군가 열없이 너에게 고백하던 날이 지나가<br/>
	너의 포옹이 지나가
	<br/><br/>
	겁이 난다는 너의 말이 지나가<br/>
	너의 사진이 지나가
	<br/><br/>
	너는 파티용 동물 모자를 쓰고 눈물을 씻고 있더라<br/>
	눈 밑이 검어져서는 야윈 그늘로 웃고 있더라
    <br/><br/>
    네 웃음에 나는 부레를 잃은 인어처럼 숨 막혀<br/>
    이제 네가 누군지 알겠어
    <br/><br/>
    있잖아, 잘있어?
    <br/><br/>
    네가 쓰다 지운 울음 자국들이 오로라로 빛나는,
    <br/><br/>
    바보야, 여기는 잊혀진 별 명왕성이야
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
              <div id="delete"">삭제</div>
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