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
	//얘를 하나만 만들어주어야하기 때문에 privte이다.
	
	//getter setter 명령규칙에 의해서 getInstance이다.
	//-> instance를 얻으려구 하는 거구나
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
		//new singleTon을 막아놓았기 때문에, SingleTon.getInstance 만 가져올 수 있다.
		//이미 있는 값으로 정의하게 된다.
		st1.str = "넌 누구";
		System.out.println(st2.str);
		//인스턴스가 같기 때문에 (객체를 공유한다는 것이다.)
		if (st1==st2) System.out.println("같다");
		else System.out.println("다르다");

	}

}
