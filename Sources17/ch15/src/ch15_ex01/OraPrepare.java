package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OraPrepare {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Oracle 부서 코드?");		String deptno = sc.nextLine();
		System.out.println("입력할 Oracle 부서 명?");	 	String dname  = sc.nextLine();
		System.out.println("입력할 Oracle 근무지?");	  	String loc    = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		//Statement문장이 아니라 PreparedStatement로 -> 문장을 준비만 해놓는다는 뜻!!
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url	  = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql    = "Insert Into dept values(?,?,?)";
		//							이 형식으로 문장을 준비해둔다는 뜻
		//							해커가 조작하기에 어렵다.
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(sql);		//sql 추가!! (준비해 둬야하기 때문에!!)
			//sql도 추가해 두고, 숫자 1,2,3에도 들어가야 한다.
			pstmt.setString(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			//result는 작업에 성공한 갯수
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("OraPrepare 입력 성공 ^^");
			else			System.out.println("OraPrepare 입력 실패 T.T");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (pstmt != null) pstmt.close();
			if (conn != null)  conn.close();
		}
		sc.close();
	}

}
