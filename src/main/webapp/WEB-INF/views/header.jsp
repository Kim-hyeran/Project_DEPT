<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<script>
	$(function () {
		$("h2#main_title").click(function () {
			document.location.href = "${rootPath}/comsc"
		})
	})
</script>
<style>
	div#header {
		width: 50%;
		margin: 0 auto;
		display: flex;
	}
	
	h2#main_title {
	  font-size: 2rem;
	  margin: 10px 0;
	  padding-top: 30px;
	}
	
	.fa-pen-nib {
	  font-size: 1.8rem;
	  margin-right: 10px;
	  color: #4a148c;
	}
	
	div#login-out {
	  width: fit-content;
	  margin-left: auto;
	  font-size: 0.9rem;
	}
	
	div#login-out button {
	  width: 65px;
	  height: 30px;
	  margin-top: 10px;
	  background-color: #4a148c;
	  color: white;
	  border: 1px solid #4a148c;
	  border-radius: 24px;
	  outline: none;
	  transition: 0.5s ease;
	}
	
	div#login-out button:hover {
	  background-color: white;
	  border: 1px solid #4a148c;
	  color: #4a148c;
	}
</style>
<div id="header">
	<h2 id="main_title"><i class="fas fa-pen-nib"></i>언어·문학</h2>
	<div id="login-out">
		<button id="login">로그인</button>
	    <button id="logout">로그아웃</button>
	</div>
</div>