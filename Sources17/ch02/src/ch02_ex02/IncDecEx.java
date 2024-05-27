package ch02_ex02;

//STUDY

public class IncDecEx {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
		int result1 = num1++;						   // ++ 연산의 결과는 num1의 기존 값
		//++보다 num1이 먼저 수행이 된다
		// 9 Line과 동일
		//1 result = num1;
		//2 num1++;
		
		int result5 = ++num5;
		//15 Line과 동일
		//1 ++num5; = num5 = num5 + 1
		//2 result5 = num5;
		
		System.out.println("num1="+ num1);
		//result값을 처리하는 것과 num의 값을 처리하는게 다르다. 
		
		int result2 = num2--;						   // -- 연산의 결과는 num2의 기존 값
		int result3 = ++num3;						   // ++ 연산의 결과는 num3의 새로운 값
		//애초에 result3값이 3+1인 것
		int result4 = --num4;						   // -- 연산의 결과는 num4의 새로운 값
		int result6 ;								   // -- 연산의 결과는 num4의 새로운 값
		//코딩을 하려다가 안한거라 오류가 생긴거임
		
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);
		System.out.println("result3 = "+result3);
		System.out.println("result4 = "+result4);
		System.out.println("result5 = "+ ++result3);
		result3--;
		//단독 실행할 때는, --나++를 앞이나 뒤나 상관이 없는데, 위나 아래의 값은 단독실행이 아니므로 앞이나 뒤로!
		System.out.println("result6 = "+result3++);
		System.out.println("result3 = "+result3);

	}

}
