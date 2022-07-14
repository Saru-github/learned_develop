package chapter3.ch13.userinfo.dao.oracle;

import chapter3.ch13.userinfo.UserInfo;
import chapter3.ch13.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB userID =" +userInfo.getUserId());
		
	}

	@Override
	public void updatetUserInfo(UserInfo userInfo) {
		System.out.println("Update into Oracle DB userID =" +userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from Oracle DB userID =" +userInfo.getUserId());
		
	}

}
