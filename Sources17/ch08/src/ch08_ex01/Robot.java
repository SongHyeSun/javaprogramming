package ch08_ex01;

//아무것도 없는 interface 상속받기
//연관관계를 엮어주기 위해서
//-> 아무 관계 없는 것들을 연관시캬주는 것 (Robot으로 모아둔 것-> 유지보수 용이해서)
public interface Robot {
}


class DanceRobot implements Robot {
//	public이 없는 이유는 interface에 정의된 것이 없기 때문이다.
	void dance () {
		System.out.println("춤을 춥니다");
	}
}

class DrawRobot implements Robot {
	void draw () {
		System.out.println("그림을 그립니다");
	}
}

class SingRobot implements Robot {
	void sing () {
		System.out.println("노래를 부릅니다");
	}
}