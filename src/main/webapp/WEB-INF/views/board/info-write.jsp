<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	$(function () {
		$("button#back_to_list").click(function () {
			document.location.href = "${rootPath}/comsc/info"
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
  	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
	<input name="cs_info_seq" value="${INFO_VO.cs_info_seq}" type="hidden" />
	<input name="cs_info_date" value="${INFO_VO.cs_info_date}" type="hidden" />
  	<input name="cs_info_time" value="${INFO_VO.cs_info_time}" type="hidden" />
  	<select name="category" id="category">
        <option value="license">자격증</option>
        <option value="contest">공모전</option>
        <option value="tip">꿀팁</option>
        <option value="recommend">추천</option>
        <option value="review">후기</option>
     </select>
    <label class="title_label"></label><input class="title_input" name="cs_info_title" value="${INFO_VO.cs_info_title}" placeholder="제목을 입력하세요" />
  </div>
  <div class="write_body">
    <textarea id="summer_note" name="cs_info_text">${INFO_VO.cs_info_text}</textarea>
  </div>
  <div>
  	<label>이미지 첨부</label><input type="file" id="write_file" name="file" accept="image/*" />
  	<div class="select_img"><img src="" /></div>
  	<script>
	  $("#write_file").change(function(){
	   if(this.files && this.files[0]) {
	    var reader = new FileReader;
	    reader.onload = function(data) {
	     $(".select_img img").attr("src", data.target.result).width(300);        
	    }
	    reader.readAsDataURL(this.files[0]);
	   }
	  });
	</script>
  </div>
  <div class="write_submit">
    <button id="back_to_list" type="button">취소</button>
    <button id="submit">등록</button>
  </div>
</form>