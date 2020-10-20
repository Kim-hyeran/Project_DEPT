<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/book-detail.css">
<div class="bbs_area">
  <div class="bbs_title_area">
    <div class="bbs_title">
      <strong>반응형 웹 만들기</strong> <strong>(판매중)</strong>
    </div>
    <div class="bbs_info">
      <div class="nickname">전대조대</div>
      <div class="comment_date">2020-10-12 | 10:01</div>
      <div class="mem_func">
        <div id="modify">수정</div>
        <div id="delete" onClick="alert('삭제할까요?')">삭제</div>
        <div id="scrap" onClick="alert('스크랩 되었습니다')">스크랩</div>
      </div>
    </div>
  </div>
  <hr />
  <div class="bbs_text_area">
    <article id="check">
      <section id="information">
        <table id="info_table">
         
          <tr>
            <td id="title">책제목</td>
            <td id="title_content">반응형 웹 만들기</td>
          </tr>
          <tr>
            <td id="author">저자</td>
            <td id="author_content">김운아</td>
          </tr>
          <tr>
            <td id="price">가격</td>
            <td id="price_content">13000</td>
          </tr>
          <tr>
            <td id="cover">표지</td>
            <td id="cover_content">낙서</td>
          </tr>
          <tr>
            <td id="bookpaper">내지</td>
            <td id="bookpaper_content">변색</td>
          </tr>
          <tr>
            <td id="deal">거래방법</td>
            <td id="deal_content">선불택배</td>
          </tr>
        
        </table>
      </section>
    </article>
    <img src="../images/book-1.jpg" width="300px" alt="책">
    <br/>
    표지에 이름 써있고<br/>
    안에 커피컵 자국이 살짝 있습니다.<br/>
    읽는용도로만 사용해서 다른 표시나 낙서는 없습니다<br/>
    택배비 선불로 3000원 받아서<br/>
    15000원 입금해주시면 됩니다.<br/>
    입금 확인 후 즉시 집앞 편의점에서 발송해드리겠습니다 <br/>
    직거래 사절이구요 착불 원하시면 가능합니다 <br/>
    <br/>
  </div>
  <div class="bbs_button_area">
    <div class="noti_reco">
      <div id="notify" onClick="alert('신고할까요?')"><i class="fas fa-exclamation-circle"></i>신고</div>
      <div id="recommend"><i class="fas fa-heart"></i>추천 (5)</div>
      <div id="back_to_list"><button onClick="location.href='../html/boardlist_page.html'">목록</button></div>
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
            <div class="nickname">익명1</div>
            <div class="comment_date">20-10-01</div>
            <div class="reply_button">
              <div id="modify">수정</div>
              <div id="delete" onClick="alert('삭제할까요?')">삭제</div>
            </div>
          </div>
          <div class="comment_text">찍사 없나요</div>
        </div>
      </li>
      <li>
        <div class="profile_img"></div>
        <div class="comment_post">
          <div class="profile_info">
            <div class="nickname">익명2</div>
            <div class="comment_date">20-10-01</div>
            <div class="reply_button">
              <div id="modify">수정</div>
              <div id="delete" onClick="alert('삭제할까요?')">삭제</div>
            </div>
          </div>
          <div class="comment_text">직거래하면 사줍니다</div>
        </div>
      </li>
    </ul>
  </div>
</div>
