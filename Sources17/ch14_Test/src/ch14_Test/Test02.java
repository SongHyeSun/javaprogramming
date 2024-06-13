package ch14_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//문항2번 부서코드를 받아 Dept Table의 해당 Row를 삭제하는 코드를 작성하시오.
public class Test02 {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 부서를 입력하세요 ?");
        String deptno = sc.nextLine();
        Connection conn = null;
        Statement  stmt = null;
        String driver = "oracle.jdbc.driver.OracleDriver";
          // Localhost -> 127.0.0.1; , Port 번호:1521  , xe(orcl)-> Service ID(Sid)
        String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        String sql = "DELETE DEPT WHERE Deptno = "+deptno;
    	try {
    		Class.forName(driver);
    		conn = DriverManager.getConnection(url,"scott","tiger");
    		stmt = conn.createStatement();
//    		stmt.executeUpdate(sql);	간단하게 코드만 보여주려고 한 것
    		
    		int result = stmt.executeUpdate(sql);
    		if (result > 0) System.out.println("삭제 성공^^");
    		else			System.out.println("삭제 실패 T.T");
    			
    			
    	} catch (Exception e) {
    		System.out.println("e.getMessage()->"+e.getMessage());
    	} finally {
    		if (stmt !=null) stmt.close();
    		if (conn !=null) conn.close();
    	}
    	sc.close();

	}

}
