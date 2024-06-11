package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraInsert {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력?");	String deptno = sc.nextLine();
		System.out.println("부서명 입력?");	    String dname  = sc.nextLine();
		System.out.println("위치 입력?");	    String loc    = sc.nextLine();
		//field명하고 맞춰주면 편하다.
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		//Localhost -> 127.0.0.1; Port 번호 : 1521 , xe(orcl) -> Service ID(Sid)
		String url	  = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String url	  = "jdbc:oracle:thin:@localhost:1521:xe";	//내 PC 위와 같은 내용
		
		//ex---> INSERT INTO DEPT VALUES(50,'영업1팀','이대'); //sql은 대소문자 구별하지 않는다.!
		String sql = String.format("Insert Into Dept Values(%s, '%s', '%s')", deptno, dname, loc);
//		String sql = "Insert Into Dept Values(" + deptno +",'"+dname+"','"+loc+"')";
		// Insert, Into, dept, Values -> reserved word는 대문자를 쓰는 경우가 많다.
		//system.out.print와 -> 가장 비슷한게 String format이다.
		System.out.println("sql->"+sql);
		Connection conn = null;
		Statement  stmt = null;
		
		
		try {
			//드라이버 올려주고
			Class.forName(driver);
			//conn해주고, stament 해준다.
			conn = DriverManager.getConnection(url, "scott", "tiger");
			//statement를 쓰면, 실행할 때만 sql을 사용하면 된다. 하지만 prepared는 다름
			stmt = conn.createStatement();
			// result Set
			//insert된 갯수
			int result = stmt.executeUpdate(sql); //수행 -> executeUpdate
			//insert문장이기 때문에 executeUpdate쓰고, select만 executeQuery쓴다.
			//insert된 row문장을 반환하고 있다.
			if (result >0) System.out.println("입력 성공^^");
			else  		   System.out.println("입력 실패 T.T");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt !=null) stmt.close();
			if (conn !=null) conn.close();
		}
		sc.close();

	}

}
