package ch07_ex01;

class C11 {
	int x;
	int y;
	int sum;
	
	void divide1(int x, int y) {
		this.x = x;
		this.y = y;
		//this.result = x/y;
	}
	void divide2(C11 c11, C11 c12, C11 c13, C11 c14) {
		c14.sum = c11.x/c11.y + c12.x/c12.y + c13.x/c13.y;
	}
}

public class Return01_ref {

	public static void main(String[] args) {
		C11 c1 = new C11();
		C11 c2 = new C11();
		C11 c3 = new C11();
		C11 c4 = new C11();
		
		c1.divide1(13, 3);
		c2.divide1(23, 3);
		c3.divide1(33, 3);
		c4.divide2(c1, c2, c3, c4);
		// int total = c1.result + c2.result + c3.result;
		System.out.println("Main resultDivide Total-> "+c4.sum);
		//void의 call by reference를 쓰던지, return받은 값을 쓰던지
		//이렇게 사용하면 main에서도 작업을 가져갈 수 있다.

	}

}