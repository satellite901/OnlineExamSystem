package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.Exam;
import cn.dao.ExamDao;
import cn.dbc.BaseDao;

public class ExamDaoImpl implements ExamDao {

	BaseDao bs = new BaseDao();
	@Override
	public List<Exam> findAllExam() {
		 List<Exam> list= null;
		 String sql = "select * from exam";
		 List<Object> lp = new ArrayList<Object>();
		 list = bs.query(sql, lp, Exam.class);
		return list;
	}

	@Override
	public Exam findExamById(int id) {
		// TODO Auto-generated method stub
		Exam e = null;
		String sql = "select * from exam where id=?";
		List<Exam> list = null;
		List<Object> lp = new ArrayList<Object>();
		lp.add(id);
		list =bs.query(sql, lp, Exam.class);
		if(list.size()>0){
			e = list.get(0);
		}
		return e;
	}

	@Override
	public List<Exam> findExamByCourseId(int courseId) {
		// TODO Auto-generated method stub
		List<Exam> list = null;
		String sql = "select * from exam where course_id = ?";
		List<Object> lp = new ArrayList<Object>();
		lp.add(courseId);
		list = bs.query(sql, lp, Exam.class);
		return list;
	}

	@Override
	public List<Exam> findExamByTeacherId(int teacherId) {
		// TODO Auto-generated method stub
		List<Exam> list = null;
		String sql ="select * from exam where teacher_id=?";
		List<Object> lp = new ArrayList<Object>();
		lp.add(teacherId);
		list = bs.query(sql, lp, Exam.class);
		return list;
	}

	@Override
	public boolean doExam(Exam e) {
		// TODO Auto-generated method stub
		boolean isFlag = false;
		String sql = "insert into exam(course_id,teacher_id,jud_list,sch_list,mch_list,exam_time) values(?,?,?,?,?,?)";
		List<Object> lp = new ArrayList<Object>();
		lp.add(e.getCourse_id());
		lp.add(e.getTeacher_id());
		lp.add(e.getJud_list());
		lp.add(e.getSch_list());
		lp.add(e.getMch_list());
		lp.add(e.getExam_time());
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean delExamById(int id) {
		boolean isFlag = false;
		String sql = "delete from exam where id=?";
		List<Object> lp = new ArrayList<Object>();
		lp.add(id);
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean updateExam(Exam e) {
		boolean isFlag = false;
		String sql = "update exam set course_id=?,teacher_id=?,jud_list=?,sch_list=?,mch_list=?,exam_time=? where id=?";
		List<Object>lp = new ArrayList<Object>();
		lp.add(e.getCourse_id());
		lp.add(e.getTeacher_id());
		lp.add(e.getJud_list());
		lp.add(e.getSch_list());
		lp.add(e.getMch_list());
		lp.add(e.getExam_time());
		lp.add(e.getId());
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

}
