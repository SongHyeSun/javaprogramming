package ch04_ex01;

public class Sw01 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		switch(num) {
		case 1  : System.out.println("L"); break;  
		case 2  : System.out.println("O"); break;
		case 3  : System.out.println("V"); break;
		case 4  : System.out.println("E"); break;
		default : System.out.println("똑바로 해");
		//break가 없다면, 해당 case부터 끝까지 다 간다. if case 2가 실행되었다면, 그 이후로 3,4,default까지
		//따라서 break 반드시!!
		}
	}

}
