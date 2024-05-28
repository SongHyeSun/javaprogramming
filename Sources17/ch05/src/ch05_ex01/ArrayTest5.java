package ch05_ex01;

//HW02
public class ArrayTest5 {

	public static void main(String[] args) {
		String[] m = {"이름","국어","영어","수학","총점","평균"}; 
		String[] name = {"김준수","이하이","안예은","국카스텐"}; 

		int[][] score = {{80,70,90},
						 {70,90,90},
						 {80,70,80},
						 {90,90,70}
						}; 
		int[] tot = new int[3]; int sum = 0, avg = 0;

		System.out.println("성적표 \n");
		for(int i = 0; i<m.length;i++)
			System.out.print(m[i]+"\t");
		
		System.out.println("\n--------------------------------------------");
		
		for (int i = 0; i < score.length ; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score [i][j] + "\t");
				sum += score[i][j];    //사람의 총계
				tot[j] += score[i][j]; //j는 과목에 대한 총계
			}
			avg = sum/score[i].length;
			System.out.println(sum + "\t" + avg );
			sum = 0;
		}
		
		System.out.println("--------------------------------------------");
		System.out.print("총계 \t");
		int totAvg, totSum = 0;
		
		for (int j=0; j<3 ; j++) {
			System.out.print(tot[j] + "\t");
			totSum += tot[j];
		}
		//avg = sum /12;
		totAvg = totSum / (score[0].length*name.length); //score[0].length인 이유
		System.out.println(totSum + "\t" + totAvg);
			
	}
}



/*성적표 

이름	국어	영어	수학	총점	평균	
--------------------------------------------
김준수	80	70	90	240	80
이하이	70	90	90	250	83
안예은	80	70	80	230	76
국카스텐	90	90	70	250	83
--------------------------------------------
총계	320	320	330	970	80
*/
