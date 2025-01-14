package ch11_ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		//		Key		Value
		// 1. Key 중복 허용X
		// 2. Value 중복 허용 O
		HashMap<String, String> hm01 = new HashMap<String, String>();
		hm01.put("이승우", "010-2222-3333");
		hm01.put("손흥민", "010-3333-3333");
		hm01.put("전지현", "010-4455-3333");
		
		//	   이승우 손흥민 전지현 -> 만 st에 들어가 있다. (key만 들어가있다.)
		Set<String> st = hm01.keySet();
		for (String str : st) {
			System.out.println(str + "의 전화[Set]-->" + hm01.get(str));
			
		}
		//keySet으로 걸면, key만 가져온다는 뜻이다!
		Iterator<String> it = hm01.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + "의 전화"+hm01.get(key));
		}
	}

}
