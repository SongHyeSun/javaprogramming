package ch02_ex01;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;
		int  intValue  = byteValue;
		System.out.println("intValue->"+intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드="+intValue);
		
		intValue = 500;
		long longValue = intValue;;
		System.out.println("longValue->"+longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println("doubleValue->"+doubleValue);
	}

}
