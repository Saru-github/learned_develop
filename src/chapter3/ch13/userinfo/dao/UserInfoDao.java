package chapter3.ch13.userinfo.dao;

import chapter3.ch13.userinfo.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updatetUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);

}
