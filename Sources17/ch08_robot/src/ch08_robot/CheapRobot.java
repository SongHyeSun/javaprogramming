package ch08_robot;

//import ch08_robot.actions.FireNo;
import ch08_robot.actions.FireOk;
import ch08_robot.actions.FlyNo;
import ch08_robot.actions.KnifeNo;

public class CheapRobot extends Robot {
	
	
	//부품은 CheapRobot, StandardRobot, SuperRobot의 생성자에서 결정되어진다.
	//생성자는 C ctrl space 자동완성
	public CheapRobot() {
		//interface의 목적은 부품 조립
		//비행기능은 얘로 조립한다.
		//super가 갖고 있는 것 -> super의 멤버변수이기 때문에 쓸 수 있다.
		flyAction = new FlyNo();
//		fireAction = new FireNo();
		fireAction = new FireOk();
		knifeAction = new KnifeNo();
	}

	@Override
	//반드시 구현해야하는 abstract method!!
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통 존재. 그리고 걸을 수 있습니다.");

	}

}
