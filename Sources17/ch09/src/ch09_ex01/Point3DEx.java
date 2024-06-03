package ch09_ex01;

class Point3D {
	int x, y, z;
	
	public Point3D (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//@override를 없애야한다.
	public boolean equals(Point3D pd) {
		boolean result = false;
		if (x==pd.x && y == pd.y) result = true;
		return result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		String showStr = "[x="+x+" , y= " +y+ " , z= "+z+"]";
		
		return showStr;
	}
	
	
}

public class Point3DEx {

	public static void main(String[] args) {
		Point3D pd1 = new Point3D(1, 2, 3);
		Point3D pd2 = new Point3D(1, 2, 4);
		Point3D pd3 = new Point3D(1, 2, 5);
		
		if (pd1.equals(pd2)) System.out.println("같다");
		else				 System.out.println("다르다");
		
		if (pd1 == pd2)      System.out.println("같다");
		else				 System.out.println("다르다");
		
		System.out.println(pd1);
		System.out.println(pd3);

	}

}