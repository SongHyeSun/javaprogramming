package ch15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class OraDr01 {

	public static void main(String[] args) {
		//처음에는 이런 코딩을 쓴다~ 한번 성공하면 copy&paste 로 사용
		String driver = "oracle.jdbc.driver.OracleDriver";

		String url	  = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//				리저브드 워드(예약어)		내 자신한테 test할 수 있따.   1521번? 
		//									shared DB serverIP
		System.out.println("Start1");
		try {
			// Oracle Driver Memory Up
			Class.forName(driver);
			System.out.println("Start2");
			Connection conn = DriverManager.getConnection(url, "scott","tiger");
			System.out.println("Start3");
			if (conn !=null) {
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(e.getMessage());
			System.out.println("Error");
		}
	

	}

}
