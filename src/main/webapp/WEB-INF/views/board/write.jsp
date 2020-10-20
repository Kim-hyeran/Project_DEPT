<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!-- include summernote css/js -->
<link href="${rootPath}/static/summernote/summernote-bs4.min.css?ver=2020-10-20-001" rel="stylesheet">
<script src="${rootPath}/static/summernote/summernote-bs4.min.js"></script>
<script src="${rootPath}/static/summernote/lang/summernote-ko-KR.min.js"></script>

<link rel="stylesheet" type="text/css" href="${rootPath}/static/css/write.css?ver=2020-10-20-002" />
<script>
	$(function() {
		var toolbar = [
			['style',['bold','italic','underline'] ],
			['fontsize',['fontsize']],
			['font Style',['fontname']],
			['color',['color']],
			['para',['ul','ol','paragraph']],
			['height',['height']],
			['table',['table']],
			['insert',['link','hr','picture']],
			['view',['fullscreen','codeview']]
			
		]
		$("#b_content").summernote({lang:"ko-KR", width:"100%", height:"400px", margin: "auto", toolbar:toolbar})
	})
</script>
<form>
  <div class="write_title">
    <label class="title_label">제목</label><input class="title_input" placeholder="제목을 입력하세요" />
  </div>
  <div class="write_body">
    <textarea id="b_content" placeholder="내용을 입력하세요"></textarea>
  </div>
  <div><label>파일 첨부</label><input type="file" id="write_file" /></div>
  <div class="write_submit">
    <button id="back_to_list">취소</button>
    <button id="submit">등록</button>
  </div>
</form>