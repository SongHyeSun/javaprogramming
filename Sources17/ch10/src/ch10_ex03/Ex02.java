package ch10_ex03;

public class Ex02 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			//참이 아닐 때에만 실행
			if (!b) System.exit(0);
			//System.exit(0);-> logic과 상관없이 시스템 종료라서 finally도 전혀 안나온다.
			//하지만 exit을 쓸 일이 없다. 하드웨어에서나 쓰게된다!
			System.out.println(2);
			
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	} 

	public static void main(String[] args) {
		System.out.println("------------------- True 시작 -------------------");
		method(true);
		System.out.println("------------------- False 시작 -------------------");
		method(false);
		

	}

}
