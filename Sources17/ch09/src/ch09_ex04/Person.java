package ch09_ex04;

public class Person {
	int 	id;
	String  name;
	
	//Hw01
	//학번만 같으면 객체가 같은 걸로 나오게 하기!
	public Person (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		Person  p = null;
		if (obj instanceof Person)		  p = (Person) obj;
		if (obj != null && this.id==p.id) b = true;
		return b;
	}

//		public boolean equals (Person p) {
//		boolean result = false;
//		if (id==p.id) result = true;
//		return result;
//	}

}
