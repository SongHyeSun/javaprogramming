package ch05_ex01;

public class Arr01 {

	public static void main(String[] args) {
		int [ ] a = new int[5];
		a [0] = 7;
		a [1] = 34;
		a [2] = 67;
		a [3] = 6;
		a [4] = 234;
		// a[4]를 주석처리 해주고 int[4]로 바꿔주면 오류가 난다. 아래 식에 5까지로 범위를 넣어줘서
		//이럴 때 .length를 사용한다. [ ]안의 숫자를 바꿔도 문제ㅏ가 없도록
		// 배열값을 잡아놨는데 값을 세팅하지 않으면 기본값인 0으로 보여지게 된다.
		int [ ] b = new int [5];
		b [0] = 7;
		b [1] = 34;
		b [2] = 67;
		b [3] = 6;
		b [4] = 234;
		
		//System.out.println("a.length->"+a.length);
		//for (int i = 0; i < 5; i++)
		for (int i = 0; i < a.length ; i++) {
		//배열명.length는 배열의 갯수
			System.out.printf("a[%d]=%d \n", i , a[i]);
			// 위 2개가 같은 식! printf와println 비교
			
		}
		for (int i=0 ; i < b.length ; i++) {
			System.out.println("b[" +i +"] =" + b[i]);
		}
		
	}

}
