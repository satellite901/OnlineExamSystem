package cn.dao;


import java.util.List;

import cn.bean.User;

public interface UserDao
{
	public User findUser(String userName,String password,int identity);//用户登录
	
	public boolean doUser(User user);//添加用户
	
	public boolean delUser(String user_name);//删除用户
	
	public boolean updateUser(User user );//修改用户
	
	public User findUserById(int id);//通过id查询用户
	
	
	
	public List<User> findUserByidentity(int did);//查询同一身份的所有用户

	public User findUserByUserName(String user_name);

	public boolean updatePwd(String user_name, String newPwd);
}
