package com.lincoln.ssm.entity;

public class Student
{
	public Student()
	{
		super();
	}
	private int userId;
	private String username;
	private String password;
	private String email;
	private float grade;

	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public Student(String username, String password, String email, float grade)
	{
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.grade = grade;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public float getGrade()
	{
		return grade;
	}
	public void setGrade(float grade)
	{
		this.grade = grade;
	}
	public int getUserId()
	{
		return userId;
	}
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
}
