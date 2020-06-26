<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="hello" class="com.edu.beans.HelloBean"/>
<jsp:getProperty property="name" name="hello"/><br>
<jsp:getProperty property="number" name="hello"/><br>

<jsp:setProperty property="*" name="hello"/><br>

<hr>

<jsp:getProperty property="name" name="hello"/><br>
<jsp:getProperty property="number" name="hello"/><br>

