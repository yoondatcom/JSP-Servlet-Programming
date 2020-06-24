package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/logProc")
public class LoginOutServlet extends HttpServlet{
	// 로그인 처리
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		// 1. ID와 비밀번호 추출
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		// 2. 유효성 체크
		if (id.isEmpty() || pwd.isEmpty()) {
			out.print("ID 또는 비밀번호를 입력해주세요.");
			// 입력페이지로 이동
			return;
		}
		
		// 3. DB 데이터 체크
		
		// 4. 로그인 처리 : 현재 로그인 상태 여부 판단
		HttpSession session = req.getSession(true);
		if (session.isNew() || session.getAttribute("id") == null) {
			session.setAttribute("id", id);
			out.print("로그인을 완료하였습니다.");
		} else {
			out.print("현재 로그인 상태입니다.");
		}
		out.close();
	}
	
	// 로그아웃 처리
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("id") != null) {
			session.invalidate();
			out.print("로그아웃 작업을 완료하였습니다.");
		} else {
			out.print("현재 로그인 상태가 아닙니다.");
		}
		
		out.close();
	}

}