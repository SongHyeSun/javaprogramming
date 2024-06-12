package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OraSelect02 {

	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url	  = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql    = "Select * From emp";
		//*가 있으면 모든 column을 가져와라 (EMP의 column을)
		Connection conn = null;
		Statement  stmt = null;
		ResultSet  rs   = null;
		System.out.println("사원명단");
		System.out.println("사원코드\t 사원명\t 업무 \t\t 급여 \t 일자");
		System.out.println("===================================================");
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			rs   = stmt.executeQuery(sql);
			if (rs.next()) {
				do {
					//컬럼 명으로 가져와야하는데, 순서명으로도 가능하기 때문에 섞어서 표현해줌
					int empno = rs.getInt(1);
					String ename = rs.getString(2);
					String job = rs.getString(3);
					//까지 컬럼명, 순서명 가능
					int sal = rs.getInt("sal");
					Date date = rs.getDate("hiredate");
					//7글자가 넘으면, 적당히 tab맞추기 위해서 , 가독성 있게 보기 위함
					if (job.length() >7) System.out.printf("%d\t%s\t%s\t%d\t%TF\n", empno, ename, job, sal, date);
					else System.out.printf("%d\t%s\t%s\t\t%d\t%TF\n", empno, ename, job, sal, date);
					//								가독성 위해 \t를 넣어줌 (업무 영역에 7글자가 넘어가면)
				} while (rs.next());
				//하나 이상의 row -> multirow (행) do-while문
				//향상형 for문처럼 사용하는데, row단위로 이동할 뿐이다.
			} else {
				System.out.println("date No");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if( rs != null)  rs.close();
			if( stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
	}

}
