package ch04_ex03;

//HW06
public class ex0301 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<=100; i ++ ) {
			if (i%3 ==0) {
				//System.out.println("i->"+i);
				//진행과정 보고싶으면 입력
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " +sum);
		//for문 이용 1부터 100까지 3의 배수의 sum 을 구하라
		
		//console값: 3의 배수의 합 : 1683

	}

}