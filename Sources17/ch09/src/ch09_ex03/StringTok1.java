package ch09_ex03;

import java.util.StringTokenizer;

public class StringTok1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("산딸기, 집딸기,판딸기.집딸기,알카리딸기",".,");
		// .이나,있는 것들을 하나의 배열처럼 생각해준다.
			//	산딸기 집딸기 판딸기 집딸기 알칼리딸기  -> 향상형 for문과 거의 비슷!!
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

	}

}
