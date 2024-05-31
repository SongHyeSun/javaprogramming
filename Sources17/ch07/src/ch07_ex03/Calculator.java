package ch07_ex03;

public class Calculator {
	void powerOn () {
		System.out.println("전원을 켭니다.");
	}
	int plus (int x, int y) {
		int result = x+y;
		return result;
		//여기서 지정해주는 변수 명은 결과값의 변수명과는 상관이 없다.
	}
	double divide (int x, int y) {
		double result = (double) x/(double)y;
		return result;
	}
	void powerOff () {
		System.out.println("전원을 끕니다.");
		
	}

}
