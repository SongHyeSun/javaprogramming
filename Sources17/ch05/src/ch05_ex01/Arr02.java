package ch05_ex01;

public class Arr02 {

	public static void main(String[] args) {
		int [ ] a = new int [ ] {23,45,67,789,2};
		int [ ] a2 = {23,45,67,789,2};
		int a3 [ ] = {23,45,67,789,2};
		//new는 새로운 memory를 생성해서 넣어주는 것
		
		System.out.println("===== 일반형 For 문 ==========");
		
		for (int i = 0 ; i < a.length ; i++) {
			System.out.printf("a[%d]=%d \n", i , a[i]);
		}
		System.out.println("===== 향상형 For 문(실무) ==========");
		//		{23,45,67,789,2}
		//       a가 자동으로 옆의 값으로 이동시켜준다.
		//       a가 넘겨받기 때문에 위와 아래가 같다.
		//       a가 더 이상 갈 곳이 없으면 자동으로 끝내준다.
		for (int kk : a) {
			System.out.println("kk->"+kk);
			//특정 값을 입력하고 싶다면 위의 일반형으로 쓴다.
			//향상형은 logic을 만들고 싶을 때, 쓰는데 대부분이 logic을 돌려야한다.
		}

	}

}
