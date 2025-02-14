package ch09_ex01;

import java.time.LocalDateTime;

public class DateTimeOperationEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 시: "+ now);
		//연산을 쉽게 할 수 있다.
		LocalDateTime targetDateTime = now.plusYears(1)
										  .minusMonths(2)
										  .plusDays(3)
										  .plusHours(4)
										  .minusMinutes(2)
										  .plusSeconds(5)
		//메소드 명이 인간친화적으로 되어있다.
										;

		
		System.out.println("연산 후: " + targetDateTime);

	}

}
