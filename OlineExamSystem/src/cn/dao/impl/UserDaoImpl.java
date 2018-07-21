package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.User;
import cn.dao.UserDao;
import cn.dbc.BaseDao;

public class UserDaoImpl implements UserDao
{
     BaseDao  bs = new BaseDao();
	@Override
	public User findUser(String userName, String password,int identity)
	{
		User user=null;
		String sql="select * from user where user_name=? and password=? and identity_id=?";
		 List <User> list = new ArrayList<User>();
		 List <Object> lp = new ArrayList<Object>();  //存放占位符的值
		 lp.add(userName);   //按顺序添加占位符的值到集合里面
		 lp.add(password);
		 lp.add(identity);
		list =  bs.query(sql, lp, User.class) ;
		if(list.size()>0){
			user=list.get(0);
		}
		
		return user;
	}

	@Override
	public boolean doUser(User user)
	{
		boolean isFlag=false;
		String sql="insert into user(name,sex,user_name,password,identity_id) values(?,?,?,?,?)";
		List <Object> lp=new ArrayList<Object>();
		lp.add(user.getName());
		lp.add(user.getSex());
		lp.add(user.getUser_name());
		lp.add(user.getPassword());
		lp.add(user.getIdentity_id());
		isFlag=bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean delUser(String user_name)
	{
		boolean isFlag=false;
		String sql="delete from user where user_name=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(user_name);
		isFlag=bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean updateUser(User user )
	{
		boolean isFlag=false;
		String sql="update user set ";
		List<Object> lp=new ArrayList<Object>();
		if(user.getName()!=null){
			sql+="name=?,";
			lp.add(user.getName());
		}
		if(user.getSex()!=null){
			sql+="sex=?,";
			lp.add(user.getSex());
		}
		if(user.getPassword()!=null){
			sql+="password=?,";
			lp.add(user.getPassword());
		}
		if(user.getIdentity_id()!=0){
			sql+="identity_id=?";
			lp.add(user.getIdentity_id());
		}
		
		if(sql.endsWith(",")){
			sql = sql.substring(0, sql.length()-1);
		} 
		sql+=" where user_name=?";
		lp.add(user.getUser_name());
		
		isFlag=bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public User findUserByUserName(String user_name)
	{
		
		User user=null;
		String sql="select * from user where user_name=? ";
		List <User> list = new ArrayList<User>();
		List<Object> lp=new ArrayList<Object>();
		lp.add(user_name);
		list=bs.query(sql, lp, User.class);
		if(list.size()>0){
			user=list.get(0);
		}
		return user;
	}

	@Override
	public boolean updatePwd(String user_name, String newPwd)
	{
		boolean isFlag=false;
		String sql="update user set password=? where user_name=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(newPwd);
		lp.add(user_name);		
		isFlag=bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public List<User> findUserByidentity(int identity_id)
	{
		List<User> list=new ArrayList<User>();
		String sql = "select * from user where identity_id = ?";
		List<Object> lp = new ArrayList<Object>();
		lp.add(identity_id);
		list=bs.query(sql, lp, User.class);
		return list;
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		User user =null;
		List<User> list=null;
		List<Object> lp = new ArrayList<Object>();
		String sql = "select * from user where id=?";
		lp.add(id);
		list = bs.query(sql, lp, User.class);
		if(list.size()>0){
			user = list.get(0);
		}
		return user;
	}




}
