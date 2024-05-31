package ch08_ex07;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = null;
		//객체를 선언만 해준 것, sub 개체를 넣을 수 있다.
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setVolume(15);
		
		//default method
		//하나 이상의 default method도 사용할 수 있다.
		rc.setMute(false);
		rc.setMute(true);
		
		//static method
		RemoteControl.changeBattery();
		// 

	}

}
