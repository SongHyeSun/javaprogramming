package ch04_ex01;

//현장 work
/* X >97   ->A+
 * X < 94 -> A-
 * Else -> A0
 */
public class If04 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade="";
		
		if (score >=90) {
			if (score > 97 ) 			grade = "A+";
			else if ( score < 94 )   grade = "A-";
			else 						grade = "A0";
		} else if (score >=80) {
			if (score>87) 			grade = "B+";
			else if (score < 84 )    grade = "B-";
			else 						grade = "B0";
		} else if (score >=70) {
			if (score>77)				grade = "C+";
			else if (score < 74)     grade = "C-";
			else						grade = "C0";
		} else		grade = "F";
			
		System.out.println("점수는 " + score +"이고" + " 학점은 " +grade);
	}

}
