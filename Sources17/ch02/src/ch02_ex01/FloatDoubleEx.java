package ch02_ex01;

public class FloatDoubleEx {

	public static void main(String[] args) {
		//실수값 저장
		double var1 = 3.14;
		//float  var2 = 3.14; -> 그냥 선언 시 기본은 double
		float  var2 = 3.14F;
		//float은 F를 붙혀줘야한다. (소문자로 써도 문제는 없지만, 대문자로 약속되어있다. Feat. 상수도 대문자로!)
		
		//정밀도테스트
		double var4 = 0.123456789123456789;
		float  var5 = 0.123456789123456789F;
		
		int    var6 = 30000000;
		double var7 = 3e6; //e6은 0이6개
		float  var8 = 3e6F;
		double var9 = 2e-3;  //e-3은 소숫점자리 3개가 생긴다.
		
		
		System.out.println("var1: "+var1);
		System.out.println("var2: "+var2);
		System.out.println("var4: "+var4);
		System.out.println("var5: "+var5);
		System.out.println("var6: "+var6);
		System.out.println("var7: "+var7);
		System.out.println("var8: "+var8);
		System.out.println("var9: "+var9);


	}

}