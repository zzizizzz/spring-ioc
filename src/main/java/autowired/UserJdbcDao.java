package autowired;

import org.springframework.stereotype.Repository;
//@Repository 자동스캔 <Bean> 작성이 필요없다
@Repository
public class UserJdbcDao implements UserDao{
	@Override
	public void insertUser() {
		System.out.println("jdbc 기술로 사용자 저장하기");
	}
	
	@Override
	public void updateUser() {
		System.out.println("jdbc 기술로 사용자 수정하기");
		
	}
	
	@Override
	public void getUser() {
		System.out.println("jdbc 기술로 사용자 조회하기");
		
	}

}
