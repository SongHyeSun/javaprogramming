package ch14_Test;

//다음 프로그램의 실행결과를 작성하시오

class Super { 
    int index = 5; 
    public void printVal() {
        System.out.println("Super");
    } 
} 
class Sub extends Super {   
    int index = 2;   
    public void printVal() {   
        System.out.println("Sub"); 
    } 
} 

public class Test05 {

	public static void main(String[] args) {
        Super sup = new Sub();
        //super로 받고  sub에세 넘겨줌
        System.out.print(sup.index + " ");
        //index는 무조건 super걸 가져와야 한다! super로 만들어야하기 때문에
        sup.printVal(); 
        //하지만 method는 sub의 method를 받아야 한다.
        
        Sub sub = new Sub();
        System.out.print(sub.index + " ");
      //여기는 멤버변수와 method 둘 다 sub의 것을 가져온다 -> sub로 받아서 sub에 메모리 올려주었기 때문에
        sub.printVal();

	}

}
