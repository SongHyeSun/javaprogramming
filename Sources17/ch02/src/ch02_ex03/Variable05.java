package ch02_ex03;

public class Variable05 {

	public static void main(String[] args) {
		int n1 = 90;
		int n2 = 90;
		int n3 = 91;
		int sum;
		double avg1;
		double avg2;
		double avg3;
		double avg4;
		
		sum = n1 + n2 + n3;
		avg1 = sum / 3;
		//나머지가 잘려서 나온다.
		avg2 = sum / (float) 3;    //float형을 선언
		//float을 했더니 소숫점 1자리 나옴 왜 한자리? system out에서 .1을 해주어서
		avg3 = (float) ( sum / 3) ;    //정수결과에 float형을 선언
		// 이미 나누고 나서 형전환을 했기 때문에, 이미 날라갔다.
		//즉, avg1값과 같은 값을 이미 만들고 float처리 해준 것
		avg4 = (float) sum / 3;
		//어느 하나라도 float이면 float값이 나온다.
		//avg1,3은 둘 다 int 값으로 이미 계산이 된 것이고, avg2,4는 float이 하나 섞여있었다.

		System.out.printf("총점 = %d\n", sum); //println
		System.out.printf("평균 = %.1f\n", avg1);
		System.out.printf("평균 = %.1f\n", avg2);
		System.out.printf("평균 = %.1f\n", avg3);
		System.out.printf("평균 = %.1f\n", avg4);
	}

}
