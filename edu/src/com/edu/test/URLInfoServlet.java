package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 방식과 프로토콜 정보</h3>");
		out.print("Request URI : "+req.getRequestURI() + "</br>");
		out.print("Request URL : "+req.getRequestURL() + "</br>");
		out.print("Context Path : "+req.getContextPath() + "</br>");
		out.print("Request Protocol : "+req.getProtocol() + "</br>");
		out.print("Servlet Path : "+req.getServletPath() + "</br>");
		out.print("</body></html>");
		out.close();
	}

}
