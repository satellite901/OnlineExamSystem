package cn.dao;

import java.util.List;

import cn.bean.User_Course;

public interface User_CourseDao {

	public List<User_Course> findAllUser_Course();  //�ҵ������û���γ̹�����Ϣ

	public List<User_Course> findUser_CourseByUserName(String userName); //����username��ѯ��γ̹�����Ϣ

	public List<User_Course> findUser_CourseByCourseId(int courseId);//���ݿγ�ID����ѯ���û���������Ϣ
	
	public boolean doUser_Course(User_Course us); //���һ���û���γ̹�������Ϣ
	
	public boolean updateUser_Course(User_Course us);  //����һ����Ϣ
	
	public boolean delUser_Course(int id); //����idɾ��һ����Ϣ
}

