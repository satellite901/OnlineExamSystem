package cn.bean;

public class Exam {

	private int id; //���
	
	private int course_id; //�γ̱��
	
	private int teacher_id; //��ʦ���
	
	private String jud_list; //�ж�����ż���
	
	private String sch_list; //��ѡ����ż���
	
	private String mch_list; //��ѡ����ż���
	
	private String exam_time; //����ʱ��

	public Exam() {
		super();
	}

	public Exam(int id, int course_id, int teacher_id, String jud_list, String sch_list, String mch_list,
			String exam_time) {
		super();
		this.id = id;
		this.course_id = course_id;
		this.teacher_id = teacher_id;
		this.jud_list = jud_list;
		this.sch_list = sch_list;
		this.mch_list = mch_list;
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

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getJud_list() {
		return jud_list;
	}

	public void setJud_list(String jud_list) {
		this.jud_list = jud_list;
	}

	public String getSch_list() {
		return sch_list;
	}

	public void setSch_list(String sch_list) {
		this.sch_list = sch_list;
	}

	public String getMch_list() {
		return mch_list;
	}

	public void setMch_list(String mch_list) {
		this.mch_list = mch_list;
	}

	public String getExam_time() {
		return exam_time;
	}

	public void setExam_time(String exam_time) {
		this.exam_time = exam_time;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", course_id=" + course_id + ", teacher_id=" + teacher_id + ", jud_list=" + jud_list
				+ ", sch_list=" + sch_list + ", mch_list=" + mch_list + ", exam_time=" + exam_time + "]";
	}
	
	
}
