package ch04_ex02;

import java.io.IOException;

//HW4 if문 or switch문
public class WhileKeyControlEx {

	public static void main(String[] args) throws IOException {
		boolean run       = true;
		int		   speed    = 0;
		int		   keyCode = 0;
		
		while (run) {
			 if ( keyCode !=13  && keyCode!=10 ) {
				System.out.println("--------------------------------------------");
				System.out.println("1. 증속 |  2. 감속 | 3. 중지 ");
				System.out.println("--------------------------------------------");
				System.out.print("선택:   ");
			 }
			
			keyCode = System.in.read( ) ;
			//숫자 입력 후 enter를 쳐야 들어간다.
			//1을 입력하면 1이 아니라 1의 ascii값이 들어간다.
			//'1'을 해주면 1숫자 그대로가 들어간다.
			
			/*keyCode ->51
			 * 결과 run = false
			 *       Escape
			 *       
			 * if (keyCode == 49) { //1
			 * 		speed++;
			 * 		System.out.println("현재 속도 = " + speed);
			 * }  else if (keyCode == 50) { //2
			 * 		speed --;
			 * 		System.out.println("현재 속도 = " + speed);
			 * }  else if (keyCode == 51) { //3
			 * 		run = false;
			 * 		// System.out.println("run = false");
			 * }
			 */
				
			switch (keyCode) {
				case '1': 
					speed += 1;
					System.out.println("보여줘 " + "[현재 속도 = " + speed + "]");
					break;
				case '2':
					speed -= 1;
					System.out.println("보여줘 " + "[현재 속도 = " + speed + "]");
					break;
				case '3' : 
					run = false;
					break;
			}
		}
		System.out.println("PGM The End");
	}
		
}

				
			
			//우선 keycode가 0이여서 if문 진행
			

			//ascii 코드가 나온다.

		
			
			//System.out.println(":keyCode->" + keyCode);
//			선택: 1
//			keyCode-<49
//			결과 1)  speed +1
//				  2)  보여줘 [현재 속도 =" + speed]
			
//			선택:   2
//			:keyCode->50
//			결과 1) speed -1
//				  2) 보여줘  [현재 속도 =" +speed]
			
//			3
//			:keyCode->51
//			결과 1) run = false	      2) escape




