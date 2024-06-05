package ch11_ex03;

import java.util.Hashtable;

public class HashTableEx01 {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("조정은", "010-2222-3333");
		ht.put("손흥민", "010-3333-3333");
		ht.put("황희찬", "010-4455-3333");
		System.out.println("조정은 TEL : " + ht.get("조정은"));
		System.out.println("손흥민 TEL : " + ht.get("손흥민"));
		System.out.println("황희찬 TEL : " + ht.get("황희찬"));
		//key값으로 get을 하면 value값을 돌려준다.


	}

}
