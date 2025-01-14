package ch05_ex01;

//HW01
public class ArrayEx15 {

	public static void main(String[] args) {
		if (args.length !=3) {
			System.out.println("usage : java ArrayEx15 NUM1 OP NUM2");
			//op: operation + - * /
			System.exit (0);
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		char op = args[1].charAt(0);    	//문자열을 문자(char)로 변환
		int result = 0;
		
		switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case 'x' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			default :
				System.out.println("지원되지 않는 연산입니다.");
		}
		// + , - , X , / 수행 -->  switch
		// *는 .classpath를 가르키므로 x로 변경하여 사용하였음 
		System.out.print("결과: " + result);
	}

}
