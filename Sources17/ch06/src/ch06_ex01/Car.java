package ch06_ex01;

// class는 기본적으로 하나의 설계도이다. main이 없음. 실행할 수 없음
public class Car {
	//   Member 변수, 필드
	String color;
	int speed;
	int wheel;
	
	//행위 ---> Method (영문자 또는 $로 시작) 두번째부터 숫자 가능
	void speedUp () {
		speed++;
		System.out.println(speed + "속도를 올렸다.");
	}
	
	void print () {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
	}


}
