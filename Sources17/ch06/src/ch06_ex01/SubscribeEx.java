package ch06_ex01;

class Subscribe {
	//public 
	public String name;
	
	//private은 같은 class 내에서만 접근이 가능하다 (handling가능) 보안문제 시 사용한다
	private String telnum;
	private int    age;
	
	//선언 안하면 default
	Subscribe(String n, String t, int a) {
		name = n;
		telnum = t;
		age = a;
	}
	Subscribe (String n) {
		name = n;
		//name으로 입력하려면 this.를 붙혀준다.
	}
	//private를 대신해서 이 함수를 사용한다. (유지보수 위해서 사용하는 경우가 있다.)
	//이를 Encapsulation이라고 한다.
	void ChgTelNum (String t) {
		telnum = t;
	}

	//age값이 public이면 '-'값이 age에 많이 입력되었을 때, 요소를 하나하나 다 바꿔야하는데
	//private이면 이 encapsulation을 하여, 한번에 유지보수 가능
	void ChgAge (int a) {
		if(a>0) 	age = a;
		else		System.out.println("말이 되나요");
	}
	void print() {
		System.out.printf(" 이름  : %s	전화번호 : %s	나이: %d	\n"	, name, telnum, age);
	}
}

public class SubscribeEx {

	public static void main(String[] args) {
		Subscribe s1 = new Subscribe("이성계", "010-2223-5567",45);
		//처음부터 모든 값을 입력
		Subscribe s2 = new Subscribe("김유신");
		//이름만 입력
		s1.print();
		s2.print();
		//s2.telnum; 이 class에서는 작동이 안된다.
		s2.ChgTelNum("02-344-7788");
		//자체가 전화번호 바꾸는 함수
		s2.ChgAge(-33);
		s2.print();
				
	}

}
