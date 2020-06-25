<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% if (session.isNew() || session.getAttribute("id") == null){%>
	<%
		String str = (String) request.getAttribute("msg");
		if(str==null) str="";
	%>
	<%= str %>
	<form action="logProc.jsp" method="post">
		ID : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pwd"><br>
		<input type="submit" value="로그인"><br>
	</form>
<% }else { %>
	<a href="logProc.jsp">로그아웃</a>
<% } %>