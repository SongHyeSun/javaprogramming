package ch08_ex05;

public class Person2 {
	private String name;
	private int		age;
	
	Person2 (String name, int age) {
		this.name = name;
		this.age  = age;
	}

	// getter setter 자동완성 
	public void print () {
		System.out.println("---------------------");
		System.out.println("이름: "+name);
		System.out.println("나이: "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 10) {
			System.out.println("좀 크면 오세요");
			return;
		}
		this.age = age;
	}

}
