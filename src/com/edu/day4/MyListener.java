package com.edu.day4;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
	
	public MyListener() {
		System.out.println("My Listener 객체 생성!");
	}
	
	//ServletContext 객체 생성 시 호출 : 서버 시작시
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// 서비스 시작 전 초기 환경 설정 내용 구현
		System.out.println("ServletContext 객체 생성!");
		
	}
	
	//ServletContext 객체 삭제 시 호출 : 서버 중지
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
