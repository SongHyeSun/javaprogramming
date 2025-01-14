package ch04_ex03;

import java.util.Scanner;

public class ex0302 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; //잔액
		
		//Scanner는 반드시 자동완성으로만 해야한다. 직접 작성하는게 아니다.
		//Sca만 타이핑하고 Ctrl Space해서 선택!
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 예금  |  2. 출금  |  3. 잔고  |  4. 종료 ");
			System.out.println("-------------------------------------------------------");
			System.out.println("선택>  ");
			
			int menuNum = scanner.nextInt();

			switch (menuNum) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;
			
			case 2:
				System.out.print("출금액>");
				balance -= scanner.nextInt();
				break;
				
			case 3:
				System.out.print("잔고>");
				System.out.println(balance);
				break;
				
			case 4:
				run = false;
				break;
			}
			
			// HW07
			// menuNum->1
			//   1) balance = balance + 예금액
			// menuNum->2
			//   2) balance = balance - 출금액
			// menuNum->3
			//   잔고 조회 콘솔에 보여줌
		}
		System.out.println("프로그램 종료");

	}

}


/*선택> 1
예금액>500
-------------------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
-------------------------------------
선택> 2
출금액>130
-------------------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
-------------------------------------
선택> 3
잔고>370
-------------------------------------
1.예금 | 2.출금 | 3.잔고 | 4.종료
-------------------------------------
선택> 4*/