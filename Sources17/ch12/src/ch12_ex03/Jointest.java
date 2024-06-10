package ch12_ex03;

import java.util.ArrayList;

class Before extends Thread {
	Before(String str) {
		super(str);
	}
	void addCar() {
		System.out.println("addCar");
		Jointest.carList.add("벤츠");
		Jointest.carList.add("아우디");
		Jointest.carList.add("SM7");
		Jointest.carList.add("포르쉐");
	}
	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			// e.printStackTrace();
		}
		addCar();
	}
}

class After extends Thread {
	After(String str) {
		super(str);
	}
	public void run () {
		System.out.println(getName());
		for (String car : Jointest.carList) {
			System.out.println(car);
		}
	}
}


public class Jointest {
	
	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {
		Before bf = new Before("우선");
		After af = new After("나중에");
		bf.start();
		try {
			bf.join();
			//bf를 다 실행시킨 후, 실행시키겠다는 뜻이다.
			//즉, 해당 thread가 die할 때 까지 기다리겠다는 뜻이다. -> die가 되야 빠져나간다.
		} catch (InterruptedException e) {
			// TODO: handle exception
			// e.printStackTrace();
		}
		af.start();

	}

}
