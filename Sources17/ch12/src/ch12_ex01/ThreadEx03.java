package ch12_ex01;

class Th1 extends Thread {
//	Th1 (String str) {
//		super(str);
//	}
	public void run () {
		for (int i = 1; i<=20 ; i++) {
			System.out.print("대박" + i + "\t");
			if (i%5==0) System.out.println();
			try {
				sleep(150);
			} catch (InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
			}
		}
	}

class Th2 extends Thread {
//	Th2 (String str) {
//		super(str);
//	}
	public void run() {
		for (int i = 1; i<=20 ; i++) {
			System.out.print(getName()+i+"\t");
//			System.out.print("수요일" + i + "\t");
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx03 {

	public static void main(String[] args) {
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		t1.start();
		t2.start();

	}

}
