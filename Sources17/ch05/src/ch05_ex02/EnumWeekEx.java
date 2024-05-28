package ch05_ex02;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null;
		//함수는 첫글자 입력하고 ctrl space로 찾아준다. (직접 입력하지 말 것)
		
		Calendar cal = Calendar.getInstance();
		//현재 일자의 번호를 가져올 때
		int weeknum = cal.get(Calendar.DAY_OF_WEEK) ;
		
		 switch (weeknum) {
		 	case 1 :
		 		today = Week.SUNDAY; break;
		 	case 2 :
		 		today = Week.MONDAY; break;
		 	case 3 :
		 		today = Week.TUESDAY; break;
		 	case 4 :
		 		today = Week.WEDNESDAY; break;
		 	case 5 :
		 		today = Week.THURSDAY; break;
		 	case 6 :
		 		today = Week.FRIDAY; break;
		 	case 7 :
			 	today = Week.SATURDAY; break;
			 
		 }
		 System.out.println("오늘 요일: " + today);
		 
		 if (today == Week.SUNDAY) {
			 System.out.println("일요일에는 축구를 합니다.");
		 } else {
			 System.out.println("열심히 자바 공부합니다.");
		 }
	}
}
