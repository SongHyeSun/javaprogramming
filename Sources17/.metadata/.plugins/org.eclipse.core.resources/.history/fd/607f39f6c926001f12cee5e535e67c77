package ch12_ex02;

class Ra1 implements Runnable {

	@Override
	public void run() {
		for (int i=1;i<=20;i++) {
			System.out.println(i+"대박"+ Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}
		
	}
	
}

class Ra2 implements Runnable {
	public void run() {
		for (int i=1;i<=20;i++) {
			System.out.println(i+"월요일"+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
				

		}
	}
}

public class RunnableEx01 {

	public static void main(String[] args) {
		Ra1 r1 = new Ra1();
		Ra2 r2 = new Ra2();
		
		//Runnable 객체를 각각 thread로 감싸고
		//interface로 선언한 것은 반드시 thread로 감싸주어야한다. (must!!)
		Thread th1 = new Thread(r1, "Pr");
		Thread th2 = new Thread(r2, "no");
		
		th1.start();
		th2.start();


	}

}
