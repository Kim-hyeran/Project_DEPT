<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/index.css" />
    <header>
      <div id="btn_box">
        <button id="loginBtn" onClick="location.href='login'">
          로그인
        </button>
        <button id="signUpBtn" onClick="location.href='signup'">
          회원가입
        </button>
      </div>
    </header>
    <div id="div_logo">
      <img src="${rootPath}/static/images/dept_logo.png" alt="dept_logo" id="dept_logo" />
    </div>
    <section id="contents">
      <section class="left_side">
        <div class="slides">
          <input type="radio" name="radio" id="r1" checked />
          <input type="radio" name="radio" id="r2" />
          <input type="radio" name="radio" id="r3" />
          <input type="radio" name="radio" id="r4" />
          <input type="radio" name="radio" id="r5" />

          <div class="slide s1">
            <img src="../images/main_01.png" alt="" />
          </div>
          <div class="slide">
            <img src="../images/img_02.jpg" alt="" />
          </div>
          <div class="slide">
            <img src="../images/img_03.jpg" alt="" />
          </div>
          <div class="slide">
            <img src="../images/img_04.jpg" alt="" />
          </div>
          <div class="slide">
            <img src="../images/img_05.jpg" alt="" />
          </div>
          <div class="navigation">
            <label for="r1" class="bar"></label>
            <label for="r2" class="bar"></label>
            <label for="r3" class="bar"></label>
            <label for="r4" class="bar"></label>
            <label for="r5" class="bar"></label>
          </div>
        </div>
      </section>
      <section class="right_side">
        <div id="best_list">
          <ul>
            <li>
              <section class="list_image">
                <i class="fas fa-comment-dollar"></i>
              </section>
              <section class="list_box">
                <div class="list_title">개강맞이 꿀팁!!</div>
                <div class="list_contents">꼭 학교 서버시간 확인해~!</div>
              </section>
            </li>
            <li>
              <section class="list_image">
                <i class="fas fa-power-off"></i>
              </section>
              <section class="list_box">
                <div class="list_title">개발자 취준하시는 분?!</div>
                <div class="list_contents">웹개발자가 되려면..</div>
              </section>
            </li>
            <li>
              <section class="list_image">
                <i class="fas fa-pen-nib"></i>
              </section>
              <section class="list_box">
                <div class="list_title">다들 개강 언제야?</div>
                <div class="list_contents">우리 학교는 9월 1일이야</div>
              </section>
            </li>
            <li>
              <section class="list_image">
                <i class="fas fa-carrot"></i>
              </section>
              <section class="list_box">
                <div class="list_title">이 문제 답 뭐야??ㅜㅜ</div>
                <div class="list_contents">
                  계속 잡고 있는데 아무리 봐도 모르겠어ㅠㅠㅠ
                </div>
              </section>
            </li>
            <li>
              <section class="list_image">
                <i class="fas fa-crop-alt"></i>
              </section>
              <section class="list_box">
                <div class="list_title">서디페 다녀오신 분</div>
                <div class="list_contents">
                  내일 오후에 갈건데 부스 뭐뭐 있어??
                </div>
              </section>
            </li>
            <li>
              <section class="list_image">
                <i class="fas fa-user-nurse"></i>
              </section>
              <section class="list_box">
                <div class="list_title">비타민 주사 맞으실 분ㅋㅋㅋ</div>
                <div class="list_contents">
                  2학년 힘들다ㅜㅜ혈관 못찾겠어...
                </div>
              </section>
            </li>
            <li>
              <section class="list_image">
                <i class="fas fa-tractor"></i>
              </section>
              <section class="list_box">
                <div class="list_title">
                  원래 3학년 때 실습 이렇게 많은거야..?
                </div>
                <div class="list_contents">
                  우리학교 2주에 한 번 가는 것 같은데..
                </div>
              </section>
            </li>
          </ul>
        </div>
      </section>
    </section>