package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/cookie2")
public class CookieTest2 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Cookie 추출!</h1>");
		
		Cookie[] cookies = req.getCookies();
		//만일 읽어드린 쿠키가 한개도 없다면 null이 반환됨
		
/*		if(cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				out.print("<h1>" + cookies[i].getName() + " : " + cookies[i].getValue() + "</h1>");
			}
		}
*/
		
/*		for (int i = 0; cookies !=null && i < cookies.length; i++) {
			out.print("<h1>" + cookies[i].getName() + " : " + cookies[i].getValue() + "</h1>");
		}
		
*/
		
/*		for(Cookie c:cookies) {
			out.print("<h1>" + c.getName() + " : " + c.getValue() + "</h1>");
			
		}
*/
		
		for (int i = 0; i < cookies.length; i++) {
			Cookie c = cookies[i];
			if(c.getName().equals("code")){
				out.print("<h1>" + c.getName() + " : " + c.getValue() + "</h1>");
			}
		}
		out.close();
	}

}
