package ch07_ex02;

public class PersonEx {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("수지");
		st1.setAge(21);
		st1.setSno("1111");
		st1.name = "수지";
		//st1.sno = 21;
		//name은 public값이라서 불러올 수 있는데
		//sno는 private값이라서 불러올 수 없음
		
		
		
		Teacher th1 = new Teacher();
		th1.setName("길동");
		th1.setAge(35);
		th1.setSubject("JAVA");
		
		Manager mg1 = new Manager();
		mg1.setName("원빈");
		mg1.setAge(19);
		mg1.setPart("청소");
		
		
		System.out.println("이름: "+st1.getName()+" , 나이 : "+st1.getAge()+", 학번 : " +st1.getSno());;
		//위 아래 둘 다 쓸 수 있는 형태
		th1.printAll();
		mg1.printAll();
		//하지만 아래 2개를 더 권장

	}

}
