package ch08_ex05;

public class Student2 extends Person2 {
	
	private String sno;
	
	//               "옥주현"		23, "1203667"
	Student2 (String name, int age, String sno) {
		super (name, age);		//이게 진짜 객체 지향 프로그래밍-> 주저리주저리 세팅해주는 게 아니라 super class꺼 가져오기
		this.sno  = sno;
	}
	
	public void print () {
		super.print();
		System.out.println("학번 : " + sno); // sub는 내것 만 priting하면 된다.
	}
	
	//자동완성
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

}