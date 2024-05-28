package ch06_ex01;

class Card {
	//인스턴스 변수 = 필드
	String kind ;
	int number;
	
	//클래스 변수
	static int width = 100; 
	static int height = 250;
	
	public Card() {
	}
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}
// 이렇게 생성자를 2개 같이 쓰는 것을 overloading!!!
	

public class CardTest01 {

	public static void main(String[] args) {
		// 객체1 생성
		Card c1 = new Card();	
		//인스턴스 변수
		c1.kind = "Heart";		
		c1.number = 7;
		System.out.print(" c1 : "+c1.kind + "," + c1.number);
		System.out.print("\n c1 : "+Card.width+ "," + Card.height);
		//c1으로 써도되고, Card로 써도 된다.
		
		//객체2 생성 --> 생성자 (Memory + 인스턴스 변수 초기화)
		Card c2 = new Card("Spade",4);
		System.out.print("\n c2 : "+c2.kind + "," + c2.number);
		System.out.print("\n c2 : "+Card.width+ "," + c2.height);
		
		
	}

}
