package ch08_ex01;

public abstract class Shape {
	int a  = 3;
	abstract void draw ();
	//일부는 표준화 해주고, 일부는 값을 받아라
	void print () {
		System.out.println("------선과 점으로 구성됐다.-------");
		
	}

}

//HW01
class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
	void display () {
		System.out.println("Rectangle 사각형 Display를 그린다");
	}
	
}
class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("삼..각형을 그린다");
		
	}
	
}
class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("원..을 그린다");
		
	}
	
}