package ch05_ex01;

public class ArrayTest2 {

	public static void main(String[] args) {
		int money = 2680;
		//				   0    1    2   3
		int [ ] unit = {500, 100, 50, 10};
		
		//각각의 동전이 최대한 나올 수 있는 count
		for (int i = 0; i < unit.length ; i++) {
			int cnt = money / unit[i];
			System.out.println(unit[i] + "원짜리 : " + cnt + "개");
			money %=unit[i];
			System.out.println("money -> "+ money);
			
		}
	}
}