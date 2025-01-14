package ch08_ex01;

public class RobotEx {
	
	static void action (Robot r) {
		//할 때마다 
		
		//instanceof는 아래 객체타입이 DanceRobot이냐?
		//r이 dancerobot의 객체냐?
		if (r instanceof DanceRobot) {
			//같은 type의 계열은 casting(형변환)이 가능하다.
			DanceRobot dr = (DanceRobot) r;
			dr.dance();
		//((DanseRobot)r).dance();
		} else if (r instanceof DrawRobot) {
			((DrawRobot)r).draw();
			//실제로 이렇게 뜬다
		} else {
//			((SingRobot)r).sing();
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
	}

	//    위가 static이니까 static이어야 한다.
	// 왜냐하면 공유 memory니까 공유해야한다.
	// static이면서 instance쓸 수는 없다.
	public static void main(String[] args) {
		Robot [] rb = new Robot[3];
		//객체배열 선언    -> array값은 3으로
		rb[0] = new DanceRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		//			DanceRobot, DrawRobot, Sing Robot -> 객체라고 어려운게 아니라 단위만 확장시켜 놓은 것
		for ( Robot r : rb) {
			action(r);
		}

	}

}
