package ch03_ex01;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVar1 = "김혁";
		String strVar2 = "김혁";
		String strVar3 = new String("김혁");
		
		System.out.println( strVar1 == strVar2 );
		System.out.println( strVar1 == strVar3 );
		//string에서의 ==는 memory를 비교한다.
		//new(strVar3)로 만들어서 주석값이 달라진다. new값을 주어서 memory를 다르게 준다.
		
		System.out.println();
		System.out.println( strVar1.equals(strVar2) );
		//string에서의 equals는 값을 비교하는 것
		System.out.println( strVar1.equals(strVar3) );
		//string의 값을 비교할 때는 .equal
		//string의 주소를 비교할 때엔 ==를 사용
	}

}
