package ch02_ex01;

public class LongEx {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		
		//long var3 = 10000000000; long값일 때는 L을 써라, 컴파일 에러
		
		long var4 = 10000000000L;
		
		System.out.println("var1->"+var1);
		System.out.println("var2->"+var2);
		System.out.println("var4->"+var4);

	}

}
