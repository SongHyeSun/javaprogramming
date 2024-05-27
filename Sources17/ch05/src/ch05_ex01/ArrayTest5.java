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
		for(int i = 0; i<m.length;i++) {
			System.out.print(m[i]+"\t"); 
		}
		System.out.println("\n--------------------------------------------");
		
		for (int j = 0; j<score.length ; j++) {
			System.out.print(name[j] + "\t");
				sum = 0;
				for (int r = 0; r < score[j].length; r++) {
				sum += score[j][r];
				System.out.print(score [j][r] + "\t");
				}
				avg = sum/tot.length;
				System.out.print(sum + "\t" + avg );
				System.out.println();
				}
		
		System.out.println("--------------------------------------------");
		System.out.print("총계 \t");
				
		for	(int j = 0; j<score.length ; j++) {
			sum = 0;
			for (int r = 0; r < score[j].length; r++) {
			sum += score[r][j];
			}
			System.out.print(sum + "\t");
			
		} 


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