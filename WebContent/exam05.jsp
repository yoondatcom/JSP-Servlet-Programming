<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>exam05.jsp</h1>

<%-- <jsp:forward page="exam01.jsp"/> --%>

<%-- <% String v = request.getParameter("p"); %>
<jsp:forward page="<%= v %>"/> --%>

<jsp:forward page="${param.p}"/>
