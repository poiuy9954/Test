<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@include file="../includes/header.jsp"%>
<div class="col-sm-8 text-left" style="margin-top: 50px">
	<form action="/msg/send" method="post">
		<div class="form-group">
			<label>From</label><input type="text" value="sigkgk123" readonly="readonly" name="from">
		</div>
		<div class="form-group">
			<label>to</label><input type="text" name="to">
		</div>
		<div class="form-group">
			<label>Content</label><br>
			<textarea class=".justify-content-center" style="width: 80%; height: 200px" name="content"></textarea>
		</div>
		<button type="메세지보내기" class="btn btn-default">Submit</button>
	</form>
</div>
<%@include file="../includes/footer.jsp"%>
