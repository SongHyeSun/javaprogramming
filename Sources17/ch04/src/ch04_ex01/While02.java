package ch04_ex01;

import java.io.IOException;

public class While02 {

													//error가 나오면 던저줄게 라는 의미 -> error가 발생한 곳에 마우스 
	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단은?");
	// ASCII코드 값으로 계산한 것
	//5를 넣으면      53				-48
	//9를 넣으면      57            -48
		int num = System.in.read( )-'0';;
		// System.out.println("num->"+num); (이해를 위해 만든 것)
		int i = 1;
		
		if ( num >=2  && num<=20 ) {
			while ( i <= 9 ) {
				System.out.println(num + " * " + i + " = " + num * i );
				i ++;
			}
		} else {
			System.out.println("구구단에 없는 숫자입니다.");
			// ascii코드는 1byte만 존재해서, 두자리수로 넘어가면 뒤 자리 숫자가 없어진다.
			//따라서 20을 넘어가면 2로 인식해서 2단이 나온다.
		}
		
	}

}
