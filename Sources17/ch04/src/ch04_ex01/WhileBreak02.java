package ch04_ex01;

public class WhileBreak02 {

	public static void main(String[] args) {
		int i = 0 , j = 0;
		while (true) {
			i ++;
			while (true) {
				j ++;
				System.out.print("현재 j는 " + j + "\t");
				//print 와 println 확인하기!!
				if (j==5) break;
			}
			//j가 5번 실행
			System.out.println("\n현재 i는 " +i );
			j = 0; //j가 
			if (i == 10) break;
		}
		System.out.println("끝");

	}

}
