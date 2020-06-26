<%@page import="com.edu.beans.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="bean" class="com.edu.beans.BookBean"/>
<jsp:setProperty property="*" name="bean"/>
<%
/* 	String title = request.getParameter("title");
	String author = request.getParameter("author");
	String publisher = request.getParameter("publisher");
	
	BookBean bean = new BookBean();
	bean.setTitle(title);
	bean.setAuthor(author);
	bean.setPublisher(publisher); */

	//book 테이블 insert 작업
	BookDAO dao = new BookDAO();
	dao.bookInsert(bean);
	
	RequestDispatcher rd = request.getRequestDispatcher("exam07.jsp");
	request.setAttribute("book", bean);
	
	rd.forward(request, response);
%>