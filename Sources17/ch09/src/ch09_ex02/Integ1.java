package ch09_ex02;

public class Integ1 {

	public static void main(String[] args) {
		String str = "3";
//		모두 문자열을 정수로 변환해주는 메소드
//		1. Integer.parseInt()는 결과값을 기본 자료형(Primitive Type)인 int 로 반환
//		2. Integer.valueOf ()는 문자열의 값을 정수형으로 변환한 뒤 참조 자료형 (Reference Type)인
//		   Integer 객체로 만들어서 반환
		
		int     i1 = Integer.parseInt("3");	//primitive형    -> 오직 값을 위한
		Integer i2 = Integer.valueOf("3");	//Integer 객체   -> .하고 method를 부를 수 있다.
		//개발자가 공짜로 쓸 method이 많으면 integer를 쓰기도 한다.
		
//		i1.   -> 안된다. 아무것도 안뜬다. (오직 숫자를 위한 )

		System.out.println(i1 + i2);
		//int 계산을 하겠다는거구나
		System.out.println(str + str);

	}

}
