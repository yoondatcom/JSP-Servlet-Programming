package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/bookOutput")
public class BookTest1Servlet2 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		Book book = (Book)req.getAttribute("book");
		
		out.print("<h3>책제목 : " + book.getTitle() + "<br>");
		out.print("<h3>책저자 : " + book.getAuthor() + "<br>");
		out.print("<h3>출판사 : " + book.getPublisher() + "<br>");
		
		out.close();
	}

}
