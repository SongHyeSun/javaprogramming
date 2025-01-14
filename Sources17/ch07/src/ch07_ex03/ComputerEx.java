package ch07_ex03;

public class ComputerEx {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int [] values1 = {1,2,3};
		// 							{1,2,3}
		int result1 = myCom.sum1(values1);
		System.out.println("result 1: "+result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 :" +result2);
		
		int result31 = myCom.sum2(1,2);
		//...값은 가변 변수처럼 인식된다. 넣고싶은 대로 넣으면 된다.
		//return을 int로 했구나 
		//배열 객체를 넣어주겠다는 뜻
		System.out.println("result3 : "+result31);
		
		int result32 = myCom.sum2(1,2,3);
		System.out.println("result4 : "+result32);
		
		int result41 = myCom.sum2(1,2,3,4,5);
		System.out.println("result41 :"+result41);
		
		int result50 = myCom.sum2(5);
		System.out.println("result50 :"+result50);
	
	}

}
