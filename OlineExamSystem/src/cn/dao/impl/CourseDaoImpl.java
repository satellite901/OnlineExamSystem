package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.Course;
import cn.dao.CourseDao;
import cn.dbc.BaseDao;

public class CourseDaoImpl implements CourseDao {

	BaseDao bs = new BaseDao();
	//List<Course> list = new ArrayList<Course>();
	//List<Object> lp = new ArrayList<Object>();
	//Course c = new Course();
	//boolean isFlag = false;
	
	@Override
	public Course findCourseById(int id) {
		// TODO Auto-generated method stub
		Course c = new Course();
		List<Course> list =null;
		List<Object> lp = new ArrayList<Object>();
		String sql ="select * from course where id=?";
		lp.add(id);
		list =  bs.query(sql, lp, Course.class);
		if(list.size()>0){
			c = list.get(0);
		}
		return c;
	}

	@Override
	public List<Course> findAllCourse() {
		// TODO Auto-generated method stub
		List<Course> list = new ArrayList<Course>();
		List<Object> lp = new ArrayList<Object>();
		String sql = "select * from course";
		list = bs.query(sql, lp, Course.class);
		return list;
	}

	@Override
	public boolean doCourse(Course c) {
		// TODO Auto-generated method stub
		boolean isFlag = false;
		List<Object> lp = new ArrayList<Object>();
		String sql = "insert into course(course_name) values(?)";
		lp.add(c.getCourse_name());
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean updateCourse(Course c) {
		// TODO Auto-generated method stub
		List<Object> lp = new ArrayList<Object>();
		boolean isFlag = false;
		String sql = "update course set course_name=? where id=?";
		lp.add(c.getCourse_name());
		lp.add(c.getId());
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean isExist(String courseName) {
		// TODO Auto-generated method stub
		boolean isFlag = false;
		List<Course> list =null;
		List<Object> lp = new ArrayList<Object>();
		String sql = "select * from course where course_name=?";
		lp.add(courseName);
		list =  bs.query(sql, lp, Course.class);
		if(list.size()>0){
			isFlag = true;
		}
		return isFlag;
	}
	
	

}
