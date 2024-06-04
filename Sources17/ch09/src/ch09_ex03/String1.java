package ch09_ex03;

public class String1 {

	public static void main(String[] args) {
		String a1 = "Java";	//문자열 상수를 생성자에 전달하여 String 객체를 생성한 예
		String a2 = "Java";
		String a3 = new String("Java");	//String 객체에 문자열 리터럴을 저장
		String a4 = new String("java");
		//a3와 a4는 메모리가 다르다. 새로운 instance를 만들어주었기 때문에, memory 각각 형성해준다.
		System.out.println(a1 + ", " + a2 +" , " + a3);
		if (a1==a2) System.out.println("a1과 a2는 같다");
		else		System.out.println("a1과 a2는 다르다");
		if (a1==a3) System.out.println("a1과 a3는 같다");
		else		System.out.println("a1과 a3는 다르다");
		//메모리값을 비교한다는 뜻!
		
		//글자가 같냐고 묻는 것에는 둘 다 같다!
		if (a1.equals(a2)) System.out.println("equals a1과 a2는 같다");
		else			   System.out.println("equals a1과 a2는 다르다");
		if (a1.equals(a3)) System.out.println("equals a1과 a3는 같다");
		else			   System.out.println("equals a1과 a3는 다르다");
		
		if (a1.equals(a4)) System.out.println("a1과 a4는 같다");
		else			   System.out.println("a1과 a4는 다르다");
		//equalsIgnoreCase는 대소문자 무시하고 같냐는 뜻이다.
		if (a1.equalsIgnoreCase(a4)) System.out.println("a1과 a4는 같다");
		else						 System.out.println("a1과 a4는 다르다");
		if (a3.equalsIgnoreCase(a4)) System.out.println("a3  b 과 a4는 같다");
		else						 System.out.println("a3과 a4는 다르다");
	}
}
