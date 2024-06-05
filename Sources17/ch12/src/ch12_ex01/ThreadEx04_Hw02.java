package ch12_ex01;

class Th3 extends Thread {
	public Th3(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public void run () {
		for (int i =1; i<=20;i++) {
			System.out.println(getName()+"대박"+i);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}
	}
}

class Th4 extends Thread {
	public Th4(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public void run () {
		for (int i=1;i<=20;i++) {
			System.out.println(getName()+"월요일"+i);
			try {
				sleep(20);
			} catch (InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx04_Hw02 {

	public static void main(String[] args) {
		//Hw02
		//20번씩 수행
		//Th3 -> 10 / 1000 쉼
		//Th4 -> 20 / 1000 쉼
		Th3 t1 = new Th3 ("Th3...");
		Th4 t2 = new Th4 ("Th4...");
		t1.start();
		t2.start();

	}

}

//--- 결과 ------
//Th3...대박1
//Th4...월요일1
//Th3...대박2
//Th4...월요일2
//Th3...대박3
//Th4...월요일3
//Th3...대박4
//Th3...대박5
//Th4...월요일4
//Th3...대박6
//Th4...월요일5
//Th4...월요일6
//Th3...대박7
//Th4...월요일7
//Th3...대박8
//Th3...대박9
//Th4...월요일8
//Th3...대박10
//Th4...월요일9
//Th3...대박11
//Th4...월요일10
//Th3...대박12
//Th4...월요일11
//Th4...월요일12
//Th3...대박13
//Th4...월요일13
//Th3...대박14
//Th3...대박15
//Th4...월요일14
//Th3...대박16
//Th4...월요일15
//Th3...대박17
//Th4...월요일16
//Th3...대박18
//Th4...월요일17
//Th4...월요일18
//Th3...대박19
//Th4...월요일19
//Th3...대박20
//Th4...월요일20