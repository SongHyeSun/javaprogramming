package ch09_ex01;

import java.util.Calendar;
import java.util.Date;

public class Calen1 {

	public static void main(String[] args) {
		//new 선언해서 객체 없는 것들은 .하고 getInstance
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1; //미국은 월을 0월부터 시작하기 때문에 
		int date = cal.get(Calendar.DATE);
		//-> object가 가지고 있는 아버지의 mehtod일 수도 있다.
		//API 중에 잘 쓰는 것만 익혀두자!! 잘 안쓰는 것들은 googling  해주면 된다.
		//이미 만들어져있는 것을 사용법을 익혀서 적용하라  -> API
		//API: Application programming interface  -> 어플 개발에 어떻게 인터페이스를 가져다 쓸것인지
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다 \n", year, month, date);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.printf("지금은 %d:%d:%d시 입니다 \n", hour, min, sec);
		
		//date는 util꺼 쓴다. (sql꺼 거의 안씀)
		Date  dt = cal.getTime();
		System.out.println("cal.getTime -> "+ dt);
		//컴퓨터 시간을 갖고오는것이다.
		
		//							현재 월의 날짜
		int dy1 = cal.get(Calendar.DAY_OF_MONTH);
		//							현재 년도의 날짜
		int dy2 = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(dy1 + " , " +dy2);
		
	}

}