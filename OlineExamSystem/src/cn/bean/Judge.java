package cn.bean;

public class Judge {
	private int id;
	private String name;
	private double deff_degree;
	private int answer;
	private int course_id;
	public Judge() {
		super();
		
	}
	public Judge(int id, String name, double deffdegree, int answer, int course_id) {
		super();
		this.id = id;
		this.name = name;
		this.deff_degree = deffdegree;
		this.answer = answer;
		this.course_id = course_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeff_degree() {
		return deff_degree;
	}
	public void setDeff_degree(double deff_degree) {
		this.deff_degree = deff_degree;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	@Override
	public String toString() {
		return "Judge [id=" + id + ", name=" + name + ", deff_degree=" + deff_degree + ", answer=" + answer
				+ ", course_id=" + course_id + "]";
	}

}
