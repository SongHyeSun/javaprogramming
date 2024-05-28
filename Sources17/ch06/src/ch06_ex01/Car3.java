package ch06_ex01;

//주차요금 설계도
public class Car3 {
	String name;		
	int    inTime;		//입고시간
	int    outTime;		//출고시간
	int    fee;			//주차요금
	final int AMTPERTIME = 3000;
	//final 함수는 대문자로 이름 생성해야한다!!!
	
	public Car3 () {}
	//위는 기본생성자! (car1 ctrl space)
	//기본생성자의 목적: 메모리만 갖는 것
	
	//이미 생성자를 입력해주었으면, 기본생성자는 반드시 입력해주어야한다.
	//생성자가 있기 때문에 자동으로 생성되지 않는다는 뜻이다. (오류가뜬다.)
	//만일 아래 만든 Car3의 생성자가 따로 없다면, 자동으로 생성된다.
	
	//생성자 --> constructor
	//생성자는 메모리로 생성될 때 가장먼저 호출되는 method
	//멤버변수 초기화의 목적도 가지고 있다.+ 메모리까지
	public Car3(String n, int inTime, int out) {
	//public Car3(String nn, int inTime, int out) 이건 의미가 없다. 같은 값으로 취급
	//public Car3(int n, int inTime, int out) 이런식으로 data type이 바뀌어야한다.
		this.name = n;
		this.inTime = inTime;
		this.outTime = out;
		//this.를 넣어주면 parameter가 아니라 이 생성자의 함수를 불러온다는 의미이다.
		//이름을 다르게하면 상관은 없지만, 보통은 헷갈려서 같은 이름을 사용하기에 this.를 꼭꼭 붙혀준다.
		//public
	}
	void print() {
		int fee = ( outTime - inTime ) * AMTPERTIME;
		System.out.println("차   이름 :" + name);
		System.out.println("입고시간 :" + inTime);
		System.out.println("출고시간 :" + outTime);
		System.out.println("주차요금 :" + fee);
		System.out.println("-----------------------------");
	}

}
