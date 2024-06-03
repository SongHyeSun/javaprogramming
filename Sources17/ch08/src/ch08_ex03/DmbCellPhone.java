package ch08_ex03;

public class DmbCellPhone extends Cellphone {
	//필드
	int channel;
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
		
	}
	//메소드
	
//	@Override
//	void powerOn() {
//		// TODO Auto-generated method stub
//		super.powerOn();
//	}
//	
	void turnOnDmb() {
		System.out.println("채널 " + channel +"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb (int channel) {
		System.out.println("채널 "+channel + "번으로 바꿉니다.");
	}
	void turnOffDmb () {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	//HW01
	//결과화면

}
