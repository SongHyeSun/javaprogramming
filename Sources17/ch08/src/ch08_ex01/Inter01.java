package ch08_ex01;

//-------------------------------------------------------
//인터페이스는 1) 양식의 역할( 큼) 함 , 
//      2) 다중상속 지원(극히 일부분..)
//      3) class 와 class 를 연결 해줌 (중요)
//-------------------------------------------------------

public interface Inter01 {
	int AA = 3 ;			//interface에 있는 모든 멤버변수는 Public Static
	void display ();
	void print ();			//모든 public
	//interface를 상속받으면 반드시 구현해주어야 한다. @override로 자동으로 입력되게 한다.
	//interface는 abstract이니까!
	
}

class D1 implements Inter01 {

	//자동으로 입력되게 해야한다.
	@Override
	public void display() {
		// AA = AA+1;   -> 컴파일 오류, final 함수이기에! (interface 변수는 무조건 다 final = 상수)
		System.out.println("재정의 했으...AA--> "+AA);
	}

	@Override
	public void print() {
		System.out.println("나도야 간다");
		
	}
	
}