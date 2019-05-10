<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
	<table>
		<thead>
			<tr>
				<td>아이디</td>
				<td>비밀번호</td>
				<td>이름</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${memberList }" var="member">
				<tr>
					<td>${member.userid }</td>
					<td>${member.pwd }</td>
					<td>${member.name }</td>
			</tr>
			</c:forEach>
		</tbody>	
	</table>


</body>
</html>
