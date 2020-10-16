<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
    <script
      type="text/javascript"
      src="https://code.jquery.com/jquery-3.2.0.min.js"
    ></script>
    <link rel="stylesheet" type="text/css" href="../styles/signup.css" />
    <script>
      $(function () {
        $("#create_account").click(function () {
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
          } else if (re_password === "") {
            $("div#msg_username").css("display", "none");
            $("div#msg_password").css("display", "none");
            $("div#msg_re_password").css("display", "block");
            $("div#msg_re_password span").css("color", "red");
            $("div#msg_re_password span").text("비밀번호 확인이 필요합니다");
            $("#re_password").focus();

            return false;
          } else if (password !== re_password) {
            $("div#msg_username").css("display", "none");
            $("div#msg_re_password").css("display", "none");
            $("div#msg_password").css("display", "block");
            $("div#msg_password span").text("비밀번호가 일치하지 않습니다");
            $("#password").val("");
            $("#re_password").val("");
            $("#password").focus();

            return false;
          } else {
            // $("form").submit();
            $(location).attr("href", "login.html");
            // location.href='login.html';
          }
        });
      });
    </script>
    <form class="box" action="signUp.html" method="POST">
      <img src="../images/dept_logo.png" alt="dept_logo" />
      <div id="input_box">
        <h3>signup</h3>
        <div>
          <label>이메일(아이디)</label>
          <input
            type="text"
            name=""
            id="username"
            placeholder="userID(email)"
          />
        </div>
        <div id="msg_username">
          <label></label>
          <span></span>
        </div>
        <div>
          <label>비밀번호</label>
          <input type="password" name="" id="password" placeholder="password" />
        </div>
        <div id="msg_password">
          <label></label>
          <span></span>
        </div>
        <div>
          <label>비밀번호 재확인</label>
          <input
            type="password"
            name=""
            id="re_password"
            placeholder="check your password"
          />
        </div>
        <div id="msg_re_password">
          <label></label>
          <span></span>
        </div>
        <div>
          <label>학교/학과</label>
          <input
            type="text"
            name=""
            id="dept_input"
            placeholder="학교/학과"
            readonly
          />
          <button id="dept_search">검색</button>
        </div>
        <div>
          <button id="create_account">Create an Account</button>
        </div>
      </div>
    </form>