package com.edu.day4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//오류 처리 페이지
@WebServlet("/errorHandle")
public class ErrorHandleServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>오류 처리 페이지!</h1>");
		
		Exception e = (Exception) req.getAttribute("javax.servlet.error.exception");
		String uri = (String) req.getAttribute("javax.servlet.error.request_uri");
		out.print("<h1>"+e);
		out.print("<h1>"+uri);
		out.close();
	}

}
