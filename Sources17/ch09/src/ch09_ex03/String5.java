package ch09_ex03;

public class String5 {

	public static void main(String[] args) {
		//		  	       0123456   -> .은 index가 5
		String fullName = "Hello.java";
		int	   index    = fullName.indexOf('.');
		System.out.println("index->" + index);
		String fileName = fullName.substring(0, index);
										//       5		-> 0부터 5미만
		
		String ext = fullName.substring(index+1);
									//		5+1부터 끝까지 가라 (지정하지 않으면)
		System.out.println(fullName + "의 확장자를 제외한 이름은 "+ fileName);
		System.out.println(fullName + "의 확장자는 "+ ext);
				

	}

}
