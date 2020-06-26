<%@page import="com.edu.beans.BookBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	BookBean bean = (BookBean) request.getAttribute("book");
%>
<%= bean.getTitle() %><br>
<%= bean.getAuthor() %><br>
<%= bean.getPublisher() %>

<hr>
${book.title}<br>
${book.author}<br>
${book.publisher}