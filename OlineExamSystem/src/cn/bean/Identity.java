package cn.bean;

public class Identity
{
	private int id;
	private String name;
	public Identity()
	{
		super();
	}
	public Identity(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Identity [id=" + id + ", name=" + name + "]";
	}
	
}
