package cn.dao;

import java.util.List;

import cn.bean.Exam;

public interface ExamDao {

	public  List<Exam> findAllExam();  //��ѯ�����Ծ�
	
	public Exam findExamById(int id); //�����Ծ�ID��ѯ�Ծ�
	
	public List<Exam> findExamByCourseId(int courseId); //��ѯ�γ�IDΪcourse_id�������Ծ�
	
	public List<Exam> findExamByTeacherId(int teacherId);//��ѯ��ʦIDΪteacherId�������Ծ�
	
	public  boolean doExam(Exam e); //���һ���Ծ�
	
	public boolean delExamById(int id); //����idɾ��һ���Ծ�
	
	public boolean updateExam(Exam e); //�޸��Ծ�
}
