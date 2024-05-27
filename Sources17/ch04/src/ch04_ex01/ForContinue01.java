package ch04_ex01;

public class ForContinue01 {

	public static void main(String[] args) {
		//    process
		//    1. (1) int i = 1 (2) i<10  --> { }
		//    2. (1) i++       (2) i<10  --> { }  logic이 끝날 때 까지
		//    3. 만약 continue를 만나면, i++로 바로 간다.
		for (int i = 0; i<10; i++) {
			System.out.println("대박 i = " +i);
			if (i>5) continue;
			System.out.println("쪽박 i = " + i);
			
		}

	}

}
