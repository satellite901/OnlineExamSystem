package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.Judge;
import cn.bean.Singlechoice;
import cn.dao.SinglechoiceDao;
import cn.dbc.BaseDao;

public class SinglechoiceDaoImpl implements SinglechoiceDao {

	BaseDao bs = new BaseDao();
	@Override
	public List<Singlechoice> findAllSinglechoice() {
		// TODO Auto-generated method stub
		List<Singlechoice> list =null;
		List<Object> lp = new ArrayList<>();
		String sql = "select * from singlechoice";
		list = bs.query(sql, lp, Singlechoice.class);
		
		return list;
	}

	@Override
	public List<Singlechoice> findSinglechoiceByCourseId(int course_id) {
		// TODO Auto-generated method stub
		List<Singlechoice> list =null;
		List<Object> lp = new ArrayList<>();
		String sql = "select * from singlechoice where course_id =?";
		lp.add(course_id);
		list = bs.query(sql, lp, Singlechoice.class);
		
		return list;
	}

	@Override
	public Singlechoice findSinglechoiceById(int id) {
		// TODO Auto-generated method stub
		List<Singlechoice> list =null;
		Singlechoice sc =null;
		List<Object> lp = new ArrayList<>();
		String sql = "select * from singlechoice where id=?";
		lp.add(id);
		list = bs.query(sql, lp, Singlechoice.class);
		if(list.size()>0){
			sc = list.get(0);
		}
		
		return sc;  
	}

	@Override
	public boolean doSinglechoice(Singlechoice sc) {
		// TODO Auto-generated method stub
		boolean isFlag = false;
		List<Object> lp = new ArrayList<>();
		String sql ="insert into singlechoice(name,option_a,option_b,option_c,option_d,deff_degree,answer,course_id) values(?,?,?,?,?,?,?,?)";
		lp.add(sc.getName());
		lp.add(sc.getOption_a());
		lp.add(sc.getOption_b());
		lp.add(sc.getOption_c());
		lp.add(sc.getOption_d());
		lp.add(sc.getDeff_degree());
		lp.add(sc.getAnswer());
		lp.add(sc.getCourse_id());
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean delSinglechoiceById(int id) {
		boolean isFlag = false;
		List<Object> lp = new ArrayList<>();
		String sql = "delete from singlechoice where id=?";
		lp.add(id);
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean updateSinglechoiceById(Singlechoice sc) {
		// TODO Auto-generated method stub
		boolean isFlag = false;
		List<Object> lp = new ArrayList<>();
		String sql = "update singlechoice set ";
		if(sc.getName()!=null){
			sql+="name=?,";
			lp.add(sc.getName());
		}
		if(sc.getOption_a()!=null){
			sql+="option_a=?,";
			lp.add(sc.getOption_a());
		}
		if(sc.getOption_b()!=null){
			sql+="option_b=?,";
			lp.add(sc.getOption_b());
		}
		if(sc.getOption_c()!=null){
			sql+="option_c=?,";
			lp.add(sc.getOption_c());
		}
		if(sc.getOption_d()!=null){
			sql+="option_d=?,";
			lp.add(sc.getOption_d());
		}
		if(sc.getDeff_degree()!=0.0){
			sql+="deff_degree=?,";
			lp.add(sc.getDeff_degree());
		}
		if(sc.getAnswer()!=null){
			sql+="answer=?,"; 
			lp.add(sc.getAnswer());
		}
		if(sc.getCourse_id()!=0){
			sql +="course_id=? ";
			lp.add(sc.getCourse_id());
		}
		if(sql.endsWith(",")){
			sql = sql.substring(0, sql.length()-1);
		}
		sql+=" where id=?";
		lp.add(sc.getId());
	    isFlag = bs.update(sql, lp);	
		return isFlag;
	}

	@Override
	public int getLastId() {
		int id = -1;
		String sql = "select * from singlechoice where id=(select max(id)from singlechoice)";
		List<Singlechoice> list=null;
		Singlechoice sc = null;
		List<Object> lp=new ArrayList<Object>();
		list=bs.query(sql, lp, Singlechoice.class);
		if(list.size()>0){
			sc = list.get(0);
			id = sc.getId();
		}
		
		return id;
		
		
	}

	@Override
	public Singlechoice findSinglechoiceByStr(String str) {
		List<Singlechoice> list=null;
		Singlechoice singlechoice=null;
		String sql="select * from singlechoice where name like ?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(str);
		list=bs.query(sql, lp, Singlechoice.class);
		if(list.size()>0)
		{
			singlechoice=list.get(0);
		}
		return singlechoice;
	}

}
