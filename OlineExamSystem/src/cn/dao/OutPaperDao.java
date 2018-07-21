package cn.dao;

import java.util.List;

import cn.bean.OutPaper;

public interface OutPaperDao {

	public List<OutPaper> findAllOutPaper(); //��ѯ���еĳ�������
	
	public OutPaper findOutPaperById(int id); //����id��ѯ��������
	
	public List<OutPaper> findOutPaperByCourseId(int courseId);//���ݿγ�id��ѯ��������
	
	public boolean doOutPaper(OutPaper op); //���һ����������
	
	public boolean delOutPaper(int id); //����idɾ����������
	
	public boolean updateOutPaper(OutPaper op); //���³�������
}
