package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/context1")
public class ServletContextTest1 extends HttpServlet{
	
	ServletContext sc;

/*	@Override
	public void init(ServletConfig config) throws ServletException {
		sc = config.getServletContext();
	}*/
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ServletContext 추출
		sc = this.getServletContext();
		//context param 추출
		String v = sc.getInitParameter("contextConfig");
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print(v);
		out.close();
	}

}
