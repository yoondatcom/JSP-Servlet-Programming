<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	RequestDispatcher rd = request.getRequestDispatcher("loginOut.jsp");

	if(request.getMethod().equals("POST")){
		// 로그인 처리
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if (id.isEmpty() || pwd.isEmpty()) {
			System.out.println("ID 또는 비밀번호응 입력해주세요.");
			request.setAttribute("msg", "ID 또는 비밀번호를 입력해주세요.");
			
			rd.forward(request, response);   // 입력페이지로 이동
			
			return;
		}
		// 현재 로그인 상태 여부 판단
		if (session.isNew() || session.getAttribute("id") == null) {
			session.setAttribute("id", id);
			System.out.println("로그인을 완료하였습니다.");
		} else {
			System.out.println("현재 로그인 상태입니다.");
		}
		out.close();
		
	} else{
		// 로그아웃 처리
		if (session != null && session.getAttribute("id") != null) {
			session.invalidate();
			System.out.println("로그아웃을 완료하였습니다.");
		} else {
			System.out.println("현재 로그인 상태가 아닙니다.");
		}
		
	}
	
	rd.forward(request, response);
	
%>