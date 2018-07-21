package cn.dao;

import java.util.List;

import cn.bean.Exam;

public interface ExamDao {

	public  List<Exam> findAllExam();  //查询所有试卷
	
	public Exam findExamById(int id); //根据试卷ID查询试卷
	
	public List<Exam> findExamByCourseId(int courseId); //查询课程ID为course_id的所有试卷
	
	public List<Exam> findExamByTeacherId(int teacherId);//查询教师ID为teacherId的所有试卷
	
	public  boolean doExam(Exam e); //添加一份试卷
	
	public boolean delExamById(int id); //根据id删除一份试卷
	
	public boolean updateExam(Exam e); //修改试卷
}
