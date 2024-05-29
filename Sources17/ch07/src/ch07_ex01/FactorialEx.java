package ch07_ex01;

import java.util.Scanner;

class Fac1 {
	int result = 1;
	//재귀함수 -> 자기 자신을 재 호출하는 함수 (자료구조형에서 많이 쓰인다.)
	void factorial (int cnt) {
		if ( cnt > 1) {
			result *=cnt;
			System.out.print( cnt + " * ");
			factorial(--cnt);
			//자기 자신을 -1씩 해주면서 곱해준다는 뜻
		} else {
			System.out.println( cnt   );
				System.out.println("Factorial 결과는  "+ result);
				return;
		}
	}
}

public class FactorialEx {

	public static void main(String[] args) {
		Fac1 e = new Fac1();
		int InNum;
		System.out.println("Factorial 할 10이하의 숫자를 입력하세요 ! ");
		//scanner는 자동으로 함수 입력해주어야 한다. 자동으로 import 불러와야 하기 때문에
		//Scanner함수 다시 보기
		Scanner sc = new Scanner(System.in);
		InNum = sc.nextInt();
		e.factorial(InNum);

	}

}
