package ch02_ex02;

public class ConditionalOpEx {

	public static void main(String[] args) {
		int a = 20, b = 30, max;
		//max도 변수이다.
		//int a = 20;
		//int b = 30;
		//int max;
		// 이 3줄을 ,로 한줄로 표현 가능
		
		max = a > b ? a:b;
		// a>b가 참이면 a를, 거짓이면 b를 넣어라
		// 즉, 참일 시 a를 가져가는 이유는 ':' 앞에 있어서 거짓이면 ':'뒤에 있는 것으로! 변수는 바뀔 수 있다.
		
//		if(a>b) {
//			max = a;
//		} else {
//			max = b;
//		}
		
		
		System.out.println("max->"+max);
	}

}
