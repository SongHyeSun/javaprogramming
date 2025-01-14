package ch08_robot;

import ch08_robot.actions.FireOk;
import ch08_robot.actions.FlyNo;
import ch08_robot.actions.KnifeWithWood;

public class StandardRobot extends Robot {
	
	//부품은 CheapRobot, StandardRobot, SuperRobot의 생성자에서 결정되어진다.
	public StandardRobot() {
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new KnifeWithWood();
		//Fir + ctrl space 선택하면 자동으로 import가 생성된다.
		//따라서 자동완성해주는게 중요하다!!
	}

	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통 존재. 그리고 달릴 수 있습니다.");

	}

}
