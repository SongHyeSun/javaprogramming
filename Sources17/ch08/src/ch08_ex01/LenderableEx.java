package ch08_ex01;

public class LenderableEx {

	public static void main(String[] args) {
		SeperateVolume sv = new SeperateVolume("젊은 베르테르의 슬픔");
		sv.checkOut("정승환/박윤하", "2024/03/21");
		sv.checkin();
		

	}

}
