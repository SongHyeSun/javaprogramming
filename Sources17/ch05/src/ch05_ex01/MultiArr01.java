package ch05_ex01;

//debug대상
public class MultiArr01 {

	public static void main(String[] args) {
		int [ ] [ ] a = new int [2] [3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		
		
		for (int i = 0; i < a.length; i++) {// 행 2
			for (int j =0 ; j < a[i].length ; j++) { //열 3
				// System.out.println("일반 For a[" + i + "][" + j "]=" +a[i][j]) ;
				System.out.print("일반 For " + a [i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("===================향상For==================");
		//1차원일때는 1차원으로 받고, 2차원일때는 2차원으로 받는다.
		for (int [] K1 : a) { // a[0], a[1] 1차원 배열을 통째로 넘겨준다.
			for (int K2 : K1) { // 0번행 a[0] --> [0][0]. [0][1]. [0][2]
								// 1번행 a[1] --> [1][0]. [1][1]. [1][2]
				System.out.print("확장 For->"+K2 + "\t");
			}
			System.out.println();
		}
		
	}

}
