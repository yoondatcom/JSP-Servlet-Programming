import java.sql.*;

public class DBTest {
	public static void main(String[] args) {
		try {
			//1. JDBC 드라이버 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. DB 서버 접속하기
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			//3. Statement/PreparedStatement 객체 생성하기
			Statement stmt = conn.createStatement();
			//4. SQL문 실행
//			stmt.executeUpdate("create table test(id varchar2(10), pwd varchar2(10))");
/*			stmt.executeUpdate("insert into test values('aa', '11')");
			stmt.executeUpdate("insert into test values('bb', '22')");
			stmt.executeUpdate("insert into test values('cc', '33')");*/
			
			ResultSet rs = stmt.executeQuery("select * from test");
			while (rs.next()) {
				System.out.println(rs.getString("id") + " : " + rs.getString(2));
			}
			//5. 자원 해제하기
			rs.close();
			stmt.close();
			conn.close(); // 
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
