package com.edu.day4;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterTwo implements Filter{
	
	String code;
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("init() 호출 ........ two");
		code = config.getInitParameter("charset");
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		req.setCharacterEncoding(code); 
		
		System.out.println("doFilter() 호출 전 ........ two");
		chain.doFilter(req, res);
		System.out.println("doFilter() 호출 후 ........ two");
	}
	
	@Override
	public void destroy() {
		System.out.println("destory() 호출 후 ........ two");
		
	}

}
