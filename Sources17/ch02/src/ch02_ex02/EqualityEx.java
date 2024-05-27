package ch02_ex02;

public class EqualityEx {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2 + 3;
		
		if (num1 == num2) {
			System.out.println("num1과 num2의 값은 동일합니다.");
		//if가 한 줄일때는 {}를 일반적으로 생략, 하지만 줄이 많으면 반드시 필요!
		}
		
		if ((num1 != num2) == false)
		//같지 않은게 거짓이니가 결국 같다는 뜻! 그래서 이 if구문은 참!
			System.out.println("다르다고 하면 거짓말!");
	}

}
