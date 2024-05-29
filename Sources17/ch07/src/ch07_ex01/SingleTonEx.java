package ch07_ex01;

class SingleTon {
	String str;
	//private static SingleTon instance = new SingleTon();
	private static SingleTon instance;
	//생성자는 외주에서 호출 못하게 private으로 지정
	//내가 나를 선언한 것 , instance로 선언했다
	private SingleTon() {
	}
	//private 는 -로 표시, public 은  +로 표시
	//생성자가 private, 즉 스스로 외에는 SingleTon을 선언할 수 없다.
	public static SingleTon getInstance () {
		//         return형이 나야
		if (instance == null) instance = new SingleTon();
		return instance;
		//null이어야만 new만들고, 그렇지 않으면, 쓰던거 써
	}
}

public class SingleTonEx {

	public static void main(String[] args) {
		//SingleTon st1 = new SingleTon();
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance();
		st1.str = "넌 누구";
		System.out.println(st2.str);
		//인스턴스가 같기 때문에 
		if (st1==st2) System.out.println("같다");
		else System.out.println("다르다");

	}

}
