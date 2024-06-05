package ch11_ex02;

import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		while (ts.size() !=6) {
			int num = (int) (Math.random()*45)+1;
			System.out.println("num->"+num);
			ts.add(num);
		}
		System.out.println(ts);
	}

}
