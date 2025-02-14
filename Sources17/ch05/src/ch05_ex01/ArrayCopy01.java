package ch05_ex01;

public class ArrayCopy01 {

	public static void main(String[] args) {
		//Index->  0 1 2 3 4 5 6
		int [ ] a = {1,2,3,4,5,6,7};
		int [ ] b = new int [10];
		// b배열은 10개가 있다. 나머지 배열값은 0으로 처리된다.
		
		for (int i = 0 ; i < a.length ;  i++ ) {
			b[i] = a[i];
		}
		System.out.println("---------a, 0, b, 0, a.length------------");
		//						   a의 Index 0 을 -> Target(b) 의 Index 0 복사 [a.length만큼]
		System.arraycopy(a,             0,             b,                    0,          a.length);
		//reference 값은 해시코드
		//primitive 값은 기본 값으로
		//System.out.println("b->" + b); //-> 해시코드 값이 보여진다. 
	
		pr(b);
		//배열값 Clear
		cls(b);
		pr(b);
		
		System.out.println("---------a, 0, b, 2, a.length------------");
		//                          a 배열의 0번째가 b Index 2에 복사
		System.arraycopy(a, 0, b, 2, a.length);
		pr(b);
		cls(b);
		
		System.out.println("---------a, 1, b, 0, a.length-1 ------------");
		//                          a 배열의 1번째가 b Index 0 에 복사
		//                          a 배열의 1부터 시작했으므로, 하나가 없어져서 -1을 해준다.
		System.arraycopy(a, 1, b, 0, a.length-1);
		pr(b);
		cls(b);
		
		System.out.println("---------a, 1, b, 3, a.length-1 ------------");
		//                          a 배열의 1번째가 b Index 3 에 복사
		System.arraycopy(a, 1, b, 3, a.length-1);
		pr(b);
		cls(b);
		
		}
	
	// 배열값을 다시 clear시켜주는 method다
	private static void cls(int[] b) {
		// 						  이 변수 이름까지 b까지 똑같을 필요는 없다! barr로 바꿔도 Ok
		for ( int i = 0 ; i < b.length ; i++) {
			b[i] = 0;
			//
		}
		
	}

	//main에서 호출하는 method는 같은 static (Must)!!
	//자동완성 시키는게 좋다!!!
	private static void pr(int[ ] b) {
		for (int i = 0 ; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
	}

}
