package ch04_ex01;

public class ForContinue02 {

	public static void main(String[] args) {
		for (int i = 0 ; i<=5 ; i ++) {
			for (int j = 0; j<=5 ; j++) {
				System.out.println("현재 j = " +j);
				if (j>2) continue;
				System.out.println("대박");
			}
			System.out.println("쪽박 현재 i = " +i);
		}

	}

}
