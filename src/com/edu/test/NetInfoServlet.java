package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>네트워크 관련 요청 정보</h3>");
		out.print("Request Scheme : "+req.getScheme() + "</br>");
		out.print("Server Name : "+req.getServerName() + "</br>");
		out.print("Server Address : "+req.getLocalAddr() + "</br>");
		out.print("ServerPort : "+req.getServerPort() + "</br>");
		out.print("Client Address : "+req.getRemoteAddr() + "</br>");
		System.out.println("접속 client : "+req.getRemoteAddr() + "</br>");
		out.print("Client Hsot : "+req.getRemoteHost() + "</br>");
		out.print("Client Port : "+req.getRemotePort() + "</br>");
		out.print("</body></html>");
		out.close();
	}

}
