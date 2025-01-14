package ch09_ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFor1 {

	public static void main(String[] args) {
		Date today = new Date();
		//오늘 date를 얻어서 날짜를 뿌려준다. -> 컴퓨터 시계로 인식한다.
		//프로젝트를 하게되면 서버시계를 다운받아서 쓰게 될 것이다.
		System.out.println("today->"+today);
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8;
		SimpleDateFormat sdf9;						//가독성 위해 나눠둔 것
		sdf1 = new SimpleDateFormat("yyyy-MM-dd"); //MM은 대문자로!
		sdf2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일");//yy가 년도를 말한다.//E는 요일
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); //HH와 hh는 상관없지만
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");  //MM(달)과 mm(분)은 다르다! //a는 am.pm표시 
		//위쪽은 필수로 알아둬야 한다.
		//필요 시 구글링
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");	
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");	
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");	
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");	
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		System.out.println("sdf1-> "+ sdf1.format(today));
		System.out.println("sdf2-> "+ sdf2.format(today));
		System.out.println("sdf3-> "+ sdf3.format(today));
		System.out.println("sdf4-> "+ sdf4.format(today));
		System.out.println();
		System.out.println("sdf5-> "+ sdf5.format(today));
		System.out.println("sdf6-> "+ sdf6.format(today));
		System.out.println("sdf7-> "+ sdf7.format(today));
		System.out.println("sdf8-> "+ sdf8.format(today));
		System.out.println("sdf9-> "+ sdf9.format(today));

	}

}
