package ch07_ex01;

class Encapsule{
	private String name;
	private int    age;
//	public String name;
//	public int    age;
	
	public String getName() {
		return name;
	}
	public int getAge () {
		return age;
	}
	//반드시 String형으로
	
	public void setName (String name) {
		this.name = name;
	}
	public void setAge (int age) {
		if (age < 0) System.out.println("나이입력오류 ㅎㅎㅎ");
		else this.age = age;
	}
	//private 멤버변수일 때는 이런식으로 이 class를 이용한 모든 내용을 한번에 고쳐줄 수 있다.
	//반드시 int형으로
}


public class EncapsuleEx {

	public static void main(String[] args) {
		Encapsule h1 = new Encapsule();
//		h1.name = "김준수";
//		h1.age = -10;
		//name과 age 멤버변수가 private이면 이 문장이 오류가 뜬다.
		//Encapsule class에서만 실행된다.
		h1.setName("김준수");
		h1.setAge(-10);
		
		System.out.println("이름 : " + h1.getName());
		System.out.println("나이 : " + h1.getAge());

	}

}
