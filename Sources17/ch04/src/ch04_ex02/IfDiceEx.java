package ch04_ex02;

public class IfDiceEx {

	public static void main(String[] args) {
		//					0.0 <= X < 1.0    0.0에서 1.0의 사이를 랜덤하게 
		int num = (int) (Math.random ( ) *6) +1; //0부터 시작이라 +1을 더해준다.
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}

	}
