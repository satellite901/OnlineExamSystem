package cn.dao;

import java.util.List;

import cn.bean.Record;

public interface RecordDao
{
	public List<Record> findAllRecord(); //查询所有考生的考试结果
	
	public Record findRecordByUser_id(int id); //查询选定考生的考试结果
	
	public List<Record>  findRecordByExam_id(int Exam_id); //查询选定试卷的考试结果
	
	public List<Record> findExamByDifficult(int Exam_id,String difficult);// 查詢選定难度的具体试卷的考试結果
	//select * from record where Course_id=? and difficult=?
	
	public boolean updateRecord(int user_id,int exam_id,String jud_ans,String sch_ans, String mch_ans,String difficult, String exam_time, double score, String finish_time );
	//增加新学生的记录表
	
	
	 
	
	
	
	
	
	
}
