package ch04_ex01;

public class While03 {

	public static void main(String[] args) {
		int i = 1, j = 2;
		System.out.println("구구단");
		while ( i<=9 ) {
			while ( j<= 9 ) {
				//println은 줄바꿈을 한다는 뜻이라서 print만 넣고, 대신에 tab을 해준다는 의미로 \t를 넣어준다.
				// 한 줄에 j값이 바뀌어야하므로 
				System.out.print(j+ " * " +i+ "  = " + i*j + "\t");
				j ++;
			}
			System.out.println();
			j = 2;
			i ++;
		}

	}

}
