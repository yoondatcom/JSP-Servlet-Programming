package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//servlet life cycle example(새로고침 횟수 카운팅)

@WebServlet("/test5")
public class Test5 extends HttpServlet{

	private int cnt = 0;  // 객체생성 여부로 최초요청 판단
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		cnt++;
		out.print("<h1>count : " +cnt);
		out.close();
		
	}

}
