package ch04_ex02;

//Hw3
public class SwitchStringEx {

	public static void main(String[] args) {
		String position = args[0];
		
		switch (position) {
		case "부장" : System.out.println(position + " -> 700만원");
						break;
		case "과장" : System.out.println(position + " -> 500만원");
						break;
		default :	    System.out.println(position +" -> 300만원");
						break;
		}
		//부장 -> 700만원
		//과장 -> 500만원
		//그외 ->300만원

	}

}
