package ch08_robot;

import ch08_robot.actions.FireOk;
import ch08_robot.actions.FlyOk;
import ch08_robot.actions.KnifeWithLazer;


public class SuperRobot extends Robot {

	//부품은 CheapRobot, StandardRobot, SuperRobot의 생성자에서 결정되어진다.
	public SuperRobot() {
		flyAction = new FlyOk();
		fireAction = new FireOk();  
		knifeAction = new KnifeWithLazer();
;	}
	
	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통 존재. 그리고 날 수 있습니다.");

	}

}
