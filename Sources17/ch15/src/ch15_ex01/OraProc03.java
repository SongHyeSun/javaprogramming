package ch15_ex01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc03 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 Oracle 사원 코드");
		String empno = sc.nextLine();
		
		Connection        conn = null;
		CallableStatement cs   = null;
		
		String driver  = "oracle.jdbc.driver.OracleDriver";
		// Localhost -> 127.0.0.1; , Port 번호:1521  , xe(orcl)-> Service ID(Sid)
		String url     = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		String sql    = "{? = call func_sal(?)}";

		System.out.println("sql1->"+sql);

		try {
			Class.forName(driver);
			System.out.println("sql2->"+sql);

			conn = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("sql3->"+sql);

			cs   = conn.prepareCall(sql);
			cs.setString(2, empno);
			//얘가 parameter
			cs.registerOutParameter(1, java.sql.Types.DOUBLE); 	//변경급여
			// 얘가 꺼내오는 것
			cs.executeQuery();
			Double sal = cs.getDouble(1);
			
			if (sal >0) {
				System.out.println("Oracle CallableStatement 수정 성공 ^^");
				System.out.println("변경 사번: "+empno);
				System.out.println("변경 급여: "+sal);
			} else {
				System.out.println("Oracle CallableStatement 수정 실패");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (conn != null) conn.close();
			if (cs   != null) cs.close();
		}
		sc.close();

	}

}
