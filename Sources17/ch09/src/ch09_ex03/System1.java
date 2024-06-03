package ch09_ex03;

public class System1 {

	public static void main(String[] args) {
		//getenv -> 시스템에 있는 환경을 의미
		String path = System.getenv("path");
		String java_home = System.getenv("JAVA_HOME");
		//설정-시스템-정보-고급 시스템 설정 - 환경변수 - 시스템변수
		//path와 내가 만든 JAVA_HOME이 있고, 그 경로가 있다.
		
		System.out.println(path);
		System.out.println(java_home);

	}

}
