package cn.dao;

import java.util.List;

import cn.bean.Course;

public interface CourseDao
{
	public Course findCourseById(int id);  //根据课程ID查询课程
	
	public List<Course> findAllCourse(); //查询所有课程
	
	public boolean doCourse(Course c); //添加课程
	
	public boolean updateCourse(Course c); //修改课程
	
	public boolean isExist(String courseName); //查询课程是否已存在
}
