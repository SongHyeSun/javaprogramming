package ch08_ex01;

interface F1 {
	void aa();
}
//Interface끼리는 다중상속 가능
interface F2 {
	void bb();
}


interface F3 extends F1,F2 {
	void cc();
}

class F4 implements F3 {
	
	@Override
	public void aa() {
		System.out.println("aa method");
		
	}
	@Override
	public void bb() {
		System.out.println("bb method");
		
	}

	@Override
	public void cc() {
		System.out.println("cc method");
		
	}
	
}

//implements는 여러개를 상속받을 수 있다.
class F5 implements F1,F2 {

	@Override
	public void bb() {
		System.out.println("F5 bb method");
		
	}

	@Override
	public void aa() {
		System.out.println("F5 aa method");
		
	}
	
}

public class Inter03Ex {

	public static void main(String[] args) {
		//F3까지는 가능
		F3 f3 = new F4();
		//interface로 정의가 가능
		//method정의까지는 되어있어야 쓸 수 있다.
		
		f3.aa();
		f3.bb();
		f3.cc();
		
		F2 f2 = new F4();
//		f2.aa();
		f2.bb();
//		f2.cc();
		
		F5 f5 = new F5();
		f5.aa();
		f5.bb();
		
		

	}

}
