package ch08_ex05;

public class Teacher2 extends Person2 {
	private String subject;

	Teacher2(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		//무조건 super부터 정의해야된다.
		//super가 밑으로 오면 오류가 뜬다.
	}
	
	public void print () {
		super.print();
		System.out.println("과목 : "+ subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
