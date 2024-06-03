package ch09_ex03;

public class String4 {

	public static void main(String[] args) {
		// 숫자를 문자로 변경
		String str1 = 3+"";
		//3+string기호 -> string으로 변하게 시킴
		String str2 = String.valueOf(3);
		// 문자열을 문자로 변경
		char c 		= str1.charAt(0);
		// 					charAt(0)이건 0번째 값을 가져온다는 뜻
//		char d		= str1.charAt(1);   -> 컴파일 오류
		//					3의 다음 숫자가 없어서 오류가 난다.
		//					만일 str1이 12로 되어있으면, charAt[0] = 1, charAt[1] = 2이다!!
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(c);
//		System.out.println(d);

	}

}
