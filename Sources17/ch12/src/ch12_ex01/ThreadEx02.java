package ch12_ex01;

public class ThreadEx02 {

	public static void main(String[] args) {
		A1 a1 = new A1("subA");
		A1 a2 = new A1("subB");
		//진짜 스레드 수행 하게 함
		a1.start();
		a2.start();
		for (int i = 1; i <=100 ; i++) {
			System.out.print("Main" + i + "\t");
			if (i%10==0) System.out.println();
		}

	}

}
