package ch15_ex01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc02 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("정보가 궁금한 사람 사번");
		int empno = sc.nextInt();
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url	  = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql    = "{call emp_Info2(?,?,?)}";
		Connection 		  conn = null;
		CallableStatement cs   = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			cs   = conn.prepareCall(sql);
			//preparestatement와 preparecall을 같이 취급 -> 둘다 미리 sql 준비
			//parameter를 넘겨주는 것 (입력을 위한 변수)
			cs.setInt(1, empno);
			//parameter의 결과값을 받아와서 다시 넣어주는 역할 (출력을 위한 변수)
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);	//string으로 가져올 것이라
			cs.registerOutParameter(3, java.sql.Types.INTEGER); //숫자로 가져올 것이라
			cs.executeQuery();
			//값을 꺼내서 확인할 수 있다.
			String ename = cs.getString(2);
			int    sal   = cs.getInt(3);
			System.out.println("사번 : "+ empno);
			System.out.println("이름 : "+ ename);
			System.out.println("급여 : "+ sal);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (cs   != null) cs.close();
			if (conn != null) conn.close();
		}

	}

}
