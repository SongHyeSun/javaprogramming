package ch09_ex03;

public class String2 {

	public static void main(String[] args) {
		char [] c = {'k', 'o', 'r', 'e', 'a'};
		String str1 = new String(c);
		//위는 배열로 만들어놨다.
		String str2 = new String(" Fighting");
		//overloading으로 만들어놨다
		String str3 = str1 + str2;
		
		System.out.println(str3);
		System.out.println(2+1+1+5+"년");
		System.out.println("연1: "+2+1+1+5);
		System.out.println("연2: "+(2+1+1+5));
		
	}

}
