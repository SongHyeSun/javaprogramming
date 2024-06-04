package ch10_ex02;

public class Throw01 {

	public static void main(String[] args) {
		System.out.println("안녕");
		Exception e1 = new Exception("내가 Error 만들었다");
		//exception은 error들의 아버지    -> error message이다. -> getMessage를 해서 보는 것!
		
		try {
			System.out.println("e1 1");
			throw e1;
			//try로 감쌌기 때문에 exception으로 떨어진 것
			//System.out.println("이건 안 출력");
			
		} catch (Exception e2) {
			System.out.println(e2.getMessage() + " kkk");
			//					내가 만든 error message를 보겠다.
		}
		System.out.println("프로그램이 정상 종료되었음.");
		//exception이 떨어졌기 때문에 정상종료 가능! throw안하고!

	}

}
