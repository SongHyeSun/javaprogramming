package ch02_ex02;

//STUDY
public class FinalEx {

	public static void main(String[] args) {
		final double PI = 3.14;
		//final PI(대문자로 쓴다), 상수는 대문자로 표기한다. 
		double radius = 2.0, circum;
		
		//PI++;
		//마지막 값은 바꿀 수가 없다. 이를 상수라고 부른다. 전산용어로 final 변수
		//나중에 spring에서 활용할 예정
		
		circum = 2 * PI * radius;
		System.out.println(circum);

	}

}
