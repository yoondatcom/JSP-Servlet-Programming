package com.edu.day4;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterOne implements Filter{
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("init() 호출 ........ one");
		
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter() 호출 전 ........ one");
		chain.doFilter(req, res);
		System.out.println("doFilter() 호출 후 ........ one");
	}
	
	@Override
	public void destroy() {
		System.out.println("destory() 호출 후 ........ one");
		
	}

}
