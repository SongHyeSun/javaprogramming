package ch02_ex01;

//STUDY
public class OperationsPromotionEx {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue3 = byteValue1 + byteValue2; //컴파일 에러 (숫자가 127까지라서 안될 가능성이 높다.)
		//그래서 아예 byte+byte = byte는 막아둠
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println("intValue1->"+intValue1);
		
		char charValue1 = 'A'; //문자열에 대한 ascii코드 값
		char charValue2 = 1;   // 진짜 숫자1을 의미
		// char charValue3 = charValue1 + charValue2; //컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자="+(char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println("intValue4->"+intValue4);

	}

}
