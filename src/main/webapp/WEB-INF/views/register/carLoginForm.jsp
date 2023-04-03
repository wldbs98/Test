<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	*{
		padding:0;
		margin:0;
		border:none;
	}
	.all{
		font-size:15px;
	}
	.carLogin{
		width:400px;
		height:350px;
		padding:50px;
		box-sizing:border-box;
		margin:0 auto;
	}
	.carLogin>h1{
		font-size:20px;
		color:black;
		margin-bottom:20px;
	}
	#logFrm>input{
		width:100%;
		height:50px;
		padding: 0 10px;
		box-sizing:border-box;
		margin-bottom:15px;
		border:black solid 1px;
	}
	#logFrm>input::placeholder{
		color:#ddd;
	}
	#logFrm>input[type="submit"]{
		color:#fff;
		background-color:black;
		font-size:15px;
		margin-top:20px;
	}
	#find{
		text-align:center;
	}
	#find a{
		color:black;
	}
</style>
<body>
<div class="all">
<div class="carLogin">
	<h1>로그인</h1>
	<form method="post" action="loginOk" id="logFrm">
			<input type="text" name="id" id="id" placeholder="아이디"/>
			<input type="password" name="password" id="password" placeholder="비밀번호"/>
			<input type="submit" value="로그인"/>
	</form>
	<div style="margin:0 auto; padding:0;" id="find">
		<a href="idSearchForm">아이디찾기</a>
		<span>/</span>
		<a href="">비밀번호찾기</a>
		<span>/</span>
		<a href="join">회원가입</a>
	</div>
</div>
</div>
</body>
</html>


