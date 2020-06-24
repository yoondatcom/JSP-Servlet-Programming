package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/cookie1")
public class CookieTest1 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Cookie 전송!</h1>");
		
		//server에서 client로 cookie 보내기
		
		//Cookie 생성
		Cookie c1 = new Cookie("id", "guest"); 
		//Cookie 전송
		resp.addCookie(c1);
		
		Cookie c2 = new Cookie("code", "1004");
		//유효시간 설정(초)
		c2.setMaxAge(60*60*3); //3시간
		resp.addCookie(c2);
		
		Cookie c3 = new Cookie("mode", "taxi");
		c3.setMaxAge(60*60*24*10); //10일
		resp.addCookie(c3);
		
		out.close();
	}

}
