package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.OutPaper;
import cn.dao.OutPaperDao;
import cn.dbc.BaseDao;

public class OutPaperDaoImpl implements OutPaperDao {

 	BaseDao bs = new BaseDao();
//	List<OutPaper> list = null;
//	OutPaper op = null;
//	List<Object> lp = new ArrayList<Object>();
//	boolean isFlag = false;
	@Override
	public List<OutPaper> findAllOutPaper() {
		// TODO Auto-generated method stub
		List<OutPaper> list = null;
		
		String sql ="select * from outpaper";
	    list = bs.query(sql, new ArrayList<Object>(), OutPaper.class);
		return list;
	}

	@Override
	public OutPaper findOutPaperById(int id) {
		// TODO Auto-generated method stub
		List<Object> lp = new ArrayList<Object>();
		List<OutPaper> list = null;
		OutPaper op = null;
		String sql = "select * from outpaper where id=?";
		lp.add(id);
		list =   bs.query(sql, lp, OutPaper.class) ;
		if(list.size()>0){
			op = list.get(0);
		}
		return op;
	}

	@Override
	public List<OutPaper> findOutPaperByCourseId(int courseId) {
		// TODO Auto-generated method stub
		List<OutPaper> list = null;
		List<Object> lp = new ArrayList<Object>();
		String sql = "select * from outpaper where course_id=?";
		lp.add(courseId);
		list = bs.query(sql, lp, OutPaper.class);
		return list;
	}

	@Override
	public boolean doOutPaper(OutPaper op) {
		// TODO Auto-generated method stub
		List<Object> lp = new ArrayList<Object>();
		boolean isFlag = false;
		String sql ="insert into outpaper(course_id,jud_number,sch_number,mch_number,deff,exam_time) values(?,?,?,?,?,?)";
		lp.add(op.getCourse_id());
		lp.add(op.getJud_number());
		lp.add(op.getSch_number());
		lp.add(op.getMch_number());
		lp.add(op.getDeff());
		lp.add(op.getExam_time());
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean delOutPaper(int id) {
		// TODO Auto-generated method stub
		boolean isFlag = false;
		List<Object> lp = new ArrayList<Object>();
		String sql = "delete from outpaper where id=?";
		lp.add(id);
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean updateOutPaper(OutPaper op) {
		// TODO Auto-generated method stub
		List<Object> lp = new ArrayList<Object>();
		boolean isFlag = false;
		String sql = "update outpaper set course_id=?,jud_number=?,sch_number=?,mch_number=?,deff=?,exam_time=? where id=?";
		lp.add(op.getCourse_id());
		lp.add(op.getJud_number());
		lp.add(op.getSch_number());
		lp.add(op.getMch_number());
		lp.add(op.getDeff());
		lp.add(op.getExam_time());
		lp.add(op.getId());
		isFlag = bs.update(sql, lp);
		
		return isFlag;
	}

}
