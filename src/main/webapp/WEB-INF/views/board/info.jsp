<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/free.css?ver=2020-10-15-001" />
 <div class="board_list_wrap">
   <h2 id="board_title">정보게시판</h2>
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
         <td>3</td>
         <td class="board_title">KBS 한국어 능력 시험 일정입니다
         </td>
         <td>알림봇</td>
         <td>20-10-01</td>
         <td>56</td>
       </tr>
       <tr>
         <td>2</td>
         <td class="board_title"><a href="#">인문학시험을 아시나요?</a></td>
         <td>모르는데요</td>
         <td>20-09-12</td>
         <td>5</td>
       </tr>
       <tr>
         <td>1</td>
         <td class="board_title"><a href="#">인터넷 강의 보다 저렴하게 이용하는 법</a></td>
         <td>사기꾼</td>
         <td>20-09-20</td>
         <td>50</td>
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