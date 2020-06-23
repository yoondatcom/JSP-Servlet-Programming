package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/orderProc")
public class OrderServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		req.setCharacterEncoding("utf-8");
		
		String goodsname = req.getParameter("goodsname");
//		String price = req.getParameter("price");
//		String cnt = req.getParameter("cnt");
//		int total = Integer.parseInt(price)*Integer.parseInt(cnt);

		int price = Integer.parseInt(req.getParameter("price"));
		int cnt = Integer.parseInt(req.getParameter("cnt"));
		int total = price * cnt;
		
		out.print("<h1>주문내역</h1>");
		out.print("<h2>상품명 : " + goodsname);
		out.print("<h2>단가 : " + price);
		out.print("<h2>수량 : " + cnt);
		out.print("<h2>주문금액 : " + total);
	
		out.close();
	}

}
