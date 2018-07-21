package cn.bean;

public class Record
{
	private int id;
	private int user_id;
	private int exam_id;
	private String jud_ans;
	private String sch_ans;
	private String mch_ans;
	private String difficult;
	private String exam_time;
	private String finish_time;
	private double score;
	
	

	public Record(int id, int user_id, int exam_id, String jud_ans, String sch_ans, String mch_ans, String diffcult,
			String exam_time, String finish_time, double score)
	{
		super();
		this.id = id;
		this.user_id = user_id;
		this.exam_id = exam_id;
		this.jud_ans = jud_ans;
		this.sch_ans = sch_ans;
		this.mch_ans = mch_ans;
		this.difficult = difficult;
		this.exam_time = exam_time;
		this.finish_time = finish_time;
		this.score = score;
	}



	public int getId()
	{
		return id;
	}



	public void setId(int id)
	{
		this.id = id;
	}



	public int getUser_id()
	{
		return user_id;
	}



	public void setUser_id(int user_id)
	{
		this.user_id = user_id;
	}



	public int getExam_id()
	{
		return exam_id;
	}



	public void setExam_id(int exam_id)
	{
		this.exam_id = exam_id;
	}



	public String getJud_ans()
	{
		return jud_ans;
	}



	public void setJud_ans(String jud_ans)
	{
		this.jud_ans = jud_ans;
	}



	public String getSch_ans()
	{
		return sch_ans;
	}



	public void setSch_ans(String sch_ans)
	{
		this.sch_ans = sch_ans;
	}



	public String getMch_ans()
	{
		return mch_ans;
	}



	public void setMch_ans(String mch_ans)
	{
		this.mch_ans = mch_ans;
	}



	public String getDifficult()
	{
		return difficult;
	}



	public void setDifficult(String difficult)
	{
		this.difficult = difficult;
	}



	public String getExam_time()
	{
		return exam_time;
	}



	public void setExam_time(String exam_time)
	{
		this.exam_time = exam_time;
	}



	public String getFinish_time()
	{
		return finish_time;
	}



	public void setFinish_time(String finish_time)
	{
		this.finish_time = finish_time;
	}



	public double getScore()
	{
		return score;
	}



	public void setScore(double score)
	{
		this.score = score;
	}



	public Record()
	{
		// TODO Auto-generated constructor stub

	}

}
