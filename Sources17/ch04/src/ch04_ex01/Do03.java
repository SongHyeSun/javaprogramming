package ch04_ex01;

import java.util.Scanner;

public class Do03 {

	public static void main(String[] args) {
		//Sca만 입력하면 자동으로 값이 뜬다. 선택해주면, 위에 import가 자동으로 뜬다. 
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0, num;
		int answer = (int) (Math.random()*100) +1;   //1~100정수
		do {
			System.out.println("1~100 중 어떤 숫자일까요? ");
			num = sc.nextInt();
			//sc.까지 입력하면 옆에 함수값이 뜬다. 
			
			// System.out.println("num->"+num); -> 시스템 알아보기 위해 한 것
			if (answer == num) {
				System.out.println(cnt + "번에 맞췄습니다 축하!!");
				break;
			} else if (answer > num) {
				System.out.println("더 큰 수를 입력하세요");
			} else  System.out.println("작은 수를 입력하세요");
			cnt ++;
			
		} while (true) ;

	}

}
