package ch06_ex01;

public class Car3Ex {

	public static void main(String[] args) {
		//Car 3 class c1,c2,c3 선언
//		Car3 c1 = new Car3 ("소나타", 10, 14);
//		Car3 c2 = new Car3 ("다마스", 9, 20);
//		Car3 c3 = new Car3 ("모 닝", 12, 13);
		
		//이렇게 생성해주면, Car3의 생성자를 불러와서 자동으로 멤버변수 초기화되고 메모리까지 생성된다.
		//Car3 c1 = new Car3("소나타", 10, 14);
		Car3 c1 = new Car3();
		//memory만 (위)
		Car3 c2 = new Car3("다마스", 9, 20);
		//Memory + Instance 변수 초기화 (위,아래)
		Car3 c3 = new Car3("모 닝", 12, 13);
		//inTime에 0이 아닌 다른 값을 넣어도, 입고시간: 0으로 출력된다.
		//inTime은 Car3의 생성자를 보면 변수의 값이 똑같다. 그러면, 헷갈려한다.
		//따라서 같은 변수명을 사용하고 싶을 때, this.를 입력해주어야한다.
		
		c1.name = "소나타";
		c1.inTime = 10;
		c1.outTime = 14;
		//Car3 c1 = new Car3("소나타", 10, 14);와 완전히 같은 값
		c1.print();
		c2.print();
		c3.print();

	}
}