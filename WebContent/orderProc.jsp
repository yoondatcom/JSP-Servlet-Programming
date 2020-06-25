<%@page import="com.edu.test.Order"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String goodsname = request.getParameter("goodsname");
	String price = request.getParameter("price");
	String cnt = request.getParameter("cnt");
	
	Order order = new Order();
	order.setGoodsname(goodsname);
	if (price.isEmpty()){
		order.setPrice(0);
	} else {
		order.setPrice(Integer.parseInt(price));	
	}
	if (cnt.isEmpty()){
		order.setCnt(0);
	} else {
		order.setCnt(Integer.parseInt(cnt));	
	}
	
	request.setAttribute("order", order);
	RequestDispatcher rd = request.getRequestDispatcher("input.jsp");
	
	if(goodsname.isEmpty() || price.isEmpty() || cnt.isEmpty()){
		request.setAttribute("msg", "모든 항목을 입력해주세요.");
		rd.forward(request, response);
	}
%>