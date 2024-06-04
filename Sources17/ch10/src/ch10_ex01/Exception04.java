package ch10_ex01;

public class Exception04 {
	
	static void method1 () throws Exception {
		System.out.println("method1 run");
		method2();
		
	}
	static void method2 () throws Exception {
		System.out.println("method2 run");
		//일부로 예외 발생시킴
		throw new Exception();
		
	}
	
	//static은 static끼리만 호출 가능해서 static을 다 붙혀준 것
	public static void main(String[] args) throws Exception {
		method1();
		System.out.println("main End");

	}

}
