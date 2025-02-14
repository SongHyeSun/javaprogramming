package ch08_ex02;

class D1 {
	D1() {
		System.out.println("매개변수 없는 조상 생성자");	
	}
	D1(int x) {
		this();    //자신 class의 생성자
		System.out.println("매개변수 1개 조상 : x = "+x);
	}
}

class D2 extends D1 {
	D2(int x) {
//		super(x); //조상 Class 1개 매개변수 생성자
		System.out.println("매개변수 2개 부모: x =" +x);
		//생성자인데, super에 대한 정의가 없으므로 D1()에 있는 method가 실행된 후 시행
		//무조건이다!
	}
	D2 (int x, int y) {
		this (x);	//자신 class 1개 매개변수 생성자
		//이건 나자신이라는 뜻, 나인데, x가 하나짜리니까
		System.out.println("매개변수 2개 부모: x = "+x+ " , y ="+y);
	}
}

class C3 extends D2 {
	C3(int x, int y) {
		super(x,y); //조상 Class 1개 매개변수 생성자
		System.out.println("매개변수 2개 자식: x =" + x +", y ="+y);
	}
	void c3() {
		System.out.println("자식 허걱");
	}
}

public class Super03 {

	public static void main(String[] args) {
		C3 c = new C3(7, 15);
		c.c3();

	}

}
