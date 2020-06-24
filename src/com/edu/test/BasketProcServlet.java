package com.edu.test;

import java.io.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/basketList")
public class BasketProcServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>현재 주문 상품</h1>");
		Order currentOrder = (Order) req.getAttribute("order");
		if (currentOrder != null){
			out.print("<h3>상품명 : " + currentOrder.getGoodsname());
			out.print("<h3>단가 : " + currentOrder.getPrice());
			out.print("<h3>수량 : " + currentOrder.getCnt());
			out.print("<h3>금액 : " + currentOrder.getAmount());
		}
		out.print("<h1>총 주문 상품 목록</h1>");
		
		List<Order> orderList = null;
		HttpSession session = req.getSession(false);
		if(session != null) {
			out.print(orderList = (List<Order>) session.getAttribute("basket"));
		} else {
			out.print("주문 상품이 없습니다.");
		}
		
		int sum = 0;
		for (int i = 0; i < orderList.size(); i++) {
			Order order = orderList.get(i);
			out.print("<h3>상품명 : " + order.getGoodsname());
			out.print("<h3>단가 : " + order.getPrice());
			out.print("<h3>수량 : " + order.getCnt());
			out.print("<h3>금액 : " + order.getAmount());
			sum += order.getAmount();
			out.print("<br>==============================================");
		}
		
		out.print("<h2>총 주문 금액 : " + sum);
		
		
		
		out.close();
	}

}
