package ch11_ex01;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		String[] pet = {"지렁이", "굼벵이", "애벌레", "구렁이","지렁이"};
		//stack 선언
		Stack<String> st = new Stack<String>();
		//			{"지렁이", "굼벵이", "애벌레", "구렁이"}
		for (String str : pet) {
			//중복 허용, -> list와 똑같다. just push와 pop이 추가된 list
			//따라서 list와 합쳐서 공부해야한다.!!
			System.out.println("push--->"+str);
			st.push(str);
		}
		System.out.println("push st->" + st);
		System.out.println("------------------------");
		while (!st.isEmpty()) {
			System.out.println("POP -> " + st.pop());
		}
		System.out.println("st->"+st);
	}

}
