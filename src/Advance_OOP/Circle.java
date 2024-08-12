package Advance_OOP;

public class Circle {
	
	
	final double PI = 3.14159;
	double radius;
	
	public double calculateArea()
	{
		return PI*radius*radius;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		c.radius = 5;
		//c.calculateArea();
		System.out.println(c.calculateArea());
	}

}
