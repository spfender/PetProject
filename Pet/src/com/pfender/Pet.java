package com.pfender;

public class Pet 
{
	//Pet properties
	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet()
	{
	}
	
	public Pet (String name, int age, String location, String type)
	{
		this.setName(name);
		this.setAge(age);
		this.setLocation(location);
		this.setType(type);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public void setLocation(String location) 
	{
		this.location = location;
	}

	public String getType() 
	{
		return type;
	}

	
}
