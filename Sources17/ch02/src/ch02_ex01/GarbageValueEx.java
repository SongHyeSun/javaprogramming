package ch02_ex01;

public class GarbageValueEx {
	public static void main(String[] args) {
		byte var1 = 125;  //1 Byte
		int  var2 = 125;  //4 Byte
		
		//     1. 초기값   3.비교   2. 증분값
		for(int   i=0;     i<5;     i++) {
			var1++;  //var1 = var1 + 1; = var1++; --는 +대신 -라고 생각하면 된다.
			var2++;
			//고수들은 ++로 사용하기 때문에 표현 익혀준다.!
			System.out.println("var1: " +var1 + "/t" + "var2: " + var2);
		}
	}
}
