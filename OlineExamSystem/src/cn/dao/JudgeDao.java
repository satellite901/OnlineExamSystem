package cn.dao;

import java.util.List;

import cn.bean.Judge;

public interface JudgeDao {
	/*
	 * 
	 * 此接口设计的方法都是和表judge相关联的数据操作
	 * 
	 */
	
	
	public boolean doJudge(Judge judge);//此方法用于添加判断题题目
	
	public boolean delJudge(int id);//此方法通过题目id删除题目
	
	public Judge findJudgeById(int id);//此方法通过题目id查找题目
	
	public List<Judge> findAllJudge();//
	
	public boolean updateJudge(Judge judge);
	
	public List<Judge> findStrJudge(String str);
	
	public int getLastId(); //获取最后一行的id
	
	public List<Judge> findJudgeByCourse_id(int course_id);//通过课程Id查找判断题

}
