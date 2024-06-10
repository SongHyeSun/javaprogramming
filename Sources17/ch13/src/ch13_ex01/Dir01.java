package ch13_ex01;

import java.io.File;

public class Dir01 {

	public static void main(String[] args) {
//		File file = new File(".");
		//프로그램을 실행시키고 있는 파일
//		File file = new File("src/ch13_ex01");
		//src 안에 ch13_ex01 패키지 내용을 말하는 것
		File file = new File("../ch12");
		//
		
		String [] list = file.list();
		System.out.println("list->"+ list);
		for (String str:list) {
			System.out.println(str);
		}
				
	}

}
