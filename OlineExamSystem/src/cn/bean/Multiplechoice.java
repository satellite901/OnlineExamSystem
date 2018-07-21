package cn.bean;

public class Multiplechoice {
	private int id;
	private String name;
	private String option_a;
	private String option_b;
	private String option_c;
	private String option_d;
	private String option_e;
	private String option_f;
	private double deff_degree;
	private String answer;
	private int course_id;
	public Multiplechoice() {
		super();
	}
	public Multiplechoice(int id, String name, String option_a, String option_b, String option_c, String option_d,
			String option_e, String option_f, double deff_degree, String answer, int course_id) {
		super();
		this.id = id;
		this.name = name;
		this.option_a = option_a;
		this.option_b = option_b;
		this.option_c = option_c;
		this.option_d = option_d;
		this.option_e = option_e;
		this.option_f = option_f;
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
	public String getOption_e() {
		return option_e;
	}
	public void setOption_e(String option_e) {
		this.option_e = option_e;
	}
	public String getOption_f() {
		return option_f;
	}
	public void setOption_f(String option_f) {
		this.option_f = option_f;
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
		return "Multiplechoice [id=" + id + ", name=" + name + ", option_a=" + option_a + ", option_b=" + option_b
				+ ", option_c=" + option_c + ", option_d=" + option_d + ", option_e=" + option_e + ", option_f="
				+ option_f + ", deff_degree=" + deff_degree + ", answer=" + answer + ", course_id=" + course_id + "]";
	}
	
	
	

}
