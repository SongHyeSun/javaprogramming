package ch10_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception03 {

	public static void main(String[] args) {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.print("첫 번째 값을 입력하세요 => ");
			try {
				int num1 = Integer.parseInt(bin.readLine());
				System.out.print("두 번째 값을 입력하세요 => ");
				int num2 = Integer.parseInt(bin.readLine());
				System.out.println(num1 + " / " + num2 + " = " + num1/num2);
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println( "숫자를 입력해야 합니다. ");
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println( "0으로 나누는 계산은 처리할 수 없습니다.");
			//모든 예외 처리를 담당해야해서 필수로 있어야 한다.
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println( "값을 잘못 입력했습니다.");
			}
		}
	}
}
