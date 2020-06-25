<%@page import="com.edu.test.Order"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<a href="basketList">장바구니 보기</a> <p>

<%
	Order order = (Order) request.getAttribute("order");
	if (order == null) order = new Order();
%>

<form action="orderProc.jsp" method="post">
	상품명 : <input type="text" name="goodsname" value="<%= order.getGoodsname() %>"><br>
	단가 : <input type="text" name="price" value="<%= order.getPrice() %>"><br>
	수량 : <input type="text" name="cnt" value="<%= order.getCnt() %>"><br>
	<input type="submit" value="주문"><br>
</form>