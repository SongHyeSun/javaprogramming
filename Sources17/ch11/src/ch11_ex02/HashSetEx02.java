package ch11_ex02;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 수");
		int num2 = sc.nextInt();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(num1);
		hs.add(num2);
		//2개는 임의의 수를 넣겠다 (내가 넣어줌)
		
		//나머지는 넣어주겠다.
		//순서유지 X, 중복허용
		while (true) {
			int num = (int) (Math.random() * 45) +1;
			System.out.println("num->" + num);
			//random으로 두면 중복 숫자 나올 수 있는데,
			//해시set으로 중복숫자 없어진다.
			hs.add(num);
			if (hs.size() == 6)
				break;
		}
		System.out.println(hs);
		sc.close();
	}

}
