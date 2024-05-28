package ch06_ex01;

class Sonata {
	int a;
	String str = "";
	
	public Sonata() {
		System.out.println("난 기본 ");
	}
	
	public Sonata(int a) {
		System.out.println("난 기본 + int -> "+this.a);
		//this가 나중에 선언되었으므로 기본값인 0이 들어간다.
		this.a = a;
		System.out.println("난 기본 + int -> "+this.a);
		//this가 선언 된 이후에는 아래에 입력한 this값이 들어간다.
	}
	
/*	public Sonata(int kk) {
		this.a = a;
		System.out.println("난 기본 + int -> "+this.a);
	}*/ //위의 constructor가 위의 변수 datatype이 같아서 안된다.
	
/*	public Sonata(long kk) {
	this.a = a;
	System.out.println("난 기본 + long -> "+this.a);
}*/ //위의 constructor가 위의 변수 datatype과 다르므로 이 method는 괜찮다.
	
	public Sonata(String str) {
		this.str = str;
		System.out.println("난 기본 + str -> " + this.str);
	}
}

public class ConstrEx01 {

	public static void main(String[] args) {
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata(4);
		Sonata s3 = new Sonata("에어백");
	}

}
