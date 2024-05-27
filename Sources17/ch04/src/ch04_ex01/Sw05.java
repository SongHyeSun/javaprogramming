package ch04_ex01;

public class Sw05 {
//Sw03에서 중첩문을 만들기
	public static void main(String[] args) {
		//월
		int num = Integer.parseInt(args[0]);
		String season = "";
		switch (num) {
			case 12:
			case 1:
			case 2: 
				switch (num) {
				case 12: System.out.println("초겨울"); break;
				case 1:  System.out.println("젤추워"); break;
				case 2:  System.out.println("추워"); break;
				}
				season = "겨울";
				break;
				
			case 3:
			case 4:
			case 5:
				if (num == 3 || num == 4)  System.out.println(" 대박");
				else 							  System.out.println(". . .");
				season = "봄";
				break;
			case 6:
			case 7:
			case 8:
				season = "여름";
				break;
			case 9:
			case 10:
			case 11:
				season = "가을";
				break;
			default : season = "오류야"; break;
		}
		System.out.println(num + "월은 " + season + "입니다.");

	}

}
