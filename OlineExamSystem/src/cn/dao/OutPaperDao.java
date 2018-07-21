package cn.dao;

import java.util.List;

import cn.bean.OutPaper;

public interface OutPaperDao {

	public List<OutPaper> findAllOutPaper(); //查询所有的出卷属性
	
	public OutPaper findOutPaperById(int id); //根据id查询出卷属性
	
	public List<OutPaper> findOutPaperByCourseId(int courseId);//根据课程id查询出卷属性
	
	public boolean doOutPaper(OutPaper op); //添加一个出卷属性
	
	public boolean delOutPaper(int id); //根据id删除出卷属性
	
	public boolean updateOutPaper(OutPaper op); //更新出卷属性
}
