package cn.dao;

import java.util.List;

 
import cn.bean.Multiplechoice;

public interface MultiplechoiceDao {
	/*
	 * 
	 * �˽ӿ���Ƶķ������Ǻͱ�multiplechoice����������ݲ���
	 * 
	 * 
	 */
	
	public boolean delMultiplechoice(int id);//ͨ����Ŀidɾ����Ŀ��
		
	public  Multiplechoice  findMultiplechoiceById(int id);//ͨ����Ŀid������Ŀ
	
	public  List<Multiplechoice> findAllMultiplechoice(); 
	
	public boolean doMultiplechoice(Multiplechoice multiplechoice);//�����Ŀ
	
	public boolean updateMultiplechoice(Multiplechoice multipleChoice);
	
	public List<Multiplechoice> findMultiplechoiceByStr(String str);
	
	public int getLastId(); //��ȡ���һ�����ݵ�ID
	
	public List<Multiplechoice> findMultiplechoiceByCourseId(int course_id);


}
