package ch11_ex01;

import java.util.ArrayList;

//List 계열
public class ArrayList01 {

	public static void main(String[] args) {
		//ArrayList에 String을 넣겠다.			<>안에 String넣어도 되고 빼도됨 (앞에 써있어서)
		ArrayList<String> a1 = new ArrayList<>();
		//중복 ---> O  , 순서 유지!!   눈여겨 보기!!
		a1.add("구렁2");
		a1.add("구렁8");
		a1.add("구렁2");
		a1.add("구렁4");
		a1.add("구렁3");
		a1.add("구렁1");
		
		for (int i = 0; i < a1.size(); i++ ) {
			System.out.println(a1.get(i));
		}
		System.out.println("===========================");
		for (String str : a1) {
			System.out.println(str);
		}

	}

}
