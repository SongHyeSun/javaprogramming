package ch09_ex02;

import java.util.Random;

public class Ran1 {

	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("100이하 정수 : "+ran.nextInt(101));
		//100R까지의 수를 아무거나 발생시킨다.
		System.out.println("랜덤 정수 : " +ran.nextInt());
		//랜덤 정수
		System.out.println("double : "+ran.nextDouble());
		//랜덤 double
		System.out.println("float : "+ ran.nextFloat());
		//랜덤 float
		System.out.println("long : "+ran.nextLong());
		//랜덤 long
	}

}
