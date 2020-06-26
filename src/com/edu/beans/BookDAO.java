package com.edu.beans;

import java.sql.*;

public class BookDAO {
	//book 테이블에 레코드 삽입하는 메소드
	public void bookInsert(BookBean book){
		try {
			//1. JDBC 드라이버 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. DB 서버 접속하기
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			//3. Statement/PreparedStatement 객체 생성하기
			Statement stmt = conn.createStatement();
			//4. SQL문 실행
			PreparedStatement pstmt = conn.prepareStatement("insert into book values(?,?,?)");
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getPublisher());
			
			pstmt.executeUpdate();
			
			ResultSet rs = stmt.executeQuery("select * form book");
			while(rs.next()){
				System.out.print("<h3>"+rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
			
			rs.close();
			pstmt.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}