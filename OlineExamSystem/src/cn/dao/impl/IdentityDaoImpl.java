package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.Identity;
import cn.dao.IdentityDao;
import cn.dbc.BaseDao;

public class IdentityDaoImpl implements IdentityDao {

	BaseDao bs = new BaseDao();
	@Override
	public Identity findIdentityById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from identity where id=?";
		Identity i = null;
		List<Identity> list = null;
		List<Object> lp = new ArrayList<>();
		lp.add(id);
		list =  bs.query(sql, lp, Identity.class) ;
		if(list.size()>0){
			i=list.get(0);
		}
		
		return i;
	}

	@Override
	public List<Identity> findAllIdentity() {
		// TODO Auto-generated method stub
		List<Identity> list = null;
		String sql ="select * from identity";
		List<Object> lp = new ArrayList<>();
		list = bs.query(sql, lp, Identity.class);
		return list;
	}

	@Override
	public Identity findIdentityByName(String name) {
		// TODO Auto-generated method stub
		Identity i =null;
		String sql = "select * from identity where name=?";
		List<Object> lp = new ArrayList<>();
		List<Identity> list = null;
		lp.add(name);
		list = bs.query(sql, lp, Identity.class) ;
		if(list.size()>0){
			i = list.get(0);
		}
		return i;
	}

}
