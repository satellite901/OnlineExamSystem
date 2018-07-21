package cn.bean;

public class OutPaper {

	private int id; //���
	 
	private int course_id; //�γ̱��
	
	private int jud_number; //�ж�������
	
	private int sch_number; //��ѡ������
	
	private int mch_number; //��ѡ������
	
	private String deff; //��Ŀ�Ѷ�
	
	private String exam_time; //����ʱ��

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
