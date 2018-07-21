package cn.dao.impl;

 
import java.util.ArrayList;
import java.util.List;

import cn.bean.Judge;
import cn.dao.JudgeDao;
import cn.dbc.BaseDao;

public class JudgeDaoImpl implements JudgeDao{
	
	BaseDao bs = new BaseDao();



	@Override
	public boolean doJudge(Judge judge) {
		boolean isflag=false;
		String sql="insert into judge(name,deff_degree,answer,course_id) values(?,?,?,?)";
		List<Object> lp=new ArrayList<Object>();
		
		lp.add(judge.getName());
		lp.add(judge.getDeff_degree());
		lp.add(judge.getAnswer());
		lp.add(judge.getCourse_id());
		isflag=bs.update(sql, lp);
		return isflag;
	}

	@Override
	public boolean delJudge(int id) {
		boolean isflag=false;
		String sql="delete from judge where id=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		isflag=bs.update(sql, lp);
		return isflag;
	}

	@Override
	public Judge findJudgeById(int id) {
		List<Judge> list=null;
		Judge judge = null;
		String sql="select * from judge where id=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		list=bs.query(sql, lp, Judge.class);
		if(list.size()>0){
			judge = list.get(0);
		}
		return judge;
	}

	


	@Override
	public List<Judge> findAllJudge() {
		List<Judge> list=null;
		String sql="select * from judge";
		List<Object> lp=new ArrayList<Object>();
		list=bs.query(sql, lp, Judge.class);
		return list;
	}

	@Override
	public boolean updateJudge(Judge judge) {
		boolean isflag=false;
		String sql="update judge set id=?,name=?,deff_degree=?,answer=?,course_id=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(judge.getId());
		lp.add(judge.getName());
		lp.add(judge.getDeff_degree());
		lp.add(judge.getAnswer());
		lp.add(judge.getCourse_id());
		isflag=bs.update(sql, lp);
		return isflag;
	}

	@Override
	public List<Judge> findStrJudge(String str) {
		List<Judge> list=null;
		String sql="select * from judge where name like ?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(str);
		list=bs.query(sql, lp, Judge.class);
		return list;
	}

	@Override
	public int getLastId() {
		int id = -1;
		String sql = "select * from judge where id=(select max(id)from judge)";
		List<Judge> list=null;
		Judge j = null;
		List<Object> lp=new ArrayList<Object>();
		list=bs.query(sql, lp, Judge.class);
		if(list.size()>0){
			j = list.get(0);
			id = j.getId();
		}
		
		return id;
	}

	@Override
	public List<Judge> findJudgeByCourse_id(int course_id) {
		List<Judge> list =null;
		List<Object> lp = new ArrayList<>();
		String sql = "select * from judge where course_id =?";
		lp.add(course_id);
		list = bs.query(sql, lp, Judge.class);
		
		return list;

	}
	
	

}
