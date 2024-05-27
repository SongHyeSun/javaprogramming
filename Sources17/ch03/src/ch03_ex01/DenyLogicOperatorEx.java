package ch03_ex01;

public class DenyLogicOperatorEx {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		//!부정형으로 두면, true -> false

		play = !play;
		System.out.println(play);
		//flase가 된 값을 다시 !부정형을 두어서 false-> true
	}

}
