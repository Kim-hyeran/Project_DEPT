<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/book-form.css">
<header>
   <h2>책방 글쓰기</h2>
   <button>완료</button>
 </header>
 <section>
     <form id="" name="" method="" action="">
       <fieldset>
         <legend>책 정보 입력</legend>
       <table>
         <tr>
           <td class="title">책제목</td>
           <td class="title_content"><input type="text"></td>
         </tr>
         <tr>
           <td class="author">저자</td>
           <td class="author_content"><input type="text"></td>
         </tr>
         <tr>
           <td class="price">가격</td>
           <td class="price_content"><input type="text"></td>
         </tr>
         <tr>
           <td class="cover">표지</td>
           <td>
             <input type="checkbox" name="cover1" value="낙서">낙서
             <input type="checkbox" name="cover2" value="변색">변색
             <input type="checkbox" name="cover3" value="찢겨짐">찢겨짐
             <input type="checkbox" name="cover4" value="접힘">접힘
             <input type="checkbox" name="cover5" value="손상없음">손상없음
           </td>
         </tr>
         <tr>
           <td class="bookpaper">내지</td>
           <td>
             <input type="checkbox" name="bookpaper1" value="낙서">낙서
             <input type="checkbox" name="bookpaper2" value="변색">변색
             <input type="checkbox" name="bookpaper3" value="찢겨짐">찢겨짐
             <input type="checkbox" name="bookpaper4" value="접힘">접힘
             <input type="checkbox" name="bookpaper5" value="손상없음">손상없음
           </td>
         </tr>
         <tr>
           <td class="deal">거래방법</td>
           <td>
             <input type="checkbox" name="deal1" value="선불택배">선불택배
             <input type="checkbox" name="deal2" value="착불택배">착불택배
             <input type="checkbox" name="deal3" value="직거래">직거래
           </td>
         </tr>
         <tr>
           <td class="first_line">한줄설명</td>
           <td class="summary"><input type="text"></td>
         </tr>
       
       </table>
     </fieldset>
     </form>
     
     <form id="contents">
       <fieldset id="content_fieldset">
         <legend>내용</legend>
       <input type="text" name="contents_write">
     </fieldset>
     </form>
 </section>
