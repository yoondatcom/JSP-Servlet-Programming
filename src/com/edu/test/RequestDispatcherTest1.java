package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/dispatcher1")
public class RequestDispatcherTest1 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Page1!</h1>");
		
		//RequsetDispatcher 객체 생성
		//방법1. ServletContext의 getRequestDispatcher(절대경로)
		ServletContext sc = this.getServletContext();
//		RequestDispatcher rd = sc.getRequestDispatcher("/dispatcher2");
		
		//방법2. HttpServletRequest의 getRequestDispatcher(path)
//		rd.forward(req, resp);	
		RequestDispatcher rd = req.getRequestDispatcher("dispatcher2");
		
		rd.include(req, resp);
		
		out.close();
	}

}
