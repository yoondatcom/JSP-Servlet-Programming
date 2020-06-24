package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class InitParamServlet extends HttpServlet{
	
	String id, pwd;
	
/*	@Override
	public void init(ServletConfig config) throws ServletException {
		id= config.getInitParameter("id");
		pwd = config.getInitParameter("password");
	}
*/
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		id = this.getInitParameter("id");
		pwd = this.getInitParameter("password");
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>id : " + id);
		out.print("<h1>password : " + pwd);
		out.close();
	}

}