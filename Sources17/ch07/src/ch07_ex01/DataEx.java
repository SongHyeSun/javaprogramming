package ch07_ex01;

//Call By Value && Call By Reference  ---> 면접 ***

class Data {
	int kor;
	int eng;
	int math;
	//Call by Reference
	void addRef (Data d1, Data d2) {
	//void는 return값을 주지 않겠다 (logic이 끝나면 알아서 return)
		d1.kor = d2.eng;
		System.out.println("Method국어 점수 : " + d1.kor);
	}
	
	//call by value
//  Return Type    return Method    parameter
	int            addKor           (int kor) {
		System.out.println("kor계산 이전-> " +kor);
		kor +=10;
		System.out.println("kor계산 이후-> " +kor);
		return kor;
		
		//얘를 호출한 곳으로 돌아간다. d3.addKor로
		//return을 안해주면, 아래로 값을 넣어주지 못한다. error가 난다.
		//kor 이 interger여서 반드시 integer형을 가진 걸 return해주어야 한다
	}
}

public class DataEx {

	public static void main(String[] args) {
		//	확보공간의 주소를 가지고 있다
		 Data d1 = new Data();
		 Data d2 = new Data();
		 Data d3 = new Data();
		 //d3_kor는 새로운 int 변수이다. 거기에 d3값을 대입
		 //int d3_kor가 10에서 20으로 된 것이다.
		 d1.kor = 50;
		 d1.math = 70;
		 d2.eng = 80;
		 // *** Instance를 넘겨주면 주소값을 넘겨주는 효과 (메모리 주소번지를 넘겨준다.)
		 //객체를 통째로 넘겨줄 때
		 d3.addRef(d1, d2);
		 System.out.println("Main 국어 점수: "+ d1.kor);
		 //call by reference call
		 //주석값(reference)을 넘겨주었기 때문에, 메모리에 저장되어서 나온다. Array, String등 다 객체
		 //주석값을 넘겨주는 것은 void를 사용해도 된다.
		 //int로 보내주면 하나밖에 못가져온다.
		 int d3_kor = d3.addKor(10);
		 System.out.println("d3_kor->"+d3_kor);
		 System.out.println("d3_kor->"+ d3.kor);
		 //call by value call

	}

}