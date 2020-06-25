package com.edu.day4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// 에러 테스트
@WebServlet("/test11")
public class Test11 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		try {
			String name = req.getParameter("p");
			int len = name.length();
		} catch (Exception e) {
			out.print("오류발생 : " + e);
		}
		
		out.print("<h1>Get 방식으로 요청됨!</h1>");
		out.close();
	}

}