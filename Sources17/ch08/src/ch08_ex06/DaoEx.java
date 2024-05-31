package ch08_ex06;

public class DaoEx {
	public static void dbwork(DataAccessObject dao) {
		//				DataAccessObject로 받는다
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		//부모 객체에 자식 개체 대입은 가능하다
		
//		DataAccessObject odao1 = new OracleDao();
//		dbwork(odao1);
//		이게 늘 쓰던 방식이다 (위)
//		아래 방법도 이해하면 충분히 쓸 수 있다. 같은 의미이다!
		dbwork(new OracleDao());
		dbwork(new MysqlDao());

	}

}
