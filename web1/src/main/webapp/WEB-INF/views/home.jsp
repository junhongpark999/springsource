<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<div>
	age : <%=request.getParameter("age") %>
</div>
<div>
	num : ${num}
</div>
<div>
	<%-- 모든 요청은 컨트롤러로 가야 함 --%>
	<p><a href="/sample/basic">basic</a></p>
	<p><a href="/sample/doA">doA</a></p>
	<p><a href="/sample/login">login</a></p>
	<p><a href="/sample/insert">insert</a></p>
</div>
<div>
	<p><a href="/board/insert">insert</a></p>
	<p><a href="/board/list">list</a></p>
	<p><a href="/board/modify">modify</a></p>
	<p><a href="/board/read">read</a></p>
</div>
</body>
</html>
