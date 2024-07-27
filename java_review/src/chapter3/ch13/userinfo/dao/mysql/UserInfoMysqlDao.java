package chapter3.ch13.userinfo.dao.mysql;

import chapter3.ch13.userinfo.UserInfo;
import chapter3.ch13.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID =" +userInfo.getUserId());
		
	}

	@Override
	public void updatetUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userID =" +userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from MySQL DB userID =" +userInfo.getUserId());
		
	}

}
