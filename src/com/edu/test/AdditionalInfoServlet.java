package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/addInfo")
public class AdditionalInfoServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>추가적인 요청 정보</h3>");
		out.print("요청방식 : " + req.getMethod() + "</br>");
		/*if (req.getMethod() == "GET")
			doGet()
		else if (req.getMethod() == "POST")
			doPost()*/
		out.print("요청 바디 타입 : " + req.getContentType() + "</br>");
		out.print("요청 바디 길이 : " + req.getContentLength() + "</br>");
		out.print("Query String(질의문자열) : " + req.getQueryString() + "</br>");
			
		out.close();
	}

}
