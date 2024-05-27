package ch02_ex02;

//STUDY
public class ConditionalAndEx {

	public static void main(String[] args) {
		int num1 = -1, num2 = 0;
		//전역변수, 지역변수
		if (++num1 > 0 || ++num2 > 0)
			//&& = and, || = or
			//and 조건이기 때문에 앞에 조건이 성립이 되지 않아서 아예 뒤의 항은 대입도 안했다.
			System.out.println("num1이 0보다 크고 num2가 0보다 큽니다.");
	
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		//들여쓰기 줄 맞추기!!!
		//System.out.println("num1이 0보다 크고 num2가 0보다 큽니다.");
		//System.out.println("num1 = " + num1);
		//System.out.println("num2 = " + num2);
		//이런식으로 한 줄에 쓰면, 나중에 복잡해졌을 때 굉장히 피곤해짐
		//물론 If 뒤에 중괄호가 없기 때문에 If문의 system.out은 한줄인건 알지만, 처음에는 구분하기 매우 어려움
		//따라서 가독성을 위해
		
				//System.out.println("num1이 0보다 크고 num2가 0보다 큽니다.");
		
		//System.out.println("num1 = " + num1);
		//System.out.println("num2 = " + num2);
		
		//이런식으로 줄 띄어쓰기 하기!!

	}

}
