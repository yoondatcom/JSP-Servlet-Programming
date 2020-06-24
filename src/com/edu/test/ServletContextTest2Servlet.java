package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/context2")
public class ServletContextTest2Servlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		ServletContext sc = this.getServletContext();
		
		out.print("서블릿 버전 : " + sc.getMajorVersion() + "." + sc.getMinorVersion());
		out.print("<br>서버 정보 : " + sc.getServerInfo());
		out.print("<br>웹 애플리케이션 경로 : " + sc.getContextPath());
		out.print("<br>웹 애플리케이션 이름 : " + sc.getServletContextName());
		out.print("<br>파일 실제 경로 : " + sc.getRealPath("/name.html"));
		sc.log("로그 기록!!");
		
		out.close();
	}

}
