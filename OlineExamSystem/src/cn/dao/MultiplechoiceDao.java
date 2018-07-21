package cn.dao;

import java.util.List;

 
import cn.bean.Multiplechoice;

public interface MultiplechoiceDao {
	/*
	 * 
	 * 此接口设计的方法都是和表multiplechoice相关联的数据操作
	 * 
	 * 
	 */
	
	public boolean delMultiplechoice(int id);//通过题目id删除题目；
		
	public  Multiplechoice  findMultiplechoiceById(int id);//通过题目id查找题目
	
	public  List<Multiplechoice> findAllMultiplechoice(); 
	
	public boolean doMultiplechoice(Multiplechoice multiplechoice);//添加题目
	
	public boolean updateMultiplechoice(Multiplechoice multipleChoice);
	
	public List<Multiplechoice> findMultiplechoiceByStr(String str);
	
	public int getLastId(); //获取最后一行数据的ID
	
	public List<Multiplechoice> findMultiplechoiceByCourseId(int course_id);


}
