package cn.dao;

import java.util.List;

import cn.bean.Identity;

public interface IdentityDao
{
	public Identity findIdentityById(int id);  //根据id获身份
	
	public List<Identity> findAllIdentity();  //获取所有的身份
	
	public Identity findIdentityByName(String name); //根据身份名获取Identity
}
