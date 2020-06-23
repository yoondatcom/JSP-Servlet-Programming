package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class Test6 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String context = req.getContextPath();
		int len = context.length();
		String path = uri.substring(len);
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("uri : " + uri + "</br>");
		out.print("context path : " + context + "</br>");
		out.print("path : " + path + "</br>");		
		out.close();
	}

}
