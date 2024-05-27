package ch02_ex01;

public class CastingEx {

	public static void main(String[] args) {
		int intValue = 44032;  //ascii코드를 넘어서 유니코드이다
		char charValue = (char) intValue; //char를 int로 바꾼다. cast해준다.
		System.out.println("charValue->"+charValue);
		
		long longValue1 = 500123456789L;
		intValue = (int) longValue1;
		System.out.println("intValue1->"+intValue);
		//long 에서만 가능한 data값을 int로 변환시키면, 숫자가 짤릴 수 있다.
		//변환되는 값은 내부적으로 계산해준다. 하지만 쓸 일이 없으니 신경 안써도 된다.
		
		long longValue2 = 500L;
		intValue = (int) longValue2;
		System.out.println("intValue1->"+intValue);
		//int에서도 인식 가능한 숫자를 변환시키면 값이 똑같다.
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue2->"+intValue);
		//값을 담을 수 없으면 버린다. 따라서 0.14는 버려진다.

	}

}
