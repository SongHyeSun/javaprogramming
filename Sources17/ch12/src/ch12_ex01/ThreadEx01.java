package ch12_ex01;


//원칙1
//Thread를 생성 시 반드시 extends Thread를 상속받아야한다!!!
class A1 extends Thread {
	public A1 (String str) {
		super (str);
	}
	
	//run은 super가 갖고 있는 method -> run은 스케쥴러에 의해서 CPU 할당해준다.
	@Override
	public void run() {
		for (int i = 1; i<=100; i++) {
			System.out.print(getName()+i+"\t");
			if ( i%10==0) System.out.println();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
//				e.printStackTrace();
			}
		}
		super.run();
	}
	
}

public class ThreadEx01 {

	public static void main(String[] args) {
		A1 a1 = new A1("subA");
		A1 a2 = new A1("subB");
		a1.start();
		a2.start();
		//cpu할당받기 위해 대기중인 상태
		//start만 걸어놓으면, cpu scheduling이 나중에 받는다.
		//언젠가는 주지만, 우선순위가 밀린다.
		//보통 start와 run을 같이 쓰지는 않는다.
		//
//		a1.run();
//		a2.run();
		for ( int i = 1; i<=100; i++) {
			System.out.print("Main " + i + "\t");
			if ( i%10==0) System.out.println();
		}

	}

}
