package ch04_ex01;

public class If03 {

	
	//HW02
	public static void main(String[] args) {
		//1. IF03 수행 시 파라메타를 하나 받음 (점수)
		int score = Integer.parseInt(args[0]);
		String grade = "";
		//2. score 가지고 if문 수행
		//   1) 90 <= X , 		  grade = "A";
		//   2) 80<= X <90,       grade = "B";
		//   3) 70<= X <80, 	  grade = "C";
		//   4) ELSE		          grade = "F";
		//    당신점수는 85이고 학점은 B입니다
				
		/*선생님 답
		// if 		(score  >=90)   grade = "A";
		// else if  (score >=80)    grade = "B";
		// else if  (score>= 80)    grade = "C";
		// else 						grade = "권총";
		// System.out.println("당신점수는" + score + "이거" + "학점은" + grade + "입니다.");*/
		
		
		//내 답
		if ( score>=90 ) {
			System.out.println("당신점수는 "+score +"이고 학점은 A입니다");
			
		} else if (80 <= score) {
			System.out.println("당신점수는 "+score +"이고 학점은 B입니다");
			
		} else if (70<= score) {
			System.out.println("당신점수는 "+score + "이고 학점은 C입니다");
			
		} else {
			System.out.println("당신점수는 "+score+"이고 학점은 F입니다");
			
		}
		

	}

}
