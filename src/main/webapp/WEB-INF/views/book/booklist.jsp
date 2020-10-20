<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/booklist.css">
<header>
  <h2>책방</h2>
  <button onclick="window.location.href='bookpage-form.html'"><b>책 판매하기</b></button>
</header>
<section id="container">
  <div class="card_line">
    <article class="card_left" id="card1" onclick="window.location.href='bookpage-contents.html'">
      
      <div class="thumbnail">
        <img src="../images/book-1.jpg" width="100%" alt="책">
      </div>
      <div class="card_info">
        <table class="info_table">
         
            <tr>
              <td class="title">책제목</td>
              <td class="title_content">반응형 웹 만들기</td>
            </tr>
            <tr>
              <td class="author">저자</td>
              <td class="author_content">김운아</td>
            </tr>
            <tr>
              <td class="price">가격</td>
              <td class="price_content">13000</td>
            </tr>
            <tr>
              <td class="cover">표지</td>
              <td class="cover_content">낙서</td>
            </tr>
            <tr>
              <td class="bookpaper">내지</td>
              <td class="bookpaper_content">변색</td>
            </tr>
            <tr>
              <td class="deal">거래방법</td>
              <td class="deal_content">선불택배</td>
            </tr>
            <tr>
              <td class="first_line" colspan="2">거의 새것과 같아요~</td>
            </tr>
          
          </table>
       
      </div>
    </article>
  <article class="card_right" id="card2">
    <div class="thumbnail">
      <img src="../images/book-2.jpg" width="100%" alt="책">
      </div>
      <div class="card_info">
        <table class="info_table">
         
          <tr>
            <td class="title">책제목</td>
            <td class="title_content">스프링 웹 프로젝트</td>
          </tr>
          <tr>
            <td class="author">저자</td>
            <td class="author_content">구멍가게코딩단</td>
          </tr>
          <tr>
            <td class="price">가격</td>
            <td class="price_content">25000</td>
          </tr>
          <tr>
            <td class="cover">표지</td>
            <td class="cover_content">찢겨짐</td>
          </tr>
          <tr>
            <td class="bookpaper">내지</td>
            <td class="bookpaper_content">변색</td>
          </tr>
          <tr>
            <td class="deal">거래방법</td>
            <td class="deal_content">착불택배</td>
          </tr>
          <tr>
            <td class="first_line" colspan="2">상태 최상입니다 </td>
          </tr>
        
        </table>
      </div>
    </article>
  </div>
    <div class="card_line">
    <article class="card_left" id="card3">
      <div class="thumbnail">
        <img src="../images/book-3.jpg" width="100%" alt="책">
      </div>
      <div class="card_info">
        <table class="info_table">
         
          <tr>
            <td class="title">책제목</td>
            <td class="title_content">HTML5+CSS3 웹표준의...</td>
          </tr>
          <tr>
            <td class="author">저자</td>
            <td class="author_content">고경희</td>
          </tr>
          <tr>
            <td class="price">가격</td>
            <td class="price_content">22000</td>
          </tr>
          <tr>
            <td class="cover">표지</td>
            <td class="cover_content">손상없음</td>
          </tr>
          <tr>
            <td class="bookpaper">내지</td>
            <td class="bookpaper_content">손상없음</td>
          </tr>
          <tr>
            <td class="deal">거래방법</td>
            <td class="deal_content">직거래</td>
          </tr>
          <tr>
            <td class="first_line" colspan="2">광주역앞에서 직거래합니다</td>
          </tr>
        
        </table>
      </div>
    </article>
  <article class="card_right" id="card4">
    <div class="thumbnail">
      <img src="../images/book-4.jpg" width="100%" alt="책">
      </div>
      <div class="card_info">
        <table class="info_table">
         
          <tr>
            <td class="title">책제목</td>
            <td class="title_content">자바 프로그래밍 입문</td>
          </tr>
          <tr>
            <td class="author">저자</td>
            <td class="author_content">박은종</td>
          </tr>
          <tr>
            <td class="price">가격</td>
            <td class="price_content">22500</td>
          </tr>
          <tr>
            <td class="cover">표지</td>
            <td class="cover_content">낙서</td>
          </tr>
          <tr>
            <td class="bookpaper">내지</td>
            <td class="bookpaper_content">낙서</td>
          </tr>
          <tr>
            <td class="deal">거래방법</td>
            <td class="deal_content">직거래</td>
          </tr>
          <tr>
            <td class="first_line" colspan="2">표지에이름 책초반에밑줄있습니다 </td>
          </tr>
        
        </table>
      </div>
    </article>
  </div>
    <div class="card_line">
    <article class="card_left" id="card5">
      <div class="thumbnail">
        <img src="../images/book-5.jpg" width="100%" alt="책">
      </div>
      <div class="card_info">
        <table class="info_table">
         
          <tr>
            <td class="title">책제목</td>
            <td class="title_content">Practical 모던 자바</td>
          </tr>
          <tr>
            <td class="author">저자</td>
            <td class="author_content">장윤기</td>
          </tr>
          <tr>
            <td class="price">가격</td>
            <td class="price_content">30500</td>
          </tr>
          <tr>
            <td class="cover">표지</td>
            <td class="cover_content">낙서</td>
          </tr>
          <tr>
            <td class="bookpaper">내지</td>
            <td class="bookpaper_content">손상없음</td>
          </tr>
          <tr>
            <td class="deal">거래방법</td>
            <td class="deal_content">선불택배</td>
          </tr>
          <tr>
            <td class="first_line" colspan="2">이름만쓰고 안썼습니다</td>
          </tr>
        
        </table>
      </div>
    </article>
  <article class="card_right" id="card6">
    <div class="thumbnail">
      <img src="../images/book-6.jpg" width="100%" alt="책">
      </div>
      <div class="card_info">
        <table class="info_table">
         
          <tr>
            <td class="title">책제목</td>
            <td class="title_content">커리어 스킬</td>
          </tr>
          <tr>
            <td class="author">저자</td>
            <td class="author_content">존 손메즈</td>
          </tr>
          <tr>
            <td class="price">가격</td>
            <td class="price_content">25000</td>
          </tr>
          <tr>
            <td class="cover">표지</td>
            <td class="cover_content">찢겨짐</td>
          </tr>
          <tr>
            <td class="bookpaper">내지</td>
            <td class="bookpaper_content">접힘</td>
          </tr>
          <tr>
            <td class="deal">거래방법</td>
            <td class="deal_content">선불택배</td>
          </tr>
          <tr>
            <td class="first_line" colspan="2">할인가능합니다</td>
          </tr>
        
        </table>
      </div>
    </article>
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

</section>
