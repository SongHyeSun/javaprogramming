package ch08_ex02;

class S1 {
	int a = 7;
	int b = 7;
	void display () {
		System.out.println("B1 대박");
	}
	void print() {
		System.out.println("B1 난 부모 print 메소드");
	}
		
	
}

class S2 extends S1 {
	int a = 10;
	void print () {
		super.print();	//부모 method 찾는다.
		// super 의 print먼저 출력
		System.out.println("B2 부모 멤버          a = " +super.a);
		// sub의 우선은 sub의 값을, super의 값을 부르고 싶으면, super.a로
		System.out.println("B2 난 자식 메소드       a = " +a);	//This가 생략된 것으로 봄 This.a
		System.out.println("B2 난 자식 메소드       b = " +b);
		System.out.println("===========================");
	}
}

//super class랑 동일한 변수 a와 method print() 를 가지고 있음

public class Super01 {

	public static void main(String[] args) {
		S2 b = new S2();
		b.print();
		b.display();
		// 우선은 sub 에서 실행, sub에서 없는 값이 입력되면, super에서
		// sub와 super 둘 다 있는 것은 우선은 sub이고 super.을 하면 super가 우선
	}

}
