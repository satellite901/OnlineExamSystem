package cn.dao;

import java.util.List;

import cn.bean.Record;

public interface RecordDao
{
	public List<Record> findAllRecord(); //��ѯ���п����Ŀ��Խ��
	
	public Record findRecordByUser_id(int id); //��ѯѡ�������Ŀ��Խ��
	
	public List<Record>  findRecordByExam_id(int Exam_id); //��ѯѡ���Ծ�Ŀ��Խ��
	
	public List<Record> findExamByDifficult(int Exam_id,String difficult);// ��ԃ�x���Ѷȵľ����Ծ�Ŀ��ԽY��
	//select * from record where Course_id=? and difficult=?
	
	public boolean updateRecord(int user_id,int exam_id,String jud_ans,String sch_ans, String mch_ans,String difficult, String exam_time, double score, String finish_time );
	//������ѧ���ļ�¼��
	
	
	 
	
	
	
	
	
	
}
