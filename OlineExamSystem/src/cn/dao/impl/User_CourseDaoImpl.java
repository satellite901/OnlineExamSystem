package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.User_Course;
import cn.dao.User_CourseDao;
import cn.dbc.BaseDao;

public class User_CourseDaoImpl implements User_CourseDao {

	BaseDao bs = new BaseDao();
//	List<Object> lp = new ArrayList<Object>();
//	List<User_Course> list = new ArrayList<User_Course>();
//	User_Course us = new User_Course();
//	boolean isFlag = false;
	@Override
	public List<User_Course> findAllUser_Course() {
		// TODO Auto-generated method stub
		List<User_Course> list = null;
		List<Object> lp = new ArrayList<Object>();
		String sql = "select * from user_course";
		list = bs.query(sql, lp, User_Course.class);
		return list;
	}

	@Override
	public List<User_Course> findUser_CourseByUserName(String userName) {
		// TODO Auto-generated method stub
		List<User_Course> list = null;
		List<Object> lp = new ArrayList<Object>();
		String sql = "select * from user_course where user_name=?";
		lp.add(userName);
		list = bs.query(sql, lp, User_Course.class);
		
		return list;
	}

	@Override
	public List<User_Course> findUser_CourseByCourseId(int courseId) {
		// TODO Auto-generated method stub
		List<User_Course> list = null;
		List<Object> lp = new ArrayList<Object>();
		String sql = "select * from user_course where course_id=?";
		lp.add(courseId);
		list = bs.query(sql, lp, User_Course.class);
		return list;
	}

	@Override
	public boolean doUser_Course(User_Course us) {
		// TODO Auto-generated method stub
		boolean isFlag = false;
		List<Object> lp = new ArrayList<Object>();
		String sql = "insert into user_course(user_name,course_id) values(?,?)";
		
		lp.add(us.getUser_name());
		lp.add(us.getCourse_id());
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean updateUser_Course(User_Course us) {
		// TODO Auto-generated method stub
		boolean isFlag = false;
		List<Object> lp = new ArrayList<Object>();

		String sql = "update user_course set user_name=?,course_id=? where id=?";
		lp.add(us.getUser_name());
		lp.add(us.getCourse_id());
		lp.add(us.getId());
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean delUser_Course(int id) {
		// TODO Auto-generated method stub
		List<Object> lp = new ArrayList<Object>();
		boolean isFlag = false;
		String sql  = "delete from user_course where id =?";
		lp.add(id);
		isFlag = bs.update(sql, lp);
		return isFlag;
	}

}
