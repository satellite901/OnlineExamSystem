package cn.dao;

import java.util.List;

import cn.bean.Judge;

public interface JudgeDao {
	/*
	 * 
	 * �˽ӿ���Ƶķ������Ǻͱ�judge����������ݲ���
	 * 
	 */
	
	
	public boolean doJudge(Judge judge);//�˷�����������ж�����Ŀ
	
	public boolean delJudge(int id);//�˷���ͨ����Ŀidɾ����Ŀ
	
	public Judge findJudgeById(int id);//�˷���ͨ����Ŀid������Ŀ
	
	public List<Judge> findAllJudge();//
	
	public boolean updateJudge(Judge judge);
	
	public List<Judge> findStrJudge(String str);
	
	public int getLastId(); //��ȡ���һ�е�id
	
	public List<Judge> findJudgeByCourse_id(int course_id);//ͨ���γ�Id�����ж���

}
