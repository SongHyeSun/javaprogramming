package ch08_ex02;

class C1 {
	//생성자가 없으면 Default를 compiler가 만들어준다.
	C1() {
		System.out.println("매개변수 없는 부모 생성자");
	}
	C1(String str) {
		System.out.println("매개변수 있는 부모 생성자 1 str  "+str);
	}
	void cc1Method () {
		System.out.println("cc1 야호! 목요일이다");
	}
}

class C2 extends C1 {
	C2() {
		//만일 super가 없다면, 기본생성자를 호출한다. C1()을 호출!!
		//하지만 여기서는 지정해주었기 때문에
		//즉, super("헐~~)이 없었다면, 매개변수 없는 부모 생성자가 먼저 입력된다.
		super("헐~~~");  //매개변수 1개짜리 부모 생성자 호출
		//따라서 str 대신에 헐~~ 이 왔다
		System.out.println("매개변수 없는 자식 생성자");
	}
	void cc1Method () {
		System.out.println("C2 야호! 목요일이다");
		//하나는 super class와 겹친다.
	}
	void cc2Method () {
		System.out.println("cc2 자식 Method cc2 ");
	}
}
public class Super02 {

	public static void main(String[] args) {
		C2 c = new C2();
		c.cc2Method();
		c.cc1Method();
		//sub도 있고 super도 있으면 sub것이 우선
		//c.super.cc1Method();
		// super는 sub class에서만 부를 수 있다.
	}

}
