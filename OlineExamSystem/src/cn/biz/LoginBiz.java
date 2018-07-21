package cn.biz;

import cn.bean.User;
import cn.dao.impl.UserDaoImpl;

public class LoginBiz {
 
	public User login(String userName,String password,int identity){
		User user = null;
		UserDaoImpl udi = new UserDaoImpl();
		user = udi.findUser(userName, password, identity);
		return user;
	}
	 
}
