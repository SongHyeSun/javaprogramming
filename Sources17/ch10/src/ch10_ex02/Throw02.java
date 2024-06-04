package ch10_ex02;

public class Throw02 {

	public static void main(String[] args) {
		int num = 100, result = 0;
		for (int i =0 ; i<10 ; i++) {
			//system error처리 안해주어서 결과가 나올수도, 처음부터 error가 뜰 수도, 중간에 error가 뜰 수도
			//아니면 완젼하게 잘 나올 수도 있다.
			//이런 사태 발생 시 try-catch or throws로
			int ran = (int) (Math.random()*10);
			result = num / ran;
			//따라서 error처리를 잘 해주어야 한다~!!
			System.out.println("나눗셈 결과 : "+result);
		}
	}

}
