package ch05_ex01;

//현장 work
public class Arr03 {

	public static void main(String[] args) {
		String [ ] str = { "산토끼", "고양이", "판토끼", "강아지" };
		for (int i = 0 ; i < str.length; i++) {
			System.out.println(str[i]) ;
		}
		System.out.println("===== * 향상형 For 문(실무) ==========");
		//변수형은 중요하지 않고, 자료형이 같아야한다. 따라서 kk를 선언해줄 때 같은 값인 string으로 선언!
		for (String kk : str) {
			System.out.println(kk);
		}
	}

}
