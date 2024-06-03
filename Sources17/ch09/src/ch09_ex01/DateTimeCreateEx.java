package ch09_ex01;

//import java.time.LocalDate;
//import java.time.LocalTime;
//class가 다르고 package가 같다라고 하면,  (위와 같은 상황)
import java.time.*; //-> 이렇게 표시해주면 된다. (해당 package안의 모든 것을 사용한다는 뜻)

public class DateTimeCreateEx {

	public static void main(String[] args) {
		//시간 얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜: " + currDate);
		LocalDate targetDate = LocalDate.of(2024, 11, 18);
		System.out.println("목표 날짜: " + targetDate + "\n");
		//시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간: "+currTime);
		LocalTime targetTime = LocalTime.of(6, 30, 10);
		System.out.println("목표 시간: " +targetTime + "\n");
		//날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: "+currDateTime);
		LocalDateTime targetDateTime = 
				LocalDateTime.of(2024, 11, 18, 17, 50, 0);
		System.out.println("목표 날짜와 시간: " + targetDateTime + "\n");
		
		// 협정 세계시와 시간존(TimeZone)
		//외우지 않고 이해만 가능하면 상관없다!
		ZonedDateTime utcDateTime = 
				ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		ZonedDateTime newyorkDateTime = 
				ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존: " + newyorkDateTime + "\n");
		
	}

}
