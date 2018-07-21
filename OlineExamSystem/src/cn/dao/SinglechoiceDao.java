package cn.dao;

import java.util.List;

import cn.bean.Singlechoice;

public interface SinglechoiceDao {

	public List<Singlechoice> findAllSinglechoice();//找出所有单选题 
	
	public List<Singlechoice> findSinglechoiceByCourseId(int course_id);//找出所有课程ID为course_id的单选题
	
	public Singlechoice findSinglechoiceById(int id); //根据id查询题目
	
	public boolean doSinglechoice(Singlechoice sc); //添加一个题目
	
	public boolean delSinglechoiceById(int id); //删除一个编号为id的题目
	
	public boolean updateSinglechoiceById(Singlechoice sc);  //更新一个题目
	
	public int getLastId(); //获取最后一行数据的ID
	
	public Singlechoice findSinglechoiceByStr(String str);//模糊查询
}