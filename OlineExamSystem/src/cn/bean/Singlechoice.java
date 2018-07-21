package cn.bean;

import java.util.ArrayList;
import java.util.List;

public class Singlechoice {

	private int id;   //编号
	
	private String name; //题目
	
	private String option_a; //选项A
	
	private String option_b; //选项B
	
	private String option_c; //选项C
	
	private String option_d; //选项D
	
	private double deff_degree; //难度分
	
	private String answer; //答案
	
	private int course_id;

	public Singlechoice() {
		super();
	}

	public Singlechoice(int id, String name, String option_a, String option_b, String option_c, String option_d,
			double deff_degree, String answer, int course_id) {
		super();
		this.id = id;
		this.name = name;
		this.option_a = option_a;
		this.option_b = option_b;
		this.option_c = option_c;
		this.option_d = option_d;
		this.deff_degree = deff_degree;
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

	public String getOption_a() {
		return option_a;
	}

	public void setOption_a(String option_a) {
		this.option_a = option_a;
	}

	public String getOption_b() {
		return option_b;
	}

	public void setOption_b(String option_b) {
		this.option_b = option_b;
	}

	public String getOption_c() {
		return option_c;
	}

	public void setOption_c(String option_c) {
		this.option_c = option_c;
	}

	public String getOption_d() {
		return option_d;
	}

	public void setOption_d(String option_d) {
		this.option_d = option_d;
	}

	public double getDeff_degree() {
		return deff_degree;
	}

	public void setDeff_degree(double deff_degree) {
		this.deff_degree = deff_degree;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
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
		return "Singlechoice [id=" + id + ", name=" + name + ", option_a=" + option_a + ", option_b=" + option_b
				+ ", option_c=" + option_c + ", option_d=" + option_d + ", deff_degree=" + deff_degree + ", answer="
				+ answer + ", course_id=" + course_id + "]";
	}
	
	public List<Object> getList(){
		List<Object> list = new ArrayList<>();
		list.add(this.id);
		list.add(this.name);
		list.add(this.option_a);
		list.add(this.option_b);
		list.add(this.option_c);
		list.add(this.option_d);
		list.add(this.deff_degree);
		list.add(this.answer);
		list.add(this.course_id);
		return list;
	}
	
}
