package cn.bean;

public class User_Course
{
	private int id;
	private String user_name;
	private int course_id;
	public User_Course()
	{
		super();
	}
	public User_Course(int id, String user_name, int course_id)
	{
		super();
		this.id = id;
		this.user_name = user_name;
		this.course_id = course_id;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getUser_name()
	{
		return user_name;
	}
	public void setUser_name(String user_name)
	{
		this.user_name = user_name;
	}
	public int getCourse_id()
	{
		return course_id;
	}
	public void setCourse_id(int course_id)
	{
		this.course_id = course_id;
	}
	@Override
	public String toString() {
		return "User_Course [id=" + id + ", user_name=" + user_name + ", course_id=" + course_id + "]";
	}
	
	
}
