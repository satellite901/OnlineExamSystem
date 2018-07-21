package cn.dao;

import java.util.List;

import cn.bean.Course;

public interface CourseDao
{
	public Course findCourseById(int id);  //���ݿγ�ID��ѯ�γ�
	
	public List<Course> findAllCourse(); //��ѯ���пγ�
	
	public boolean doCourse(Course c); //��ӿγ�
	
	public boolean updateCourse(Course c); //�޸Ŀγ�
	
	public boolean isExist(String courseName); //��ѯ�γ��Ƿ��Ѵ���
}
