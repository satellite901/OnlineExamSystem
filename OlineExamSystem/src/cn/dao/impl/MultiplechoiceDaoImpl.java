package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

 
import cn.bean.Multiplechoice;
import cn.bean.Singlechoice;
import cn.dao.MultiplechoiceDao;
import cn.dbc.BaseDao;

public class MultiplechoiceDaoImpl implements MultiplechoiceDao{
	
	BaseDao bs= new BaseDao();

	@Override
	public boolean delMultiplechoice(int id) {
		boolean isflag=false;
		String sql="delete from multiplechoice where id=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		isflag=bs.update(sql, lp);
		return isflag;
	}

	

	@Override
	public  Multiplechoice  findMultiplechoiceById(int id) {
		List<Multiplechoice> list=null;
		Multiplechoice mch = null;
		String sql="select * from multiplechoice where id=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		list=bs.query(sql, lp, Multiplechoice.class);
		if(list.size()>0){
			mch = list.get(0);
		}
		return mch;
	}

	@Override
	public boolean doMultiplechoice(Multiplechoice multiplechoice) {
		boolean isflag=false;
		String sql="insert into multiplechoice( name,option_a,option_b,option_c,option_d,option_e,option_f,deff_degree,answer,course_id) values( ?,?,?,?,?,?,?,?,?,?)";
		List<Object> lp=new ArrayList<Object>();
		 
		lp.add(multiplechoice.getName());
		lp.add(multiplechoice.getOption_a());
		lp.add(multiplechoice.getOption_b());
		lp.add(multiplechoice.getOption_c());
		lp.add(multiplechoice.getOption_d());
		lp.add(multiplechoice.getOption_e());
		lp.add(multiplechoice.getOption_f());
		lp.add(multiplechoice.getDeff_degree());
		lp.add(multiplechoice.getAnswer());
		lp.add(multiplechoice.getCourse_id());
		isflag=bs.update(sql, lp);
		return isflag;
		
	}

	@Override
	public List<Multiplechoice> findAllMultiplechoice() {
		List<Multiplechoice> list=null;
		String sql="select * from multiplechoice";
		List<Object> lp=new ArrayList<Object>();
		list=bs.query(sql, lp, Multiplechoice.class);
		return list;
		
	}



	@Override
	public boolean updateMultiplechoice(Multiplechoice multipleChoice) {
		boolean isflag=false;
		String sql="update multiplechoice set id=?,name=?,option_a=?,option_b=?,option_c=?,option_d=?,option_e=?,option_f=?,deff_degree=?,answer=?,course_id=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(multipleChoice.getId());
		lp.add(multipleChoice.getName());
		lp.add(multipleChoice.getOption_a());
		lp.add(multipleChoice.getOption_b());
		lp.add(multipleChoice.getOption_c());
		lp.add(multipleChoice.getOption_d());
		lp.add(multipleChoice.getOption_e());
		lp.add(multipleChoice.getOption_f());
		lp.add(multipleChoice.getDeff_degree());
		lp.add(multipleChoice.getAnswer());
		lp.add(multipleChoice.getCourse_id());
		isflag=bs.update(sql, lp);
		return isflag;
	}



	@Override
	public List<Multiplechoice> findMultiplechoiceByStr(String str) {
		List<Multiplechoice> list=null;
		String sql="select * from multiplechoice where name like ?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(str);
		list=bs.query(sql, lp, Multiplechoice.class);
		return list;
	}



	@Override
	public int getLastId() {
		int id = -1;
		String sql = "select * from Multiplechoice where id=(select max(id)from Multiplechoice)";
		List<Multiplechoice> list=null;
		Multiplechoice mc = null;
		List<Object> lp=new ArrayList<Object>();
		list=bs.query(sql, lp, Multiplechoice.class);
		if(list.size()>0){
			mc = list.get(0);
			id = mc.getId();
		}
		
		return id;
	}



	@Override
	public List<Multiplechoice> findMultiplechoiceByCourseId(int course_id) {
		List<Multiplechoice> list =null;
		List<Object> lp = new ArrayList<>();
		String sql = "select * from Multiplechoice where course_id =?";
		lp.add(course_id);
		list = bs.query(sql, lp, Multiplechoice.class);
		
		return list;

	}

}
