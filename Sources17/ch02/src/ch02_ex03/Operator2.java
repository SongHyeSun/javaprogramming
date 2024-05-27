package ch02_ex03;

public class Operator2 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 5;
		boolean result;     //True = 1, False = 0
		result = n1> n2;    //10>5
		System.out.printf("%d  %c  %d  = %b\n", n1, '>', n2, result);
		//boolean이기에 %b로 받는다.
		result = n1< n2;
		System.out.printf("%d  %c  %d  = %b\n", n1, '<', n2, result);
		result =  n1>= n2;
		System.out.printf("%d  %s  %d  = %b\n", n1, ">=", n2, result);
		//%s는 string , char는 한 글자, 하나 이상은 string이어서 %s
		//char는 작은따옴표'  '    , string은 큰따옴표 "   "
		result =  n1<= n2;
		System.out.printf("%d  %s  %d  = %b\n", n1, "<=", n2, result);
		result =  n1  ==  n2;
		System.out.printf("%d  %s  %d  = %b\n", n1, "==", n2, result);
		result =  n1  !=  n2;
		System.out.printf("%d  %s  %d  = %b\n", n1, "!=", n2, result);


	}

}
