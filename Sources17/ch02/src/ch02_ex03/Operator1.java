package ch02_ex03;

public class Operator1 {

	public static void main(String[] args) {
		int n1 = 33;
		int n2 = 10;
		int result;
		
		// + - / * % 사칙연산자
		result = n1  + n2;
		//%d = decimal (int나 long값) , %c = char 
		//%d = n1	  %c = '+'   %d = n2    =   %d = result       \n(줄바꿈)
		System.out.printf("%d %c %d = %d\n", n1, '+', n2, result);
		//printf는 줄바꿈을 안해준다. '\n은 줄바꿈이다' ln과 다르게 줄바꿈을 안해서 줄바꿈을 해주어야한다.
		//\n을 안해주면 한 줄에 이어서 나온다.
		//printf도 많이 쓴다. println은 띄어쓰기까지 전부 표현해주어야한다.
		System.out.println(n1 + "+" + n2 + " = " + result);
		
		result = n1  - n2;
		System.out.printf("%d %c %d = %d\n", n1, '-', n2, result);
		result = n1  * n2;
		System.out.printf("%d %c %d = %d\n", n1, '*', n2, result);
		result = n1  / n2;
		System.out.printf("%d %c %d = %d\n", n1, '/', n2, result);
		result = 10  % 3;      // %는 나머지
		System.out.printf("%d %c %d = %d\n", 10, '%', 3, result);
	}

}
