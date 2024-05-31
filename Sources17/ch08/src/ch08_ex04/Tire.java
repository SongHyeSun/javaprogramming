package ch08_ex04;

public class Tire {
	//필드
	public int maxRotation;				// 최대 회전수 (최대 수명)
	public int accumulatedRotation;		// 누적 회전수
	public String location;				//타이어의 위치
	//Tire의 앞바퀴냐 뒷바퀴냐

	//생성자
	public Tire (String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll () {
		++accumulatedRotation;
		//							6 2 3 4
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation-accumulatedRotation) +"회");
			return true;
			//생명이 남았다 -> true로 표현
		} else {
		  //if의 식이 같거나 크면
			System.out.println("***" + location + " Tire  펑크 ***");
			return false;
		}
	}
}
