package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.Record;
import cn.dao.RecordDao;
import cn.dbc.BaseDao;

public class RecordDaoImpl implements RecordDao
{

	BaseDao bs= new BaseDao();
	public RecordDaoImpl()
	{
	}

	public List<Record> findAllRecord()
	{
		bs.getConenction();
		List<Record> list = null;
		List<Object> lp =new ArrayList<Object>();
		String sql= "select * from record ";
		bs.query(sql, lp, Record.class);
		return list;
	}

	public Record findRecordByUser_id(int id)
	{
		bs.getConenction();
		Record record= null;
		List<Object> lp =new ArrayList<Object>();
		List<Record> list = new ArrayList<Record>();
		String sql= "select * from record where id =? ";
		lp.add(id);
		bs.query(sql, lp, Record.class);
		if(list.size()>0)
		{
			record= list.get(0);
		}
		return record;
	}

	public List<Record> findRecordByExam_id(int Exam_id)
	{
		bs.getConenction();
		List<Object> lp =new ArrayList<Object>();
		List<Record> list = null;
		String sql= "select * from record ";
		lp.add(Exam_id);
		bs.query(sql, lp, Record.class);
		
		return list;
	}

	public List<Record> findExamByDiffcult(int Exam_id, String difficult)
	{
		
		bs.getConenction();
		List<Object> lp =new ArrayList<Object>();
		List<Record> list = null;
		String sql= "select * from record where exam_id=? and diffcult=?";
		lp.add(Exam_id);
		lp.add(difficult);
		bs.query(sql, lp, Record.class);
		return list;
	}
	
	public boolean updateRecord(int user_id,int exam_id,String jud_ans,String sch_ans, String mch_ans,String difficult, String exam_time, double score, String finish_time )
	{
		boolean isFlag = false; 
		List<Object> lp =new ArrayList<Object>();
		bs.getConenction();
		String sql= "insert into record(user_id,exam_id,jud_ans,sch_ans,mch_ans,difficult,exam_time,score,finish_time)values(?,?,?,?,?,?,?,?,?)";
		lp.add(user_id);
		lp.add(exam_id);
		lp.add(jud_ans);
		lp.add(sch_ans);
		lp.add(mch_ans);
		lp.add(difficult);
		lp.add(exam_time);
		lp.add(score);
		lp.add(finish_time);
		isFlag= bs.update(sql,lp);
		return isFlag;
	}

	@Override
	public List<Record> findExamByDifficult(int Exam_id, String difficult)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
