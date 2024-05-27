package ch03_ex02;

public class ex0202 {

	public static void main(String[] args) {
		int score = 85;
		String result = (! (score>90 ) ) ?  "가" : "나" ;
		//90보다 크지 않으면, 맞으면 가 틀리면 나, 즉 90보다 크지 않으므로 true 여서 가
		System.out.println(result);

	}

}
