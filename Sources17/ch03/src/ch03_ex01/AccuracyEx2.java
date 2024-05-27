package ch03_ex01;

public class AccuracyEx2 {

	public static void main(String[] args) {
		int       apple       = 1;
		int       totalPieces = apple * 10;
		//정확한 값으로 떨어지게 하기 위해서 전부 int로 바꾼다.
		int       number    = 7;
		
		int		   temp       = totalPieces - number;
		
		//우선순위 같을 시 왼쪽 -> 오른쪽로 진행
		//우선순위 * / %     ->    +  -
		
		double result = temp/10.0;
		//10.0은 float이나 double이라는 것이라 아예 값을 바꾸겠다는 뜻
		//float이나 double이 피연산자에 존재하면 결과값은 float이나 double이 가능하다.
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + " 조각이 남는다. ");

	}

}
