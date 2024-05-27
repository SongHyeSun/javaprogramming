package ch05_ex01;

// Debug02
public class ArrayTest4 {

	public static void main(String[] args) {
		int array [ ] = {76, 45, 34, 89, 100, 50, 90, 92};
		int Temp = 0;
		
		//내림차순으로 숫자 정리
		for (int i = 0 ; i < array.length ; i++) {
			for (int j = i +1 ; j<array.length ; j++) {
				if (array[i] > array[j]) {
					//array[i] < array [j]; -> 오름차순!!
					Temp = array[i];
					array[i] = array[j];
					array[j] = Temp;
					//교환을 하겠다는 의미 (다시 확인하기)
				}
			}
		}
		for(int i=0 ; i<array.length; i++) {
			System.out.println(" " + array[i]);
		}
	}

}
