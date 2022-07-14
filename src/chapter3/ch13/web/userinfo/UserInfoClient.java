package chapter3.ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import chapter3.ch13.userinfo.UserInfo;
import chapter3.ch13.userinfo.dao.UserInfoDao;
import chapter3.ch13.userinfo.dao.mysql.UserInfoMysqlDao;
import chapter3.ch13.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		UserInfo userInfo = new UserInfo();
		
		UserInfoDao userInfoDao = null;
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}
		else {
			System.out.println("error");
			return;
		}

		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updatetUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}

}
