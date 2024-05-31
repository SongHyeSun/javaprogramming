package ch08_ex02;

//복습
public class Car {
	
	String kind;	
	Engine eg;		//type,    cc,    print ()이걸 한꺼번에 들고 다님
					// string  int    method   -> 한번에 들고 다닌다
	//객체를 멤버변수로 선언? 완전 가능!! 그저 변수랑 똑같다고 생각한다
	//객체를 통째로 설정할 수 있다!! 너무나 흔한 일
	//상자 안의 내용물을 하나씩 옮기는게 아니라, 상자를 한번에 옮긴다는 의미
	//하나씩 풀어써도 되는데, module화를 하기 위해서 이런 방식을 사용한다.
	
	public Car(String kind, Engine eg) {
		this.kind = kind;
		this.eg = eg;
	}
	
	void print () {
		System.out.println("종류 : "+kind);
		eg.print();
		//엔진 타입과 출력값은 얘기 출력
		System.out.println("=================");
	}

	public static void main(String[] args) {
		Engine eg1 = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("베타엔진", 3000);
		//통째로 받는다.
		//객체를 상속받지 않고 사용한다.
		Car [] c = new Car[3];
		c[0] = new Car("소나타", eg1);
		//객체를 통째로 넣어주는 것
		//사실은 한번에 정의하고 3개를 한번에 줄 수 있었지만
		//객체 단위를 보여주기 위해서 이렇게 미리 만들어 놓은 경우를 보여주기 위해
		//->association관계 (객체가 객체를 사용하는 관계)
		c[1] = new Car("모 닝", eg1);
		c[2] = new Car("벤 츠", eg2);
		
		//이 안에 나 있다. c안에 소나타, 모 닝, 벤 츠 car의 객체가 넘어가는 것
		for ( Car c1 : c ) {
			c1.print();
		}
		//for 문을 이렇게 풀어쓸 수도 있다. 하지만 logic화 못시킨다.
//		Car  c1 = new Car ("소나타", eg1);
//		c1.print();
//		Car  c2 = new Car ("모 닝", eg1);
//		c2.print();
//		Car  c3 = new Car ("벤 츠", eg2);
//		c3.print();
		//이렇게 풀어쓰는 경우는 많이 없으므로 향상형 for문을 연습하기!!

	}

}
