package ch10_ex01;

public class Exception07 {
	static void callDriver() throws ClassNotFoundException {
		System.out.println("callDriver 수행중...");
		//driver가 존재한다면 memory를 올리지만, 없다면 오류를 발생해줘야한다.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("callDriver Driver 완료");
				
	}

	public static void main(String[] args) {
		System.out.println("callDriver 호출 전");
		try {
			callDriver();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println("e.getMessage()->"+e.getMessage());
		} finally {
			//finally는 반드시 가준다!
			System.out.println("시스템 종료.");
		}

	}

}
