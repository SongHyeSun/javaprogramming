package ch10_ex04;

public class MyException extends Exception {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
//		return super.getMessage();
		String errMsg;
		//Business(Buz) Logic Error
		errMsg = "아니 10보다 크다니";
		return errMsg;
	}

}