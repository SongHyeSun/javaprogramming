package ch02_ex03;

public class Variable01 {

	public static void main(String[] args) {
		float f1, f2;
		double  d1;
		
		f1 = 10.1f;
		System.out.printf("f1=%.1f     \n", f1);
		
		f2 = 10.123456f;
		System.out.printf("f2=%.3f     \n", f2);
		//.3은 소숫점 셋째자리 까지라는 듯이다
		//float은 표시를 해주어야한다. 안해주면 길게 늘어짐. 반드시 해주어야한다.

		d1 = 100.17;
		System.out.printf("d1=%f     \n", d1);
		//double도 f로 넣는다, d로 넣으면 decimal랑 헷갈리기 때문에!
		//double은 .숫자를 입력하지 않아도 된다. 알아서 해줌.
	}

}
