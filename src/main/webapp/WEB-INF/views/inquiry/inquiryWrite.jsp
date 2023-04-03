<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<style>
	*{
		text-size:1.3em;
	}
	.c{
		display:flex;
		justify-content:center;
	}
	#inquiryForm li{
		padding:10px 0px;
		margin-bottom:5px;
	}
	h1{
		text-align:center;
	}
	#subject{
		width:500px;
		height:30px;
	}
	#content{
		width:500px;
		height:250px;
	}
	ul{
		list-style-type:none;
	}
	input, textarea{
		border:1px solid #e3dcd4;
	}

</style>
</head>
<body>
<div class="c">
<div class="all">
	<h1>1:1 문의</h1>
	<hr/>
	<form method="post" action="inquiryWriteOk" id="inquiryForm">
		<ul>
			<li>이름 
     				<input type="text" readonly id="staticName" value="example" style="border:none; margin-left:85px;">
    		</li>
			<li>이메일(아이디)
      				<input type="text" readonly id="staticEmail" value="email@example.com" style="border:none; margin-left:20px;">
			</li>
			<li>카테고리 선택</li>
			<li>
				<select style="height:30px; background-color:#f5f3f2; border:none;">
					<option value="카테고리 선택" selected>카테고리 선택</option>
					<option value="차 구매">차 구매</option>
					<option value="배송문의">배송문의</option>
				</select>
			</li>
			<li>제목</li>
			<li><input type="text" name="subject" id="subject"/></li>
			<li>상담내용</li>
			<li><textarea name="content" id="content"></textarea></li>
			<li>첨부파일</li>
			<li>
				<input type="submit" value="등록하기" id="submit" style="border:none; background-color:#0e2b5b; color:white; font-size:1.3em;"/>
			</li>
		</ul>
	</form>
</div>
</div>
</body>
</html>