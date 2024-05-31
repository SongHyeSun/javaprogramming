package ch08_ex04;

public class Car {
	
	//필드
	//객체 갖다 쓰는 거 association
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	//test하기 위해서 수명이 거의 다 된 tire를 산 것
	
	//생성자 (기본 생성자를 갖춘 것)
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll()==false) {
			stop();
			return 1;
		};
		if (frontRightTire.roll()==false) {
			stop();
			return 2;
		};
		if (backLeftTire.roll()==false) {
			stop();
			return 3;
		};
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		};
		return 0;
		//0이 정상 나머지는 정상이 아닌 상태
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
