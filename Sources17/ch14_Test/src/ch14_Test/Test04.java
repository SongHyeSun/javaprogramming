package ch14_Test;

//각각 K1 k1, K2 k2 각각의 Thread 수행하는 main Method를 완성하시오.

//Thread 상속 
class K1 extends Thread {
  public void run() {
      for (int i = 0; i < 20; i ++) {
          System.out.print("k1..");
      }
      System.out.println();
  }
}

//Runnable 구현 
class K2 implements Runnable {
  public void run() {
      for (int i = 0; i < 20; i ++) {
          System.out.print("k2..");
      }
      System.out.println();
  }
}

//문항4
public class Test04 {

	public static void main(String[] args) {
		// 각각 K1 k1 , K2 k2 각각의  Thread 수행 하는 main Method를 완성하시요
		K1 k1 = new K1();
		//2줄로 만들어도 되고,
//		K2 k2 = new K2();
//		Thread th1 = new Thread (k2);
		//1줄로 만들어도 된다.
		Thread k2  = new Thread(new K2());

		k1.start();
		k2.start();
//		th1.start();

	}

}