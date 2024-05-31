package ch08_ex01;

interface E1 {
	void aa();
}

interface E2 extends E1 {
	void bb();
}
interface E3 extends E2 {
	void cc();
}
//interface는 정의만 하기 때문에 extend를 사용 (interface를 확장시킬 때)

//class에 interface를 넣을 때에는 extend
class E4 implements E3 {

	@Override
	public void bb() {
		System.out.println("E4 난 E2에 있는 Method bb()");		
	}

	@Override
	public void aa() {
		System.out.println("E4 난 E1에 있는 Method aa()");		
	}

	@Override
	public void cc() {
		System.out.println("E4 난 E3에 있는 Method cc()");		
	}
	
}


public class Inter02Ex {

	public static void main(String[] args) {
		//선언은 부모 Type 가능! memory는 E4로
		//선언은 E2가 interface라 할지라도 가능하다
		E2 e2 = new E4();
		e2.aa();   // E1
		e2.bb();   // E2
		//e2.cc();   // E3
		//메모리를 E4로 할당했어도 선언한 E2를 넘어서지는 못한다. E2는 E3의 부모 method
		// e2.aa,e2.bb만 사용 가능 ,   e2.cc()는 사용 불가
		
		E4 e4 = new E4();
		e4.aa();   // E1
		e4.bb();   // E2
		e4.cc();   // E3
		//E4로 선언했으니, 그 위의 모든 method 상속받을 수 있다.
	}

}
