package ch15_ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


//HW02
//Table professor 이용하여 교수번호\t이름\t직위\t\t급여\t학과코드 출력
//		모든 row 전체 조회
public class MySelect02 {

	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url    = "jdbc:mysql://127.0.0.1:3306/scottdb";
		String sql    = "Select * From professor";
		
		Connection conn = null;		//DB 연결
		Statement  stmt = null;		//Sql 사용
		ResultSet  rs   = null;		//조회결과 저장
		System.out.println("MySQL  교수명단");
		System.out.println("교수번호\t이름\t직위\t급여\t학과코드");
		System.out.println("=======================================");
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql84");
			stmt = conn.createStatement();
			rs   = stmt.executeQuery(sql);
			
			if (rs.next()) {
				do {
					int profno = rs.getInt(1);
					String name = rs.getString(2);
					String position = rs.getString("position");
					int sal = rs.getInt("sal");
					int deptno = rs.getInt("deptno");
					System.out.printf("%d\t%s\t%s\t%d\t%d\n", profno, name, position, sal, deptno);
					
//					7글자 이상이 없어서 가독성을 위한 if문을 써줄 필요가 없다.
//					if (position.length() >7) System.out.printf("%d\t%s\t%s\t%d\t%d\n", profno, name, position, sal, deptno);
//					else System.out.printf("%d\t%s\t%s\t\t%d\t%d\n", profno, name, position, sal, deptno);
				
				} while (rs.next());
				
				
			} else {
				System.out.println("자료가 없습니다.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if ( rs   != null ) rs.close();
			if ( conn != null ) conn.close();
			if ( stmt != null ) stmt.close();
		}
	}

}
