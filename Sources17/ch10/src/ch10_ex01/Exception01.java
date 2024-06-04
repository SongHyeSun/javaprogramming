package ch10_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		//system에서 친 것으로 버퍼를 만드는 것
		
		//무한루트 돌리는 것
		while (true) {
			System.out.print("첫 번째 값을 입력하세요 => ");
			int num1 = Integer.parseInt(bin.readLine());
			System.out.print("두 번째 값을 입력하세요 => ");
			int num2 = Integer.parseInt(bin.readLine());
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			
		}

	}

}
