package ch10_ex05;

public class MyExceptionEx02 {

	public static void main(String[] args) {
		// Buz Rule
		// 최소급여 100 ~ 최대급여 1,000만원
		System.out.println("java MyExceptionEx02 num1");

		try {
			int kkk = Integer.parseInt(args[0]);
			//int kkk가... 꼭... try문 안으로 들어와야된다.
			//try밖에 두면 catch를 할 수 없다!
			if (kkk <100) throw new MyException0201();
			if (kkk > 1000) throw new MyException0202();
			System.out.println("정상 실행.");
		
		} catch (MyException0201 e) {
			System.out.println(e.getMessage());
			
		} catch (MyException0202 e) {
			System.out.println(e.getMessage());
//		catch (MyException0201 e | MyException0202 e) {
//			System.out.println(e.getMessage());
//		} 위의 2줄을 1줄로 나눌 수 있다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java MyExceptionEx2 num1");
		// 위의 ArrayIndexOutOfBoundsException가 int kkk block 가 try 문 안에 들어와야한다..!
		} catch (Exception e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java MyExceptionEx2 num1");
		}

	}

}


//1.최소급여
//java MyExceptionEx02 num1
//사장님 100만원 보다 적어요 !! 이 뭡니다
//2.최대급여
//사장님 1000만원 넘 많아요, 좀 적당히 합시다
//3.정상급여
//java MyExceptionEx02 num1
//정상실행.
//4.잘못된 수행 
//java MyExceptionEx02 num1
//실행 매개값의 수가 부족합니다.
//[실행 방법]
//java MyExceptionEx2 num1