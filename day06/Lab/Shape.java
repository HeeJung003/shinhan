package com.shinhan.day06.Lab;

public class Shape { //도형을 넣을 수 있음.

	private String color;
	private String type;
	
	public Shape() {}
	
	public Shape(String color, String type)
	{
		this.color = color;
		this.type = type;
	}
	
	public String getColor()
	{
		return color;
	}
	public String getType()
	{
		return type;
	}
	
	public double calculateArea() 
	{
		return 0;
	}
	
	public double calculatePerimeter() 
	{
		return 0;
	}
	
	public String toString()
	{
		return color + " " + type;
	}

}
