<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<!-- include summernote css/js -->
<link href="${rootPath}/static/summernote/summernote-lite.min.css?ver=2020-10-20-001" rel="stylesheet">
<script src="${rootPath}/static/summernote/summernote-lite.min.js"></script>
<script src="${rootPath}/static/summernote/lang/summernote-ko-KR.min.js"></script>

<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/write.css?ver=2020-10-20-002" />

<script>
	$(function () {
		$("button#back_to_list").click(function () {
			document.location.href = "${rootPath}/notice"
		})
	})
	
	$(function() {
		var toolbar = [
			['style',['bold','italic','underline'] ],
			['fontsize',['fontsize']],
			['font Style',['fontname']],
			['color',['color']],
			['para',['ul','ol','paragraph']],
			['height',['height']],
			['table',['table']],
			['insert',['link','hr']],
			['view',['fullscreen','codeview']]
			
		]
		$("#summer_note").summernote({lang:"ko-KR", width:"100%", height:"300px", toolbar:toolbar})
	})
</script>
<form method="POST">
  <div class="write_title">
  	<input name="cs_noti_seq" value="${FREE_VO.cs_info_seq}" type="hidden" />
	<input name="cs_date" value="${NOTI_VO.cs_date}" type="hidden" />
  	<input name="cs_time" value="${NOTI_VO.cs_time}" type="hidden" />
    <input class="title_input" name="cs_title" value="${NOTI_VO.cs_title}" placeholder="제목을 입력하세요" />
  </div>
  <div class="write_body">
    <textarea id="summer_note" name="cs_text">${NOTI_VO.cs_text}</textarea>
  </div>
  <div><label></label></div>
  <div class="write_submit">
    <button id="back_to_list" type="button">취소</button>
    <button id="submit">등록</button>
  </div>
</form>