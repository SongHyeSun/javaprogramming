package ch08_ex01;

public class ShapeEx {

	public static void main(String[] args) {
		// Instance 형성 안됨. (객체 생성 안됨)--> abstract class라서 반드시 실행을 먼저 해주어야함
//		Shape sh = new Shape() ;
		Shape[] sh = new Shape[3] ;
		sh[0]   =  new Triangle();
		sh[1]   =  new Rectangle();
		sh[2]   =  new Circle();
		for (Shape s : sh) {
			s.print();
			s.draw();
			if ( s instanceof Rectangle ) {
				((Rectangle)s).display();
			}
		}

	}
	

}

/*------선과 점으로 구성됐다.-------
삼..각형을 그린다
------선과 점으로 구성됐다.-------
사각형을 그린다
Rectangle 사각형 Display을 그린다
------선과 점으로 구성됐다.-------
원...을 그린다*/