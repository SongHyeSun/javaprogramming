package ch07_ex01;

class C1 {
	void divide(int x, int y) {
		if (y==0) {
			System.out.println("y가 0이야   0으로 못 나눠");
			return; // 여기까지 하고 method 부른 곳으로 돌아가란 말이다
		}
		System.out.printf("%d / %s = %d\n", x, y, x/y);
	}
	
	int divide2 (int x, int y) {
		if (y==0) {
			System.out.println("y가 0이야   0으로 못 나눠");
			return y; // 여기까지 하고 method 부른 곳으로 돌아가란 말이다
		}
		System.out.printf("%d / %s = %d\n", x, y, x/y);
		int retdivide = x/y;
		return retdivide;
	}
}

public class Return01 {

	public static void main(String[] args) {
		int resultDivide;
		C1 c = new C1();
		c.divide(13, 3);
		resultDivide = c.divide2(13, 3);
		System.out.println("Main resultDivide-> "+resultDivide);
		//void의 call by reference를 쓰던지, return받은 값을 쓰던지
		//이렇게 사용하면 main에서도 작업을 가져갈 수 있다.

	}

}
