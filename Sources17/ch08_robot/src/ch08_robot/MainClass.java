package ch08_robot;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("SuperRobot을 주문. 만들어 주세요.");
		//SuperRobot으로 바로 만들어도 되지만, Robot으로 바로 만드는 이유는?
		//부모 class를 생성해 놓으면 나중에 편하다.
		Robot superRobot = new SuperRobot();
		//su + Ctrl space
		superRobot.shape();
		//기본적으로 팔~ 날 수 있습니다
		superRobot.actionBasic();
		//팔, 다리, 몸통이 있죠
		superRobot.actionFly();
		//날 수 있어요
		superRobot.actionFire();
		//대포동 미사일 발사
		superRobot.actionKnife();
		
		System.out.println("-----------------------------------------------------");		
		System.out.println("StandardRobot을 주문. 만들어 주세요.");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		
		
		System.out.println("-----------------------------------------------------");		
		System.out.println("CheapRobot을 주문. 만들어 주세요.");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.shape();
		cheapRobot.actionBasic();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionKnife();
		
	}

}
