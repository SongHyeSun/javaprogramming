package ch10_ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		FileReader reader;
		char [] buffer = new char [100];
		String file_name = ".classpath";
		//					source17 폴더에 가면, .classpath가 있다.
		//			.이 들어가면 metafile이라고 생각하면 된다. 프로젝트를 구성하는 하나의 구성 파일
		// -> 내부 정보를 저장하는 프로그램 정보 (12:40 수업 다시 듣기)
		
		try {
			reader = new FileReader(file_name);
			reader.read(buffer,      0,   100);
			//			buffer 배열  시작    끝(-번째 까지)
			//			현재 배열 갯수가 100개여서 시작을 5로하고 끝을 100으로 하면, 끝이 아니라 100번째까지를 의미
			//									따라서 오류가 뜬다. -> 5부터 100번째면 105까진데, 범위를 넘어가서
			//								시작을 5로하고 끝을 95로 해주면 두개 합쳐서 100이라 가능!
			//								그렇게 하면, 앞에 5글자 건너뛰고 입력된다!
			//								시작+끝 = 배열.length 이다!
			//100byte 단위로 읽어들이는 buffer
			//call by reference니까 값이 입력되어있음
			String str = new String(buffer);
			System.out.println("읽은 건"+str);
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("그런 파일 없슴당");
		} catch (IOException e) {
			System.out.println("읽다가 에러났슈");
		} finally {
			System.out.println("어쨌거나 읽었어요");
		}
		

	}

}
