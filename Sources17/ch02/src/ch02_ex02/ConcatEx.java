package ch02_ex02;

//STUDY
public class ConcatEx {

	public static void main(String[] args) {
		String str1 = "num=" + 3 + 4;
		//string(문자) + 숫자 (문자) 따라서 문자열로 결합해버린다. 
		String str2 = 3 + 4 + "=num";
		// 숫자로 더해지고 난 결과가 문자열이면, 숫자가 더해지고 문자열이 된다.
		//즉, 문자가 먼저 나오면 숫자도 문자로 인식, 숫자가 먼저 나오면 숫자 계산된 후 문자 입력된다!
		System.out.println("str1->"+str1);
		System.out.println("str2->"+str2);

	}

}