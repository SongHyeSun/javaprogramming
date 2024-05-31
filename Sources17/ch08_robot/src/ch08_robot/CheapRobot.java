package ch08_robot;

import ch08_robot.actions.FireNo;
import ch08_robot.actions.FlyNo;
import ch08_robot.actions.KnifeNo;

public class CheapRobot extends Robot {
	
	//생성자는 C ctrl space 자동완성
	public CheapRobot() {
		//interface의 목적은 부품 조립
		
		//super가 갖고 있는 것 -> super의 멤버변수이기 때문에 쓸 수 있다.
		flyAction = new FlyNo();
		//비행기능은 얘로 조립한다.
		fireAction = new FireNo();
		knifeAction = new KnifeNo();
	}

	@Override
	//반드시 구현해야하는 abstract method!!
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통 존재. 그리고 걸을 수 있습니다.");

	}

}
