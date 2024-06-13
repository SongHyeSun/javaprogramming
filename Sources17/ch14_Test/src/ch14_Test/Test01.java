package ch14_Test;

//문항1번
public class Test01{
	
    public static void main(String[] args) {   
        int a=5, b=5, aa, bb;
        aa = ++a;	//6
        bb = b++;	//bb = 5, b = 6  //logic이 돌아갈때 다른 값을 갖고 싶으면 이렇게 쓴다.
        System.out.println("aa="+aa+" bb="+bb);
        System.out.println("a="+a+" b="+b);
       
        int i = 10;
        System.out.println(i++); //먼저 10으로 프린트 하고 결과값은 11로
        System.out.println(++i); //증가 먼저하고 출력이라 12
        System.out.println(i);
    }
}

