package ch08_robot;

import ch08_robot.actions.FireAction;
import ch08_robot.actions.FlyAction;
import ch08_robot.actions.KnifeAction;

public abstract class Robot {
	public FlyAction flyAction;
	//naming이 떠오르지 않으면, f Ctrl Space -> 자동으로 소문자로 만들어준다.
	public FireAction fireAction;
	public KnifeAction knifeAction;		//KnifeNo, KnifeWithWood, KnifewithLazer를 가지고 만든다.
	
	//R + Ctrl space
	public Robot() {
	}
	
	//추상 메소드
	public abstract void shape ();
	
	//일반 메소드
	//단어가 바뀔 때마다 대문자쓰는것이 규칙
	public void actionFly() {
		flyAction.fly();
	}
	
	public void actionFire() {
		fireAction.fire();
	}
	
	public void actionKnife () {
		knifeAction.knife();
	}
	
	public void actionBasic () {
		System.out.println("Robot 팔, 다리, 머리, 몸통이 있죠.");
	}
	
	// 필요 시 setter만 만들 수 있다.  (source 자동완성 set, get전부가 아니라 set만!)

	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}

	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}

	public void setKnifeAction(KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}
	
	

}
