package ch07_ex03;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn(); //얘는 void구나
		//return타입이 없다 -> void 이다!
		//return 타입이 없는 이유는 myCalc 앞에 return 타입이 지정되어있지 않기 때문에
		
		int result1 = myCalc.plus(5,6);
		//return형이 int구나
		System.out.println("result1: " +result1);
		
		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x,y);
		//return형이 double이구나
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
		//void구나
		
	}

}
