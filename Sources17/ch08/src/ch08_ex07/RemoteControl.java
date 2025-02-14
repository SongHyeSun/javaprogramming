package ch08_ex07;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff(); 				 //-> 바로 정의할 수 없다-> abstract이어서 {}를 할 수 없다는 뜻
	void setVolume(int volume);
	
	//interface method 변수는 상수, method는 추상메소드
	
//     +
	
	//단, JAVA 8 이상
//	----------------------------------------------------
	//디폴트 메소드 -> 바로 정의가 가능하다 {} 로 정의 가능
	//디폴트 메소드, static 메소드에서만 가능하다
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
		
//	------------------------------------------

}
