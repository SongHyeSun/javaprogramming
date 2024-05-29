package ch07_ex01;

//Hw02
class OverLoad {
	int k;
	String str;
	void print () {
		System.out.println("매개변수가 없다");
	}
	void print (int k) {
		System.out.println("매개변수 1개 Int = "+k);
	}
	void print (String str) {
		System.out.println("매개변수 1개 str"+str);
	}
	void print (String str, int k) {
		System.out.println("매개변수 2개 str["+str+"], int = "+k);
	}
	
}

public class OverLoadingEx {

	public static void main(String[] args) {
		OverLoad ol = new OverLoad();
		ol.print();
		ol.print(12);
		ol.print("대박");
		ol.print("금요일", 16);
		

	}

}
