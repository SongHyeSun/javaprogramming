package ch04_ex01;

import java.io.IOException;

//HW 
public class For02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단 숫자는");
		int   num = System.in.read ( ) - '0';
		
		for (int i = 1 ; i<=9 ; i++) {
			System.out.println(num + " * " + i + " = " + num * i );
		}
				
		//보고싶은 구구단 숫자는
//		5
//		5 * 1 = 5
//		5 * 2 = 10
//		5 * 3 = 15
//		5 * 4 = 20
//		5 * 5 = 25
//		5 * 6 = 30
//		5 * 7 = 35
//		5 * 8 = 40
//		5 * 9 = 45
 	}

}
