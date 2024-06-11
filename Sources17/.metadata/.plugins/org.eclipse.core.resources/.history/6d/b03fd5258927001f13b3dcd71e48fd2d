package ch13_ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWriter01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 파일명");
		String fileName = sc.nextLine();
		System.out.println("저장할 글을 입력하시요");
		String msg = sc.nextLine();
		FileWriter fw = new FileWriter(fileName);
		Date date = new Date();
		fw.write(date + " : "+msg);
		fw.close();
		System.out.println("출력 끝");
		sc.close();
	}

}
