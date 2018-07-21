package cn.dao;

import java.util.List;

import cn.bean.User_Course;

public interface User_CourseDao {

	public List<User_Course> findAllUser_Course();  //找到所有用户与课程关联信息

	public List<User_Course> findUser_CourseByUserName(String userName); //根据username查询与课程关联信息

	public List<User_Course> findUser_CourseByCourseId(int courseId);//根据课程ID来查询与用户关联的信息
	
	public boolean doUser_Course(User_Course us); //添加一条用户与课程关联的信息
	
	public boolean updateUser_Course(User_Course us);  //更新一条信息
	
	public boolean delUser_Course(int id); //根据id删除一条信息
}

