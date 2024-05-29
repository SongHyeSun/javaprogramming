package ch08_ex01;

class B1 {
	void print1 () {
		System.out.println("바꾸기 가능 ");
	}
	final void print2() {
		System.out.println("변경 금지  ");
	}
}

//final은 상속 금지
class B2 extends B1 {
	void print1 () {
		System.out.println("난 자식 메소드 ");
	}
//	private void print2() {
//		// TODO Auto-generated method stub
//
//	} -> final은 사용할 수 없다.
	
}

public class OverRide02 {

	public static void main(String[] args) {
		B1 b1 = new B2();
		b1.print1();
		//B2에 저장되어서 자식 method에서 실행
		b1.print2();
		//B2에 print2가 없어서 super class의 print2가 실행

	}

}
