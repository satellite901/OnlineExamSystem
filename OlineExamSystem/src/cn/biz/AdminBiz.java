package cn.biz;

import cn.bean.User;
import cn.dao.UserDao;
import cn.dao.impl.JudgeDaoImpl;
import cn.dao.impl.MultiplechoiceDaoImpl;
import cn.dao.impl.SinglechoiceDaoImpl;
import cn.dao.impl.UserDaoImpl;

public class AdminBiz {
	
	
	/*
	 * 添加用户
	 */
	public boolean doUser(User user){
	 boolean isFlag = false;
	 UserDao udi = new UserDaoImpl();
	 if(user!=null)
	 isFlag =udi.doUser(user);
	 return isFlag ; 
	}
	
	/*
	 * 删除用户
	 */
	public boolean delUser(String userName){
		boolean isFlag = false;
		UserDao udi = new UserDaoImpl();
		if(userName!=null)
		isFlag = udi.delUser(userName);
		return isFlag;
	}
	/*
	 * 重置密码
	 */
	public boolean updateUserPassword( String user_name, String newPwd){
		boolean isFlag = false;
		UserDao udi = new UserDaoImpl();
		if(user_name!=null&&newPwd!=null)
		isFlag = udi.updatePwd(user_name, newPwd);
		return isFlag;
	}
	/*
	 * 修改用户资料
	 */
	public boolean updateUser(User user){
		boolean isFlag = false;
		UserDao udi = new UserDaoImpl();
		if(user.getUser_name()!=null)
		isFlag = udi.updateUser(user);
		return isFlag;
	}
	
	
	
	
	

}
