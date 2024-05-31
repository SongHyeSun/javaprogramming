package ch08_ex05;

public class Manager2 extends Person2 {
	private String part;

	Manager2(String name, int age, String part) {
		super(name, age);
		this.part = part;
	}
	
	public void print () {
		super.print();
		System.out.println("담당 : " +part);
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

}
