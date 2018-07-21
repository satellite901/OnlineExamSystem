package cn.dao;

import java.util.List;

import cn.bean.Identity;

public interface IdentityDao
{
	public Identity findIdentityById(int id);  //����id�����
	
	public List<Identity> findAllIdentity();  //��ȡ���е����
	
	public Identity findIdentityByName(String name); //�����������ȡIdentity
}
