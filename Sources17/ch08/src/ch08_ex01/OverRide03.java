package ch08_ex01;

//추상class
abstract class C1 {
	int k;
	public C1() {
		System.out.println("추상Class 생성자 ");
	}
	//k에 대한 setter method
	void setK(int k) {
		this.k = k;
	}
	//하나 이상의 추상 method가 존재 해야 함
	//method 정의만 존재하는 것을 추상 method라고 함
	//실제로 구현한 것이 아니다.
	abstract void print();
	//templete 패턴
}

class C2 extends C1 {

	@Override
	void print() {
		System.out.println("C2 k ->"+k);
		
	}
	void print3() {
		System.out.println("C2 print3");
		
	}
	
}

public class OverRide03 {

	public static void main(String[] args) {
		//추상 class는 생성 안됨 -> 하나 이상의 추상 method를 가지고 있기 때문에
		//C1 c1 = new C1();
		//-이와 같은 경고가 뜬다, ->Cannot instantiate the type C1\
		//추상 class는 생성 안됨 -> 하나 이상의 추상 method를 가지고 있기 때문에
		
		//C1을 C2에 만들어주면, 가능하다
		C1 c1 = new C2();
		c1.setK(12);
		c1.print();
		//c1.print3();
		//기본 타입을 super class에서 받았기 때문에, 새로 만든 type은 만들 수 없다.
		
		//기본 선언을 무엇으로 했느냐에 따라서 결과가 달라질 수 있다.
		C2 c2 = new C2();
		c2.setK(7);
		c2.print();			//c2.k와 c1.k  --> 각각의 값은 다름
		c2.print3();

	}

}
