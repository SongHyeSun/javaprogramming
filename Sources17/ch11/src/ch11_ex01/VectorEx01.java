package ch11_ex01;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		vc.add("구렁2");
		vc.add("팔렁8");
		vc.add("철렁7");
		vc.add("구렁2");
		vc.add("구렁3");
		vc.add("구렁4");
		for (int i = 0; i < vc.size(); i++) {
			System.out.println(vc.get(i));
		}
		System.out.println("==============");
		for (String str : vc) {
			System.out.println(str);
		}
	}

}
