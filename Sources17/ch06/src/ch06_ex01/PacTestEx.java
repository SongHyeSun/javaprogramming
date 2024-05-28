package ch06_ex01;

import ch06_ex09.PakTest01;
//다른 package면 자동으로 불러와진다.

public class PacTestEx {

	public static void main(String[] args) {
		PakTest01 pt = new PakTest01();
		pt.print();
		pt.a = 10;
		pt.b = 27;
		pt.print();
		

	}

}
