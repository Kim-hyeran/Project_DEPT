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
	  margin: 50px 0 20px 0;
	  cursor: pointer;
	}
	
	i#dept_icon {
	  font-size: 1.8rem;
	  margin-right: 10px;
	  color: #4a148c;
	}
	
	div#logout {
	  width: fit-content;
	  margin-left: auto;
	  font-size: 0.9rem;
	}
	
	div#logout button {
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
	
	div#logout button:hover {
	  background-color: white;
	  border: 1px solid #4a148c;
	  color: #4a148c;
	}
	
	@media (max-width: 980px) {
	    div#header {
	      width: 90%;
	    }
  	}
</style>
<div id="header">
	<h2 id="main_title"><i id="dept_icon" class="fas fa-power-off"></i>컴퓨터·통신</h2>
	<div id="logout">
	    <button id="btn_logout">로그아웃</button>
	</div>
</div>