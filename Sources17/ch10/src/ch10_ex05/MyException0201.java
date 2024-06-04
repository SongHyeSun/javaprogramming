package ch10_ex05;

// 최소 임금 Error Msg
public class MyException0201 extends Exception {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
//		return super.getMessage();
		String ErrMsg;
		ErrMsg = "사장님 100만원 보다 적어요 !! 이 뭡니다";
		return ErrMsg;
	}

}
