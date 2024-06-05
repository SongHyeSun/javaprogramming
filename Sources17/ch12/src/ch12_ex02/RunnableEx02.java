package ch12_ex02;

class Th1 extends Thread {
	Th1(String str) {
		   super(str);
	}
	public void run() {
		for (int i = 1; i <= 20 ; i ++ ) {
			System.out.print("대박" +i+ " \t");
			if(i%5==0) System.out.println();
			try {
				sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}
}

class Th2 extends Thread {
	Th2(String str) {
		   super(str);
	}
	public void run() {
		for (int i = 1; i <= 20 ; i ++ ) {
			System.out.print(getName() +i+ " \t");
			// System.out.print("수요일" +i+ " \t");
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}
}

class Ra3 implements Runnable {
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + "대박" + i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	}
}

//class Ra4 extends B1 implements Runnable {
class Ra4 implements Runnable {
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + "월요일" + i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	}
}
	
public class RunnableEx02 {

	public static void main(String[] args) {
		// 1.Ra3  :  I/F 20번수행 --> getName()+대박+i
		// 2.Ra4  :  I/F 20번수행 --> getName()+월요일+i
		// 3.Th1  :  Thread 상속  , 수행 
		// 4.Th2  :  Thread 상속  , 수행
		Ra3 r1 = new Ra3();
		Ra4 r2 = new Ra4();
		Th1 th1 = new Th1("zz");
		Th2 th2 = new Th2("oo");
		Thread th3 = new Thread(r1, "ㅋㅋ");
		Thread th4 = new Thread(r2, "ㅠㅠ");
	
		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}

}
