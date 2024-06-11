package ch15_ex01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in); 
		System.out.println("입력할 Oracle 부서 코드."); 		String deptno = sc.nextLine();
		System.out.println("입력할 Oracle 부서명? ");	 	String dname  = sc.nextLine();
		System.out.println("입력할 Oracle 근무지? "); 		String loc    = sc.nextLine();
		
		Connection 		  conn = null;
		//Procedure 호출식
		CallableStatement cs   = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url	  = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		// Procedure call할 때의 format
		String sql    = "{call Dept_Insert(?,?,?)}";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			cs   = conn.prepareCall(sql);
			//preparedstatement와 다를 게 없다.
			cs.setString(1, deptno);
			cs.setString(2, dname);
			cs.setString(3, loc);
			int result = cs.executeUpdate();
			if (result > 0) System.out.println("Oracle CallableStatement 입력 성공 ^^");
			else			System.out.println("Oracle CallableStatement 입력 실패 T.T");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (cs   !=null)  cs.close();
			if (conn != null) conn.close();
		}
		sc.close();

	}

}
