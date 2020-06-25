package com.edu.day4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
// 에러 테스트
@WebServlet("/test9")
public class Test9 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("p");
		int len = name.length(); //NullPointException 에러 발생
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("");
		out.close();
	}

}
