package ch08_ex01;

class A1 {
	private int kkk;
	//상속 받았지만 private
	public void print () {
		System.out.println("  부모 메소드");
	}
}

class A2 extends A1 {
//	@Override
//	public void print() {
		// TODO Auto-generated method stub
//		super.print();
//	}
	public void print3() {
		System.out.println("A2의 print3 메소드");
	}
}

public class OverRide01 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.print();
		// a1.print3(); 부모는 자식꺼 쓸 수 없다. 불가능하다
		
		//sub class는 선언은 super class로 해도 상관없다.
		A1 a2 = new A2();
		//상속 시 super 사용가능
		a2.print();
		//선언을 super로 했을 때 사용 X
		//a2.print3();
		A2 a22 = new A2();
		//상속 시 super 사용 가능
		a22.print();
		a22.print3();
		//a22.kkk();
		//super class의 private는 쓸 수 없음
	}

}