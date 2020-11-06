<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.2.0.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${rootPath}/static/css/login.css" />
<script>
	$(function() {
		$("#login").click(function() {
			let username = $("#username").val();
			let password = $("#password").val();
			let re_password = $("#re_password").val();

			if (username === "") {
				$("div#msg_username").css("display", "block");
				$("div#msg_username span").css("color", "red");
				$("div#msg_username span").text("ID를 입력해주세요");
				$("#username").focus();

				return false;
			} else if (password === "") {
				$("div#msg_username").css("display", "none");
				$("div#msg_password").css("display", "block");
				$("div#msg_password span").css("color", "red");
				$("div#msg_password span").text("비밀번호를 입력해주세요");
				$("#password").focus();

				return false;
			} else {
				$(location).attr("href", "${rootPath}/comsc");
			}

			// $("form").submit();
		});
	});
</script>
<form class="box" action="${rootPath}/login" method="POST" modelAttribute="LOGIN_VO">
	<img src="${rootPath}/static/images/dept_logo.png" alt="dept_logo" />
	<h3>Login</h3>
	
	<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
		<h4 id="login-fail">${SPRING_SECURITY_LAST_EXCEPTION.message}</h4>
		<c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session" />
	</c:if>
	
	<input type="text" name="" id="username" placeholder="userID(email)" />
	<div id="msg_username">
		<label></label> <span></span>
	</div>
	
	<input type="password" name="" id="password" placeholder="password" />
	<div id="msg_password">
		<label></label> <span></span>
	</div>
	
	<input type="button" name="" id="login" value="Login" /> <input
		type="button" name="" value="Create an Account"
		onClick="location.href='signup';" /> 
	
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

</form>