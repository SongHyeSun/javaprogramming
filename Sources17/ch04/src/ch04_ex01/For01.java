package ch04_ex01;

public class For01 {

	public static void main(String[] args) {
		int sum = 0;
		//    process
		//    1. (1) int i = 1 (2) i<-10  --> { }
		//    2. (1) i++       (2) i<=10  --> { }  logic이 끝날 때 까지
		for (int i = 0; i<=10; i ++) {
			sum += i;
					System.out.println(i + "까지 합:  "+sum);
		}
		System.out.println("합계:  "+ sum);
	}

}
