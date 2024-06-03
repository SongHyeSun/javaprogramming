package ch09_ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaEx {

	public static void main(String[] args) {
		String[] data = {"bat" , "baby", "bonus"
						, "cA", "ca" , "co" , "c."
						, "c0" , "car", "combat", "count"
						, "cafe12"
						,"date", "disc" };
		
		Pattern p = Pattern.compile("c[a-z]*");
		//c로 시작하는 소문자 영단어 (c[a-z]-> a-z까지 소문자가 나와야한다.)
		//패턴 매칭된 애들만
		for (int i=0; i<data.length ; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) {
				System.out.print(data[i] + ",");
			}
		}
				
		

	}

}
