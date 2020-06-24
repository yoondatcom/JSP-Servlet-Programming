package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/queryTest2")
public class QueryStringTest2 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Post방식으로 요청됨!</h1>");
		
		ServletInputStream input = req.getInputStream();
		int len = req.getContentLength();  //요청정보 길이값
		byte[] buffer = new byte[len];  //byte 배열
		
		input.readLine(buffer, 0, len);
		
		out.print("<h3>" + new String(buffer));
		
		out.close();
	}

}
