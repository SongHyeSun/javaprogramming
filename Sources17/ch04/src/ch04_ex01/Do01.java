package ch04_ex01;

public class Do01 {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		//do while은 검증을 처음에 하느냐 나중에 하느냐. do는 무조건 1번은 실행해야한다.
		do {
			sum += i;
			i++ ;
		} while ( i <= 10) ;
		
		System.out.println("합계: " + sum);

	}

}
