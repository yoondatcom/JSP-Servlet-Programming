package com.edu.day4;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	// Filter 객체 생성시 호출 : 초기화 기능 구현 - 서버가 시작할 때 web.xml을 읽어 생성
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("MyFilter init()");

	}

	// 필터링 하는 페이지가 요청이 될 때 마다 호출 : 필터링 기능 구현
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("MyFilter doFilter()");
		chain.doFilter(arg0, arg1);
		System.out.println("모든 실행 완료");
	}

	// Filter 객체 삭제시 호출 : 자원 해제 기능 구현 - 서버가 중지될 때 삭제
	public void destroy() {
		System.out.println("MyFilter destroy()");

	}

}
