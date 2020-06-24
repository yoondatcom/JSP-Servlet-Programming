package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/queryTest")
public class QueryStringTestServlet extends HttpServlet{
	//Get방식으로 요청시 실행
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Get방식으로 요청됨!</h1>");
		
		//Parameter 추출
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String[] colors = req.getParameterValues("color");
		
		out.print("<h1>"+id+":"+pwd);
		for (int i = 0; i < colors.length; i++) {
			out.print("<h1>"+colors[i]);
		}

		out.print("<h6>"+req.getQueryString());
		out.close();
	}
	
	//Post방식으로 요청시 실행
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Post방식으로 요청됨!</h1>");
		
		//한글처리
		//Parameter 추출 전에 실행
		req.setCharacterEncoding("utf-8");
		
		//Parameter 추출
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String[] colors = req.getParameterValues("color");
		
		out.print("<h1>"+id+":"+pwd);
		for (int i = 0; i < colors.length; i++) {
			out.print("<h1>"+colors[i]);
		}

		out.print("<h6>"+req.getQueryString());
		out.close();
	}

}
