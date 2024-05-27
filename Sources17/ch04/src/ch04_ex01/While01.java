package ch04_ex01;

public class While01 {

	public static void main(String[] args) {
		//				while 변수 초기값 설정!!
		int sum = 0 , i = 1;
		while (i <= 10) {
			sum += i;
			System.out.println(i + "까지 합" + sum);
			i ++;
		}
		System.out.println("합계:" + sum );
	}

}
