package ch10_ex01;

public class Exception05 {
	
	static void method1() throws Exception {
		try {
			System.out.println("1. method1 run 정상 run ");
			throw new Exception();	// 나를 부른 자리로 간다는 뜻
		} catch (Exception e) {
			System.out.println("2. method1메서드에서 예외가 처리");
			throw e;  //다시 예외를 발생시킨다.
		}
	}

	public static void main(String[] args) {
		System.out.println("main start...");
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메서드에서 예외가 처리");
		}

	}

}
