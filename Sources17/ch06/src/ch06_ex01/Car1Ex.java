package ch06_ex01;

//public은 하나여야만 한다.
class Car1 {
	//   Member 변수, 필드
	String color;
	// 공유변수   -> class 변수
	static int speed;
	
	void print () {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
		System.out.println("--------------------------");
	}
	
}

public class Car1Ex {

	public static void main(String[] args) {
		//class변수(static 변수)는 어느곳이든 가져다쓸 수 있다. 
		//static 붙어있는 것은 객체 선언 없이 사용 가능 (공유 됨)
		Car1.speed = 130;
		//   선언       생성
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		//이 둘은 같은 설계도만 이용한 것 뿐이다.
		c1.print();
		//class 변수값이 들어가진 것
		
		c1.color = "빨강";
		c1.speed = 200;
		//(느낌표)권고: c1speed로 해도 되지만, car1.speed로 권고한다는 뜻
		c2.color = "노랑";
		//static 없는 int 변수일 때에는, speed값을 지정해주지 않아서 0으로 표시
		//static int로 정의해주면, 공유변수가 되어서 같은 class 사용한다면 같은 값을 공유한다는 의미로
		//c1에 있는 값을 공유한다. c1과 c2는 같은 class 이므로!
				
		c1.print();
		c2.print();
	}

}