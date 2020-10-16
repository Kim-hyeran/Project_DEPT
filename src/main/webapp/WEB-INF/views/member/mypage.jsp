<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
    <link rel="stylesheet" type="text/css" href="../styles/mypage.css" />
    <script
      src="https://kit.fontawesome.com/c2f525edad.js"
      crossorigin="anonymous"
    ></script>
    <header>
      <h1>마이페이지</h1>
    </header>
    <section id="main_content">
      <section id="top_content">
        <aside id="top_content_left">
          <img
            src="../images/img_01.jpg"
            alt="프로필이미지"
            style="width: 240px; height: 240px"
          />
        </aside>
        <aside id="top_content_right">
          <table>
            <tr>
              <th>아이디(이메일)</th>
              <td>안녕하세요 뚱이에오</td>
            </tr>
            <tr>
              <th>닉네임</th>
              <td>사랑해요~</td>
            </tr>
            <tr>
              <th>학교/학과</th>
              <td>전남대/소프트웨어공학</td>
            </tr>
          </table>
          <button id="btn_modify">프로필 수정하기</button>
        </aside>
      </section>
      <section id="bottom_content">
        <nav id="menu">
          <button class="btn_menu">내가 쓴 글</button>
          <button class="btn_menu">스크랩</button>
          <button class="btn_menu">책방이용현황</button>
          <button class="btn_menu">탈퇴하기</button>
        </nav>
        <aside id="bottom_content_in">
          <table id="write_table">
            <tr>
              <th>제목</th>
              <th>날짜</th>
            </tr>
            <tr>
              <td>이 문제 아는 사람ㅜㅜ</td>
              <td>2020.10.12</td>
            </tr>
            <tr>
              <td>다들 전필과목 뭐 있어?</td>
              <td>2020.7.18</td>
            </tr>
            <tr>
              <td>그러쿠나</td>
              <td>2020.4.8</td>
            </tr>
            <tr>
              <td>알겠써</td>
              <td>2020.3.14</td>
            </tr>
            <tr>
              <td>개강이다...</td>
              <td>2020.3.2</td>
            </tr>
            <tr>
              <td>으아아ㅏ아아아아</td>
              <td>2020.3.1</td>
            </tr>
            <tr>
              <td>타닥타닥 모닥불이 타닥타닥타닥</td>
              <td>2020.2.22</td>
            </tr>
            <tr>
              <td>으으으으음으으으으으으으으으으으으음</td>
              <td>2020.1.17</td>
            </tr>
            <tr>
              <td>안녕하세요 반가워요 또만나요</td>
              <td>2020.1.10</td>
            </tr>
          </table>
          <div class="paging">
            <a href="#"><i class="fas fa-angle-left"></i></a>
            <a href="#"><b>1</b></a>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#"><i class="fas fa-angle-right"></i></a>
          </div>
        </aside>
      </section>
    </section>