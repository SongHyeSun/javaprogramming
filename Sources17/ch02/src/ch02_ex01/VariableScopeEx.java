package ch02_ex01;

public class VariableScopeEx {

	public static void main(String[] args) {
		int var1 = 15; //값을 미리 선언하지 않고 나중에 선언해도 상관없다
		 // t를 입력하고 Ctrl Space하면 자동으로 true 생성
		//현재 상태는 무조건 수행해라
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
			
			//sysout Ctrl Space 누르면 자동생성
			System.out.println("var1->"+var1);
			System.out.println("var2->"+var2);
			
		}
		System.out.println("var1->"+var1);
		// Block안에서만 유효 (지역변수) 따라서 var2는 block 안에서만, var1은 main에서도 가능 (전역변수)
	//	System.out.println("var2->"+var2); 오류가 나게 되어있다.
	}

}