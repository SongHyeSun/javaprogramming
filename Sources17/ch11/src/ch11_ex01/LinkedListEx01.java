package ch11_ex01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		LinkedList<String> kk = new LinkedList<String>();
		String [] animal = {"산토끼", "고양이", "진돗개","치와와","토끼"};
		for (int i = 0; i < animal.length; i++) {
			kk.add(animal[i]);
		}
		System.out.println("kk 1->"+kk);
		
		//고수들이 하는 방법
		int i = 0;
		Iterator<String> it = kk.iterator();
		while (it.hasNext()) {
			System.out.println(i+"->"+it.next());
			i++;
		}
		System.out.println("kk 2->"+kk);
		//일반적인 방법
		System.out.println("----------------Simple------------");
		
		i = 0;
		//한 번 밖에 못쓴다. -> 바로 없어지기 때문에
		while (!kk.isEmpty()) {
			System.out.println(i+"->"+kk.poll());
			i++;
		}
		System.out.println("kk 3->"+kk);

	}

}
