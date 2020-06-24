package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;

//Servlet 객체의 생명주기
public class Test2 extends HttpServlet{   

	//최초 요청시 한번 실행 : 초기화 작업
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출");
	}

	//요청이 들어올 때 마다 실행 : 실제 내용 구현
	@Override
	public void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() 호출");
	}
	
	//Servlet 객체가 삭제 실행 : 서비스 중시 될 떄
	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
	}
}
