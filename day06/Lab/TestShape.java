package com.shinhan.day06.Lab;

public class TestShape {
	public static void main(String args[])
	{
		Shape[] s = new Shape[3];
		
		s[0] = new Circle("BLUE", 10);
		s[1] = new Rectangle("RED", 5, 7);
		s[2] = new Circle("GREEN", 8);
		
		for(int i = 0 ; i < 3 ; i++)
		{
			//돌건데 Circle이면 
			if(s[i] instanceof Circle){
				System.out.println("Shape " + i + " is a " + s[i]
				          + " with an area of " + s[i].calculateArea()
				          + ", a radius of " + ((Circle)s[i]).getRadius()
				          + ", and a perimeter of " + s[i].calculatePerimeter());
			} //Rectangle이면
			else if(s[i] instanceof Rectangle){
				System.out.println("Shape " + i +  " is a " + s[i] 
				          + " with an area of " + s[i].calculateArea()
				          + " and a perimeter of " + s[i].calculatePerimeter());
			}	
		}	
	}
}

