package ch06_ex01;

class AA1 {
	int 		num1;
	static int  num2;
	AA1() {
		num1 ++;
		num2 ++;
		
	}
	void print() {
		System.out.println("num1 = "+num1 + " num2 = "+num2);
	}
}

public class NumEx {

	public static void main(String[] args) {
		AA1 a1 = new AA1();
		a1.print();
		AA1 a2 = new AA1();
		a2.print();
		AA1 a3 = new AA1();
		a3.print();
		//num1은 인스턴스
		//num2는 공유변수
		//따라서 num1값은 매번 0에서 +1이 되지만
		//num2값은 +1이 된 값이 저장되어 +1이 더 추가로 되어서 값이 더 증가한다.
	}

}
