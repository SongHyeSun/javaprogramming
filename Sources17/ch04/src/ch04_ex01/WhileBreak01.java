package ch04_ex01;

public class WhileBreak01 {
	
	public static void main(String[] args) {
		int num = 0, sum = 0;
		while (true) {
			num++;
			sum+= num;
			if(num==5) break;
			// Break 반복문, 분기문 종료
			
		}
		System.out.println("합계: " + sum);
		System.out.println("끝");
		
	}
}
