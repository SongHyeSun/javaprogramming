package ch04_ex01;

public class If02 {

	//main 이 하나의 thread
	public static void main(String[] args) {
		//main thread에서 parameter를 받아야한다.
		int a = Integer.parseInt(args[0]);
		//(args[0]) 의 초기 값으로는 args[0]을 드래그해서 우마우스-run as -run configuration에서
		//argument에 숫자 입력해준다.
		//argument에 띄어쓰기 후 숫자를 연속해서 입력해주면, 그 다음 그다음 수로 나타난다. 
		//int b = args[1] 이거는 오류가 뜬다. 문자열을 숫자로 parselnt
	
		int b = Integer.parseInt(args[1]);
		//int b 에 4a의 문자열을 입력하면 오류가 뜬다.
		// 반드시 paraselnt 는 숫자를 입력해야한다.
		
		String str = args[2];
		//argument는 string값도 받아들일 수 있다.
		
		
		System.out.println("a->"+a);
		System.out.println("b->"+b);
		System.out.println("str->"+str);
		
		if ( a  > 0 ) {
			System.out.println(a+"는 양수");
			System.out.println("양수일");
		} else {
			System.out.println(a+"는 음수");
			System.out.println("음수일");
		}
		
		//reuse, reverse engineering 이렇게 run as argument에 값을 넣으면, 값을 넣을 때 마다 값이 달라져서 재활용가능
		
		System.out.println("프로그램 종료");
	}

}
