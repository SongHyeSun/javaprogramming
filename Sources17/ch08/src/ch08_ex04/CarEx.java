package ch08_ex04;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		//상속관계 아니어도 불러쓸 수 있다.
		
		for (int i = 0; i <= 5; i++) {
			//						6 2 3 4
			int problemLocation = car.run();
			//association관계
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new HankookTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-----------------------------------------");
		}

	}

}
