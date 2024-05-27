package ch04_ex01;

public class If05 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		
		if (score >=90 ) {
			grade = "A";
		} else if (score >=80) {
			grade = "B";
		} else if  (score >=70) {
			grade = "C";
		} else if (score >=60) {
			grade = "D";
		} else   grade = "F";

		if (score >=100) grade += "+";
		//grade += "+"       ===     grade = grade + "+"
		else if			  (score>= 60) {
			  if			  (score%10 > 7 )   grade  += "+";
			  else if    (score%10 <4 )     grade += "-";
			  else 	grade								 += "0";
		}
		System.out.println("점수는 " + score +"이고" + " 학점은 " + grade) ;
	}

}
