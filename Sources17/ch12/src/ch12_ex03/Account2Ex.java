package ch12_ex03;

// Thread화 시켜준다. thread 생성
class Account2User extends Thread {
	Account2  act;
	boolean   flag;
	//없으면 false가 우선
	
	public Account2User(Account2 act, String name) {
		super(name);
		this.act = act;
	}
	
	//au1 instance 당 5번씩 !
	public void run () {
		for (int i = 0; i <5 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				// e.printStackTrace();
				
				//내가 act를 시켜놓으면, 다른 객체가 해당 instance에 접근할 수 없도록 하는 것
			} synchronized (act) {
				if (flag) act.deposit((int) (Math.random()*10000), getName());
				else	  act.withdraw((int)(Math.random()*10000), getName());
				flag  = ! flag;  //flag SWAP
			}
			//까지 for문 안에서 돌아간다.
		}
	}
}






public class Account2Ex {

	public static void main(String[] args) {
		//association이다.
		//girl Group --> 뉴진스
		Account2 act1 = new Account2(10000);
		// men Group --> BTS
		Account2 act2 = new Account2(15000);
		//act1과 act2가 생성자로 반드시 만들어져야 한다.
		
	
		//Group별로 하나의 계좌를 쓰겠다는 것
		//같은 계정을 사용할 때에는 synchronized method를 사용해야 한다.
		//하나의 계좌를 3명이 같이 쓰는 것
		//act1이 call by reference하는 것이다. 주소값으로 움직이는 것
		Account2User au1 = new Account2User(act1, "하니");
		Account2User au2 = new Account2User(act1, "민지");
		Account2User au3 = new Account2User(act1, "혜린");
		
		Account2User au4 = new Account2User(act2, "정국");
		Account2User au5 = new Account2User(act2, "뷔");
		Account2User au6 = new Account2User(act2, "지민");

		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();

	}

}
