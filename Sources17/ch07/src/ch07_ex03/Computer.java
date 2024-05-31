package ch07_ex03;

public class Computer {
	//	result1	{1,2,3}  -> ComputerEx main에서 받은 값
	//	result2 {1,2,3,4,5}
	int sum1 (int[] values) {
		int sum = 0;
		//						3
		for (int i = 0; i <values.length; i++) {
			sum += values[i];
			//sum = sum + 1 =1
			//sum = 1   + 2 =3
			//sum = 3   + 3 =6
		}
		return sum;
	}
	
	int sum2 (int ... values) {
		//...은 배열처럼 취급하는게 아니라 배열로 잡힌다. 
		//-> 인자를 지정해주는 것이 아니라 가변으로 마음대로 사용 가능
		int sum = 0;
		System.out.println("values->"+values);
		for(int i = 0; i < values.length; i++) {
			System.out.println("values[i]->"+values[i]);
			sum += values[i];
		}
		return sum;
	}
	
}
