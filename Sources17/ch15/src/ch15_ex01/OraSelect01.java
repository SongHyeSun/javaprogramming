package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraSelect01 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요");
		int  deptno = sc.nextInt();
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url	  = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "Select dname,loc From Dept Where deptno=" +deptno;
//						Select * 하면 모든 행을 불러온다는 뜻, 여기서는 지정해주었다.
		//string format으로 해도 되는데, 하나 입력은 이렇게 해도 된다.
		Connection conn = null;		//DB
		Statement  stmt = null;		//Sql
		ResultSet  rs	= null;		//select를 했을 경우 반드시 resultSet을 쓴다!!
		
		System.out.println("sql->"+sql);
		//완성이된 sql 얘가 올려준다. //하나의 row면 몰라도, 하나 이상의 row일 때 저장해 두었다 실행해야해서
		
		try {
			Class.forName(driver);		//Driver
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();	//stmt
			rs = stmt.executeQuery(sql);	//SQL -> select시에만
//			rs Row
			//iterator에서 hasnext와 같다!
			if (rs.next()) {
				String dname = rs.getString("dname");	//rs.getString(1) <--dname
				String   loc = rs.getString("loc"); 	//rs.getString(2) <--loc 이렇게 해도 된다. (2번째꺼를 가져온다.)
				//getString에서 index라고 할 수 없다. 0부터 시작하지 않기 때문! 따라서 순서명이라고
				//이름을 입력해되 되고, 순서명을 입력해도 된다.
				System.out.println("부서코드: "+deptno);
				System.out.println("부서명: "+dname);
				System.out.println("위치: "+loc);
			} else {
				System.out.println("자료가 없습니다");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if( rs != null)  rs.close();
			if( stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
		sc.close();

	}

}
