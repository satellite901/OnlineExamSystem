package cn.bean;

public class OutPaper {

	private int id; //编号
	 
	private int course_id; //课程编号
	
	private int jud_number; //判断题题量
	
	private int sch_number; //单选题题量
	
	private int mch_number; //多选题题量
	
	private String deff; //题目难度
	
	private String exam_time; //考试时间

	public OutPaper() {
		super();
	}

	public OutPaper(int id, int course_id, int jud_number, int sch_number, int mch_number, String deff,
			String exam_time) {
		super();
		this.id = id;
		this.course_id = course_id;
		this.jud_number = jud_number;
		this.sch_number = sch_number;
		this.mch_number = mch_number;
		this.deff = deff;
		this.exam_time = exam_time;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getJud_number() {
		return jud_number;
	}

	public void setJud_number(int jud_number) {
		this.jud_number = jud_number;
	}

	public int getSch_number() {
		return sch_number;
	}

	public void setSch_number(int sch_number) {
		this.sch_number = sch_number;
	}

	public int getMch_number() {
		return mch_number;
	}

	public void setMch_number(int mch_number) {
		this.mch_number = mch_number;
	}

	public String getDeff() {
		return deff;
	}

	public void setDeff(String deff) {
		this.deff = deff;
	}

	public String getExam_time() {
		return exam_time;
	}

	public void setExam_time(String exam_time) {
		this.exam_time = exam_time;
	}

	@Override
	public String toString() {
		return "OutPaper [id=" + id + ", course_id=" + course_id + ", jud_number=" + jud_number + ", sch_number="
				+ sch_number + ", mch_number=" + mch_number + ", deff=" + deff + ", exam_time=" + exam_time + "]";
	}
	
}
