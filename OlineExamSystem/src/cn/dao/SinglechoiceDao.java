package cn.dao;

import java.util.List;

import cn.bean.Singlechoice;

public interface SinglechoiceDao {

	public List<Singlechoice> findAllSinglechoice();//�ҳ����е�ѡ�� 
	
	public List<Singlechoice> findSinglechoiceByCourseId(int course_id);//�ҳ����пγ�IDΪcourse_id�ĵ�ѡ��
	
	public Singlechoice findSinglechoiceById(int id); //����id��ѯ��Ŀ
	
	public boolean doSinglechoice(Singlechoice sc); //���һ����Ŀ
	
	public boolean delSinglechoiceById(int id); //ɾ��һ�����Ϊid����Ŀ
	
	public boolean updateSinglechoiceById(Singlechoice sc);  //����һ����Ŀ
	
	public int getLastId(); //��ȡ���һ�����ݵ�ID
	
	public Singlechoice findSinglechoiceByStr(String str);//ģ����ѯ
}