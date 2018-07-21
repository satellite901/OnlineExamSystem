package cn.dao;


import java.util.List;

import cn.bean.User;

public interface UserDao
{
	public User findUser(String userName,String password,int identity);//�û���¼
	
	public boolean doUser(User user);//����û�
	
	public boolean delUser(String user_name);//ɾ���û�
	
	public boolean updateUser(User user );//�޸��û�
	
	public User findUserById(int id);//ͨ��id��ѯ�û�
	
	
	
	public List<User> findUserByidentity(int did);//��ѯͬһ��ݵ������û�

	public User findUserByUserName(String user_name);

	public boolean updatePwd(String user_name, String newPwd);
}
