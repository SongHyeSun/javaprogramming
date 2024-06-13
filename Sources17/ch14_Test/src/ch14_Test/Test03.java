package ch14_Test;

// JDBC에서 Statement/PreparedStatement/CallableStatement 각각의 객체를 설명하고 비교하시오.
public class Test03 {

	public static void main(String[] args) {
//		PreparedStatement, CallableStatement -->Secure Coding(보안) & 가독성
//		   
//      Statement와 PreparedStatement, CallableStatement 모두 SQL 쿼리를 실행시킨다는 공통점이 있으나,
//		Statement는 sql을 할당하는 시점에서 고정된 데이터를 갖는 쿼리문을 실행한다.
//
//		반면, PreparedStatement의 경우, 임의의 데이터를 ? 표로 대체하고, set~(Int, String 등)의 메소드를 통해
//		임의의 데이터를 주입하여 실행할 수 있다.
//
//		Statement 에서도 임의의 데이터를 주입하여 실행하기 위해 Java의 + 연산자를 이용할 수도 있으나,
//		해당 방식은 데이터 값으로 쿼리에 영향을 줄 수 있는 값이 주입될 경우 오류를 일으킬 수 있다.
//		(예시: "DELETE FROM DEPT WHERE DEPTNO = " + deptno; 에서 deptno 가 "1 OR 1=1" 의 값을 가질 경우 DEPT 테이블의 모든 데이터가 지워진다.)
//
//		CallableStatement의 경우, SQL 데이터베이스 내의 프로시저 객체를 실행시킬 때 사용하는 것으로,
//		기본적으로 그 쿼리문은 {CALL 프로시저_이름} 형태로 되어있다.
//		그러나 out 매개변수가 있을 경우 {? = CALL 프로시저_이름} 의 형태로 쿼리문을 작성하는데,
//		이 out 매개변수는 registerOutParameter(물음표 순서, 데이터베이스의 데이터 타입); 메소드를 통해 Java에서 그 값을 이용할 수 있다.

	}

}
