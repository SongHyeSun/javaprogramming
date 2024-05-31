package ch08_ex01;

public class VolumeEx {

	public static void main(String[] args) {
		Volume [] vol = new Volume[3];
		vol[0] = new TV();
		vol[1] = new Speaker();
		vol[2] = new Audio();
		
		for (Volume v : vol) {
			v.volumeUp();
			v.VolumeDown();
			//반드시 instanceof를 써서 관련된 것만 보여주어야 한다.
			if (v instanceof TV) {
				((TV)v).play();
			}
		}
		

	}

}

//정답
//TV Volume 올리기
//TV Volume 내리기
//TV 화면을 본다
//Speaker Volume 올리기
//Speaker Volume 내리기
//Audio Volume 올리기
//Audio Volume 내리기