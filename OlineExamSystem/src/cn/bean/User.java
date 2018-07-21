package cn.bean;

public class User
{
	private int id;
	private String name;
	private String sex;
	private String user_name;
	private String password;
	private int identity_id;
	public User()
	{
		super();
	}
	public User(int id, String name, String sex, String user_name, String password, int identity_id)
	{
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.user_name = user_name;
		this.password = password;
		this.identity_id = identity_id;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getUser_name()
	{
		return user_name;
	}
	public void setUser_name(String user_name)
	{
		this.user_name = user_name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public int getIdentity_id()
	{
		return identity_id;
	}
	public void setIdentity_id(int identity_id)
	{
		this.identity_id = identity_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", user_name=" + user_name + ", password="
				+ password + ", identity_id=" + identity_id + "]";
	}
	
}
