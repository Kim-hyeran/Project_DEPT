<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<!-- include summernote css/js -->
<link href="${rootPath}/static/summernote/summernote-lite.min.css" rel="stylesheet">
<script src="${rootPath}/static/summernote/summernote-lite.min.js"></script>
<script src="${rootPath}/static/summernote/lang/summernote-ko-KR.min.js"></script>

<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/write.css?ver=2020-10-20-002" />
<script>
	var csrf_header = "${_csrf.headerName}"
	var csrf_token = "${_csrf.token}"
	
	$(function () {
		$("button#back_to_list").click(function () {
			document.location.href = "${rootPath}/comsc/free"
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
<form method="POST" enctype="multipart/form-data">
  <div class="write_title">
	<input name="cs_free_seq" value="${FREE_VO.cs_free_seq}" type="hidden" />
  	<input name="cs_free_date" value="${FREE_VO.cs_free_date}" type="hidden" />
  	<input name="cs_free_time" value="${FREE_VO.cs_free_time}" type="hidden" />
    <input class="title_input" name="cs_free_title" value="${FREE_VO.cs_free_title}" placeholder="제목을 입력하세요" />
  </div>
  <div class="write_body">
    <textarea id="summer_note" name="cs_free_text">${FREE_VO.cs_free_text}</textarea>
  </div>
  <div><label>이미지 첨부</label><input type="file" id="write_file" name="file" accept="image/*" /></div>
  <div class="write_submit">
    <button id="back_to_list" type="button">취소</button>
    <button id="submit">등록</button>
  </div>
</form>