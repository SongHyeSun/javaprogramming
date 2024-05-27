package ch03_ex02;

public class ex0201 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		//z에 ()++x) + y 까지만 반영된다.
		System.out.println("x->"+x);
		System.out.println("y->"+y);
		System.out.println("z->"+z);

	}

}
